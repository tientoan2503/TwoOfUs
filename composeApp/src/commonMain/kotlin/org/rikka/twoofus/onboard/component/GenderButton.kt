package org.rikka.twoofus.onboard.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.rikka.twoofus.core.theme.Neutral0
import org.rikka.twoofus.core.theme.Neutral700
import org.rikka.twoofus.core.theme.Pink400
import org.rikka.twoofus.core.theme.Pink700
import org.rikka.twoofus.core.theme.TextStyles
import twoofus.composeapp.generated.resources.Res
import twoofus.composeapp.generated.resources.female
import twoofus.composeapp.generated.resources.gender_other
import twoofus.composeapp.generated.resources.ic_gender_female
import twoofus.composeapp.generated.resources.ic_gender_male
import twoofus.composeapp.generated.resources.ic_gender_other
import twoofus.composeapp.generated.resources.male

/**
 * Created by rikka on 28/2/26.
 **/

@Composable
fun GenderButton(
  modifier: Modifier = Modifier,
  gender: Gender,
  isSelected: Boolean = false,
) {
  val genderSymbolRes = when (gender) {
    Gender.MALE -> Res.drawable.ic_gender_male
    Gender.FEMALE -> Res.drawable.ic_gender_female
    Gender.OTHER -> Res.drawable.ic_gender_other
  }
  
  val genderRes = when (gender) {
    Gender.MALE -> Res.string.male
    Gender.FEMALE -> Res.string.female
    Gender.OTHER -> Res.string.gender_other
  }
  
  Box(modifier = modifier) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .background(
          color = if (isSelected) {
            Pink400
          } else Neutral0,
          shape = RoundedCornerShape(12.dp)
        ) then if (isSelected) Modifier.border(
        width = 1.dp,
        color = Pink700,
        shape = RoundedCornerShape(12.dp)
      ).padding(8.dp) else Modifier.padding(8.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
      Image(
        painter = painterResource(genderSymbolRes),
        contentDescription = "image gender",
        modifier = Modifier.size(16.dp)
      )
      
      Text(
        text = stringResource(genderRes),
        style = TextStyles.Title20Bold.copy(
          fontSize = 12.sp,
          color = if (isSelected) Neutral0 else Neutral700
        )
      )
    }
  }
}

@Preview
@Composable
private fun GenderButtonPrev() {
  GenderButton(gender = Gender.MALE)
}