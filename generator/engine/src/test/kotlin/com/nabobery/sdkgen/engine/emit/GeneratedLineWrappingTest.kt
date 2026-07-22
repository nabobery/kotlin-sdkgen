package com.nabobery.sdkgen.engine.emit

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GeneratedLineWrappingTest {
    @Test
    fun leavesLargeGeneratedCodeStringsUntouchedToPreserveSyntax() {
        val source = "\"" + "word ".repeat(5_000) + "end\""

        val wrapped = wrapGeneratedKotlinForTest(source)

        assertEquals(source, wrapped)
    }

    @Test
    fun preservesKDocDelimitersAndBlankLinesWhileWrappingContent() {
        val longContent = "word ".repeat(40).trimEnd()
        val source =
            listOf(
                "/**",
                " * Short content.",
                " * $longContent",
                " *",
                " */",
            ).joinToString("\n")

        val wrapped = wrapGeneratedKotlinForTest(source)
        val lines = wrapped.lineSequence().toList()

        assertEquals("/**", lines.first())
        assertEquals(" * Short content.", lines[1])
        assertEquals(" *", lines[lines.lastIndex - 1])
        assertEquals(" */", lines.last())
        assertTrue(lines.drop(2).dropLast(2).all { line -> line.startsWith(" * ") })
        assertTrue(lines.size > 5)
    }

    @Test
    fun leavesLongLineUnwrappedWhenLeadingDotCannotMakeProgress() {
        val source = "." + "x".repeat(200)

        val wrapped = wrapGeneratedKotlinForTest(source)

        assertEquals(source, wrapped)
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
