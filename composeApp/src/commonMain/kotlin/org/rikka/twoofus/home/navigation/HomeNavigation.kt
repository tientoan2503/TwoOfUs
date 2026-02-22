package org.rikka.twoofus.home.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable
import org.rikka.twoofus.home.presentation.HomeScreen

/**
 * Created by rikka on 20/2/26.
 **/

@Serializable
object HomeRoute: NavKey

@Composable
fun EntryProviderScope<NavKey>.homeScreen() {
  entry<HomeRoute> {
    HomeScreen()
  }
}