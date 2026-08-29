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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOpikDestination/properties/config
 */
@Serializable(with = InlineObservabilityOpikDestinationConfigX2c5bed62.Serializer::class)
public class InlineObservabilityOpikDestinationConfigX2c5bed62(
  public val apiKey: String,
  public val projectName: String,
  public val workspace: String,
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

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineObservabilityOpikDestinationConfigX2c5bed62 {
      check(apiKeyValue != null) { "apiKey is required" }
      check(projectNameValue != null) { "projectName is required" }
      check(workspaceValue != null) { "workspace is required" }
      return InlineObservabilityOpikDestinationConfigX2c5bed62(
        apiKey = apiKey,
        projectName = projectName,
        workspace = workspace,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityOpikDestinationConfigX2c5bed62 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityOpikDestinationConfigX2c5bed62> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityOpikDestinationConfigX2c5bed62 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityOpikDestinationConfigX2c5bed62")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityOpikDestinationConfigX2c5bed62 must be a JSON object")
      val apiKey = json.decodeRequired<String>(rawObject, "apiKey")
      val projectName = json.decodeRequired<String>(rawObject, "projectName")
      val workspace = json.decodeRequired<String>(rawObject, "workspace")
      return InlineObservabilityOpikDestinationConfigX2c5bed62(
        apiKey = apiKey,
        projectName = projectName,
        workspace = workspace,
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityOpikDestinationConfigX2c5bed62) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityOpikDestinationConfigX2c5bed62")
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

public fun inlineObservabilityOpikDestinationConfigX2c5bed62(block: InlineObservabilityOpikDestinationConfigX2c5bed62.Builder.() -> Unit): InlineObservabilityOpikDestinationConfigX2c5bed62 = InlineObservabilityOpikDestinationConfigX2c5bed62.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityOpikDestinationConfigX2c5bed62 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
