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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityRampDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityRampDestination/properties/config
 */
@Serializable(with = InlineObservabilityRampDestinationConfigX6c5677e2.Serializer::class)
public class InlineObservabilityRampDestinationConfigX6c5677e2(
  /**
   * Generate this in your Ramp integration settings.
   */
  public val apiKey: String,
  public val baseUrl: String? = null,
  headers: Map<String, String>? = null,
) {
  /**
   * Custom HTTP headers to include in requests to Ramp.
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var apiKeyValue: String? = null

    public var apiKey: String
      get() = requireNotNull(apiKeyValue) { "apiKey is required" }
      set(`value`) {
        apiKeyValue = value
      }

    public var baseUrl: String? = null

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to Ramp.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineObservabilityRampDestinationConfigX6c5677e2 {
      check(apiKeyValue != null) { "apiKey is required" }
      return InlineObservabilityRampDestinationConfigX6c5677e2(
        apiKey = apiKey,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityRampDestinationConfigX6c5677e2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityRampDestinationConfigX6c5677e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityRampDestinationConfigX6c5677e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityRampDestinationConfigX6c5677e2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityRampDestinationConfigX6c5677e2 must be a JSON object")
      val apiKey = json.decodeRequired<String>(rawObject, "apiKey")
      return InlineObservabilityRampDestinationConfigX6c5677e2(
        apiKey = apiKey,
        baseUrl = rawObject["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityRampDestinationConfigX6c5677e2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityRampDestinationConfigX6c5677e2")
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

public fun inlineObservabilityRampDestinationConfigX6c5677e2(block: InlineObservabilityRampDestinationConfigX6c5677e2.Builder.() -> Unit): InlineObservabilityRampDestinationConfigX6c5677e2 = InlineObservabilityRampDestinationConfigX6c5677e2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityRampDestinationConfigX6c5677e2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
