package com.nabobery.sdkgen.engine.declarations

import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinNameResolverTest {
    @Test
    fun namingIsLocaleIndependentAcronymAwareAndReportsDeterministicCollisions() {
        val resolver = KotlinNameResolver()
        val first = resolver.resolveTypes(listOf("foo-bar", "foo_bar", "class"))
        val second = resolver.resolveTypes(listOf("class", "foo_bar", "foo-bar"))

        assertEquals(first.names, second.names)
        assertEquals("ClassValue", first.names.getValue("class"))
        assertEquals("FooBar", first.names.getValue("foo-bar"))
        assertEquals("FooBar2", first.names.getValue("foo_bar"))
        assertEquals("SttRequest", KotlinNameResolver.typeName("STTRequest"))
        assertEquals("ByokKey", KotlinNameResolver.typeName("BYOKKey"))
        assertEquals(1, first.diagnostics.size)
    }
}
