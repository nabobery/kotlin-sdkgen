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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003Branch {
  Branch1,
  ShippingRate,
}

public sealed class InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003Inspection(
  public val matchesBranch1: Boolean,
  public val matchesShippingRate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesShippingRate).count { it }
}

/**
 * The shipping rate.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_shipping_option/properties/shipping_r
 * ate
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003.Serializer::class)
public class InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val shippingRate: ShippingRate? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShippingRate) json.decodeFromJsonElement<ShippingRate>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003Branch.Branch1)
      if (inspection.matchesShippingRate) add(InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003Branch.ShippingRate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003NoMatchException("InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003(element: JsonElement): InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesShippingRate = element.isJsonDecodable<ShippingRate>()
  return InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003Inspection(
    matchesBranch1 = matchesBranch1,
    matchesShippingRate = matchesShippingRate,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesShippingRate) add("ShippingRate: value does not match ShippingRate")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
