package org.rikka.twoofus.onboard.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.rikka.twoofus.core.theme.Black
import org.rikka.twoofus.core.theme.Neutral0
import org.rikka.twoofus.core.theme.Neutral200
import org.rikka.twoofus.core.theme.Pink100
import org.rikka.twoofus.core.theme.Pink500
import org.rikka.twoofus.core.theme.Teal100
import org.rikka.twoofus.core.theme.Teal500
import org.rikka.twoofus.core.theme.TextStyles

/**
 * Created by rikka on 23/2/26.
 **/

@Composable
internal fun SetupCard(
  modifier: Modifier = Modifier,
) {
  Box(modifier = modifier) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .background(color = Neutral0, shape = RoundedCornerShape(28.dp))
        .padding(top = 20.dp, bottom = 16.dp, start = 16.dp, end = 16.dp),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Text(
        text = "Setup your love \uD83D\uDC95",
        style = TextStyles.Title20Bold
      )
      
      Spacer(modifier = Modifier.height(14.dp))
      
      PartnerItem(
        isMe = true,
        name = "TienToan",
        dob = 100,
        gender = ""
      )
      
      Spacer(modifier = Modifier.height(8.dp))
      
      Text(text = "\uD83D\uDC9E")
      
      Spacer(modifier = Modifier.height(8.dp))
      
      PartnerItem(
        isMe = false,
        name = "",
        dob = 100,
        gender = ""
      )
      
    }
  }
}

@Composable
private fun PartnerItem(
  modifier: Modifier = Modifier,
  name: String,
  gender: String,
  dob: Long,
  isMe: Boolean = false,
) {
  Box(modifier = modifier) {
    Row(
      modifier = Modifier
        .fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically
    ) {
      // Avatar
      Box(
        modifier = Modifier.size(52.dp).border(
          width = 2.dp,
          color = if (isMe) Pink500 else Teal500,
          shape = CircleShape
        ).background(color = if (isMe) Pink100 else Teal100, shape = CircleShape),
        contentAlignment = Alignment.Center
      ) {
        Text(
          text = if (isMe) "\uD83E\uDDD1" else "\uD83D\uDC69"
        )
      }
      
      Spacer(modifier = Modifier.width(8.dp))
      
      // Information input
      Column(
        modifier = Modifier.weight(1f)
      ) {
        BasicTextField(
          value = name,
          onValueChange = {},
          singleLine = true,
          textStyle = TextStyles.Title20Bold.copy(
            fontSize = 12.sp,
            color = Black
          ),
          cursorBrush = SolidColor(Pink100),
          keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
          keyboardActions = KeyboardActions(
            onDone = { },
          ),
          modifier = Modifier.fillMaxWidth()
        ) { innerTextField ->
          Row(
            modifier = Modifier
              .fillMaxWidth()
              .border(
                width = 1.dp,
                shape = RoundedCornerShape(14.dp),
                color = Neutral200
              )
              .padding(horizontal = 16.dp, vertical = 12.dp),
          ) {
            innerTextField()
          }
        }
        
        
      }
    }
  }
}

@Preview
@Composable
private fun SetupCardPrev() {
  SetupCard()
}