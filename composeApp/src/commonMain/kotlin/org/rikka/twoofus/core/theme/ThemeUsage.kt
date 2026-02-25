package org.rikka.twoofus.core.theme

// ─────────────────────────────────────────────────────────────
//  📖 LoveDays Theme — Usage Examples
//  File này chỉ là tài liệu tham khảo, không phải code thực tế
// ─────────────────────────────────────────────────────────────

/*
 ██████████████████████████████████████████████████████████
 ██  SETUP — Bọc app trong LoveDaysTheme                 ██
 ██████████████████████████████████████████████████████████

    // App.kt / MainViewController.kt
    @Composable
    fun App() {
        LoveDaysTheme {
            // Toàn bộ UI của app ở đây
            NavHost(...)
        }
    }


 ██████████████████████████████████████████████████████████
 ██  COLOR — Dùng MaterialTheme.colorScheme              ██
 ██████████████████████████████████████████████████████████

    // Primary pink button
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,    // Pink500
            contentColor   = MaterialTheme.colorScheme.onPrimary,  // White
        )
    ) { Text("Bắt đầu hành trình 🚀") }

    // Teal secondary chip
    SuggestionChip(
        onClick = {},
        label = { Text("Song Tử") },
        colors = SuggestionChipDefaults.suggestionChipColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer, // Teal100
            labelColor     = MaterialTheme.colorScheme.secondary,          // Teal500
        )
    )

    // Surface card
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,    // White
        )
    ) { ... }


 ██████████████████████████████████████████████████████████
 ██  EXTENDED COLORS — Gradient & đặc thù               ██
 ██████████████████████████████████████████████████████████

    val ext = MaterialTheme.loveColors

    // Gradient background cho Hero card
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(LoveDaysShape.HeroCard)
            .background(ext.glassCard)
            .border(1.dp, ext.glassCardBorder, LoveDaysShape.HeroCard)
    )

    // Gradient button
    Box(
        modifier = Modifier
            .clip(LoveDaysShape.Chip)
            .background(ext.gradientPrimary)
            .padding(horizontal = 16.dp, vertical = 10.dp)
    ) {
        Text("Bắt đầu 🚀", color = Color.White)
    }

    // Home background
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ext.gradientHome)
    )

    // Heart icon màu đặc trưng
    Icon(
        imageVector = Icons.Filled.Favorite,
        contentDescription = null,
        tint = ext.heartRed,
    )

    // Avatar ring - Me (pink) vs Partner (teal)
    Box(
        modifier = Modifier
            .size(72.dp)
            .clip(CircleShape)
            .border(3.dp, ext.avatarRingMe, CircleShape)
    )


 ██████████████████████████████████████████████████████████
 ██  TYPOGRAPHY — Dùng MaterialTheme.typography          ██
 ██████████████████████████████████████████████████████████

    // Hero counter (Pacifico 64sp)
    Text(
        text  = "369",
        style = MaterialTheme.typography.displayLarge,
        color = Color.White,
    )

    // Screen title
    Text(
        text  = "📅 Kỷ Niệm",
        style = MaterialTheme.typography.headlineMedium,
        color = Color.White,
    )

    // Card item title
    Text(
        text  = "Kỷ niệm 1 năm yêu nhau",
        style = MaterialTheme.typography.titleMedium,
    )

    // Badge / chip text (UPPERCASE)
    Text(
        text  = "DAYS",
        style = MaterialTheme.typography.labelSmall,
        color = Color.White,
    )

    // Description
    Text(
        text  = "Còn 6 ngày nữa • 14/02/2025",
        style = MaterialTheme.typography.bodySmall,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
    )


 ██████████████████████████████████████████████████████████
 ██  SHAPES — Dùng LoveDaysShape shortcuts               ██
 ██████████████████████████████████████████████████████████

    // Chip badge
    Surface(shape = LoveDaysShape.Chip, color = ext.upcomingBadge) {
        Text("6 ngày", modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp))
    }

    // Stat card
    Card(shape = LoveDaysShape.StatCard) { ... }

    // Settings list item
    Surface(shape = LoveDaysShape.ListItem) { ... }

    // Hero card
    Card(shape = LoveDaysShape.HeroCard) { ... }

    // Avatar
    Image(modifier = Modifier.clip(LoveDaysShape.Circle))

    // Stat card bottom label
    Box(modifier = Modifier.clip(LoveDaysShape.StatLabel).background(Teal500)) {
        Text("YEARS", style = MaterialTheme.typography.labelSmall)
    }


 ██████████████████████████████████████████████████████████
 ██  COLOR REFERENCE QUICK TABLE                         ██
 ██████████████████████████████████████████████████████████

    Token                         | Light       | Dùng cho
    ──────────────────────────────┼─────────────┼─────────────────────────────
    colorScheme.primary           | #FF6B9D     | Button, FAB, active nav tab
    colorScheme.primaryContainer  | #FFD6E7     | Chip bg, name tag me
    colorScheme.secondary         | #2BBFB3     | Stat label, partner accent
    colorScheme.secondaryContainer| #D6F6F4     | Partner chip bg
    colorScheme.tertiary          | #FF8C69     | Gradient pair với primary
    colorScheme.tertiaryContainer | #FFE8D6     | Peach ann icon bg
    colorScheme.background        | #FFF5F0     | App background
    colorScheme.surface           | #FFFFFF     | Card, sheet
    colorScheme.surfaceVariant    | #FFF5EE     | Input field bg
    colorScheme.onSurfaceVariant  | #8A8A8A     | Placeholder, hint, subtitle
    colorScheme.outline           | #DDDDDD     | Divider, border
    colorScheme.inverseSurface    | #1A1A1A     | Bottom nav bg
    loveColors.gradientPrimary    | Pink→Coral  | Hero button, onboarding bg
    loveColors.gradientHome       | Teal dark→lt| Home screen background
    loveColors.gradientSettings   | Purple→Pink | Settings header
    loveColors.heartRed           | #FF4D6D     | Heart icon giữa couple
    loveColors.glassCard          | 20% white   | Glass card background
    loveColors.glassCardBorder    | 35% white   | Glass card border
*/