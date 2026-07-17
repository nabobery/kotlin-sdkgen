import org.gradle.api.tasks.PathSensitivity
import org.jlleitschuh.gradle.ktlint.KtlintExtension

plugins {
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
    id("sdkgen.publishing")
}

tasks.test {
    val openRouterFile =
        rootProject.layout.projectDirectory
            .file("conformance/openrouter/openapi.yaml")
    val consumerSourceRoot =
        rootProject.layout.projectDirectory
            .dir("conformance/openrouter/consumer/src/commonMain/kotlin")
    val basicOpenApiFile =
        rootProject.layout.projectDirectory
            .file("generator/openapi/src/test/resources/fixtures/basic-openapi.yaml")
    val wave1GoldenRoot = layout.projectDirectory.dir("src/test/resources/goldens/wave1")
    val emitterSource =
        layout.projectDirectory
            .file("src/main/kotlin/com/nabobery/sdkgen/engine/emit/KotlinPoetEmitter.kt")
    val emissionContextSource =
        layout.projectDirectory
            .file("src/main/kotlin/com/nabobery/sdkgen/engine/emit/EmissionContext.kt")

    // These fixtures/goldens are read at test execution time via the system properties below;
    // declare them explicitly so Gradle tracks their contents (not just the path string baked
    // into the system property) as UP-TO-DATE/build-cache inputs.
    inputs.file(openRouterFile).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(basicOpenApiFile).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(consumerSourceRoot).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(wave1GoldenRoot).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(emitterSource).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(emissionContextSource).withPathSensitivity(PathSensitivity.RELATIVE)

    systemProperty("engine.openRouterFile", openRouterFile.asFile.absolutePath)
    systemProperty("engine.basicOpenApiFile", basicOpenApiFile.asFile.absolutePath)
    systemProperty("engine.goldenRoot", consumerSourceRoot.asFile.absolutePath)
    systemProperty("engine.wave1GoldenRoot", wave1GoldenRoot.asFile.absolutePath)
    systemProperty("engine.consumerSourceRoot", consumerSourceRoot.asFile.absolutePath)
    systemProperty("engine.emitterSource", emitterSource.asFile.absolutePath)
    systemProperty("engine.emissionContextSource", emissionContextSource.asFile.absolutePath)
}

configure<KtlintExtension> {
    filter {
        exclude { element -> element.file.path.contains("/goldens/") }
    }
}

dependencies {
    implementation(project(":generator:model"))
    implementation(project(":generator:openapi"))
    implementation(libs.kotlinpoet)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kaml)
    implementation(libs.jackson.databind)

    testImplementation(libs.json.schema.validator)
    testImplementation(libs.kotlin.test)
}
