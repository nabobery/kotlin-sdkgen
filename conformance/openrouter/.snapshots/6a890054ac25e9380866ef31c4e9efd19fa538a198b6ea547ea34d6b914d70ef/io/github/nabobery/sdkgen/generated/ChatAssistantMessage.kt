package io.github.nabobery.sdkgen.generated

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
 * Assistant message for requests and responses
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantMessage
 */
@Serializable(with = ChatAssistantMessage.Serializer::class)
public class ChatAssistantMessage(
  public val role: InlineChatAssistantMessageRoleX885f4543,
  public val audio: ChatAudioOutput? = null,
  /**
   * Assistant message content
   */
  public val content: InlineChatAssistantMessageContentX9555b928? = null,
  images: List<InlineChatAssistantImagesItemX3ae5f390>? = null,
  /**
   * Optional name for the assistant
   */
  public val name: String? = null,
  /**
   * Reasoning output
   */
  public val reasoning: String? = null,
  reasoningDetails: List<ReasoningDetailUnion>? = null,
  /**
   * Refusal message if content was refused
   */
  public val refusal: String? = null,
  toolCalls: List<ChatToolCall>? = null,
) {
  public val images: List<InlineChatAssistantImagesItemX3ae5f390>? =
      images?.let { collection0 -> collection0.toList() }

  public val reasoningDetails: List<ReasoningDetailUnion>? =
      reasoningDetails?.let { collection0 -> collection0.toList() }

  /**
   * Tool calls made by the assistant
   */
  public val toolCalls: List<ChatToolCall>? = toolCalls?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var roleValue: InlineChatAssistantMessageRoleX885f4543? = null

    public var role: InlineChatAssistantMessageRoleX885f4543
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public var audio: ChatAudioOutput? = null

    /**
     * Assistant message content
     */
    public var content: InlineChatAssistantMessageContentX9555b928? = null

    private var imagesValue: List<InlineChatAssistantImagesItemX3ae5f390>? = null

    public var images: List<InlineChatAssistantImagesItemX3ae5f390>?
      get() = imagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        imagesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Optional name for the assistant
     */
    public var name: String? = null

    /**
     * Reasoning output
     */
    public var reasoning: String? = null

    private var reasoningDetailsValue: List<ReasoningDetailUnion>? = null

    public var reasoningDetails: List<ReasoningDetailUnion>?
      get() = reasoningDetailsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        reasoningDetailsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Refusal message if content was refused
     */
    public var refusal: String? = null

    private var toolCallsValue: List<ChatToolCall>? = null

    /**
     * Tool calls made by the assistant
     */
    public var toolCalls: List<ChatToolCall>?
      get() = toolCallsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        toolCallsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): ChatAssistantMessage {
      check(roleValue != null) { "role is required" }
      return ChatAssistantMessage(
        role = role,
        audio = audio,
        content = content,
        images = images,
        name = name,
        reasoning = reasoning,
        reasoningDetails = reasoningDetails,
        refusal = refusal,
        toolCalls = toolCalls,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatAssistantMessage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatAssistantMessage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatAssistantMessage {
      val jsonDecoder = decoder.requireJsonDecoder("ChatAssistantMessage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatAssistantMessage must be a JSON object")
      val role = json.decodeRequired<InlineChatAssistantMessageRoleX885f4543>(rawObject, "role")
      return ChatAssistantMessage(
        role = role,
        audio = rawObject["audio"]?.let { json.decodeFromJsonElement<ChatAudioOutput>(it) },
        content = rawObject["content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChatAssistantMessageContentX9555b928?>(element) },
        images = rawObject["images"]?.let { json.decodeFromJsonElement<List<InlineChatAssistantImagesItemX3ae5f390>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        reasoning = rawObject["reasoning"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reasoningDetails = rawObject["reasoning_details"]?.let { json.decodeFromJsonElement<List<ReasoningDetailUnion>>(it) },
        refusal = rawObject["refusal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        toolCalls = rawObject["tool_calls"]?.let { json.decodeFromJsonElement<List<ChatToolCall>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatAssistantMessage) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatAssistantMessage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("role", json.encodeToJsonElement(value.role))
        value.audio?.let { put("audio", json.encodeToJsonElement(it)) }
        value.content?.let { put("content", json.encodeToJsonElement(it)) }
        value.images?.let { put("images", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.reasoning?.let { put("reasoning", it) }
        value.reasoningDetails?.let { put("reasoning_details", json.encodeToJsonElement(it)) }
        value.refusal?.let { put("refusal", it) }
        value.toolCalls?.let { put("tool_calls", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatAssistantMessage(block: ChatAssistantMessage.Builder.() -> Unit): ChatAssistantMessage = ChatAssistantMessage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatAssistantMessage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
