package io.multidev134.proper_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.fragment.app.FragmentActivity
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import dagger.hilt.android.AndroidEntryPoint
import io.multidev134.proper_compose.core.navigation.NavRoutes
import io.multidev134.proper_compose.features.about.ui.AboutScreen
import io.multidev134.proper_compose.features.home.ui.HomeScreen
import io.multidev134.proper_compose.features.welcome.ui.WelcomeScreen

@AndroidEntryPoint
class MainActivity : FragmentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      val backStack = rememberNavBackStack(NavRoutes.Welcome)
      NavDisplay(
        backStack = backStack,
        onBack = {
          backStack.removeLastOrNull()
        },
        entryProvider = entryProvider {
          entry<NavRoutes.Welcome> {
            WelcomeScreen(
              onGoHome = {
                backStack.add(NavRoutes.Home)
              },
            )
            entry<NavRoutes.Home> {
              HomeScreen()
            }
            entry<NavRoutes.About> {
              AboutScreen()
            }
          }
        })
    }
  }
}
