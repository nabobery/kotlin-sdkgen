package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/rate-limit-overview/properties/resources.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rate-limit-overview/properties/resources
 */
@Serializable(with = InlineRateLimitOverviewResourcesX18981ee7.Serializer::class)
public class InlineRateLimitOverviewResourcesX18981ee7(
  public val core: RateLimit,
  public val search: RateLimit,
  public val actionsRunnerRegistration: RateLimit? = null,
  public val codeScanningAutofix: RateLimit? = null,
  public val codeSearch: RateLimit? = null,
  public val copilotUsageRecords: RateLimit? = null,
  public val dependencySbom: RateLimit? = null,
  public val dependencySnapshots: RateLimit? = null,
  public val graphql: RateLimit? = null,
  public val integrationManifest: RateLimit? = null,
  public val scim: RateLimit? = null,
  public val sourceImport: RateLimit? = null,
) {
  public class Builder {
    private var coreValue: RateLimit? = null

    public var core: RateLimit
      get() = requireNotNull(coreValue) { "core is required" }
      set(`value`) {
        coreValue = value
      }

    private var searchValue: RateLimit? = null

    public var search: RateLimit
      get() = requireNotNull(searchValue) { "search is required" }
      set(`value`) {
        searchValue = value
      }

    public var actionsRunnerRegistration: RateLimit? = null

    public var codeScanningAutofix: RateLimit? = null

    public var codeSearch: RateLimit? = null

    public var copilotUsageRecords: RateLimit? = null

    public var dependencySbom: RateLimit? = null

    public var dependencySnapshots: RateLimit? = null

    public var graphql: RateLimit? = null

    public var integrationManifest: RateLimit? = null

    public var scim: RateLimit? = null

    public var sourceImport: RateLimit? = null

    public fun build(): InlineRateLimitOverviewResourcesX18981ee7 {
      check(coreValue != null) { "core is required" }
      check(searchValue != null) { "search is required" }
      return InlineRateLimitOverviewResourcesX18981ee7(
        core = core,
        search = search,
        actionsRunnerRegistration = actionsRunnerRegistration,
        codeScanningAutofix = codeScanningAutofix,
        codeSearch = codeSearch,
        copilotUsageRecords = copilotUsageRecords,
        dependencySbom = dependencySbom,
        dependencySnapshots = dependencySnapshots,
        graphql = graphql,
        integrationManifest = integrationManifest,
        scim = scim,
        sourceImport = sourceImport,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRateLimitOverviewResourcesX18981ee7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRateLimitOverviewResourcesX18981ee7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRateLimitOverviewResourcesX18981ee7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRateLimitOverviewResourcesX18981ee7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRateLimitOverviewResourcesX18981ee7 must be a JSON object")
      val core = json.decodeRequired<RateLimit>(rawObject, "core")
      val search = json.decodeRequired<RateLimit>(rawObject, "search")
      return InlineRateLimitOverviewResourcesX18981ee7(
        core = core,
        search = search,
        actionsRunnerRegistration = rawObject["actions_runner_registration"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
        codeScanningAutofix = rawObject["code_scanning_autofix"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
        codeSearch = rawObject["code_search"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
        copilotUsageRecords = rawObject["copilot_usage_records"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
        dependencySbom = rawObject["dependency_sbom"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
        dependencySnapshots = rawObject["dependency_snapshots"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
        graphql = rawObject["graphql"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
        integrationManifest = rawObject["integration_manifest"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
        scim = rawObject["scim"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
        sourceImport = rawObject["source_import"]?.let { json.decodeFromJsonElement<RateLimit>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRateLimitOverviewResourcesX18981ee7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRateLimitOverviewResourcesX18981ee7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("core", json.encodeToJsonElement(value.core))
        put("search", json.encodeToJsonElement(value.search))
        value.actionsRunnerRegistration?.let { put("actions_runner_registration", json.encodeToJsonElement(it)) }
        value.codeScanningAutofix?.let { put("code_scanning_autofix", json.encodeToJsonElement(it)) }
        value.codeSearch?.let { put("code_search", json.encodeToJsonElement(it)) }
        value.copilotUsageRecords?.let { put("copilot_usage_records", json.encodeToJsonElement(it)) }
        value.dependencySbom?.let { put("dependency_sbom", json.encodeToJsonElement(it)) }
        value.dependencySnapshots?.let { put("dependency_snapshots", json.encodeToJsonElement(it)) }
        value.graphql?.let { put("graphql", json.encodeToJsonElement(it)) }
        value.integrationManifest?.let { put("integration_manifest", json.encodeToJsonElement(it)) }
        value.scim?.let { put("scim", json.encodeToJsonElement(it)) }
        value.sourceImport?.let { put("source_import", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRateLimitOverviewResourcesX18981ee7(block: InlineRateLimitOverviewResourcesX18981ee7.Builder.() -> Unit): InlineRateLimitOverviewResourcesX18981ee7 = InlineRateLimitOverviewResourcesX18981ee7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRateLimitOverviewResourcesX18981ee7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
