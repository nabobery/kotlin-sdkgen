package com.nabobery.sdkgen.gradleplugin

import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Phase 1 placeholder for the `com.nabobery.kotlin-sdkgen` Gradle plugin.
 *
 * The real lazy, cacheable generation task described by
 * [ADR 0009](https://github.com/nabobery/kotlin-sdkgen/blob/main/docs/adr/0009-gradle-plugin-direction.md)
 * does not exist yet. Applying this plugin id today would silently register no extension, task,
 * or source-set wiring, which is worse than an explicit failure. Fail fast instead of pretending
 * to generate anything.
 */
public class SdkGenPlugin : Plugin<Project> {
    override fun apply(target: Project): Nothing =
        throw GradleException(
            "Phase 1 placeholder — generation tasks arrive in Phase 2; " +
                "remove this plugin id or pin the CLI.",
        )
}
