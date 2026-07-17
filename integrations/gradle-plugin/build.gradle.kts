plugins {
    id("sdkgen.kotlin-jvm")
    `java-gradle-plugin`
    id("sdkgen.publishing")
}

dependencies {
    implementation(project(":generator:engine"))
}

gradlePlugin {
    plugins {
        create("sdkgen") {
            id = "com.nabobery.kotlin-sdkgen"
            implementationClass = "com.nabobery.sdkgen.gradleplugin.SdkGenPlugin"
            displayName = "Kotlin SDKGen"
            description = "Phase 1 placeholder: fails fast on apply. SDK generation tasks arrive in Phase 2."
        }
    }
}
