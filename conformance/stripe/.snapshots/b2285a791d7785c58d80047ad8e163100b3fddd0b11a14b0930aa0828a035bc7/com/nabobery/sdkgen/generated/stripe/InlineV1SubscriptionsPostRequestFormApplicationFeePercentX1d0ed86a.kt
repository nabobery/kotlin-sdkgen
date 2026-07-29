package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7,
}

public sealed class InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7).count { it }
}

/**
 * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
 * subscription invoice total that will be transferred to the application owner's Stripe account. The request must be
 * made by a platform account on a connected account in order to set an application fee percentage. For more
 * information, see the application fees
 * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/application_fee_percent
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aInspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7:
      InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7) add(InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aBranch.InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aNoMatchException("InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86a(element: JsonElement): InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aInspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7>()
  return InlineV1SubscriptionsPostRequestFormApplicationFeePercentX1d0ed86aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7 = matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7) add("InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7: value does not match InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
