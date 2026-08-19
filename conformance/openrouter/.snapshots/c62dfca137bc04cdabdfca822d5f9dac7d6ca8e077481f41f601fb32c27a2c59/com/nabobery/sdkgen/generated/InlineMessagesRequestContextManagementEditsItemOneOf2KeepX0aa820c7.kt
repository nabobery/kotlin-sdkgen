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

public enum class InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7Branch {
  AnthropicThinkingTurns,
  InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977,
  InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7,
}

public sealed class InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7NoMatchException(
  message: String,
) : InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7DecodingException(message)

internal data class InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7Inspection(
  public val matchesAnthropicThinkingTurns: Boolean,
  public val matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977:
      Boolean,
  public val matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAnthropicThinkingTurns, matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977, matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1/properties/keep.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1/properties/keep
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7.Serializer::class)
public class InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7Inspection,
) {
  public val anthropicThinkingTurns: AnthropicThinkingTurns? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicThinkingTurns) json.decodeFromJsonElement<AnthropicThinkingTurns>(raw) else null }

  public val inlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977:
      InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977) json.decodeFromJsonElement<InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977>(raw) else null }

  public val inlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7:
      InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7) json.decodeFromJsonElement<InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7>(raw) else null }

  public val matchedBranches:
      Set<InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7Branch>
    get() = buildSet {
      if (inspection.matchesAnthropicThinkingTurns) add(InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7Branch.AnthropicThinkingTurns)
      if (inspection.matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977) add(InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7Branch.InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977)
      if (inspection.matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7) add(InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7Branch.InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7 {
      val inspection = inspectInlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7(raw)
      if (inspection.matchCount == 0) {
        throw InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7NoMatchException("InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7) {
      encoder.requireJsonEncoder("InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7(element: JsonElement): InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7Inspection {
  val matchesAnthropicThinkingTurns = element.isJsonDecodable<AnthropicThinkingTurns>()
  val matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977 = element.isJsonDecodable<InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977>()
  val matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7 = element.isJsonDecodable<InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7>()
  return InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7Inspection(
    matchesAnthropicThinkingTurns = matchesAnthropicThinkingTurns,
    matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977 = matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977,
    matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7 = matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7,
    failures = buildList {
      if (!matchesAnthropicThinkingTurns) add("AnthropicThinkingTurns: value does not match AnthropicThinkingTurns")
      if (!matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977) add("InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977: value does not match InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977")
      if (!matchesInlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7) add("InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7: value does not match InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
