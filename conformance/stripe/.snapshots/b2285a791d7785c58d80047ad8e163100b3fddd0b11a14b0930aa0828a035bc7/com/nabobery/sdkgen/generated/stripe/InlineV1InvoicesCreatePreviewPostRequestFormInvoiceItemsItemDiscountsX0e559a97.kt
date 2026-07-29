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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/discounts
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97Inspection,
) {
  public val branch1:
      List<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemItemXd1150b7a>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemItemXd1150b7a>>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31) add(InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97Branch.InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemItemXd1150b7a>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31>()
  return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31 = matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31) add("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31: value does not match InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X673caf31")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
