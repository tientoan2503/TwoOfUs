package org.rikka.twoofus

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import org.rikka.twoofus.home.navigation.HomeRoute
import org.rikka.twoofus.home.navigation.homeScreen
import org.rikka.twoofus.onboard.navigation.OnboardRoute
import org.rikka.twoofus.onboard.navigation.onboardScreen

/**
 * Created by rikka on 20/2/26.
 **/

@Composable
internal fun NavHostRoot() {
  val backStack = rememberNavBackStack(
    configuration = SavedStateConfiguration {
      serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
          subclass(OnboardRoute::class, OnboardRoute.serializer())
        }
      }
    },
    OnboardRoute, HomeRoute
  )
  
  Scaffold(
    modifier = Modifier.fillMaxSize()
  ) {
    NavDisplay(
      backStack = backStack,
      entryDecorators = listOf(
        rememberSaveableStateHolderNavEntryDecorator(),
        rememberViewModelStoreNavEntryDecorator()
      ),
      entryProvider = entryProvider {
        onboardScreen()
        homeScreen()
      }
    )
  }
}