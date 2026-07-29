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

public enum class InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efBranch {
  Branch1,
  InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2,
}

public sealed class InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efNoMatchException(
  message: String,
) : InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efDecodingException(message)

internal data class InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2).count { it }
}

/**
 * A list of [Tax Rate](https://docs.stripe.com/api/tax_rates) ids. These Tax Rates will override the
 * [`default_tax_rates`](https://docs.stripe.com/api/subscriptions/create#create_subscription-default_tax_rates) on the
 * Subscription. When updating, pass an empty string to remove previously-defined tax rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2:
      InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2) json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2) add(InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efBranch.InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef {
      val inspection = inspectInlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efNoMatchException("InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef) {
      encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef(element: JsonElement): InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2 = element.isJsonDecodable<InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2>()
  return InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0efInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2 = matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2) add("InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2: value does not match InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
