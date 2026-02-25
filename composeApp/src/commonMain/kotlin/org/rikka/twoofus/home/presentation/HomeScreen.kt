package org.rikka.twoofus.home.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.painterResource
import twoofus.composeapp.generated.resources.Res
import twoofus.composeapp.generated.resources.default_background

/**
 * Created by rikka on 20/2/26.
 **/

@Composable
internal fun HomeScreen() {
  Content()
}

@Composable
private fun Content() {
  Box(modifier = Modifier.fillMaxSize()) {
    // Background image
    Image(
      painter = painterResource(Res.drawable.default_background),
      contentDescription = "image background",
      modifier = Modifier.fillMaxSize(),
      contentScale = ContentScale.Crop
    )
    
    Column(
      modifier = Modifier.fillMaxSize()
    ) {
    
    }
  }
}

@Preview
@Composable
private fun HomeScreenPrev() {
  HomeScreen()
}