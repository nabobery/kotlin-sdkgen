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

public enum class InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bBranch {
  Branch1,
  InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17,
}

public sealed class InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bNoMatchException(
  message: String,
) : InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bDecodingException(message)

internal data class InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17).count { it }
}

/**
 * The coupons, promotion codes & existing discounts which apply to the invoice item or invoice line item. Item
 * discounts are applied before invoice discounts. Pass an empty string to remove previously-defined discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/discounts
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bInspection,
) {
  public val branch1: List<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX3e8f2dfd>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX3e8f2dfd>>(raw) else null }

  public val inlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17:
      InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17) json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bBranch.Branch1)
      if (inspection.matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17) add(InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bBranch.InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b {
      val inspection = inspectInlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bNoMatchException("InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b) {
      encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b(element: JsonElement): InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX3e8f2dfd>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17 = element.isJsonDecodable<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17>()
  return InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17 = matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17) add("InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17: value does not match InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf2Xdd652c17")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
