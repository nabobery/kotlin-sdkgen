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

public enum class InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64).count { it }
}

/**
 * The coupons to redeem into discounts for the subscription. A populated array overwrites the existing discounts on the
 * subscription. If not specified or empty array, it leaves the subscription's discounts unchanged. If empty string, it
 * clears the subscription's discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/discounts
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65Inspection,
) {
  public val branch1:
      List<InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf1ItemX70d51604>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf1ItemX70d51604>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64:
      InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64) add(InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65Branch.InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf1ItemX70d51604>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64>()
  return InlineV1CustomersSubscriptionsPostRequestFormDiscountsX4d29ba65Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64 = matchesInlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64) add("InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64: value does not match InlineV1CustomersSubscriptionsPostRequestFormDiscountsAnyOf2Xc5dd0d64")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
