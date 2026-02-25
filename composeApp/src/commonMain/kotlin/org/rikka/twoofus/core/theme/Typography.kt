package org.rikka.twoofus.core.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import twoofus.composeapp.generated.resources.Nunito_Bold
import twoofus.composeapp.generated.resources.Nunito_ExtraBold
import twoofus.composeapp.generated.resources.Nunito_Italic
import twoofus.composeapp.generated.resources.Nunito_Medium
import twoofus.composeapp.generated.resources.Nunito_Regular
import twoofus.composeapp.generated.resources.Nunito_SemiBold
import twoofus.composeapp.generated.resources.Pacifico_Regular
import twoofus.composeapp.generated.resources.Res

val Pacifico
  @Composable get() = FontFamily(
    Font(
      resource = Res.font.Pacifico_Regular,
      weight = FontWeight.Normal
    )
  )

val Nunito
  @Composable get() = FontFamily(
    Font(
      resource = Res.font.Nunito_Regular,
      weight = FontWeight.Normal
    ),
    Font(
      resource = Res.font.Nunito_Medium,
      weight = FontWeight.Medium
    ),
    Font(
      resource = Res.font.Nunito_SemiBold,
      weight = FontWeight.SemiBold
    ),
    Font(
      resource = Res.font.Nunito_Bold,
      weight = FontWeight.Bold
    ),
    Font(
      resource = Res.font.Nunito_Italic,
      weight = FontWeight.Normal,
      style = FontStyle.Italic
    ),
    Font(
      resource = Res.font.Nunito_ExtraBold,
      weight = FontWeight.ExtraBold,
    ),
  )

object TextStyles {
  // Title
  val Title32Bold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Bold, fontSize = 32.sp)
  val Title24Bold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Bold, fontSize = 24.sp)
  val Title20Bold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Bold, fontSize = 20.sp)
  val Title20Semibold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
  
  // Subtitle 18
  val Subtitle18Medium
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Medium, fontSize = 18.sp)
  val Subtitle18Semibold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
  val Subtitle18Bold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Bold, fontSize = 18.sp)
  
  // Subtitle 16
  val Subtitle16Regular
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Normal, fontSize = 16.sp)
  val Subtitle16Medium
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Medium, fontSize = 16.sp)
  val Subtitle16Semibold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
  val Subtitle16Bold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Bold, fontSize = 16.sp)
  
  // Body 14
  val Body14Regular
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Normal, fontSize = 14.sp)
  val Body14Medium
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Medium, fontSize = 14.sp)
  val Body14Semibold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
  
  // Caption 12
  val Caption12Regular
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Normal, fontSize = 12.sp)
  val Caption12Medium
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.Medium, fontSize = 12.sp)
  val Caption12Semibold
    @Composable get() =
      TextStyle(fontFamily = Nunito, fontWeight = FontWeight.SemiBold, fontSize = 12.sp)
}
