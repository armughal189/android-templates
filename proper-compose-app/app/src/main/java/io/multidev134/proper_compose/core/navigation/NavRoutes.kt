package io.multidev134.proper_compose.core.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoutes: NavKey {
  @Serializable data object Welcome: NavRoutes()
  @Serializable data object Home: NavRoutes()
  @Serializable data object About: NavRoutes()
}
