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

public enum class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcBranch {
  Branch1,
  InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11,
}

public sealed class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcDecodingException(message)

internal data class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/discounts
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc.Serializer::class)
public class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcInspection,
) {
  public val branch1: List<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXa8bcd986>?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXa8bcd986>>(raw) else null }

  public val inlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11:
      InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11>(raw) else null }

  public val matchedBranches:
      Set<InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcBranch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11) add(InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcBranch.InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc {
      val inspection = inspectInlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcNoMatchException("InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc(element: JsonElement): InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXa8bcd986>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11 = element.isJsonDecodable<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11>()
  return InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdcInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11 = matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11) add("InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11: value does not match InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
