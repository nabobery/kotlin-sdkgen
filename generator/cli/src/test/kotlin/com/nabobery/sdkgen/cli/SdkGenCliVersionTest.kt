package com.nabobery.sdkgen.cli

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SdkGenCliVersionTest {
    @Test
    fun usesPackagedImplementationVersion() {
        assertEquals("0.2.1", SdkGenCliVersion.resolve { "0.2.1" })
        assertEquals("0.2.1", SdkGenCliVersion.resolve { " 0.2.1 " })
    }

    @Test
    fun usesLoudFallbackWhenRunningUnpackagedClasses() {
        assertEquals("0.0.0-dev", SdkGenCliVersion.resolve { null })
        assertEquals("0.0.0-dev", SdkGenCliVersion.resolve { "" })
        assertEquals("0.0.0-dev", SdkGenCliVersion.resolve { "  " })
    }
}
