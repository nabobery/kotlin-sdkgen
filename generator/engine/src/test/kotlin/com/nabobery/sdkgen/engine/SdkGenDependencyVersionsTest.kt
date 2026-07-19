package com.nabobery.sdkgen.engine

import kotlin.test.Test
import kotlin.test.assertTrue

class SdkGenDependencyVersionsTest {
    @Test
    fun `kotlinpoet version comes from packaged dependency metadata`() {
        assertTrue(SdkGenDependencyVersions.kotlinPoet.matches(Regex("\\d+\\.\\d+\\.\\d+([-+].*)?")))
    }
}
