package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class PaymentPagesCheckoutSessionShippingAddressCollectionView internal constructor(
  @SerialName("allowed_countries")
  public val allowedCountries: List<InlinePaymentPagesCheckout32bcAllowedCountriesItemX19abb46f>,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_shipping_address_collection
 */
@Serializable(with = PaymentPagesCheckoutSessionShippingAddressCollection.Serializer::class)
public class PaymentPagesCheckoutSessionShippingAddressCollection(
  allowedCountries: List<InlinePaymentPagesCheckout32bcAllowedCountriesItemX19abb46f>,
) {
  /**
   * An array of two-letter ISO country codes representing which countries Checkout should provide as options for
   * shipping locations. Unsupported country codes: `AS, CX, CC, CU, HM, IR, KP, MH, FM, NF, MP, PW, SY, UM, VI`.
   */
  public val allowedCountries: List<InlinePaymentPagesCheckout32bcAllowedCountriesItemX19abb46f> =
      allowedCountries.toList()

  public class Builder {
    private var allowedCountriesValue:
        List<InlinePaymentPagesCheckout32bcAllowedCountriesItemX19abb46f>? = null

    public var allowedCountries: List<InlinePaymentPagesCheckout32bcAllowedCountriesItemX19abb46f>
      get() = requireNotNull(allowedCountriesValue) { "allowedCountries is required" }.toList()
      set(`value`) {
        allowedCountriesValue = value.toList()
      }

    public fun build(): PaymentPagesCheckoutSessionShippingAddressCollection {
      check(allowedCountriesValue != null) { "allowedCountries is required" }
      return PaymentPagesCheckoutSessionShippingAddressCollection(
        allowedCountries = allowedCountries,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionShippingAddressCollection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionShippingAddressCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionShippingAddressCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionShippingAddressCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionShippingAddressCollection must be a JSON object")
      val allowedCountries = json.decodeRequired<List<InlinePaymentPagesCheckout32bcAllowedCountriesItemX19abb46f>>(rawObject, "allowed_countries")
      return PaymentPagesCheckoutSessionShippingAddressCollection(
        allowedCountries = allowedCountries,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionShippingAddressCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionShippingAddressCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allowed_countries", json.encodeToJsonElement(value.allowedCountries))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionShippingAddressCollection(block: PaymentPagesCheckoutSessionShippingAddressCollection.Builder.() -> Unit): PaymentPagesCheckoutSessionShippingAddressCollection = PaymentPagesCheckoutSessionShippingAddressCollection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionShippingAddressCollection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
