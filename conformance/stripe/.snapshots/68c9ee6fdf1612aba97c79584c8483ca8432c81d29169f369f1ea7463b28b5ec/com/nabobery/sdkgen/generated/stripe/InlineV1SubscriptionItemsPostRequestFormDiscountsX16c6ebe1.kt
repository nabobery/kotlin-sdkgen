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

public enum class InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1Branch {
  Branch1,
  InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97,
}

public sealed class InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1NoMatchException(
  message: String,
) : InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1DecodingException(message)

internal data class InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97).count { it }
}

/**
 * The coupons to redeem into discounts for the subscription item.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/discounts
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1Inspection,
) {
  public val branch1: List<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220>>(raw) else null }

  public val inlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97:
      InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97) json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97) add(InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1Branch.InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1 {
      val inspection = inspectInlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1NoMatchException("InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1) {
      encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1(element: JsonElement): InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97 = element.isJsonDecodable<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97>()
  return InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97 = matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97) add("InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97: value does not match InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
