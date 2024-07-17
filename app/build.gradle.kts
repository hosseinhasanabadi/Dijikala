import java.io.FileInputStream
import java.util.Properties


plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

    id("com.google.dagger.hilt.android")
    id("com.google.devtools.ksp")


  //  kotlin("kapt")
  //  id("com.google.dagger.hilt.android")
}

 val apikeyPropertiesFile=rootProject.file("key.properties")
val apikeyProperties = Properties()
/*FileInputStream(apikeyPropertiesFile).use { stream ->
    apikeyProperties.load(stream)
}*/
apikeyProperties.load(FileInputStream(apikeyPropertiesFile))



android {
    namespace = "com.example.dijikala"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dijikala"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        buildConfigField("String", "X_API_KEY", apikeyProperties.getProperty("X_API_KEY"))
        buildFeatures{

        }



        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildToolsVersion = "34.0.0"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.support.annotations)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation("androidx.compose.material:material:1.4.3")





    //retrofit
    val retrofit_version = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
    //room

    val room_version = "2.6.0"

    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    // kapt("androidx.room:room-compiler:$room_version")

    implementation("androidx.room:room-ktx:2.6.0")
    //datastore

    val datastore_version = "1.0.0"
    implementation("androidx.datastore:datastore-preferences:$datastore_version")


    //hilt di



    val hilt_version = "2.48"
    ksp(libs.hilt.compiler.v248)
    implementation(libs.hilt.android)

    //kapt(libs.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    //compose navigation
    implementation("androidx.navigation:navigation-compose:2.7.5")
    //animation
    implementation("com.airbnb.android:lottie-compose:6.1.0")

    //coil - load image from url    mesl picaso bari load kardan tasavir
    implementation("io.coil-kt:coil-compose:2.0.0-rc01")

    //swipe refresh         lodaind refresh
    implementation("com.google.accompanist:accompanist-swiperefresh:0.27.0")

    //system ui controller        contorol kardan ui
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.28.0")

    //Accompanist-Pager
    implementation("com.google.accompanist:accompanist-pager:0.28.0")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.28.0")



}
//kapt {
    //correctErrorTypes = true
//}

