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

public enum class InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66Branch {
  Branch1,
  InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4,
}

public sealed class InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66NoMatchException(
  message: String,
) : InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66DecodingException(message)

internal data class InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4).count { it }
}

/**
 * The coupons and promotion codes to redeem into discounts for the invoice item or invoice line item.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/discounts
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66Inspection,
) {
  public val branch1: List<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d>>(raw) else null }

  public val inlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4:
      InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4) json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66Branch.Branch1)
      if (inspection.matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4) add(InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66Branch.InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66 {
      val inspection = inspectInlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66NoMatchException("InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66) {
      encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66(element: JsonElement): InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4 = element.isJsonDecodable<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4>()
  return InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4 = matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4) add("InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4: value does not match InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xf22001f4")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
