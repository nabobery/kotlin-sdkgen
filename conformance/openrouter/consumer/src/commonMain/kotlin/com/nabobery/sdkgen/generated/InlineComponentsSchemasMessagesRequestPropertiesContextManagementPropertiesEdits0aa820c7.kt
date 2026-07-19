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

public enum class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7Branch {
  AnthropicThinkingTurns,
  InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977,
  InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7,
}

public sealed class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7NoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7DecodingException(message)

internal data class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7Inspection(
  public val matchesAnthropicThinkingTurns: Boolean,
  public val matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977:
      Boolean,
  public val matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAnthropicThinkingTurns,
      matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977,
        matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1/properties/keep.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7
  .Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7Inspection,
) {
  public val anthropicThinkingTurns: AnthropicThinkingTurns? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicThinkingTurns) json
        .decodeFromJsonElement<AnthropicThinkingTurns>(raw) else null }

  public val inlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977>(raw) else null }

  public val inlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7Branch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesAnthropicThinkingTurns) add(InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7Branch.AnthropicThinkingTurns)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977) add(InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7Branch.InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7) add(InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7Branch.InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7 {
      val inspection =
        inspectInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7NoMatchException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7 " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7(element: JsonElement): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7Inspection {
  val matchesAnthropicThinkingTurns = element.isJsonDecodable<AnthropicThinkingTurns>()
  val matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977 = element
    .isJsonDecodable<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977>()
  val matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7 = element
    .isJsonDecodable<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7>()
  return InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0aa820c7Inspection(
    matchesAnthropicThinkingTurns = matchesAnthropicThinkingTurns,
    matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977 =
      matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977,
    matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7 =
      matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7,
    failures = buildList {
      if (!matchesAnthropicThinkingTurns) add("AnthropicThinkingTurns: value does not match AnthropicThinkingTurns")
      if (!matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977) add("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977: " +
        "value does not match InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsa8d91977")
      if (!matchesInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7) add("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7: " +
        "value does not match InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits0890d2a7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
