plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.tanzhiqiang.kmvvm"
        minSdkVersion(16)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    dataBinding {
        isEnabled = true
    }
}
dependencies {
    implementation(fileTree("dir" to "libs", "include" to "*.jar"))

    val androidx: Map<String, Any> by rootProject.extra
    implementation("${androidx["appcompat"]}")
    implementation("${androidx["constraintlayout"]}")
    implementation("${androidx["material"]}")
    implementation("${androidx["core_ktx"]}")
    implementation("${androidx["lifecycle"]}")
    val coroutines: Map<String, Any> by rootProject.extra
    implementation("${coroutines["core"]}")
    implementation("${coroutines["android"]}")
    val http: Map<String, Any> by rootProject.extra
    // Retrofit
    implementation("${http["retrofit"]}")
    implementation("${http["converter_gson"]}")
    // okhttp
    implementation("${http["okhttp_interceptor"]}")
    implementation("${http["okhttp"]}")

    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.0-alpha4")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-alpha4")
}