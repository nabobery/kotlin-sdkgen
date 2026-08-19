package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

@Serializable
public data class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8View(
  @SerialName("tool_name")
  public val toolName: String,
  public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4,
)

public enum class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feBranch {
  AnthropicTextBlockParam,
  AnthropicImageBlockParam,
  InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8,
  AnthropicSearchResultBlockParam,
  AnthropicDocumentBlockParam,
}

public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feDecodingException(
  message: String,
) : SerializationException(message)

public class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feNoMatchException(
  message: String,
) : InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feDecodingException(message)

internal data class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feInspection(
  public val matchesAnthropicTextBlockParam: Boolean,
  public val matchesAnthropicImageBlockParam: Boolean,
  public val matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8:
      Boolean,
  public val matchesAnthropicSearchResultBlockParam: Boolean,
  public val matchesAnthropicDocumentBlockParam: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAnthropicTextBlockParam, matchesAnthropicImageBlockParam, matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8, matchesAnthropicSearchResultBlockParam, matchesAnthropicDocumentBlockParam).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content/anyOf/1/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content/anyOf/1/items
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feInspection,
) {
  public val anthropicTextBlockParam: AnthropicTextBlockParamView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicTextBlockParam) json.decodeFromJsonElement<AnthropicTextBlockParamView>(raw) else null }

  public val anthropicImageBlockParam: AnthropicImageBlockParamView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicImageBlockParam) json.decodeFromJsonElement<AnthropicImageBlockParamView>(raw) else null }

  public val inlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8:
      InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8) json.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8View>(raw) else null }

  public val anthropicSearchResultBlockParam: AnthropicSearchResultBlockParamView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicSearchResultBlockParam) json.decodeFromJsonElement<AnthropicSearchResultBlockParamView>(raw) else null }

  public val anthropicDocumentBlockParam: AnthropicDocumentBlockParamView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicDocumentBlockParam) json.decodeFromJsonElement<AnthropicDocumentBlockParamView>(raw) else null }

  public val matchedBranches:
      Set<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feBranch>
    get() = buildSet {
      if (inspection.matchesAnthropicTextBlockParam) add(InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feBranch.AnthropicTextBlockParam)
      if (inspection.matchesAnthropicImageBlockParam) add(InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feBranch.AnthropicImageBlockParam)
      if (inspection.matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8) add(InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feBranch.InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8)
      if (inspection.matchesAnthropicSearchResultBlockParam) add(InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feBranch.AnthropicSearchResultBlockParam)
      if (inspection.matchesAnthropicDocumentBlockParam) add(InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feBranch.AnthropicDocumentBlockParam)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe {
      val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe(raw)
      if (inspection.matchCount == 0) {
        throw InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feNoMatchException("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe) {
      encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe(element: JsonElement): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feInspection {
  val raw = element as? JsonObject ?: return InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feInspection(
    matchesAnthropicTextBlockParam = false,
    matchesAnthropicImageBlockParam = false,
    matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8 = false,
    matchesAnthropicSearchResultBlockParam = false,
    matchesAnthropicDocumentBlockParam = false,
    failures = listOf("AnthropicTextBlockParam: expected JSON object", "AnthropicImageBlockParam: expected JSON object", "InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8: expected JSON object", "AnthropicSearchResultBlockParam: expected JSON object", "AnthropicDocumentBlockParam: expected JSON object"),
  )
  val matchesAnthropicTextBlockParam = raw["text"].isString() && raw["type"] != null
  val matchesAnthropicImageBlockParam = raw["source"] != null && raw["type"] != null
  val matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8 = raw["tool_name"].isString() && raw["type"] != null
  val matchesAnthropicSearchResultBlockParam = raw["content"] != null && raw["source"].isString() && raw["title"].isString() && raw["type"] != null
  val matchesAnthropicDocumentBlockParam = raw["source"] != null && raw["type"] != null
  return InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8feInspection(
    matchesAnthropicTextBlockParam = matchesAnthropicTextBlockParam,
    matchesAnthropicImageBlockParam = matchesAnthropicImageBlockParam,
    matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8 = matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8,
    matchesAnthropicSearchResultBlockParam = matchesAnthropicSearchResultBlockParam,
    matchesAnthropicDocumentBlockParam = matchesAnthropicDocumentBlockParam,
    failures = buildList {
      if (!matchesAnthropicTextBlockParam) add("AnthropicTextBlockParam: required properties 'text', 'type' do not match their declared types")
      if (!matchesAnthropicImageBlockParam) add("AnthropicImageBlockParam: required properties 'source', 'type' do not match their declared types")
      if (!matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8: required properties 'tool_name', 'type' do not match their declared types")
      if (!matchesAnthropicSearchResultBlockParam) add("AnthropicSearchResultBlockParam: required properties 'content', 'source', 'title', 'type' do not match their declared types")
      if (!matchesAnthropicDocumentBlockParam) add("AnthropicDocumentBlockParam: required properties 'source', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
