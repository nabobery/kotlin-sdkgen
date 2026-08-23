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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityBraintrustDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityBraintrustDestination/properties/config
 */
@Serializable(with = InlineObservabilityBraintrustDestinationConfigXca3254f1.Serializer::class)
public class InlineObservabilityBraintrustDestinationConfigXca3254f1(
  public val apiKey: String,
  public val projectId: String,
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

    private var projectIdValue: String? = null

    public var projectId: String
      get() = requireNotNull(projectIdValue) { "projectId is required" }
      set(`value`) {
        projectIdValue = value
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

    public fun build(): InlineObservabilityBraintrustDestinationConfigXca3254f1 {
      check(apiKeyValue != null) { "apiKey is required" }
      check(projectIdValue != null) { "projectId is required" }
      return InlineObservabilityBraintrustDestinationConfigXca3254f1(
        apiKey = apiKey,
        projectId = projectId,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityBraintrustDestinationConfigXca3254f1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityBraintrustDestinationConfigXca3254f1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityBraintrustDestinationConfigXca3254f1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityBraintrustDestinationConfigXca3254f1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityBraintrustDestinationConfigXca3254f1 must be a JSON object")
      val apiKey = json.decodeRequired<String>(rawObject, "apiKey")
      val projectId = json.decodeRequired<String>(rawObject, "projectId")
      return InlineObservabilityBraintrustDestinationConfigXca3254f1(
        apiKey = apiKey,
        projectId = projectId,
        baseUrl = rawObject["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityBraintrustDestinationConfigXca3254f1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityBraintrustDestinationConfigXca3254f1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apiKey", value.apiKey)
        put("projectId", value.projectId)
        value.baseUrl?.let { put("baseUrl", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineObservabilityBraintrustDestinationConfigXca3254f1(block: InlineObservabilityBraintrustDestinationConfigXca3254f1.Builder.() -> Unit): InlineObservabilityBraintrustDestinationConfigXca3254f1 = InlineObservabilityBraintrustDestinationConfigXca3254f1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityBraintrustDestinationConfigXca3254f1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
