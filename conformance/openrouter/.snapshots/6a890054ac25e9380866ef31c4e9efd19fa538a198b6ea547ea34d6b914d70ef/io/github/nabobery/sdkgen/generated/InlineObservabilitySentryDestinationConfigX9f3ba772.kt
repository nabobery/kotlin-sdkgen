package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilitySentryDestination/properties/config
 */
@Serializable(with = InlineObservabilitySentryDestinationConfigX9f3ba772.Serializer::class)
public class InlineObservabilitySentryDestinationConfigX9f3ba772(
  public val dsn: String,
  public val otlpEndpoint: String,
  headers: Map<String, String>? = null,
) {
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

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

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineObservabilitySentryDestinationConfigX9f3ba772 {
      check(dsnValue != null) { "dsn is required" }
      check(otlpEndpointValue != null) { "otlpEndpoint is required" }
      return InlineObservabilitySentryDestinationConfigX9f3ba772(
        dsn = dsn,
        otlpEndpoint = otlpEndpoint,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilitySentryDestinationConfigX9f3ba772 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilitySentryDestinationConfigX9f3ba772> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilitySentryDestinationConfigX9f3ba772 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilitySentryDestinationConfigX9f3ba772")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilitySentryDestinationConfigX9f3ba772 must be a JSON object")
      val dsn = json.decodeRequired<String>(rawObject, "dsn")
      val otlpEndpoint = json.decodeRequired<String>(rawObject, "otlpEndpoint")
      return InlineObservabilitySentryDestinationConfigX9f3ba772(
        dsn = dsn,
        otlpEndpoint = otlpEndpoint,
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilitySentryDestinationConfigX9f3ba772) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilitySentryDestinationConfigX9f3ba772")
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

public fun inlineObservabilitySentryDestinationConfigX9f3ba772(block: InlineObservabilitySentryDestinationConfigX9f3ba772.Builder.() -> Unit): InlineObservabilitySentryDestinationConfigX9f3ba772 = InlineObservabilitySentryDestinationConfigX9f3ba772.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilitySentryDestinationConfigX9f3ba772 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
