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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityGrafanaDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig(
  public val apiKey: String,
  public val instanceId: String,
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

    private var instanceIdValue: String? = null

    public var instanceId: String
      get() = requireNotNull(instanceIdValue) { "instanceId is required" }
      set(`value`) {
        instanceIdValue = value
      }

    public var baseUrl: String? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public fun build(): InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig {
      check(apiKeyValue != null) { "apiKey is required" }
      check(instanceIdValue != null) { "instanceId is required" }
      return InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig(
        apiKey = apiKey,
        instanceId = instanceId,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig must be " +
          "a JSON object")
      val apiKey = json.decodeRequired<String>(raw, "apiKey")
      val instanceId = json.decodeRequired<String>(raw, "instanceId")
      return InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig(
        apiKey = apiKey,
        instanceId = instanceId,
        baseUrl = raw["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apiKey", value.apiKey)
        put("instanceId", value.instanceId)
        value.baseUrl?.let { put("baseUrl", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig = InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
