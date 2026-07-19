package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityRampDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig(
  /**
   * Generate this in your Ramp integration settings.
   */
  public val apiKey: String,
  public val baseUrl: String? = null,
  /**
   * Custom HTTP headers to include in requests to Ramp.
   */
  public val headers: Map<String, String>? = null,
) {
  public class Builder {
    private var apiKeyValue: String? = null

    public var apiKey: String
      get() = requireNotNull(apiKeyValue) { "apiKey is required" }
      set(`value`) {
        apiKeyValue = value
      }

    public var baseUrl: String? = null

    /**
     * Custom HTTP headers to include in requests to Ramp.
     */
    public var headers: Map<String, String>? = null

    public fun build(): InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig {
      check(apiKeyValue != null) { "apiKey is required" }
      return InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig(
        apiKey = apiKey,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig must be a " +
          "JSON object")
      val apiKey = json.decodeRequired<String>(raw, "apiKey")
      return InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig(
        apiKey = apiKey,
        baseUrl = raw["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apiKey", value.apiKey)
        value.baseUrl?.let { put("baseUrl", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityRampDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig = InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
