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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOpikDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig(
  public val apiKey: String,
  public val projectName: String,
  public val workspace: String,
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

    private var projectNameValue: String? = null

    public var projectName: String
      get() = requireNotNull(projectNameValue) { "projectName is required" }
      set(`value`) {
        projectNameValue = value
      }

    private var workspaceValue: String? = null

    public var workspace: String
      get() = requireNotNull(workspaceValue) { "workspace is required" }
      set(`value`) {
        workspaceValue = value
      }

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public fun build(): InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig {
      check(apiKeyValue != null) { "apiKey is required" }
      check(projectNameValue != null) { "projectName is required" }
      check(workspaceValue != null) { "workspace is required" }
      return InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig(
        apiKey = apiKey,
        projectName = projectName,
        workspace = workspace,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig must be a " +
          "JSON object")
      val apiKey = json.decodeRequired<String>(raw, "apiKey")
      val projectName = json.decodeRequired<String>(raw, "projectName")
      val workspace = json.decodeRequired<String>(raw, "workspace")
      return InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig(
        apiKey = apiKey,
        projectName = projectName,
        workspace = workspace,
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apiKey", value.apiKey)
        put("projectName", value.projectName)
        put("workspace", value.workspace)
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig = InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
