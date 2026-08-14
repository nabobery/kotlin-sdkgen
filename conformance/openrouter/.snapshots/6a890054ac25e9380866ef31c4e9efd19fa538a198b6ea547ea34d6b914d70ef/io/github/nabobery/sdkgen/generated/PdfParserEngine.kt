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

public enum class PdfParserEngineBranch {
  InlinePdfParserEngineAnyOf1Xb22d267d,
  InlinePdfParserEngineAnyOf2X63c52ee1,
}

public sealed class PdfParserEngineDecodingException(
  message: String,
) : SerializationException(message)

public class PdfParserEngineNoMatchException(
  message: String,
) : PdfParserEngineDecodingException(message)

internal data class PdfParserEngineInspection(
  public val matchesInlinePdfParserEngineAnyOf1Xb22d267d: Boolean,
  public val matchesInlinePdfParserEngineAnyOf2X63c52ee1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlinePdfParserEngineAnyOf1Xb22d267d, matchesInlinePdfParserEngineAnyOf2X63c52ee1).count { it }
}

/**
 * The engine to use for parsing PDF files. "pdf-text" is deprecated and automatically redirected to "cloudflare-ai".
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PDFParserEngine
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
  public val inlinePdfParserEngineAnyOf1Xb22d267d: InlinePdfParserEngineAnyOf1Xb22d267d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlinePdfParserEngineAnyOf1Xb22d267d) json.decodeFromJsonElement<InlinePdfParserEngineAnyOf1Xb22d267d>(raw) else null }

  public val inlinePdfParserEngineAnyOf2X63c52ee1: InlinePdfParserEngineAnyOf2X63c52ee1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlinePdfParserEngineAnyOf2X63c52ee1) json.decodeFromJsonElement<InlinePdfParserEngineAnyOf2X63c52ee1>(raw) else null }

  public val matchedBranches: Set<PdfParserEngineBranch>
    get() = buildSet {
      if (inspection.matchesInlinePdfParserEngineAnyOf1Xb22d267d) add(PdfParserEngineBranch.InlinePdfParserEngineAnyOf1Xb22d267d)
      if (inspection.matchesInlinePdfParserEngineAnyOf2X63c52ee1) add(PdfParserEngineBranch.InlinePdfParserEngineAnyOf2X63c52ee1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): PdfParserEngine {
      val inspection = inspectPdfParserEngine(raw)
      if (inspection.matchCount == 0) {
        throw PdfParserEngineNoMatchException("PdfParserEngine matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return PdfParserEngine(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<PdfParserEngine> {
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
  val matchesInlinePdfParserEngineAnyOf1Xb22d267d = element.isJsonDecodable<InlinePdfParserEngineAnyOf1Xb22d267d>()
  val matchesInlinePdfParserEngineAnyOf2X63c52ee1 = element.isJsonDecodable<InlinePdfParserEngineAnyOf2X63c52ee1>()
  return PdfParserEngineInspection(
    matchesInlinePdfParserEngineAnyOf1Xb22d267d = matchesInlinePdfParserEngineAnyOf1Xb22d267d,
    matchesInlinePdfParserEngineAnyOf2X63c52ee1 = matchesInlinePdfParserEngineAnyOf2X63c52ee1,
    failures = buildList {
      if (!matchesInlinePdfParserEngineAnyOf1Xb22d267d) add("InlinePdfParserEngineAnyOf1Xb22d267d: value does not match InlinePdfParserEngineAnyOf1Xb22d267d")
      if (!matchesInlinePdfParserEngineAnyOf2X63c52ee1) add("InlinePdfParserEngineAnyOf2X63c52ee1: value does not match InlinePdfParserEngineAnyOf2X63c52ee1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
