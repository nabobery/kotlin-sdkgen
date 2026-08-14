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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityLangsmithDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityLangsmithDestination/properties/config
 */
@Serializable(with = InlineObservabilityLangsmithDestinationConfigX8b295aef.Serializer::class)
public class InlineObservabilityLangsmithDestinationConfigX8b295aef(
  public val apiKey: String,
  public val endpoint: String? = null,
  headers: Map<String, String>? = null,
  /**
   * The name for this project, such as pr-openrouter-demo. Defaults to "main" if not set.
   */
  public val project: String? = null,
  /**
   * Required for org-scoped API keys. Find this in your LangSmith workspace settings.
   */
  public val workspaceId: String? = null,
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

    /**
     * The name for this project, such as pr-openrouter-demo. Defaults to "main" if not set.
     */
    public var project: String? = null

    /**
     * Required for org-scoped API keys. Find this in your LangSmith workspace settings.
     */
    public var workspaceId: String? = null

    public fun build(): InlineObservabilityLangsmithDestinationConfigX8b295aef {
      check(apiKeyValue != null) { "apiKey is required" }
      return InlineObservabilityLangsmithDestinationConfigX8b295aef(
        apiKey = apiKey,
        endpoint = endpoint,
        headers = headers,
        project = project,
        workspaceId = workspaceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityLangsmithDestinationConfigX8b295aef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityLangsmithDestinationConfigX8b295aef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityLangsmithDestinationConfigX8b295aef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityLangsmithDestinationConfigX8b295aef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityLangsmithDestinationConfigX8b295aef must be a JSON object")
      val apiKey = json.decodeRequired<String>(rawObject, "apiKey")
      return InlineObservabilityLangsmithDestinationConfigX8b295aef(
        apiKey = apiKey,
        endpoint = rawObject["endpoint"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        project = rawObject["project"]?.let { json.decodeFromJsonElement<String>(it) },
        workspaceId = rawObject["workspaceId"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityLangsmithDestinationConfigX8b295aef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityLangsmithDestinationConfigX8b295aef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apiKey", value.apiKey)
        value.endpoint?.let { put("endpoint", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
        value.project?.let { put("project", it) }
        value.workspaceId?.let { put("workspaceId", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineObservabilityLangsmithDestinationConfigX8b295aef(block: InlineObservabilityLangsmithDestinationConfigX8b295aef.Builder.() -> Unit): InlineObservabilityLangsmithDestinationConfigX8b295aef = InlineObservabilityLangsmithDestinationConfigX8b295aef.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityLangsmithDestinationConfigX8b295aef is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
