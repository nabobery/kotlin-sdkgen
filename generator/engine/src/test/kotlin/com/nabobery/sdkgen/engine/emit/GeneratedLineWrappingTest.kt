package com.nabobery.sdkgen.engine.emit

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GeneratedLineWrappingTest {
    @Test
    fun wrapsLargeGeneratedStringWithoutGrowingTheCallStack() {
        val source = "\"" + "word ".repeat(5_000) + "end\""

        val wrapped = wrapGeneratedKotlinForTest(source)

        assertEquals(source.removeSurrounding("\""), generatedStringContents(wrapped))
        assertTrue(wrapped.lineSequence().count() > 1)
    }

    @Test
    fun leavesLongLineUnwrappedWhenLeadingDotCannotMakeProgress() {
        val source = "." + "x".repeat(200)

        val wrapped = wrapGeneratedKotlinForTest(source)

        assertEquals(source, wrapped)
    }

    private fun generatedStringContents(source: String): String =
        source
            .lineSequence()
            .joinToString("") { line ->
                line
                    .trim()
                    .removeSuffix("+")
                    .trim()
                    .removeSurrounding("\"")
            }

    private fun wrapGeneratedKotlinForTest(source: String): String {
        val method =
            Class
                .forName("com.nabobery.sdkgen.engine.emit.EmissionContextKt")
                .getDeclaredMethod("wrapGeneratedKotlin", String::class.java)
        method.isAccessible = true
        return method.invoke(null, source) as String
    }
}
