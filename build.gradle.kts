buildscript {
  repositories {
    google()
    mavenCentral()
  }
  dependencies {
    classpath(Deps.gradle)
    classpath(Deps.KotlinGradle)
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
  }
}

tasks.register("clean", Delete::class) {
  delete(rootProject.buildDir)
}