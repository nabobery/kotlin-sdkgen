package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.model.SemanticDocument
import java.lang.reflect.Modifier
import kotlin.io.path.readText
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ParserSeamTest {
    @Test
    fun `semantic model public api contains no swagger parser types`() {
        val modelClasses =
            sequenceOf(SemanticDocument::class.java)
                .flatMap(::reachablePublicModelTypes)
                .distinct()
                .toList()

        assertTrue(modelClasses.isNotEmpty())
        assertTrue(modelClasses.none { it.name.startsWith("io.swagger.") })
    }

    @Test
    fun `model package is parser neutral and common ready`() {
        val modelSource = ExperimentSupport.modelSource.readText()

        assertFalse(modelSource.contains("io.swagger"))
        assertFalse(modelSource.contains("import java."))
        assertFalse(Regex("\\bAny\\??\\b").containsMatchIn(modelSource))
        assertFalse(modelSource.contains("import javax."))
        assertFalse(Regex("\\bvar\\s+").containsMatchIn(modelSource))
        assertFalse(Regex("\\bMutable(?:List|Map|Set|Collection)\\b").containsMatchIn(modelSource))
    }

    private fun reachablePublicModelTypes(root: Class<*>): Sequence<Class<*>> =
        sequence {
            val pending = ArrayDeque<Class<*>>()
            val seen = mutableSetOf<Class<*>>()
            pending += root
            while (pending.isNotEmpty()) {
                val type = pending.removeFirst()
                if (!seen.add(type)) continue
                yield(type)
                type.declaredFields
                    .asSequence()
                    .filter { Modifier.isPublic(it.modifiers) || it.name != "Companion" }
                    .map { it.type }
                    .filter { it.name.startsWith("com.nabobery.sdkgen.model") }
                    .forEach(pending::addLast)
                type.declaredClasses
                    .filter { it.name.startsWith("com.nabobery.sdkgen.model") }
                    .forEach(pending::addLast)
            }
        }
}
