package com.nabobery.sdkgen.engine.config

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertInstanceOf
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ConfigLoaderTest {
    @Test
    fun `YAML and JSON decode to the same typed model`() {
        val yaml = ConfigLoader.decodeYaml(TestFixtures.text("/fixtures/sdkgen.yaml"), "sdkgen.yaml")
        val json = ConfigLoader.decodeJson(TestFixtures.text("/fixtures/sdkgen.json"), "sdkgen.json")

        assertEquals(json, yaml)
        assertEquals(ConfigVersion.V1_ALPHA_1, yaml.version)
        assertEquals(TargetFamily.IOS, yaml.kotlin.targets[2])
        assertTrue(
            yaml.plugins
                .single()
                .config
                .containsKey("preserveProviderRouting"),
        )
    }

    @Test
    fun `unknown YAML field fails with a stable nested path diagnostic`() {
        val invalid =
            TestFixtures.text("/fixtures/sdkgen.yaml").replace(
                "    timeoutSeconds: 30",
                "    timeoutSeconds: 30\n    surprisePolicy: reject",
            )

        val error =
            assertThrows<ConfigDecodeException> {
                ConfigLoader.decodeYaml(invalid, "invalid.yaml")
            }

        assertEquals("SDKGEN-CONFIG-UNKNOWN-FIELD", error.diagnostic.code)
        assertEquals(DiagnosticSeverity.ERROR, error.diagnostic.severity)
        assertEquals(DiagnosticPhase.CONFIGURATION, error.diagnostic.phase)
        assertEquals("invalid.yaml", error.diagnostic.path.file)
        assertEquals("$.source.acquisition.surprisePolicy", error.diagnostic.path.yamlPath)
        assertTrue(error.diagnostic.remediation.contains("Remove"))
    }

    @Test
    fun `unknown JSON field also reports its nested path`() {
        val invalid =
            TestFixtures.text("/fixtures/sdkgen.json").replace(
                "\"timeoutSeconds\": 30,",
                "\"timeoutSeconds\": 30, \"surprisePolicy\": \"reject\",",
            )

        val error =
            assertThrows<ConfigDecodeException> {
                ConfigLoader.decodeJson(invalid, "invalid.json")
            }

        assertEquals("SDKGEN-CONFIG-UNKNOWN-FIELD", error.diagnostic.code)
        assertEquals("$.source.acquisition.surprisePolicy", error.diagnostic.path.yamlPath)
    }

    @Test
    fun `missing version has a distinct typed error`() {
        val invalid = TestFixtures.text("/fixtures/sdkgen.yaml").removePrefix("version: v1alpha1\n")

        val error =
            assertThrows<MissingConfigVersionException> {
                ConfigLoader.decodeYaml(invalid, "missing-version.yaml")
            }

        assertEquals("SDKGEN-CONFIG-VERSION-MISSING", error.diagnostic.code)
        assertEquals("$.version", error.diagnostic.path.yamlPath)
    }

    @Test
    fun `unsupported version has a distinct typed error`() {
        val invalid = TestFixtures.text("/fixtures/sdkgen.json").replace("v1alpha1", "v2")

        val error =
            assertThrows<UnsupportedConfigVersionException> {
                ConfigLoader.decodeJson(invalid, "unsupported.json")
            }

        assertEquals("SDKGEN-CONFIG-VERSION-UNSUPPORTED", error.diagnostic.code)
        assertEquals("v2", error.actualVersion)
        assertInstanceOf(ConfigContractException::class.java, error)
    }
}
