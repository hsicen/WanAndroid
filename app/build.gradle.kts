plugins {
  id("com.android.application")
  id("kotlin-android")
}

android {
  compileSdk = ProjectConfigs.compileSdk

  defaultConfig {
    applicationId = ProjectConfigs.applicationId
    minSdk = ProjectConfigs.minSdk
    targetSdk = ProjectConfigs.targetSdk
    versionCode = ProjectConfigs.versionCode
    versionName = ProjectConfigs.versionName

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables { useSupportLibrary = true }
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
  kotlinOptions {
    jvmTarget = "11"
  }

  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = Versions.compose
  }

  packagingOptions {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}

dependencies {
  implementation(DepsGroup.coreUi)
  implementation(DepsGroup.compose)
  implementation(DepsGroup.activity)
  implementation(DepsGroup.lifecycle)

  implementationModule(Module.theme)

  testImplementation(DepsGroup.testLib)
  androidTestImplementation(DepsGroup.androidTestLib)
  debugImplementation(DepsGroup.debugLib)
}