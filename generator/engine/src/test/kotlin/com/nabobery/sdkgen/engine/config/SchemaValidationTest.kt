package com.nabobery.sdkgen.engine.config

import com.networknt.schema.InputFormat
import com.networknt.schema.SchemaRegistry
import com.networknt.schema.SpecificationVersion
import kotlinx.serialization.encodeToString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SchemaValidationTest {
    private val schemaText = TestFixtures.text("/com/nabobery/sdkgen/engine/config/sdkgen-v1alpha1.schema.json")
    private val schema =
        SchemaRegistry
            .withDefaultDialect(SpecificationVersion.DRAFT_2020_12)
            .getSchema(schemaText, InputFormat.JSON)
            .also { it.initializeValidators() }

    @Test
    fun `JSON fixture validates against published v1alpha1 schema`() {
        val errors = schema.validate(TestFixtures.text("/fixtures/sdkgen.json"), InputFormat.JSON)

        assertEquals(emptyList<com.networknt.schema.Error>(), errors)
    }

    @Test
    fun `YAML fixture validates after decoding through the shared typed model`() {
        val config = ConfigLoader.decodeYaml(TestFixtures.text("/fixtures/sdkgen.yaml"), "sdkgen.yaml")
        val asJson = ConfigFormats.json.encodeToString(config)
        val errors = schema.validate(asJson, InputFormat.JSON)

        assertEquals(emptyList<com.networknt.schema.Error>(), errors)
    }

    @Test
    fun `published schema and production loader reject representative constraint violations`() {
        val config = TestFixtures.config
        val invalid =
            listOf(
                config.copy(source = config.source.copy(uri = "")),
                config.copy(kotlin = config.kotlin.copy(packageName = "invalid-package")),
                config.copy(runtime = config.runtime.copy(requestTimeoutMillis = 0)),
            )

        invalid.forEach { candidate ->
            val text = ConfigFormats.json.encodeToString(candidate)

            assertTrue(schema.validate(text, InputFormat.JSON).isNotEmpty())
            assertThrows<ConfigValidationException> {
                ConfigLoader.decodeJson(text, "sdkgen.json")
            }
        }
    }

    @Test
    fun `removed resourceGrouping is rejected rather than silently ignored`() {
        // ADR-0018 deleted `naming.resourceGrouping`: it was never read, yet it fed `configDigest`, so
        // changing it moved a compatibility digest while generated output stayed byte-identical. Both the
        // schema and the decoder reject unknown keys, so a config still carrying it fails loudly. That is the
        // intended migration signal — a silently ignored key would leave users believing it still did
        // something, which is the exact failure being removed.
        val carriesRemovedKey =
            TestFixtures.text("/fixtures/sdkgen.json").replace(
                "\"clientName\":",
                "\"resourceGrouping\": \"tags\", \"clientName\":",
            )

        val errors = schema.validate(carriesRemovedKey, InputFormat.JSON)

        assertTrue(errors.any { error -> error.keyword == "additionalProperties" })
        // The decoder rejects it too, independently of the schema: `ignoreUnknownKeys = false`.
        assertThrows<ConfigContractException> {
            ConfigLoader.decodeJson(carriesRemovedKey, "sdkgen.json")
        }
    }

    @Test
    fun `schema rejects unknown fields and identifies the instance path`() {
        val invalid =
            TestFixtures.text("/fixtures/sdkgen.json").replace(
                "\"timeoutSeconds\": 30,",
                "\"timeoutSeconds\": 30, \"surprisePolicy\": \"reject\",",
            )

        val errors = schema.validate(invalid, InputFormat.JSON)

        assertTrue(errors.isNotEmpty())
        assertTrue(errors.any { error -> error.keyword == "additionalProperties" })
        assertTrue(errors.any { error -> error.instanceLocation.toString().contains("source/acquisition") })
    }
}
