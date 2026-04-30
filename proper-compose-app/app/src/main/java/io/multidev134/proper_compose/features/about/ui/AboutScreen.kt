package io.multidev134.proper_compose.features.about.ui

import androidx.compose.runtime.Composable
import io.multidev134.reuse_hub.ui.widget.CbaColumn
import io.multidev134.reuse_hub.ui.widget.CbaLayout
import io.multidev134.reuse_hub.ui.widget.CbaTextView

@Composable
fun AboutScreen() {
  CbaLayout("About") {
    CbaColumn {
      CbaTextView("This is the About Screen of our Proper Compose App")
    }
  }
}
