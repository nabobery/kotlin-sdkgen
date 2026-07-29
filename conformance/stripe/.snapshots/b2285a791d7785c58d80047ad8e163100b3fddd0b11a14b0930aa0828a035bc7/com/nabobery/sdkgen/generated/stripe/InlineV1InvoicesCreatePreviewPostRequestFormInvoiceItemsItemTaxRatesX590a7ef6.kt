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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a) add(InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6Branch.InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a>()
  return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a = matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a) add("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a: value does not match InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
