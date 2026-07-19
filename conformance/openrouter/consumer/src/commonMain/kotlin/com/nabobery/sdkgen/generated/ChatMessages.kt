package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class ChatMessagesDecodingException(
  message: String,
) : SerializationException(message)

public class ChatMessagesNoMatchException(
  message: String,
) : ChatMessagesDecodingException(message)

public class ChatMessagesAmbiguityException(
  message: String,
) : ChatMessagesDecodingException(message)

/**
 * Chat completion message with role-based discrimination
 */
@Serializable(with = ChatMessages.Serializer::class)
public sealed interface ChatMessages {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ChatSystemMessage internal constructor(
    public val content: InlineComponentsSchemasChatSystemMessagePropertiesContent,
    public val role: InlineComponentsSchemasChatSystemMessagePropertiesRole,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: InlineComponentsSchemasChatSystemMessagePropertiesContent,
        role: InlineComponentsSchemasChatSystemMessagePropertiesRole): ChatSystemMessage = ChatSystemMessage(
        content = content,
        role = role,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("role", "system")
        },
      )
    }
  }

  public class ChatUserMessage internal constructor(
    public val content: InlineComponentsSchemasChatUserMessagePropertiesContent,
    public val role: InlineComponentsSchemasChatUserMessagePropertiesRole,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: InlineComponentsSchemasChatUserMessagePropertiesContent,
        role: InlineComponentsSchemasChatUserMessagePropertiesRole): ChatUserMessage = ChatUserMessage(
        content = content,
        role = role,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("role", "user")
        },
      )
    }
  }

  public class ChatDeveloperMessage internal constructor(
    public val content: InlineComponentsSchemasChatDeveloperMessagePropertiesContent,
    public val role: InlineComponentsSchemasChatDeveloperMessagePropertiesRole,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: InlineComponentsSchemasChatDeveloperMessagePropertiesContent,
        role: InlineComponentsSchemasChatDeveloperMessagePropertiesRole): ChatDeveloperMessage = ChatDeveloperMessage(
        content = content,
        role = role,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("role", "developer")
        },
      )
    }
  }

  public class ChatAssistantMessage internal constructor(
    public val role: InlineComponentsSchemasChatAssistantMessagePropertiesRole,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(role: InlineComponentsSchemasChatAssistantMessagePropertiesRole): ChatAssistantMessage =
        ChatAssistantMessage(
        role = role,
        raw = buildJsonObject {
          put("role", "assistant")
        },
      )
    }
  }

  public class ChatToolMessage internal constructor(
    public val content: InlineComponentsSchemasChatToolMessagePropertiesContent,
    public val role: InlineComponentsSchemasChatToolMessagePropertiesRole,
    public val toolCallId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatMessages {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: InlineComponentsSchemasChatToolMessagePropertiesContent,
        role: InlineComponentsSchemasChatToolMessagePropertiesRole,
        toolCallId: String,
      ): ChatToolMessage = ChatToolMessage(
        content = content,
        role = role,
        toolCallId = toolCallId,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("role", "tool")
          put("tool_call_id", toolCallId)
        },
      )
    }
  }

  public object Serializer : KSerializer<ChatMessages> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatMessages {
      val jsonDecoder = decoder.requireJsonDecoder("ChatMessages")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw ChatMessagesNoMatchException("ChatMessages matched 0 branches: expected JSON object")
      val matches = inspectChatMessages(raw)
      if (matches.size == 0) {
        throw ChatMessagesNoMatchException("ChatMessages matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw ChatMessagesAmbiguityException("ChatMessages matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.roleState3Matches && matches.contentState2Decoded -> ChatSystemMessage(content = requireNotNull(matches
          .contentState2), role = requireNotNull(matches.roleState3), raw = raw)
        matches.roleState5Matches && matches.contentState4Decoded -> ChatUserMessage(content = requireNotNull(matches
          .contentState4), role = requireNotNull(matches.roleState5), raw = raw)
        matches.roleState2Matches && matches.contentState1Decoded -> ChatDeveloperMessage(content =
          requireNotNull(matches.contentState1), role = requireNotNull(matches.roleState2), raw = raw)
        matches.roleState1Matches -> ChatAssistantMessage(role = requireNotNull(matches.roleState1), raw = raw)
        matches.roleState4Matches && matches.contentState3Decoded && matches.toolCallIdDecoded ->
          ChatToolMessage(content = requireNotNull(matches.contentState3), role = requireNotNull(matches.roleState4),
            toolCallId = requireNotNull(matches.toolCallId), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: ChatMessages) {
      encoder.requireJsonEncoder("ChatMessages").encodeJsonElement(value.raw)
    }
  }
}

private data class ChatMessagesInspection(
  public val roleState3: InlineComponentsSchemasChatSystemMessagePropertiesRole?,
  public val roleState3Decoded: Boolean,
  public val roleState3Matches: Boolean,
  public val contentState2: InlineComponentsSchemasChatSystemMessagePropertiesContent?,
  public val contentState2Decoded: Boolean,
  public val roleState5: InlineComponentsSchemasChatUserMessagePropertiesRole?,
  public val roleState5Decoded: Boolean,
  public val roleState5Matches: Boolean,
  public val contentState4: InlineComponentsSchemasChatUserMessagePropertiesContent?,
  public val contentState4Decoded: Boolean,
  public val roleState2: InlineComponentsSchemasChatDeveloperMessagePropertiesRole?,
  public val roleState2Decoded: Boolean,
  public val roleState2Matches: Boolean,
  public val contentState1: InlineComponentsSchemasChatDeveloperMessagePropertiesContent?,
  public val contentState1Decoded: Boolean,
  public val roleState1: InlineComponentsSchemasChatAssistantMessagePropertiesRole?,
  public val roleState1Decoded: Boolean,
  public val roleState1Matches: Boolean,
  public val roleState4: InlineComponentsSchemasChatToolMessagePropertiesRole?,
  public val roleState4Decoded: Boolean,
  public val roleState4Matches: Boolean,
  public val contentState3: InlineComponentsSchemasChatToolMessagePropertiesContent?,
  public val contentState3Decoded: Boolean,
  public val toolCallId: String?,
  public val toolCallIdDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (roleState3Matches && contentState2Decoded) add("ChatSystemMessage")
      if (roleState5Matches && contentState4Decoded) add("ChatUserMessage")
      if (roleState2Matches && contentState1Decoded) add("ChatDeveloperMessage")
      if (roleState1Matches) add("ChatAssistantMessage")
      if (roleState4Matches && contentState3Decoded && toolCallIdDecoded) add("ChatToolMessage")
    }

  public val size: Int
    get() = names.size
}

