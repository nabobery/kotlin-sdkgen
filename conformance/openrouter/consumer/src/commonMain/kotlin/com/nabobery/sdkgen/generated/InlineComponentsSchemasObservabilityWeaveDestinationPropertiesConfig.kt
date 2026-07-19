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
 */
@Serializable(with = InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig(
  public val apiKey: String,
  public val entity: String,
  public val project: String,
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

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public fun build(): InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig {
      check(apiKeyValue != null) { "apiKey is required" }
      check(entityValue != null) { "entity is required" }
      check(projectValue != null) { "project is required" }
      return InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig(
        apiKey = apiKey,
        entity = entity,
        project = project,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig must be a " +
          "JSON object")
      val apiKey = json.decodeRequired<String>(raw, "apiKey")
      val entity = json.decodeRequired<String>(raw, "entity")
      val project = json.decodeRequired<String>(raw, "project")
      return InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig(
        apiKey = apiKey,
        entity = entity,
        project = project,
        baseUrl = raw["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig")
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

public fun inlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig = InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
