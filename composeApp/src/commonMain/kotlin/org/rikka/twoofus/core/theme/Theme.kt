package org.rikka.twoofus.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Immutable
data class LoveDaysExtendedColors(
  
  // Gradient presets
  val gradientPrimary: Brush,   // Pink → Coral (onboarding, hero button)
  val gradientHome: Brush,   // Teal dark → Teal light (home bg)
  val gradientSettings: Brush,   // Purple → Pink (settings header)
  val gradientAnniversary: Brush,   // Pink → Coral (anniversary header)
  
  // Glass / overlay
  val glassCard: Color,   // card nổi trên nền bg
  val glassCardBorder: Color, // viền glass card
  val glassDark: Color,   // bottom nav bg
  
  // Semantic
  val heartRed: Color,   // tim ❤️ giữa couple
  val starGold: Color,   // anniversary star
  val upcomingBadge: Color,   // "Sắp tới" bg
  val pastBadge: Color,   // "Đã qua" bg
  val todayBadge: Color,   // "Hôm nay" bg (= primary)
  
  // Avatar ring
  val avatarRingMe: Color,
  val avatarRingPartner: Color,
)

// ─────────────────────────────────────────────
//  Light extended
// ─────────────────────────────────────────────
private val LightExtendedColors = LoveDaysExtendedColors(
  
  gradientPrimary = Brush.linearGradient(listOf(Pink500, Coral500)),
  gradientHome = Brush.verticalGradient(
    listOf(
      Color(0xFF1A8FA8), Color(0xFF1DD1B8), Color(0xFFA8EDDF)
    )
  ),
  gradientSettings = Brush.linearGradient(listOf(Purple400, Pink500)),
  gradientAnniversary = Brush.linearGradient(listOf(Pink500, Coral500)),
  
  glassCard = Color(0x33FFFFFF),    // 20% white
  glassCardBorder = Color(0x59FFFFFF),    // 35% white
  glassDark = Color(0xCC1A1A1A),    // 80% black
  
  heartRed = HeartRed,
  starGold = StarGold,
  upcomingBadge = Teal100,
  pastBadge = Peach200,
  todayBadge = Pink500,
  
  avatarRingMe = Pink500,
  avatarRingPartner = Teal500,
)

// ─────────────────────────────────────────────
//  Dark extended
// ─────────────────────────────────────────────
private val DarkExtendedColors = LoveDaysExtendedColors(
  
  gradientPrimary = Brush.linearGradient(listOf(Pink400, Coral400)),
  gradientHome = Brush.verticalGradient(
    listOf(
      Color(0xFF0D5F72), Color(0xFF0E9985), Color(0xFF2BBFB3)
    )
  ),
  gradientSettings = Brush.linearGradient(listOf(Purple300, Pink400)),
  gradientAnniversary = Brush.linearGradient(listOf(Pink400, Coral400)),
  
  glassCard = Color(0x26FFFFFF),    // 15% white
  glassCardBorder = Color(0x40FFFFFF),    // 25% white
  glassDark = Color(0xE61A1A1A),    // 90% black
  
  heartRed = Color(0xFFFF6B8A),
  starGold = Yellow300,
  upcomingBadge = Teal800,
  pastBadge = Color(0xFF4A3020),
  todayBadge = Pink600,
  
  avatarRingMe = Pink400,
  avatarRingPartner = Teal400,
)

object TwogetherColors {
  val colors: LoveDaysExtendedColors
    @Composable
    get() = LocalTwogetherExtendedColors.current
}

val LocalTwogetherExtendedColors = staticCompositionLocalOf { LightExtendedColors }

@Composable
fun TwogetherTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit,
) {
  MaterialTheme(
    typography = Typography(),
    content = content,
  )
}