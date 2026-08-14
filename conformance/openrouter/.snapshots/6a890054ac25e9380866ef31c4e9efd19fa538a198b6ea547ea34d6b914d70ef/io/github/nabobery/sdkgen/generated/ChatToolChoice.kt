package io.github.nabobery.sdkgen.generated

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
  InlineChatToolChoiceAnyOf1X91ca62e3,
  InlineChatToolChoiceAnyOf2Xffc7d777,
  InlineChatToolChoiceAnyOf3X0afd7cdf,
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
  public val matchesInlineChatToolChoiceAnyOf1X91ca62e3: Boolean,
  public val matchesInlineChatToolChoiceAnyOf2Xffc7d777: Boolean,
  public val matchesInlineChatToolChoiceAnyOf3X0afd7cdf: Boolean,
  public val matchesChatNamedToolChoice: Boolean,
  public val matchesChatServerToolChoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineChatToolChoiceAnyOf1X91ca62e3, matchesInlineChatToolChoiceAnyOf2Xffc7d777, matchesInlineChatToolChoiceAnyOf3X0afd7cdf, matchesChatNamedToolChoice, matchesChatServerToolChoice).count { it }
}

/**
 * Tool choice configuration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice
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
  public val inlineChatToolChoiceAnyOf1X91ca62e3: InlineChatToolChoiceAnyOf1X91ca62e3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineChatToolChoiceAnyOf1X91ca62e3) json.decodeFromJsonElement<InlineChatToolChoiceAnyOf1X91ca62e3>(raw) else null }

  public val inlineChatToolChoiceAnyOf2Xffc7d777: InlineChatToolChoiceAnyOf2Xffc7d777? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineChatToolChoiceAnyOf2Xffc7d777) json.decodeFromJsonElement<InlineChatToolChoiceAnyOf2Xffc7d777>(raw) else null }

  public val inlineChatToolChoiceAnyOf3X0afd7cdf: InlineChatToolChoiceAnyOf3X0afd7cdf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineChatToolChoiceAnyOf3X0afd7cdf) json.decodeFromJsonElement<InlineChatToolChoiceAnyOf3X0afd7cdf>(raw) else null }

  public val chatNamedToolChoice: ChatNamedToolChoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesChatNamedToolChoice) json.decodeFromJsonElement<ChatNamedToolChoice>(raw) else null }

  public val chatServerToolChoice: ChatServerToolChoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesChatServerToolChoice) json.decodeFromJsonElement<ChatServerToolChoice>(raw) else null }

  public val matchedBranches: Set<ChatToolChoiceBranch>
    get() = buildSet {
      if (inspection.matchesInlineChatToolChoiceAnyOf1X91ca62e3) add(ChatToolChoiceBranch.InlineChatToolChoiceAnyOf1X91ca62e3)
      if (inspection.matchesInlineChatToolChoiceAnyOf2Xffc7d777) add(ChatToolChoiceBranch.InlineChatToolChoiceAnyOf2Xffc7d777)
      if (inspection.matchesInlineChatToolChoiceAnyOf3X0afd7cdf) add(ChatToolChoiceBranch.InlineChatToolChoiceAnyOf3X0afd7cdf)
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
        throw ChatToolChoiceNoMatchException("ChatToolChoice matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return ChatToolChoice(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<ChatToolChoice> {
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
  val matchesInlineChatToolChoiceAnyOf1X91ca62e3 = element.isJsonDecodable<InlineChatToolChoiceAnyOf1X91ca62e3>()
  val matchesInlineChatToolChoiceAnyOf2Xffc7d777 = element.isJsonDecodable<InlineChatToolChoiceAnyOf2Xffc7d777>()
  val matchesInlineChatToolChoiceAnyOf3X0afd7cdf = element.isJsonDecodable<InlineChatToolChoiceAnyOf3X0afd7cdf>()
  val matchesChatNamedToolChoice = element.isJsonDecodable<ChatNamedToolChoice>()
  val matchesChatServerToolChoice = element.isJsonDecodable<ChatServerToolChoice>()
  return ChatToolChoiceInspection(
    matchesInlineChatToolChoiceAnyOf1X91ca62e3 = matchesInlineChatToolChoiceAnyOf1X91ca62e3,
    matchesInlineChatToolChoiceAnyOf2Xffc7d777 = matchesInlineChatToolChoiceAnyOf2Xffc7d777,
    matchesInlineChatToolChoiceAnyOf3X0afd7cdf = matchesInlineChatToolChoiceAnyOf3X0afd7cdf,
    matchesChatNamedToolChoice = matchesChatNamedToolChoice,
    matchesChatServerToolChoice = matchesChatServerToolChoice,
    failures = buildList {
      if (!matchesInlineChatToolChoiceAnyOf1X91ca62e3) add("InlineChatToolChoiceAnyOf1X91ca62e3: value does not match InlineChatToolChoiceAnyOf1X91ca62e3")
      if (!matchesInlineChatToolChoiceAnyOf2Xffc7d777) add("InlineChatToolChoiceAnyOf2Xffc7d777: value does not match InlineChatToolChoiceAnyOf2Xffc7d777")
      if (!matchesInlineChatToolChoiceAnyOf3X0afd7cdf) add("InlineChatToolChoiceAnyOf3X0afd7cdf: value does not match InlineChatToolChoiceAnyOf3X0afd7cdf")
      if (!matchesChatNamedToolChoice) add("ChatNamedToolChoice: value does not match ChatNamedToolChoice")
      if (!matchesChatServerToolChoice) add("ChatServerToolChoice: value does not match ChatServerToolChoice")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
