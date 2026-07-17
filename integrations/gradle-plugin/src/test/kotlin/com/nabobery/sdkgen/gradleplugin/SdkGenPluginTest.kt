package com.nabobery.sdkgen.gradleplugin

import org.gradle.api.GradleException
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SdkGenPluginTest {
    @Test
    fun exposesStableImplementationClass() {
        assertEquals("SdkGenPlugin", SdkGenPlugin::class.simpleName)
    }

    @Test
    fun applyFailsFastWithAPhase1PlaceholderMessage() {
        val project = ProjectBuilder.builder().build()

        val failure =
            assertThrows(GradleException::class.java) {
                project.plugins.apply(SdkGenPlugin::class.java)
            }

        // Gradle wraps the plugin's own exception in an InvalidPluginException whose message
        // only names the failing plugin class; the placeholder message itself is the cause.
        val rootMessage =
            generateSequence(failure as Throwable) { it.cause }
                .mapNotNull { it.message }
                .joinToString(" | ")

        assertTrue(
            rootMessage.contains("Phase 1 placeholder"),
            "Expected a Phase 1 placeholder message, but was: $rootMessage",
        )
        assertTrue(
            rootMessage.contains("Phase 2"),
            "Expected the message to point consumers to Phase 2, but was: $rootMessage",
        )
    }
}
