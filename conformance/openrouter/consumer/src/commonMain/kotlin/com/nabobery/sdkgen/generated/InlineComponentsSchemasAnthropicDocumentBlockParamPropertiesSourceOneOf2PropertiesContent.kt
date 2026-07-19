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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentBranch {
  Branch1,
  Branch2,
}

public sealed class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentNoMatchException(
  message: String,
) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentDecodingException(message)

internal data class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source/oneOf/2/properties/con
 * tent.
 */
@Serializable(with = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent
  .Serializer::class)
public class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2:
      List<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144>?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
























































                                                                                                                        .decodeFromJsonElement<List<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144>>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesBranch1) add(InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentBranch.Branch1)
      if (inspection
























































                                                                                                                        .matchesBranch2) add(InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent {
      val inspection =
        inspectInlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentNoMatchException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent) {
      encoder
























































                                                                                                                        .requireJsonEncoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent(element: JsonElement): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element


























































                                                                                                                        .isJsonDecodable<List<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContentInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
