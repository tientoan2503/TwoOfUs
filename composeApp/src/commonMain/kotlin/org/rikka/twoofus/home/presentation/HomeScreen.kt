package org.rikka.twoofus.home.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

/**
 * Created by rikka on 20/2/26.
 **/

@Composable
fun HomeScreen() {
  Box(modifier = Modifier.fillMaxSize().background(color = Color.Red)) {
    Text(
      text = "Hello World"
    )
  }
}