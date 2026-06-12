plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.app.nourapplication2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.app.nourapplication2"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    // الأكواد بالطريقة الصحيحة لملفات الـ .kts
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // حل مشكلة الـ 8 أخطاء السابقة المتوافق مع إصدار 34
    implementation("androidx.activity:activity:1.8.2")
    implementation("androidx.core:core:1.12.0")
    implementation("androidx.core:core-ktx:1.12.0")
}