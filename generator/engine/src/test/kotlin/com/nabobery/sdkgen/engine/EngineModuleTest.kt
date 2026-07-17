package com.nabobery.sdkgen.engine

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EngineModuleTest {
    @Test
    fun exposesModuleIdentity() {
        assertEquals("engine", EngineModule().name)
    }
}
