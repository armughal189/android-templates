package io.multidev134.proper_compose.features.home.ui

import androidx.compose.runtime.Composable
import io.multidev134.reuse_hub.ui.widget.CbaColumn
import io.multidev134.reuse_hub.ui.widget.CbaLayout
import io.multidev134.reuse_hub.ui.widget.CbaTextView

@Composable
fun HomeScreen() {
  CbaLayout("Home") {
    CbaColumn {
      CbaTextView("This is the Home Screen of Proper Compose App")
      CbaTextView("Use the Navigation \"Bar\" Below to Navigate through the Top Level Screens.")
    }
  }
}
