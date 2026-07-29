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

public enum class InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dBranch {
  Branch1,
  InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb,
}

public sealed class InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dNoMatchException(
  message: String,
) : InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dDecodingException(message)

internal data class InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb).count { it }
}

/**
 * A list of up to 20 tax amounts for this line item. This can be useful if you calculate taxes on your own or use a
 * third-party to calculate them. You cannot set tax amounts if any line item has
 * [tax_rates](https://docs.stripe.com/api/invoices/line_item#invoice_line_item_object-tax_rates) or if the invoice has
 * [default_tax_rates](https://docs.stripe.com/api/invoices/object#invoice_object-default_tax_rates) or uses [automatic
 * tax](https://docs.stripe.com/tax/invoicing). Pass an empty string to remove previously defined tax amounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/tax_amounts
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d.Serializer::class)
public class InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dInspection,
) {
  public val branch1: List<InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemX9c911dab>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemX9c911dab>>(raw) else null }

  public val inlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb:
      InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb) json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb) add(InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dBranch.InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d {
      val inspection = inspectInlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dNoMatchException("InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d) {
      encoder.requireJsonEncoder("InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d(element: JsonElement): InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemX9c911dab>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb = element.isJsonDecodable<InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb>()
  return InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb = matchesInlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb) add("InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb: value does not match InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
