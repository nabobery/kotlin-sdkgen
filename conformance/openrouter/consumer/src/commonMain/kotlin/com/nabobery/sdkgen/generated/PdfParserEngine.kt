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

public enum class PdfParserEngineBranch {
  InlineComponentsSchemasPdfParserEngineAnyOf0,
  InlineComponentsSchemasPdfParserEngineAnyOf1,
}

public sealed class PdfParserEngineDecodingException(
  message: String,
) : SerializationException(message)

public class PdfParserEngineNoMatchException(
  message: String,
) : PdfParserEngineDecodingException(message)

internal data class PdfParserEngineInspection(
  public val matchesInlineComponentsSchemasPdfParserEngineAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasPdfParserEngineAnyOf1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasPdfParserEngineAnyOf0,
      matchesInlineComponentsSchemasPdfParserEngineAnyOf1).count { it }
}

/**
 * The engine to use for parsing PDF files. "pdf-text" is deprecated and automatically redirected to "cloudflare-ai".
 */
@Serializable(with = PdfParserEngine.Serializer::class)
public class PdfParserEngine internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: PdfParserEngineInspection,
) {
  public val inlineComponentsSchemasPdfParserEngineAnyOf0:
      InlineComponentsSchemasPdfParserEngineAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineComponentsSchemasPdfParserEngineAnyOf0) json
        .decodeFromJsonElement<InlineComponentsSchemasPdfParserEngineAnyOf0>(raw) else null }

  public val inlineComponentsSchemasPdfParserEngineAnyOf1:
      InlineComponentsSchemasPdfParserEngineAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineComponentsSchemasPdfParserEngineAnyOf1) json
        .decodeFromJsonElement<InlineComponentsSchemasPdfParserEngineAnyOf1>(raw) else null }

  public val matchedBranches: Set<PdfParserEngineBranch>
    get() = buildSet {
      if (inspection.matchesInlineComponentsSchemasPdfParserEngineAnyOf0) add(PdfParserEngineBranch
        .InlineComponentsSchemasPdfParserEngineAnyOf0)
      if (inspection.matchesInlineComponentsSchemasPdfParserEngineAnyOf1) add(PdfParserEngineBranch
        .InlineComponentsSchemasPdfParserEngineAnyOf1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): PdfParserEngine {
      val inspection = inspectPdfParserEngine(raw)
      if (inspection.matchCount == 0) {
        throw PdfParserEngineNoMatchException("PdfParserEngine matched 0 branches: " + inspection.failures
          .joinToString("; "))
      }
      return PdfParserEngine(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<PdfParserEngine> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PdfParserEngine {
      val jsonDecoder = decoder.requireJsonDecoder("PdfParserEngine")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: PdfParserEngine) {
      encoder.requireJsonEncoder("PdfParserEngine").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectPdfParserEngine(element: JsonElement): PdfParserEngineInspection {
  val matchesInlineComponentsSchemasPdfParserEngineAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasPdfParserEngineAnyOf0>()
  val matchesInlineComponentsSchemasPdfParserEngineAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasPdfParserEngineAnyOf1>()
  return PdfParserEngineInspection(
    matchesInlineComponentsSchemasPdfParserEngineAnyOf0 = matchesInlineComponentsSchemasPdfParserEngineAnyOf0,
    matchesInlineComponentsSchemasPdfParserEngineAnyOf1 = matchesInlineComponentsSchemasPdfParserEngineAnyOf1,
    failures = buildList {
      if (!matchesInlineComponentsSchemasPdfParserEngineAnyOf0) add("InlineComponentsSchemasPdfParserEngineAnyOf0: " +
        "value does not match InlineComponentsSchemasPdfParserEngineAnyOf0")
      if (!matchesInlineComponentsSchemasPdfParserEngineAnyOf1) add("InlineComponentsSchemasPdfParserEngineAnyOf1: " +
        "value does not match InlineComponentsSchemasPdfParserEngineAnyOf1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
