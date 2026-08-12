plugins {
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
}

dependencies {
    implementation(project(":conformance:streaming-fixture:consumer"))

    testImplementation(libs.kotlinx.serialization.json)
    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:2.3.20")
}
