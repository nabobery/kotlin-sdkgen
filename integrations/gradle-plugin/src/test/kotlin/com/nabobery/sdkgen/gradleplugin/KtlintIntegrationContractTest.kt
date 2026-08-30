package com.nabobery.sdkgen.gradleplugin

import org.gradle.api.Action
import org.gradle.api.file.FilePermissions
import org.gradle.api.file.FileTreeElement
import org.gradle.api.file.RelativePath
import org.gradle.api.tasks.util.PatternFilterable
import org.gradle.api.tasks.util.PatternSet
import org.gradle.testfixtures.ProjectBuilder
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText

/**
 * Pins the ktlint-gradle contract `KtlintIntegration` relies on. This test compiles against ktlint-gradle 14.2.0, so a
 * ktlint release that renames or retypes the supported entry point fails here at compile time rather than in a
 * consumer's build; the TestKit tests cover the split-class-loader case where `KtlintExtension` is not visible.
 */
class KtlintIntegrationContractTest {
    @Test
    fun ktlintExposesTheSupportedTypedFilterEntryPoint() {
        val method = KtlintExtension::class.java.getMethod("filter", Action::class.java)

        assertEquals(1, method.parameterCount)
        val filterMethods = KtlintExtension::class.java.methods.filter { it.name == "filter" }
        assertEquals(listOf(method), filterMethods, "exactly one filter overload is expected")
    }

    @Test
    fun exclusionInstallsAgainstARealKtlintExtension(
        @TempDir projectDir: Path,
    ) {
        val project = ProjectBuilder.builder().withProjectDir(projectDir.toFile()).build()
        project.pluginManager.apply("org.jlleitschuh.gradle.ktlint")

        KtlintIntegration.excludeOutputRoot(project, project.layout.buildDirectory.dir("generated/sdkgen/api"))
    }

    @Test
    fun filterExcludesOnlyFilesBelowTheResolvedOutputRoot(
        @TempDir temporaryDirectory: Path,
    ) {
        // Gradle canonicalizes the project directory (`/var` -> `/private/var` on macOS); compare real paths.
        val projectDir = temporaryDirectory.toRealPath()
        val project = ProjectBuilder.builder().withProjectDir(projectDir.toFile()).build()
        val outputRoot = project.layout.buildDirectory.dir("generated/sdkgen/api")
        val generated = projectDir.resolve("build/generated/sdkgen/api/sources/Generated.kt")
        val handwritten = projectDir.resolve("src/main/kotlin/Handwritten.kt")
        val sibling = projectDir.resolve("build/generated/sdkgen/api-other/Sibling.kt")
        listOf(generated, handwritten, sibling).forEach { file ->
            file.parent.createDirectories()
            file.writeText("fun x() = 1\n")
        }
        val filterable: PatternFilterable = PatternSet()

        KtlintIntegration.excludeBelow(outputRoot).execute(filterable)

        val spec = (filterable as PatternSet).asSpec
        assertFalse(spec.isSatisfiedBy(element(projectDir, generated)))
        assertTrue(spec.isSatisfiedBy(element(projectDir, handwritten)))
        assertTrue(spec.isSatisfiedBy(element(projectDir, sibling)))
    }

    private fun element(
        root: Path,
        file: Path,
    ): FileTreeElement =
        PathOnlyElement(
            file.toFile(),
            root.relativize(file).toString().replace(File.separatorChar, '/'),
        )

    /** A [FileTreeElement] whose only meaningful members are `file` and `relativePath`; nothing else is consulted. */
    private class PathOnlyElement(
        private val file: File,
        private val path: String,
    ) : FileTreeElement {
        override fun getFile(): File = file

        override fun isDirectory(): Boolean = false

        override fun getLastModified(): Long = 0

        override fun getSize(): Long = 0

        override fun open(): InputStream = file.inputStream()

        override fun copyTo(output: OutputStream) = error("not used")

        override fun copyTo(target: File): Boolean = error("not used")

        override fun getPath(): String = path

        override fun getRelativePath(): RelativePath = RelativePath.parse(true, path)

        override fun getPermissions(): FilePermissions = error("not used")

        override fun getName(): String = file.name
    }
}
