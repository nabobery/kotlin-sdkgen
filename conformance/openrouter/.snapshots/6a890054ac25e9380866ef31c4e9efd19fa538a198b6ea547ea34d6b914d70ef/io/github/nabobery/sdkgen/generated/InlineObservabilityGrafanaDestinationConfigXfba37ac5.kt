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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityGrafanaDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityGrafanaDestination/properties/config
 */
@Serializable(with = InlineObservabilityGrafanaDestinationConfigXfba37ac5.Serializer::class)
public class InlineObservabilityGrafanaDestinationConfigXfba37ac5(
  public val apiKey: String,
  public val instanceId: String,
  public val baseUrl: String? = null,
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

    private var instanceIdValue: String? = null

    public var instanceId: String
      get() = requireNotNull(instanceIdValue) { "instanceId is required" }
      set(`value`) {
        instanceIdValue = value
      }

    public var baseUrl: String? = null

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineObservabilityGrafanaDestinationConfigXfba37ac5 {
      check(apiKeyValue != null) { "apiKey is required" }
      check(instanceIdValue != null) { "instanceId is required" }
      return InlineObservabilityGrafanaDestinationConfigXfba37ac5(
        apiKey = apiKey,
        instanceId = instanceId,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityGrafanaDestinationConfigXfba37ac5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityGrafanaDestinationConfigXfba37ac5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityGrafanaDestinationConfigXfba37ac5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityGrafanaDestinationConfigXfba37ac5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityGrafanaDestinationConfigXfba37ac5 must be a JSON object")
      val apiKey = json.decodeRequired<String>(rawObject, "apiKey")
      val instanceId = json.decodeRequired<String>(rawObject, "instanceId")
      return InlineObservabilityGrafanaDestinationConfigXfba37ac5(
        apiKey = apiKey,
        instanceId = instanceId,
        baseUrl = rawObject["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityGrafanaDestinationConfigXfba37ac5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityGrafanaDestinationConfigXfba37ac5")
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

public fun inlineObservabilityGrafanaDestinationConfigXfba37ac5(block: InlineObservabilityGrafanaDestinationConfigXfba37ac5.Builder.() -> Unit): InlineObservabilityGrafanaDestinationConfigXfba37ac5 = InlineObservabilityGrafanaDestinationConfigXfba37ac5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityGrafanaDestinationConfigXfba37ac5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
