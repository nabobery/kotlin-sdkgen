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
            InvalidCase(
                "relative default server",
                "$.runtime.defaultServer",
                config.copy(runtime = config.runtime.copy(defaultServer = "/v1")),
            ),
            InvalidCase(
                "non-http default server",
                "$.runtime.defaultServer",
                config.copy(runtime = config.runtime.copy(defaultServer = "ftp://api.example/v1")),
            ),
            InvalidCase(
                "blank default server",
                "$.runtime.defaultServer",
                config.copy(runtime = config.runtime.copy(defaultServer = "   ")),
            ),
            InvalidCase(
                "default server without a host",
                "$.runtime.defaultServer",
                config.copy(runtime = config.runtime.copy(defaultServer = "https:///v1")),
            ),
            InvalidCase(
                "blank user agent suffix",
                "$.runtime.userAgentSuffix",
                config.copy(runtime = config.runtime.copy(userAgentSuffix = "  ")),
            ),
            InvalidCase(
                "user agent suffix with a line feed",
                "$.runtime.userAgentSuffix",
                config.copy(runtime = config.runtime.copy(userAgentSuffix = "acme\nX-Injected: 1")),
            ),
            InvalidCase(
                "user agent suffix with a carriage return",
                "$.runtime.userAgentSuffix",
                config.copy(runtime = config.runtime.copy(userAgentSuffix = "acme\rX-Injected: 1")),
            ),
        )
    }

    @Test
    fun `loader accepts an absolute http default server and a plain user agent suffix`() {
        val config =
            TestFixtures.config.copy(
                runtime =
                    TestFixtures.config.runtime.copy(
                        defaultServer = "https://api.example/v1",
                        userAgentSuffix = "acme-kotlin/1.0",
                    ),
            )

        val decoded = ConfigLoader.decodeJson(ConfigFormats.json.encodeToString(config), "sdkgen.json")

        assertEquals("https://api.example/v1", decoded.runtime.defaultServer)
        assertEquals("acme-kotlin/1.0", decoded.runtime.userAgentSuffix)
    }

    private data class InvalidCase(
        val name: String,
        val path: String,
        val config: SdkgenConfigV1Alpha1,
    )
}
