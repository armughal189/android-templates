package io.armughal189.empty_compose_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      App()
    }
  }

  @Composable
  fun App() {
    Text(
      text = "Welcome to ${stringResource(R.string.app_name)}",
      modifier = Modifier.fillMaxSize()
    )
  }
}

