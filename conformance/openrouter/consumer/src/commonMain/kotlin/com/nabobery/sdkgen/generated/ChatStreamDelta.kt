package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Delta changes in streaming response
 */
@Serializable(with = ChatStreamDelta.Serializer::class)
public class ChatStreamDelta(
  public val audio: ChatAudioOutput? = null,
  /**
   * Message content delta
   */
  public val content: String? = null,
  /**
   * Reasoning content delta
   */
  public val reasoning: String? = null,
  public val reasoningDetails: List<ReasoningDetailUnion>? = null,
  /**
   * Refusal message delta
   */
  public val refusal: String? = null,
  /**
   * The role of the message author
   */
  public val role: InlineComponentsSchemasChatStreamDeltaPropertiesRole? = null,
  /**
   * Tool calls delta
   */
  public val toolCalls: List<ChatStreamToolCall>? = null,
) {
  public class Builder {
    public var audio: ChatAudioOutput? = null

    /**
     * Message content delta
     */
    public var content: String? = null

    /**
     * Reasoning content delta
     */
    public var reasoning: String? = null

    public var reasoningDetails: List<ReasoningDetailUnion>? = null

    /**
     * Refusal message delta
     */
    public var refusal: String? = null

    /**
     * The role of the message author
     */
    public var role: InlineComponentsSchemasChatStreamDeltaPropertiesRole? = null

    /**
     * Tool calls delta
     */
    public var toolCalls: List<ChatStreamToolCall>? = null

    public fun build(): ChatStreamDelta = ChatStreamDelta(
      audio = audio,
      content = content,
      reasoning = reasoning,
      reasoningDetails = reasoningDetails,
      refusal = refusal,
      role = role,
      toolCalls = toolCalls,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatStreamDelta = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatStreamDelta> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatStreamDelta {
      val jsonDecoder = decoder.requireJsonDecoder("ChatStreamDelta")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatStreamDelta must be a JSON object")
      return ChatStreamDelta(
        audio = raw["audio"]?.let { json.decodeFromJsonElement<ChatAudioOutput>(it) },
        content = raw["content"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        reasoning = raw["reasoning"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        reasoningDetails = raw["reasoning_details"]?.let { json.decodeFromJsonElement<List<ReasoningDetailUnion>>(it) },
        refusal = raw["refusal"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        role = raw["role"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasChatStreamDeltaPropertiesRole>(it) },
        toolCalls = raw["tool_calls"]?.let { json.decodeFromJsonElement<List<ChatStreamToolCall>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatStreamDelta) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatStreamDelta")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.audio?.let { put("audio", json.encodeToJsonElement(it)) }
        value.content?.let { put("content", it) }
        value.reasoning?.let { put("reasoning", it) }
        value.reasoningDetails?.let { put("reasoning_details", json.encodeToJsonElement(it)) }
        value.refusal?.let { put("refusal", it) }
        value.role?.let { put("role", json.encodeToJsonElement(it)) }
        value.toolCalls?.let { put("tool_calls", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatStreamDelta(block: ChatStreamDelta.Builder.() -> Unit): ChatStreamDelta = ChatStreamDelta.build(block)
