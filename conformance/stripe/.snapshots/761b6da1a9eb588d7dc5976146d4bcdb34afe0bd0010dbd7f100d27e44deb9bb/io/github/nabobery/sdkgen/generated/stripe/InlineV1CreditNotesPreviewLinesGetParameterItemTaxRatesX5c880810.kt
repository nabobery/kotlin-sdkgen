package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810Branch {
  Branch1,
  InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f,
}

public sealed class InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810NoMatchException(
  message: String,
) : InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810DecodingException(message)

internal data class InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items/properties/tax_r
 * ates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items/properties/tax_r
 * ates
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810.Serializer::class)
public class InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f:
      InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f) json.decodeFromJsonElement<InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810Branch.Branch1)
      if (inspection.matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f) add(InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810Branch.InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810 {
      val inspection = inspectInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810NoMatchException("InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810) {
      encoder.requireJsonEncoder("InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810(element: JsonElement): InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f = element.isJsonDecodable<InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f>()
  return InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f = matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f) add("InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f: value does not match InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesAnyOf2X372a759f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
