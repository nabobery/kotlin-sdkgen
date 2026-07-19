package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Streaming chat completion chunk
 */
@Serializable(with = ChatStreamChunk.Serializer::class)
public class ChatStreamChunk(
  choices: List<ChatStreamChoice>,
  /**
   * Unix timestamp of creation
   */
  public val created: Int,
  /**
   * Unique chunk identifier
   */
  public val id: String,
  /**
   * Model used for completion
   */
  public val model: String,
  public val objectValue: InlineComponentsSchemasChatStreamChunkPropertiesObject,
  /**
   * Error information
   */
  public val error: InlineComponentsSchemasChatStreamChunkPropertiesError? = null,
  public val openrouterMetadata: OpenRouterMetadata? = null,
  /**
   * The service tier used by the upstream provider for this request
   */
  public val serviceTier: String? = null,
  /**
   * System fingerprint
   */
  public val systemFingerprint: String? = null,
  public val usage: ChatUsage? = null,
) {
  /**
   * List of streaming chunk choices
   */
  public val choices: List<ChatStreamChoice> = choices.toList()

  public class Builder {
    private var choicesValue: List<ChatStreamChoice>? = null

    public var choices: List<ChatStreamChoice>
      get() = requireNotNull(choicesValue) { "choices is required" }
      set(`value`) {
        choicesValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var objectValueValue: InlineComponentsSchemasChatStreamChunkPropertiesObject? = null

    public var objectValue: InlineComponentsSchemasChatStreamChunkPropertiesObject
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * Error information
     */
    public var error: InlineComponentsSchemasChatStreamChunkPropertiesError? = null

    public var openrouterMetadata: OpenRouterMetadata? = null

    /**
     * The service tier used by the upstream provider for this request
     */
    public var serviceTier: String? = null

    /**
     * System fingerprint
     */
    public var systemFingerprint: String? = null

    public var usage: ChatUsage? = null

    public fun build(): ChatStreamChunk {
      check(choicesValue != null) { "choices is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(modelValue != null) { "model is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return ChatStreamChunk(
        choices = choices,
        created = created,
        id = id,
        model = model,
        objectValue = objectValue,
        error = error,
        openrouterMetadata = openrouterMetadata,
        serviceTier = serviceTier,
        systemFingerprint = systemFingerprint,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatStreamChunk = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatStreamChunk> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatStreamChunk {
      val jsonDecoder = decoder.requireJsonDecoder("ChatStreamChunk")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatStreamChunk must be a JSON object")
      val choices = json.decodeRequired<List<ChatStreamChoice>>(raw, "choices")
      val created = json.decodeRequired<Int>(raw, "created")
      val id = json.decodeRequired<String>(raw, "id")
      val model = json.decodeRequired<String>(raw, "model")
      val objectValue = json.decodeRequired<InlineComponentsSchemasChatStreamChunkPropertiesObject>(raw, "object")
      return ChatStreamChunk(
        choices = choices,
        created = created,
        id = id,
        model = model,
        objectValue = objectValue,
        error = raw["error"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasChatStreamChunkPropertiesError>(it) },
        openrouterMetadata = raw["openrouter_metadata"]?.let { json.decodeFromJsonElement<OpenRouterMetadata>(it) },
        serviceTier = raw["service_tier"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        systemFingerprint = raw["system_fingerprint"]?.let { json.decodeFromJsonElement<String>(it) },
        usage = raw["usage"]?.let { json.decodeFromJsonElement<ChatUsage>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatStreamChunk) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatStreamChunk")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("choices", json.encodeToJsonElement(value.choices))
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("model", value.model)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.error?.let { put("error", json.encodeToJsonElement(it)) }
        value.openrouterMetadata?.let { put("openrouter_metadata", json.encodeToJsonElement(it)) }
        value.serviceTier?.let { put("service_tier", it) }
        value.systemFingerprint?.let { put("system_fingerprint", it) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatStreamChunk(block: ChatStreamChunk.Builder.() -> Unit): ChatStreamChunk = ChatStreamChunk.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatStreamChunk is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
