package org.rikka.twoofus.onboard.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.rikka.twoofus.core.theme.Black
import org.rikka.twoofus.core.theme.Neutral0
import org.rikka.twoofus.core.theme.Neutral500
import org.rikka.twoofus.core.theme.Pink100
import org.rikka.twoofus.core.theme.Pink200
import org.rikka.twoofus.core.theme.Pink400
import org.rikka.twoofus.core.theme.TextStyles
import twoofus.composeapp.generated.resources.Res
import twoofus.composeapp.generated.resources.ic_default_avatar_boy
import twoofus.composeapp.generated.resources.ic_default_avatar_girl

/**
 * Created by rikka on 28/2/26.
 **/

enum class Gender(val value: Int) {
  MALE(0),
  FEMALE(1),
  OTHER(-1);
  
  companion object {
    fun fromValue(value: Int): Gender {
      return when (value) {
        0 -> MALE
        1 -> FEMALE
        else -> OTHER
      }
    }
  }
}

data class Person(
  val name: String,
  val age: Int,
  val gender: Int,
  val avatar: String,
) {
  companion object {
    val EMPTY = Person(name = "", age = 0, gender = 0, avatar = "")
  }
}

@Composable
fun InfoInputForm(
  modifier: Modifier = Modifier,
  person: Person = Person.EMPTY,
) {
  val avatarRes = remember(person.gender) {
    when (Gender.fromValue(person.gender)) {
      Gender.MALE -> Res.drawable.ic_default_avatar_boy
      Gender.FEMALE -> Res.drawable.ic_default_avatar_girl
      Gender.OTHER -> Res.drawable.ic_default_avatar_boy
    }
  }
  
  Box(modifier = modifier) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .background(color = Pink100, shape = RoundedCornerShape(20.dp))
        .border(width = 1.dp, color = Pink200, shape = RoundedCornerShape(20.dp))
        .padding(14.dp)
    ) {
      // Avatar and name
      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
      ) {
        Box(
          modifier = Modifier.size(48.dp)
            .clip(shape = CircleShape)
            .background(color = Neutral0, shape = CircleShape)
            .border(width = 1.dp, color = Pink400, shape = CircleShape),
          contentAlignment = Alignment.Center
        ) {
          // TODO: add feature select
          Image(
            painter = painterResource(avatarRes),
            contentDescription = "image avatar",
            modifier = Modifier.size(48.dp).clip(shape = CircleShape),
          )
        }
        
        BasicTextField(
          modifier = Modifier.weight(1f),
          textStyle = TextStyles.Body14Semibold,
          value = person.name,
          onValueChange = {},
          decorationBox = { innerTextField ->
            BoxInput {
              if (person.name.isNotBlank()) {
                innerTextField()
              } else {
                Text(
                  text = "Enter the name",
                  style = TextStyles.Body14Regular.copy(color = Neutral500)
                )
              }
            }
          },
          cursorBrush = SolidColor(value = Pink400),
          maxLines = 1,
          keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
          keyboardActions = KeyboardActions(onDone = {
            
          })
        )
      }
      
      Spacer(modifier = Modifier.height(14.dp))
      
      // Gender and age
      Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
      ) {
        
        Text(
          text = "Gender",
          style = TextStyles.Title20Bold.copy(color = Black, fontSize = 16.sp),
        )
        
        Row(
          modifier = Modifier.fillMaxWidth(),
          horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
          GenderButton(
            gender = Gender.MALE,
            modifier = Modifier.weight(1f)
          )
          GenderButton(
            gender = Gender.FEMALE,
            modifier = Modifier.weight(1f)
          )
          GenderButton(
            gender = Gender.OTHER,
            modifier = Modifier.weight(1f)
          )
        }
      }
      
      Spacer(modifier = Modifier.height(14.dp))
      
      // DOB
      Column(
        verticalArrangement = Arrangement.spacedBy(4.dp)
      ) {
        Text(
          text = "Date of birth",
          style = TextStyles.Title20Bold.copy(color = Black, fontSize = 16.sp),
        )
        
        BoxInput(modifier = Modifier.width(120.dp)) {
        
        }
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
private fun InfoInputFormPrev() {
  InfoInputForm()
}