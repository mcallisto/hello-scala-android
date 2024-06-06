// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath(libs.scala.android.plugin)
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
}