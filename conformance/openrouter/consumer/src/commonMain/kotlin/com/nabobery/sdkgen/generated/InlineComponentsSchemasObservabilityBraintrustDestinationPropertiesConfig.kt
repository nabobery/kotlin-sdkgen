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
 */
@Serializable(with = InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig(
  public val apiKey: String,
  public val projectId: String,
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

    private var projectIdValue: String? = null

    public var projectId: String
      get() = requireNotNull(projectIdValue) { "projectId is required" }
      set(`value`) {
        projectIdValue = value
      }

    public var baseUrl: String? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public fun build(): InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig {
      check(apiKeyValue != null) { "apiKey is required" }
      check(projectIdValue != null) { "projectId is required" }
      return InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig(
        apiKey = apiKey,
        projectId = projectId,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig must " +
          "be a JSON object")
      val apiKey = json.decodeRequired<String>(raw, "apiKey")
      val projectId = json.decodeRequired<String>(raw, "projectId")
      return InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig(
        apiKey = apiKey,
        projectId = projectId,
        baseUrl = raw["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig")
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

public fun inlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig = InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
