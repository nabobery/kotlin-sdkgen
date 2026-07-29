package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863Branch {
  Branch1,
  InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8,
}

public sealed class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863NoMatchException(
  message: String,
) : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863DecodingException(message)

internal data class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/tax_rates
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863.Serializer::class)
public class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8:
      InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8) json.decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8) add(InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863Branch.InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863 {
      val inspection = inspectInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863NoMatchException("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863) {
      encoder.requireJsonEncoder("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863(element: JsonElement): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8 = element.isJsonDecodable<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8>()
  return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8 = matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8) add("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8: value does not match InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
