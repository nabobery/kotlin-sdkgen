package com.nabobery.sdkgen.engine.config

import kotlinx.serialization.encodeToString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ConfigValidatorTest {
    @Test
    fun `loader rejects values outside the v1alpha1 configuration contract`() {
        invalidCases().forEach { case ->
            val text = ConfigFormats.json.encodeToString(case.config)

            val failure =
                assertThrows<ConfigValidationException>(case.name) {
                    ConfigLoader.decodeJson(text, "sdkgen.json")
                }

            assertEquals("SDKGEN-CONFIG-CONSTRAINT", failure.diagnostic.code, case.name)
            assertEquals(DiagnosticPhase.CONFIGURATION, failure.diagnostic.phase, case.name)
            assertEquals(case.path, failure.diagnostic.path.yamlPath, case.name)
            assertFalse(failure.diagnostic.remediation.isBlank(), case.name)
        }
    }

    private fun invalidCases(): List<InvalidCase> {
        val config = TestFixtures.config
        val acquisition = config.source.acquisition
        val retries = config.runtime.retries
        return listOf(
            InvalidCase("empty source URI", "$.source.uri", config.copy(source = config.source.copy(uri = ""))),
            InvalidCase(
                "invalid source digest",
                "$.source.sha256",
                config.copy(source = config.source.copy(sha256 = "abc")),
            ),
            InvalidCase(
                "zero maximum bytes",
                "$.source.acquisition.maxBytes",
                config.copy(source = config.source.copy(acquisition = acquisition.copy(maxBytes = 0))),
            ),
            InvalidCase(
                "zero acquisition timeout",
                "$.source.acquisition.timeoutSeconds",
                config.copy(source = config.source.copy(acquisition = acquisition.copy(timeoutSeconds = 0))),
            ),
            InvalidCase(
                "duplicate allowed host",
                "$.source.acquisition.allowedHosts[1]",
                config.copy(
                    source =
                        config.source.copy(
                            acquisition = acquisition.copy(allowedHosts = listOf("api.example", "api.example")),
                        ),
                ),
            ),
            InvalidCase(
                "empty allowed host",
                "$.source.acquisition.allowedHosts[0]",
                config.copy(source = config.source.copy(acquisition = acquisition.copy(allowedHosts = listOf("")))),
            ),
            InvalidCase(
                "invalid package name",
                "$.kotlin.packageName",
                config.copy(kotlin = config.kotlin.copy(packageName = "invalid-package")),
            ),
            InvalidCase(
                "empty targets",
                "$.kotlin.targets",
                config.copy(kotlin = config.kotlin.copy(targets = emptyList())),
            ),
            InvalidCase(
                "duplicate target",
                "$.kotlin.targets[1]",
                config.copy(kotlin = config.kotlin.copy(targets = listOf(TargetFamily.JVM, TargetFamily.JVM))),
            ),
            InvalidCase(
                "invalid client identifier",
                "$.kotlin.naming.clientName",
                config.copy(kotlin = config.kotlin.copy(naming = config.kotlin.naming.copy(clientName = "9Client"))),
            ),
            InvalidCase(
                "zero request timeout",
                "$.runtime.requestTimeoutMillis",
                config.copy(runtime = config.runtime.copy(requestTimeoutMillis = 0)),
            ),
            InvalidCase(
                "zero retry attempts",
                "$.runtime.retries.maxAttempts",
                config.copy(runtime = config.runtime.copy(retries = retries.copy(maxAttempts = 0))),
            ),
            InvalidCase(
                "negative jitter",
                "$.runtime.retries.jitterRatio",
                config.copy(runtime = config.runtime.copy(retries = retries.copy(jitterRatio = -0.1))),
            ),
            InvalidCase(
                "jitter above one",
                "$.runtime.retries.jitterRatio",
                config.copy(runtime = config.runtime.copy(retries = retries.copy(jitterRatio = 1.1))),
            ),
            InvalidCase(
                "empty output sources",
                "$.output.sources",
                config.copy(output = config.output.copy(sources = "")),
            ),
            InvalidCase(
                "empty compatibility profile ID",
                "$.compatibilityProfiles[0].id",
                config.copy(compatibilityProfiles = listOf(CompatibilityProfileConfig("", "1"))),
            ),
            InvalidCase("empty rule ID", "$.rules[0].id", config.copy(rules = listOf(RuleConfig("")))),
            InvalidCase(
                "empty plugin ID",
                "$.plugins[0].id",
                config.copy(plugins = listOf(config.plugins.single().copy(id = ""))),
            ),
            InvalidCase(
                "malformed plugin SPI range",
                "$.plugins[0].spiRange",
                config.copy(plugins = listOf(config.plugins.single().copy(spiRange = ">=0.1 <0.2 trailing"))),
            ),
            InvalidCase(
                "incompatible plugin SPI range",
                "$.plugins[0].spiRange",
                config.copy(plugins = listOf(config.plugins.single().copy(spiRange = ">=0.2 <0.3"))),
            ),
            InvalidCase(
                "invalid diagnostic code",
                "$.diagnostics.warningAllowlist[0]",
                config.copy(diagnostics = config.diagnostics.copy(warningAllowlist = listOf("not-a-code"))),
            ),
        )
    }

    private data class InvalidCase(
        val name: String,
        val path: String,
        val config: SdkgenConfigV1Alpha1,
    )
}
