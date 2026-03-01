package org.rikka.twoofus.onboard.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.rikka.twoofus.core.theme.Neutral0
import org.rikka.twoofus.core.theme.Pacifico
import org.rikka.twoofus.core.theme.TextStyles
import org.rikka.twoofus.core.theme.TwogetherColors
import org.rikka.twoofus.onboard.component.InfoInputForm
import twoofus.composeapp.generated.resources.Res
import twoofus.composeapp.generated.resources.logo_app

/**
 * Created by rikka on 23/2/26.
 **/

@Composable
internal fun OnboardScreen() {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(TwogetherColors.colors.gradientPrimary)
      .statusBarsPadding(),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Column(
      modifier = Modifier
        .weight(3f)
        .fillMaxWidth(),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Image(
        painter = painterResource(Res.drawable.logo_app),
        contentDescription = "image logo",
        modifier = Modifier.padding(top = 50.dp)
      )
      
      Text(
        text = "Twogether",
        style = TextStyle(fontFamily = Pacifico, fontSize = 32.sp, color = Neutral0)
      )
    }
    
    Column(
      modifier = Modifier
        .weight(7f)
        .background(
          color = Neutral0,
          shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
        )
        .padding(vertical = 34.dp, horizontal = 16.dp)
    ) {
      InfoInputForm()
      
      Spacer(modifier = Modifier.height(20.dp))
      
      Box(
        modifier = Modifier
          .height(56.dp)
          .fillMaxWidth()
          .background(
            brush = TwogetherColors.colors.gradientPrimary,
            shape = RoundedCornerShape(16.dp)
          ),
        contentAlignment = Alignment.Center
      ) {
        Text(
          text = "Continue",
          style = TextStyles.Title20Bold.copy(color = Neutral0),
        )
      }
      
    }
    
    
  }
}

@Preview(showBackground = true)
@Composable
private fun OnboardScreenPrev() {
  OnboardScreen()
}