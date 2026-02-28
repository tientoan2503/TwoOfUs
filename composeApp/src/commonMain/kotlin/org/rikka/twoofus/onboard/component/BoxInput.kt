package org.rikka.twoofus.onboard.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.rikka.twoofus.core.theme.Neutral0
import org.rikka.twoofus.core.theme.Pink100
import org.rikka.twoofus.core.theme.Pink400

/**
 * Created by rikka on 28/2/26.
 **/

@Composable
internal fun BoxInput(
  modifier: Modifier = Modifier,
  isFocused: Boolean = false,
  content: @Composable () -> Unit,
) {
  Box(
    modifier = modifier
      .height(48.dp)
      .background(color = if (isFocused) Pink100 else Neutral0, shape = RoundedCornerShape(14.dp))
        then if (isFocused)
      Modifier.border(width = 1.dp, color = Pink400, shape = RoundedCornerShape(14.dp))
        .padding(horizontal = 12.dp) else Modifier.padding(horizontal = 12.dp),
    contentAlignment = Alignment.CenterStart
  ) {
    content()
  }
}

@Preview
@Composable
private fun BoxInputPrev() {
  BoxInput {
  
  }
}