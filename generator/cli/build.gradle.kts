plugins {
    application
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
    id("sdkgen.publishing")
}

application {
    mainClass = "com.nabobery.sdkgen.cli.CliModuleKt"
}

dependencies {
    implementation(project(":generator:engine"))
    implementation(project(":generator:model"))
    implementation(project(":generator:openapi"))
    implementation(libs.jackson.databind)
    implementation(libs.clikt)
    implementation(libs.kotlinx.serialization.json)

    testImplementation(libs.kotlin.test)
}

tasks.test {
    val openRouterFile = rootProject.layout.projectDirectory.file("conformance/openrouter/openapi.yaml")

    inputs.file(openRouterFile).withPathSensitivity(org.gradle.api.tasks.PathSensitivity.RELATIVE)

    systemProperty("cli.openRouterFile", openRouterFile.asFile.absolutePath)
}
