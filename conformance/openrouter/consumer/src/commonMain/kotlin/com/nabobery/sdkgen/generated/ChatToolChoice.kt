package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class ChatToolChoiceBranch {
  InlineComponentsSchemasChatToolChoiceAnyOf0,
  InlineComponentsSchemasChatToolChoiceAnyOf1,
  InlineComponentsSchemasChatToolChoiceAnyOf2,
  ChatNamedToolChoice,
  ChatServerToolChoice,
}

public sealed class ChatToolChoiceDecodingException(
  message: String,
) : SerializationException(message)

public class ChatToolChoiceNoMatchException(
  message: String,
) : ChatToolChoiceDecodingException(message)

internal data class ChatToolChoiceInspection(
  public val matchesInlineComponentsSchemasChatToolChoiceAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasChatToolChoiceAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasChatToolChoiceAnyOf2: Boolean,
  public val matchesChatNamedToolChoice: Boolean,
  public val matchesChatServerToolChoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasChatToolChoiceAnyOf0,
      matchesInlineComponentsSchemasChatToolChoiceAnyOf1, matchesInlineComponentsSchemasChatToolChoiceAnyOf2,
        matchesChatNamedToolChoice, matchesChatServerToolChoice).count { it }
}

/**
 * Tool choice configuration
 */
@Serializable(with = ChatToolChoice.Serializer::class)
public class ChatToolChoice internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: ChatToolChoiceInspection,
) {
  public val inlineComponentsSchemasChatToolChoiceAnyOf0:
      InlineComponentsSchemasChatToolChoiceAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineComponentsSchemasChatToolChoiceAnyOf0) json
        .decodeFromJsonElement<InlineComponentsSchemasChatToolChoiceAnyOf0>(raw) else null }

  public val inlineComponentsSchemasChatToolChoiceAnyOf1:
      InlineComponentsSchemasChatToolChoiceAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineComponentsSchemasChatToolChoiceAnyOf1) json
        .decodeFromJsonElement<InlineComponentsSchemasChatToolChoiceAnyOf1>(raw) else null }

  public val inlineComponentsSchemasChatToolChoiceAnyOf2:
      InlineComponentsSchemasChatToolChoiceAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineComponentsSchemasChatToolChoiceAnyOf2) json
        .decodeFromJsonElement<InlineComponentsSchemasChatToolChoiceAnyOf2>(raw) else null }

  public val chatNamedToolChoice: ChatNamedToolChoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesChatNamedToolChoice) json
        .decodeFromJsonElement<ChatNamedToolChoice>(raw) else null }

  public val chatServerToolChoice: ChatServerToolChoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesChatServerToolChoice) json
        .decodeFromJsonElement<ChatServerToolChoice>(raw) else null }

  public val matchedBranches: Set<ChatToolChoiceBranch>
    get() = buildSet {
      if (inspection.matchesInlineComponentsSchemasChatToolChoiceAnyOf0) add(ChatToolChoiceBranch
        .InlineComponentsSchemasChatToolChoiceAnyOf0)
      if (inspection.matchesInlineComponentsSchemasChatToolChoiceAnyOf1) add(ChatToolChoiceBranch
        .InlineComponentsSchemasChatToolChoiceAnyOf1)
      if (inspection.matchesInlineComponentsSchemasChatToolChoiceAnyOf2) add(ChatToolChoiceBranch
        .InlineComponentsSchemasChatToolChoiceAnyOf2)
      if (inspection.matchesChatNamedToolChoice) add(ChatToolChoiceBranch.ChatNamedToolChoice)
      if (inspection.matchesChatServerToolChoice) add(ChatToolChoiceBranch.ChatServerToolChoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): ChatToolChoice {
      val inspection = inspectChatToolChoice(raw)
      if (inspection.matchCount == 0) {
        throw ChatToolChoiceNoMatchException("ChatToolChoice matched 0 branches: " + inspection.failures
          .joinToString("; "))
      }
      return ChatToolChoice(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<ChatToolChoice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatToolChoice {
      val jsonDecoder = decoder.requireJsonDecoder("ChatToolChoice")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: ChatToolChoice) {
      encoder.requireJsonEncoder("ChatToolChoice").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectChatToolChoice(element: JsonElement): ChatToolChoiceInspection {
  val matchesInlineComponentsSchemasChatToolChoiceAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasChatToolChoiceAnyOf0>()
  val matchesInlineComponentsSchemasChatToolChoiceAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasChatToolChoiceAnyOf1>()
  val matchesInlineComponentsSchemasChatToolChoiceAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasChatToolChoiceAnyOf2>()
  val matchesChatNamedToolChoice = element.isJsonDecodable<ChatNamedToolChoice>()
  val matchesChatServerToolChoice = element.isJsonDecodable<ChatServerToolChoice>()
  return ChatToolChoiceInspection(
    matchesInlineComponentsSchemasChatToolChoiceAnyOf0 = matchesInlineComponentsSchemasChatToolChoiceAnyOf0,
    matchesInlineComponentsSchemasChatToolChoiceAnyOf1 = matchesInlineComponentsSchemasChatToolChoiceAnyOf1,
    matchesInlineComponentsSchemasChatToolChoiceAnyOf2 = matchesInlineComponentsSchemasChatToolChoiceAnyOf2,
    matchesChatNamedToolChoice = matchesChatNamedToolChoice,
    matchesChatServerToolChoice = matchesChatServerToolChoice,
    failures = buildList {
      if (!matchesInlineComponentsSchemasChatToolChoiceAnyOf0) add("InlineComponentsSchemasChatToolChoiceAnyOf0: " +
        "value does not match InlineComponentsSchemasChatToolChoiceAnyOf0")
      if (!matchesInlineComponentsSchemasChatToolChoiceAnyOf1) add("InlineComponentsSchemasChatToolChoiceAnyOf1: " +
        "value does not match InlineComponentsSchemasChatToolChoiceAnyOf1")
      if (!matchesInlineComponentsSchemasChatToolChoiceAnyOf2) add("InlineComponentsSchemasChatToolChoiceAnyOf2: " +
        "value does not match InlineComponentsSchemasChatToolChoiceAnyOf2")
      if (!matchesChatNamedToolChoice) add("ChatNamedToolChoice: value does not match ChatNamedToolChoice")
      if (!matchesChatServerToolChoice) add("ChatServerToolChoice: value does not match ChatServerToolChoice")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
