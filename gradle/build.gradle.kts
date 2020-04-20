buildscript {
    val kotlinVersion by extra("1.4.255-SNAPSHOT")
    repositories {
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    group = "org.test"
    version = "1.0-SNAPSHOT"


    repositories {
        mavenCentral()
        mavenLocal()
    }
}

