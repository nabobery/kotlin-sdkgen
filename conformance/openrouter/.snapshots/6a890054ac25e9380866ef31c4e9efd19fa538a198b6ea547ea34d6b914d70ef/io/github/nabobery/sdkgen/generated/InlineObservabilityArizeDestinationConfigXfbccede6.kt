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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityArizeDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityArizeDestination/properties/config
 */
@Serializable(with = InlineObservabilityArizeDestinationConfigXfbccede6.Serializer::class)
public class InlineObservabilityArizeDestinationConfigXfbccede6(
  public val apiKey: String,
  /**
   * The name of the tracing project in Arize AX
   */
  public val modelId: String,
  public val spaceKey: String,
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

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineObservabilityArizeDestinationConfigXfbccede6 {
      check(apiKeyValue != null) { "apiKey is required" }
      check(modelIdValue != null) { "modelId is required" }
      check(spaceKeyValue != null) { "spaceKey is required" }
      return InlineObservabilityArizeDestinationConfigXfbccede6(
        apiKey = apiKey,
        modelId = modelId,
        spaceKey = spaceKey,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityArizeDestinationConfigXfbccede6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityArizeDestinationConfigXfbccede6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityArizeDestinationConfigXfbccede6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityArizeDestinationConfigXfbccede6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityArizeDestinationConfigXfbccede6 must be a JSON object")
      val apiKey = json.decodeRequired<String>(rawObject, "apiKey")
      val modelId = json.decodeRequired<String>(rawObject, "modelId")
      val spaceKey = json.decodeRequired<String>(rawObject, "spaceKey")
      return InlineObservabilityArizeDestinationConfigXfbccede6(
        apiKey = apiKey,
        modelId = modelId,
        spaceKey = spaceKey,
        baseUrl = rawObject["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityArizeDestinationConfigXfbccede6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityArizeDestinationConfigXfbccede6")
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

public fun inlineObservabilityArizeDestinationConfigXfbccede6(block: InlineObservabilityArizeDestinationConfigXfbccede6.Builder.() -> Unit): InlineObservabilityArizeDestinationConfigXfbccede6 = InlineObservabilityArizeDestinationConfigXfbccede6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityArizeDestinationConfigXfbccede6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
