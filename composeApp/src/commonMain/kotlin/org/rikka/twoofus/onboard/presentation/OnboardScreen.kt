package org.rikka.twoofus.onboard.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.rikka.twoofus.core.theme.LocalTwogetherExtendedColors
import twoofus.composeapp.generated.resources.Res
import twoofus.composeapp.generated.resources.ic_default_avatar_boy

/**
 * Created by rikka on 23/2/26.
 **/

@Composable
internal fun OnboardScreen() {
  val extendedColors = LocalTwogetherExtendedColors.current
  
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(extendedColors.gradientPrimary)
      .padding(vertical = 16.dp),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Image(
      painter = painterResource(Res.drawable.ic_default_avatar_boy),
      contentDescription = "avatar"
    )
    
    
  }
}

@Preview(showBackground = true)
@Composable
private fun OnboardScreenPrev() {
  OnboardScreen()
}