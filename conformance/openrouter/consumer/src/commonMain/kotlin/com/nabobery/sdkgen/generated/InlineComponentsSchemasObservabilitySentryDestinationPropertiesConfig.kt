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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilitySentryDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig(
  public val dsn: String,
  public val otlpEndpoint: String,
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = null,
) {
  public class Builder {
    private var dsnValue: String? = null

    public var dsn: String
      get() = requireNotNull(dsnValue) { "dsn is required" }
      set(`value`) {
        dsnValue = value
      }

    private var otlpEndpointValue: String? = null

    public var otlpEndpoint: String
      get() = requireNotNull(otlpEndpointValue) { "otlpEndpoint is required" }
      set(`value`) {
        otlpEndpointValue = value
      }

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public fun build(): InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig {
      check(dsnValue != null) { "dsn is required" }
      check(otlpEndpointValue != null) { "otlpEndpoint is required" }
      return InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig(
        dsn = dsn,
        otlpEndpoint = otlpEndpoint,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig must be a " +
          "JSON object")
      val dsn = json.decodeRequired<String>(raw, "dsn")
      val otlpEndpoint = json.decodeRequired<String>(raw, "otlpEndpoint")
      return InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig(
        dsn = dsn,
        otlpEndpoint = otlpEndpoint,
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("dsn", value.dsn)
        put("otlpEndpoint", value.otlpEndpoint)
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig = InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
