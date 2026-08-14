package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5Branch {
  Branch1,
  InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9,
}

public sealed class InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5NoMatchException(
  message: String,
) : InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5DecodingException(message)

internal data class InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9).count { it }
}

/**
 * A list of [Tax Rate](https://docs.stripe.com/api/tax_rates) ids. These Tax Rates will override the
 * [`default_tax_rates`](https://docs.stripe.com/api/subscriptions/create#create_subscription-default_tax_rates) on the
 * Subscription. When updating, pass an empty string to remove previously-defined tax rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9:
      InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9) json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9) add(InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5Branch.InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5 {
      val inspection = inspectInlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5NoMatchException("InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5) {
      encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5(element: JsonElement): InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9 = element.isJsonDecodable<InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9>()
  return InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9 = matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9) add("InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9: value does not match InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
