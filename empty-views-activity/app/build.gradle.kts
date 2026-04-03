plugins {
  alias(libs.plugins.android.application)
}

android {
  namespace = "io.armughal189.empty_views_activity"
  compileSdk {
    version = release(36)
  }

  defaultConfig {
    applicationId = "io.armughal189.empty_views_activity"
    minSdk = 28
    targetSdk = 36
    versionCode = 1
    versionName = "1.0.0"
  }

  buildTypes {
    release {
      isMinifyEnabled = true
      isShrinkResources = true
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
  buildFeatures {
    viewBinding = true
  }
}

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.material)
  implementation(libs.androidx.activity)
}
