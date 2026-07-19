plugins {
    id("sdkgen.kotlin-jvm")
    id("sdkgen.publishing")
}

dependencies {
    api(project(":runtime:core"))
    implementation(libs.kotlinx.coroutines.jdk9)

    testImplementation(project(":runtime:testing"))
    testImplementation(libs.kotlin.test)
}
