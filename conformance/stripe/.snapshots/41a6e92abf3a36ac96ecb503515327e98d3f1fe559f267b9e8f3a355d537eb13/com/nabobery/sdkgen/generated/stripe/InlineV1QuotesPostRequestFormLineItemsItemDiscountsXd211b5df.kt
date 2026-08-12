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

public enum class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfBranch {
  Branch1,
  InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb,
}

public sealed class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfDecodingException(message)

internal data class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/discounts
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df.Serializer::class)
public class InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfInspection,
) {
  public val branch1: List<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99>?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99>>(raw) else null }

  public val inlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb:
      InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb>(raw) else null }

  public val matchedBranches:
      Set<InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfBranch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb) add(InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfBranch.InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df {
      val inspection = inspectInlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfNoMatchException("InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df(element: JsonElement): InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb = element.isJsonDecodable<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb>()
  return InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5dfInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb = matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb) add("InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb: value does not match InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
