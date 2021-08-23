buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Deps.gradle)
        classpath(Deps.KotlinGradle)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}