val versions = mapOf(
    "appcompat" to "1.0.0",
    "material" to "1.0.0",
    "core_ktx" to "1.0.0",
    "lifecycle" to "2.0.0",
    "constraintlayout" to "1.1.3",
    "kotlinx_coroutines" to "1.4.1",
    "retrofit_version" to "2.9.0",
    "okhttp_version" to "3.9.1",
    "gradle" to "7.1.3",
    "kotlin" to "1.6.20"
)
extra["versions"] = versions

val androidx = mapOf(
    "appcompat" to "androidx.appcompat:appcompat:${versions["appcomapt"]}",
    "constraintlayout" to "androidx.constraintlayout:constraintlayout:${versions["constraintlayout"]}",
    "material" to "com.google.android.material:material:${versions["material"]}",
    "core_ktx" to "androidx.core:core-ktx:${versions["core_ktx"]}",
    "lifecycle" to "androidx.lifecycle:lifecycle-extensions:${versions["lifecycle"]}"
)
extra["androidx"] = androidx

val coroutines = mapOf(
    "core" to "org.jetbrains.kotlinx:kotlinx-coroutines-core:${versions["kotlinx_coroutines"]}",
    "android" to "org.jetbrains.kotlinx:kotlinx-coroutines-android:${versions["kotlinx_coroutines"]}"
)
extra["coroutines"] = coroutines

val http = mapOf(
    "retrofit" to "com.squareup.retrofit2:retrofit:${versions["retrofit_version"]}",
    "converter_gson" to "com.squareup.retrofit2:converter-gson:${versions["retrofit_version"]}",
    "okhttp_interceptor" to "com.squareup.okhttp3:logging-interceptor:${versions["okhttp_version"]}",
    "okhttp" to "com.squareup.okhttp3:okhttp:${versions["okhttp_version"]}"
)
extra["http"] = http
