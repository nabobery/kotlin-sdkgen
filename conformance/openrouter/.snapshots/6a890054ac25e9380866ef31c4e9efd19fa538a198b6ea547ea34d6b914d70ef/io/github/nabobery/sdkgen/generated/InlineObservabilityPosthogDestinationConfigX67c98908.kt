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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityPosthogDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityPosthogDestination/properties/config
 */
@Serializable(with = InlineObservabilityPosthogDestinationConfigX67c98908.Serializer::class)
public class InlineObservabilityPosthogDestinationConfigX67c98908(
  public val apiKey: String,
  public val endpoint: String? = null,
  headers: Map<String, String>? = null,
) {
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var apiKeyValue: String? = null

    public var apiKey: String
      get() = requireNotNull(apiKeyValue) { "apiKey is required" }
      set(`value`) {
        apiKeyValue = value
      }

    public var endpoint: String? = null

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineObservabilityPosthogDestinationConfigX67c98908 {
      check(apiKeyValue != null) { "apiKey is required" }
      return InlineObservabilityPosthogDestinationConfigX67c98908(
        apiKey = apiKey,
        endpoint = endpoint,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityPosthogDestinationConfigX67c98908 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityPosthogDestinationConfigX67c98908> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityPosthogDestinationConfigX67c98908 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityPosthogDestinationConfigX67c98908")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityPosthogDestinationConfigX67c98908 must be a JSON object")
      val apiKey = json.decodeRequired<String>(rawObject, "apiKey")
      return InlineObservabilityPosthogDestinationConfigX67c98908(
        apiKey = apiKey,
        endpoint = rawObject["endpoint"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityPosthogDestinationConfigX67c98908) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityPosthogDestinationConfigX67c98908")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apiKey", value.apiKey)
        value.endpoint?.let { put("endpoint", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineObservabilityPosthogDestinationConfigX67c98908(block: InlineObservabilityPosthogDestinationConfigX67c98908.Builder.() -> Unit): InlineObservabilityPosthogDestinationConfigX67c98908 = InlineObservabilityPosthogDestinationConfigX67c98908.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityPosthogDestinationConfigX67c98908 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
