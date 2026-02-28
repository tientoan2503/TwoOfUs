package org.rikka.twoofus.onboard.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.rikka.twoofus.core.theme.TwogetherColors

/**
 * Created by rikka on 23/2/26.
 **/

@Composable
internal fun OnboardScreen() {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(TwogetherColors.colors.gradientPrimary)
      .padding(vertical = 16.dp),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
  }
}

@Preview(showBackground = true)
@Composable
private fun OnboardScreenPrev() {
  OnboardScreen()
}