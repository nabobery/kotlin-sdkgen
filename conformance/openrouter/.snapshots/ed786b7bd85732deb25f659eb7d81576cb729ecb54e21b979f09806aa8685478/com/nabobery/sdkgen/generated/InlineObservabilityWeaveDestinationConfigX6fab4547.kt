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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityWeaveDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityWeaveDestination/properties/config
 */
@Serializable(with = InlineObservabilityWeaveDestinationConfigX6fab4547.Serializer::class)
public class InlineObservabilityWeaveDestinationConfigX6fab4547(
  public val apiKey: String,
  public val entity: String,
  public val project: String,
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

    private var entityValue: String? = null

    public var entity: String
      get() = requireNotNull(entityValue) { "entity is required" }
      set(`value`) {
        entityValue = value
      }

    private var projectValue: String? = null

    public var project: String
      get() = requireNotNull(projectValue) { "project is required" }
      set(`value`) {
        projectValue = value
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

    public fun build(): InlineObservabilityWeaveDestinationConfigX6fab4547 {
      check(apiKeyValue != null) { "apiKey is required" }
      check(entityValue != null) { "entity is required" }
      check(projectValue != null) { "project is required" }
      return InlineObservabilityWeaveDestinationConfigX6fab4547(
        apiKey = apiKey,
        entity = entity,
        project = project,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityWeaveDestinationConfigX6fab4547 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityWeaveDestinationConfigX6fab4547> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityWeaveDestinationConfigX6fab4547 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityWeaveDestinationConfigX6fab4547")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityWeaveDestinationConfigX6fab4547 must be a JSON object")
      val apiKey = json.decodeRequired<String>(rawObject, "apiKey")
      val entity = json.decodeRequired<String>(rawObject, "entity")
      val project = json.decodeRequired<String>(rawObject, "project")
      return InlineObservabilityWeaveDestinationConfigX6fab4547(
        apiKey = apiKey,
        entity = entity,
        project = project,
        baseUrl = rawObject["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityWeaveDestinationConfigX6fab4547) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityWeaveDestinationConfigX6fab4547")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apiKey", value.apiKey)
        put("entity", value.entity)
        put("project", value.project)
        value.baseUrl?.let { put("baseUrl", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineObservabilityWeaveDestinationConfigX6fab4547(block: InlineObservabilityWeaveDestinationConfigX6fab4547.Builder.() -> Unit): InlineObservabilityWeaveDestinationConfigX6fab4547 = InlineObservabilityWeaveDestinationConfigX6fab4547.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityWeaveDestinationConfigX6fab4547 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
