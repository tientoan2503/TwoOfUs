package org.rikka.twoofus.onboard.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable
import org.rikka.twoofus.onboard.presentation.OnboardScreen

/**
 * Created by rikka on 23/2/26.
 **/

@Serializable
object OnboardRoute : NavKey

@Composable
fun EntryProviderScope<NavKey>.onboardScreen() {
  entry<OnboardRoute> {
    OnboardScreen()
  }
}