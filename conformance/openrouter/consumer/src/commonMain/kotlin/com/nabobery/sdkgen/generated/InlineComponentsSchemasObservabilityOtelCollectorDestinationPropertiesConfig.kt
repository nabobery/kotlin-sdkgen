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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOtelCollectorDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig(
  public val endpoint: String,
  /**
   * Custom HTTP headers as a JSON object. For Axiom, use {"Authorization": "Bearer xaat-xxx", "X-Axiom-Dataset":
   * "your-dataset"}
   */
  public val headers: Map<String, String>? = null,
) {
  public class Builder {
    private var endpointValue: String? = null

    public var endpoint: String
      get() = requireNotNull(endpointValue) { "endpoint is required" }
      set(`value`) {
        endpointValue = value
      }

    /**
     * Custom HTTP headers as a JSON object. For Axiom, use {"Authorization": "Bearer xaat-xxx", "X-Axiom-Dataset":
     * "your-dataset"}
     */
    public var headers: Map<String, String>? = null

    public fun build(): InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig {
      check(endpointValue != null) { "endpoint is required" }
      return InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig(
        endpoint = endpoint,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig " +
          "must be a JSON object")
      val endpoint = json.decodeRequired<String>(raw, "endpoint")
      return InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig(
        endpoint = endpoint,
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("endpoint", value.endpoint)
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig = InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
