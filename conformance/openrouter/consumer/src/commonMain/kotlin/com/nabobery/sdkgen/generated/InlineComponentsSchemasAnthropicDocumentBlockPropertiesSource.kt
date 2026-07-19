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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceBranch {
  AnthropicBase64PdfSource,
  AnthropicPlainTextSource,
}

public sealed class InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceNoMatchException(
  message: String,
) : InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceDecodingException(message)

internal data class InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceInspection(
  public val matchesAnthropicBase64PdfSource: Boolean,
  public val matchesAnthropicPlainTextSource: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAnthropicBase64PdfSource, matchesAnthropicPlainTextSource).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlock/properties/source.
 */
@Serializable(with = InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource.Serializer::class)
public class InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceInspection,
) {
  public val anthropicBase64PdfSource: AnthropicBase64PdfSourceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicBase64PdfSource) json
        .decodeFromJsonElement<AnthropicBase64PdfSourceView>(raw) else null }

  public val anthropicPlainTextSource: AnthropicPlainTextSourceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicPlainTextSource) json
        .decodeFromJsonElement<AnthropicPlainTextSourceView>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceBranch>
    get() = buildSet {
      if (inspection
        .matchesAnthropicBase64PdfSource) add(InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceBranch
          .AnthropicBase64PdfSource)
      if (inspection
        .matchesAnthropicPlainTextSource) add(InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceBranch
          .AnthropicPlainTextSource)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource {
      val inspection = inspectInlineComponentsSchemasAnthropicDocumentBlockPropertiesSource(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceNoMatchException("InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource) {
      encoder.requireJsonEncoder("InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasAnthropicDocumentBlockPropertiesSource(element: JsonElement): InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceInspection {
  val raw = element as? JsonObject ?: return InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceInspection(
    matchesAnthropicBase64PdfSource = false,
    matchesAnthropicPlainTextSource = false,
    failures = listOf("AnthropicBase64PdfSource: expected JSON object",
      "AnthropicPlainTextSource: expected JSON object"),
  )
  val matchesAnthropicBase64PdfSource = raw["data"].isString() && raw["media_type"] != null && raw["type"] != null
  val matchesAnthropicPlainTextSource = raw["data"].isString() && raw["media_type"] != null && raw["type"] != null
  return InlineComponentsSchemasAnthropicDocumentBlockPropertiesSourceInspection(
    matchesAnthropicBase64PdfSource = matchesAnthropicBase64PdfSource,
    matchesAnthropicPlainTextSource = matchesAnthropicPlainTextSource,
    failures = buildList {
      if (!matchesAnthropicBase64PdfSource) add("AnthropicBase64PdfSource: required properties 'data', 'media_type', " +
        "'type' do not match their declared types")
      if (!matchesAnthropicPlainTextSource) add("AnthropicPlainTextSource: required properties 'data', 'media_type', " +
        "'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
