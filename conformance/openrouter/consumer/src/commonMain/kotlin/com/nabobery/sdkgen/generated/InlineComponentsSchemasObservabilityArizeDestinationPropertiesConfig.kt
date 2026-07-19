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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityArizeDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig(
  public val apiKey: String,
  /**
   * The name of the tracing project in Arize AX
   */
  public val modelId: String,
  public val spaceKey: String,
  public val baseUrl: String? = null,
  /**
   * Custom HTTP headers to include in requests to this destination.
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

    private var modelIdValue: String? = null

    public var modelId: String
      get() = requireNotNull(modelIdValue) { "modelId is required" }
      set(`value`) {
        modelIdValue = value
      }

    private var spaceKeyValue: String? = null

    public var spaceKey: String
      get() = requireNotNull(spaceKeyValue) { "spaceKey is required" }
      set(`value`) {
        spaceKeyValue = value
      }

    public var baseUrl: String? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public fun build(): InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig {
      check(apiKeyValue != null) { "apiKey is required" }
      check(modelIdValue != null) { "modelId is required" }
      check(spaceKeyValue != null) { "spaceKey is required" }
      return InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig(
        apiKey = apiKey,
        modelId = modelId,
        spaceKey = spaceKey,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig must be a " +
          "JSON object")
      val apiKey = json.decodeRequired<String>(raw, "apiKey")
      val modelId = json.decodeRequired<String>(raw, "modelId")
      val spaceKey = json.decodeRequired<String>(raw, "spaceKey")
      return InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig(
        apiKey = apiKey,
        modelId = modelId,
        spaceKey = spaceKey,
        baseUrl = raw["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apiKey", value.apiKey)
        put("modelId", value.modelId)
        put("spaceKey", value.spaceKey)
        value.baseUrl?.let { put("baseUrl", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig = InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
