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
public data class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8View(
  @SerialName("tool_name")
  public val toolName: String,
  public val type:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4,
)

public enum class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feBranch {
  AnthropicTextBlockParam,
  AnthropicImageBlockParam,
  InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8,
  AnthropicSearchResultBlockParam,
  AnthropicDocumentBlockParam,
}

public sealed class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feDecodingException(message)

internal data class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feInspection(
  public val matchesAnthropicTextBlockParam: Boolean,
  public val matchesAnthropicImageBlockParam: Boolean,
  public val matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8:
      Boolean,
  public val matchesAnthropicSearchResultBlockParam: Boolean,
  public val matchesAnthropicDocumentBlockParam: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAnthropicTextBlockParam, matchesAnthropicImageBlockParam,
      matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8,
        matchesAnthropicSearchResultBlockParam, matchesAnthropicDocumentBlockParam).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content/anyOf/1/items.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe
  .Serializer::class)
public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feInspection,
) {
  public val anthropicTextBlockParam: AnthropicTextBlockParamView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicTextBlockParam) json
        .decodeFromJsonElement<AnthropicTextBlockParamView>(raw) else null }

  public val anthropicImageBlockParam: AnthropicImageBlockParamView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicImageBlockParam) json
        .decodeFromJsonElement<AnthropicImageBlockParamView>(raw) else null }

  public val inlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8View>(raw) else null }

  public val anthropicSearchResultBlockParam: AnthropicSearchResultBlockParamView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicSearchResultBlockParam) json
        .decodeFromJsonElement<AnthropicSearchResultBlockParamView>(raw) else null }

  public val anthropicDocumentBlockParam: AnthropicDocumentBlockParamView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicDocumentBlockParam) json
        .decodeFromJsonElement<AnthropicDocumentBlockParamView>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesAnthropicTextBlockParam) add(InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feBranch.AnthropicTextBlockParam)
      if (inspection
























































                                                                                                                        .matchesAnthropicImageBlockParam) add(InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feBranch.AnthropicImageBlockParam)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8) add(InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feBranch.InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8)
      if (inspection
























































                                                                                                                        .matchesAnthropicSearchResultBlockParam) add(InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feBranch.AnthropicSearchResultBlockParam)
      if (inspection
























































                                                                                                                        .matchesAnthropicDocumentBlockParam) add(InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feBranch.AnthropicDocumentBlockParam)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe {
      val inspection =
        inspectInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feNoMatchException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8fe(element: JsonElement): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feInspection {
  val raw = element as? JsonObject ?:
    return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feInspection(
    matchesAnthropicTextBlockParam = false,
    matchesAnthropicImageBlockParam = false,
    matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8 = false,
    matchesAnthropicSearchResultBlockParam = false,
    matchesAnthropicDocumentBlockParam = false,
    failures = listOf("AnthropicTextBlockParam: expected JSON object",
      "AnthropicImageBlockParam: expected JSON object",
        "InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8: expected JSON object", "AnthropicSearchResultBlockParam: expected JSON object", "AnthropicDocumentBlockParam: expected JSON object"),
  )
  val matchesAnthropicTextBlockParam = raw["text"].isString() && raw["type"] != null
  val matchesAnthropicImageBlockParam = raw["source"] != null && raw["type"] != null
  val matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8 =
    raw["tool_name"].isString() && raw["type"] != null
  val matchesAnthropicSearchResultBlockParam = raw["content"] != null && raw["source"].isString() && raw["title"]
    .isString() && raw["type"] != null
  val matchesAnthropicDocumentBlockParam = raw["source"] != null && raw["type"] != null
  return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro1e93d8feInspection(
    matchesAnthropicTextBlockParam = matchesAnthropicTextBlockParam,
    matchesAnthropicImageBlockParam = matchesAnthropicImageBlockParam,
    matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8 =
      matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8,
    matchesAnthropicSearchResultBlockParam = matchesAnthropicSearchResultBlockParam,
    matchesAnthropicDocumentBlockParam = matchesAnthropicDocumentBlockParam,
    failures = buildList {
      if (!matchesAnthropicTextBlockParam) add("AnthropicTextBlockParam: required properties 'text', 'type' do not " +
        "match their declared types")
      if (!matchesAnthropicImageBlockParam) add("AnthropicImageBlockParam: required properties 'source', 'type' do " +
        "not match their declared types")
      if (!matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro00e646e8: " +
        "required properties 'tool_name', 'type' do not match their declared types")
      if (!matchesAnthropicSearchResultBlockParam) add("AnthropicSearchResultBlockParam: required properties " +
        "'content', 'source', 'title', 'type' do not match their declared types")
      if (!matchesAnthropicDocumentBlockParam) add("AnthropicDocumentBlockParam: required properties 'source', 'type' " +
        "do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
