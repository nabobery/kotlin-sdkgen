plugins {
    id("sdkgen.publishing")
    id("sdkgen.kotlin-jvm")
}

dependencies {
    api(project(":runtime:core"))
    implementation(libs.kotlinx.coroutines.jdk9)

    testImplementation(project(":runtime:testing"))
    testImplementation(libs.kotlin.test)
}
