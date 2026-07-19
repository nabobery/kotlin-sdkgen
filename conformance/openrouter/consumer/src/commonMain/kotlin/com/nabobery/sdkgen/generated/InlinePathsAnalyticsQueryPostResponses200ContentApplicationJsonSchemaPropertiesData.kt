package com.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/responses/200/content/application~1json/schema/properties
 * /data.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData
  .Serializer::class)
public class InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData(
  `data`: List<JsonObject>,
  public val metadata:
      InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b,
  public val cachedAt: Double? = null,
  /**
   * Warnings about filter resolution issues (e.g. unresolvable api_key_id hashes). The query still runs normally; these
   * inform the caller that some filter values could not be resolved.
   */
  public val warnings: List<String>? = null,
) {
  public val `data`: List<JsonObject> = data.toList()

  public class Builder {
    private var dataValue: List<JsonObject>? = null

    public var `data`: List<JsonObject>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var metadataValue:
        InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b? =
        null

    public var metadata:
        InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b
      get() = requireNotNull(metadataValue) { "metadata is required" }
      set(`value`) {
        metadataValue = value
      }

    public var cachedAt: Double? = null

    /**
     * Warnings about filter resolution issues (e.g. unresolvable api_key_id hashes). The query still runs normally;
     * these inform the caller that some filter values could not be resolved.
     */
    public var warnings: List<String>? = null

    public fun build(): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData {
      check(dataValue != null) { "data is required" }
      check(metadataValue != null) { "metadata is required" }
      return InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData(
        data = data,
        metadata = metadata,
        cachedAt = cachedAt,
        warnings = warnings,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData " +
          "must be a JSON object")
      val data = json.decodeRequired<List<JsonObject>>(raw, "data")
      val metadata = json
        .decodeRequired<InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b>(raw,
          "metadata")
      return InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData(
        data = data,
        metadata = metadata,
        cachedAt = raw["cachedAt"]?.let { json.decodeFromJsonElement<Double>(it) },
        warnings = raw["warnings"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("metadata", json.encodeToJsonElement(value.metadata))
        value.cachedAt?.let { put("cachedAt", json.encodeToJsonElement(it)) }
        value.warnings?.let { put("warnings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData(block: InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData.Builder.() -> Unit): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData = InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesData " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
