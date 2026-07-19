package com.nabobery.sdkgen.runtime.auth

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SecretTest {
    @Test
    fun toStringNeverContainsTheWrappedValue() {
        val secret = Secret("super-secret-value")

        assertFalse(secret.toString().contains("super-secret-value"))
        assertEquals("Secret(redacted)", secret.toString())
    }

    @Test
    fun revealReturnsExactlyTheWrappedValue() {
        assertEquals("abc123", Secret("abc123").reveal())
    }

    @Test
    fun equalityUsesObjectIdentityRatherThanTheWrappedValue() {
        // Deliberate: see Secret's class KDoc. Equality must not reveal whether two wrapped values match or differ.
        val a = Secret("value-one")
        val b = Secret("value-two")

        assertTrue(a == a)
        assertFalse(a == b)
        assertFalse(a === b)
    }

    @Test
    fun equalityRejectsNonSecretTypes() {
        val secret = Secret("value")

        assertFalse(secret.equals("value"))
        assertFalse(secret.equals(null))
    }
}