private fun inspectChatMessages(raw: JsonObject): ChatMessagesInspection {
  val roleState3Result = raw["role"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatSystemMessagePropertiesRole>(element) } }
  val roleState3 = roleState3Result?.getOrNull()
  val roleState3Decoded = roleState3Result?.isSuccess == true
  val roleState3Matches = raw.stringValue("role") == "system" && roleState3Decoded
  val contentState2Result = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatSystemMessagePropertiesContent>(element) } }
  val contentState2 = contentState2Result?.getOrNull()
  val contentState2Decoded = contentState2Result?.isSuccess == true
  val roleState5Result = raw["role"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatUserMessagePropertiesRole>(element) } }
  val roleState5 = roleState5Result?.getOrNull()
  val roleState5Decoded = roleState5Result?.isSuccess == true
  val roleState5Matches = raw.stringValue("role") == "user" && roleState5Decoded
  val contentState4Result = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatUserMessagePropertiesContent>(element) } }
  val contentState4 = contentState4Result?.getOrNull()
  val contentState4Decoded = contentState4Result?.isSuccess == true
  val roleState2Result = raw["role"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatDeveloperMessagePropertiesRole>(element) } }
  val roleState2 = roleState2Result?.getOrNull()
  val roleState2Decoded = roleState2Result?.isSuccess == true
  val roleState2Matches = raw.stringValue("role") == "developer" && roleState2Decoded
  val contentState1Result = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatDeveloperMessagePropertiesContent>(element) } }
  val contentState1 = contentState1Result?.getOrNull()
  val contentState1Decoded = contentState1Result?.isSuccess == true
  val roleState1Result = raw["role"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatAssistantMessagePropertiesRole>(element) } }
  val roleState1 = roleState1Result?.getOrNull()
  val roleState1Decoded = roleState1Result?.isSuccess == true
  val roleState1Matches = raw.stringValue("role") == "assistant" && roleState1Decoded
  val roleState4Result = raw["role"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatToolMessagePropertiesRole>(element) } }
  val roleState4 = roleState4Result?.getOrNull()
  val roleState4Decoded = roleState4Result?.isSuccess == true
  val roleState4Matches = raw.stringValue("role") == "tool" && roleState4Decoded
  val contentState3Result = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatToolMessagePropertiesContent>(element) } }
  val contentState3 = contentState3Result?.getOrNull()
  val contentState3Decoded = contentState3Result?.isSuccess == true
  val toolCallIdResult = raw["tool_call_id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val toolCallId = toolCallIdResult?.getOrNull()
  val toolCallIdDecoded = toolCallIdResult?.isSuccess == true
  return ChatMessagesInspection(
    roleState3 = roleState3,
    roleState3Decoded = roleState3Decoded,
    roleState3Matches = roleState3Matches,
    contentState2 = contentState2,
    contentState2Decoded = contentState2Decoded,
    roleState5 = roleState5,
    roleState5Decoded = roleState5Decoded,
    roleState5Matches = roleState5Matches,
    contentState4 = contentState4,
    contentState4Decoded = contentState4Decoded,
    roleState2 = roleState2,
    roleState2Decoded = roleState2Decoded,
    roleState2Matches = roleState2Matches,
    contentState1 = contentState1,
    contentState1Decoded = contentState1Decoded,
    roleState1 = roleState1,
    roleState1Decoded = roleState1Decoded,
    roleState1Matches = roleState1Matches,
    roleState4 = roleState4,
    roleState4Decoded = roleState4Decoded,
    roleState4Matches = roleState4Matches,
    contentState3 = contentState3,
    contentState3Decoded = contentState3Decoded,
    toolCallId = toolCallId,
    toolCallIdDecoded = toolCallIdDecoded,
    failures = buildList {
      if (!roleState3Matches ||
        !contentState2Decoded) add("ChatSystemMessage: required properties 'role' and 'content' do not match their " +
          "declared types")
      if (!roleState5Matches ||
        !contentState4Decoded) add("ChatUserMessage: required properties 'role' and 'content' do not match their " +
          "declared types")
      if (!roleState2Matches ||
        !contentState1Decoded) add("ChatDeveloperMessage: required properties 'role' and 'content' do not match their " +
          "declared types")
      if (!roleState1Matches) add("ChatAssistantMessage: required properties 'role' do not match their declared types")
      if (!roleState4Matches || !contentState3Decoded ||
        !toolCallIdDecoded) add("ChatToolMessage: required properties 'role' and 'content' and 'tool_call_id' do not " +
          "match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
