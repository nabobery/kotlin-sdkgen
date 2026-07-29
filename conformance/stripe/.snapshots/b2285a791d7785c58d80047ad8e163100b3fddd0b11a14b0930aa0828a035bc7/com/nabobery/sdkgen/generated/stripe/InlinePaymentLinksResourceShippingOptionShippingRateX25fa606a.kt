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

public enum class InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aBranch {
  Branch1,
  ShippingRate,
}

public sealed class InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aNoMatchException(
  message: String,
) : InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aDecodingException(message)

internal data class InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aInspection(
  public val matchesBranch1: Boolean,
  public val matchesShippingRate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesShippingRate).count { it }
}

/**
 * The ID of the Shipping Rate to use for this shipping option.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_shipping_option/properties/shipping_rate
 */
@Serializable(with = InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a.Serializer::class)
public class InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val shippingRate: ShippingRate? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShippingRate) json.decodeFromJsonElement<ShippingRate>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aBranch.Branch1)
      if (inspection.matchesShippingRate) add(InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aBranch.ShippingRate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a {
      val inspection = inspectInlinePaymentLinksResourceShippingOptionShippingRateX25fa606a(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aNoMatchException("InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourceShippingOptionShippingRateX25fa606a(element: JsonElement): InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesShippingRate = element.isJsonDecodable<ShippingRate>()
  return InlinePaymentLinksResourceShippingOptionShippingRateX25fa606aInspection(
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
