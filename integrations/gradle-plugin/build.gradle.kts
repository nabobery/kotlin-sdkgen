plugins {
    id("sdkgen.kotlin-jvm")
    `java-gradle-plugin`
    id("sdkgen.publishing")
}

dependencies {
    implementation(project(":generator:engine"))
    implementation(libs.kotlin.gradle.plugin)
    testImplementation(gradleTestKit())
}

tasks.test {
    systemProperty("sdkgen.testRoot", rootProject.projectDir.absolutePath)
}

tasks.named<org.gradle.jvm.tasks.Jar>("jar") {
    manifest.attributes["Implementation-Version"] = project.version.toString()
}

gradlePlugin {
    plugins {
        create("sdkgen") {
            id = "com.nabobery.kotlin-sdkgen"
            implementationClass = "com.nabobery.sdkgen.gradleplugin.SdkGenPlugin"
            displayName = "Kotlin SDKGen"
            description =
                "Lazy cacheable Kotlin SDK source generation backed by the shared SDKGen engine."
        }
    }
}
