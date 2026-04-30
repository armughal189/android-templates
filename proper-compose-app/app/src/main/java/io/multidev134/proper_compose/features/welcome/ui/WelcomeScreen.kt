package io.multidev134.proper_compose.features.welcome.ui

import androidx.compose.runtime.Composable
import io.multidev134.reuse_hub.ui.widget.CbaButton
import io.multidev134.reuse_hub.ui.widget.CbaColumn
import io.multidev134.reuse_hub.ui.widget.CbaLayout
import io.multidev134.reuse_hub.ui.widget.CbaTextView

@Composable
fun WelcomeScreen(
  onGoHome: () -> Unit
) {
  CbaLayout("Welcome") {
    CbaColumn {
      CbaTextView("This is the Welcome Screen of Proper Compose App")
      CbaButton(
        label = "Go to Home",
        onClick = {
          onGoHome()
        }
      )

    }
  }
}