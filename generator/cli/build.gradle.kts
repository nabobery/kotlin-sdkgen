plugins {
    application
    id("sdkgen.kotlin-jvm")
    id("sdkgen.publishing")
}

application {
    mainClass = "com.nabobery.sdkgen.cli.CliModuleKt"
}

dependencies {
    implementation(project(":generator:engine"))
    implementation(libs.clikt)
    implementation(libs.kotlinx.serialization.json)

    testImplementation(libs.kotlin.test)
}

tasks.test {
    val openRouterFile = rootProject.layout.projectDirectory.file("conformance/openrouter/openapi.yaml")

    inputs.file(openRouterFile).withPathSensitivity(org.gradle.api.tasks.PathSensitivity.RELATIVE)

    systemProperty("cli.openRouterFile", openRouterFile.asFile.absolutePath)
}
