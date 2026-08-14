plugins {
    alias(libs.plugins.gradle.plugin.publish)
    `java-gradle-plugin`
    id("sdkgen.publishing")
    id("sdkgen.kotlin-jvm")
}

dependencies {
    implementation(project(":generator:engine"))
    testImplementation(gradleTestKit())
}

tasks.test {
    systemProperty("sdkgen.testRoot", rootProject.projectDir.absolutePath)
}

tasks.named<org.gradle.jvm.tasks.Jar>("jar") {
    manifest.attributes["Implementation-Version"] = project.version.toString()
}

gradlePlugin {
    website = "https://github.com/nabobery/kotlin-sdkgen"
    vcsUrl = "https://github.com/nabobery/kotlin-sdkgen.git"
    plugins {
        create("sdkgen") {
            id = "io.github.nabobery.kotlin-sdkgen"
            implementationClass = "com.nabobery.sdkgen.gradleplugin.SdkGenPlugin"
            displayName = "Kotlin SDKGen"
            description =
                "Lazy cacheable Kotlin SDK source generation backed by the shared SDKGen engine."
            tags = listOf("kotlin", "openapi", "sdk", "code-generation")
        }
    }
}
