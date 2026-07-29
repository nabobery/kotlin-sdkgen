package com.nabobery.sdkgen.generated.stripe

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
public data class PaymentLinksResourceShippingAddressCollectionView internal constructor(
  @SerialName("allowed_countries")
  public val allowedCountries:
      List<InlinePaymentLinksResourceShippingAddressCollectionAllowedCountriesItemX09a846af>,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_shipping_address_collection
 */
@Serializable(with = PaymentLinksResourceShippingAddressCollection.Serializer::class)
public class PaymentLinksResourceShippingAddressCollection(
  allowedCountries: List<InlinePaymentLinksResourceShippingAddressCollectionAllowedCountriesItemX09a846af>,
) {
  /**
   * An array of two-letter ISO country codes representing which countries Checkout should provide as options for
   * shipping locations. Unsupported country codes: `AS, CX, CC, CU, HM, IR, KP, MH, FM, NF, MP, PW, SD, SY, UM, VI`.
   */
  public val allowedCountries:
      List<InlinePaymentLinksResourceShippingAddressCollectionAllowedCountriesItemX09a846af> =
      allowedCountries.toList()

  public class Builder {
    private var allowedCountriesValue:
        List<InlinePaymentLinksResourceShippingAddressCollectionAllowedCountriesItemX09a846af>? =
        null

    public var allowedCountries:
        List<InlinePaymentLinksResourceShippingAddressCollectionAllowedCountriesItemX09a846af>
      get() = requireNotNull(allowedCountriesValue) { "allowedCountries is required" }.toList()
      set(`value`) {
        allowedCountriesValue = value.toList()
      }

    public fun build(): PaymentLinksResourceShippingAddressCollection {
      check(allowedCountriesValue != null) { "allowedCountries is required" }
      return PaymentLinksResourceShippingAddressCollection(
        allowedCountries = allowedCountries,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceShippingAddressCollection = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourceShippingAddressCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceShippingAddressCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceShippingAddressCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceShippingAddressCollection must be a JSON object")
      val allowedCountries = json.decodeRequired<List<InlinePaymentLinksResourceShippingAddressCollectionAllowedCountriesItemX09a846af>>(rawObject, "allowed_countries")
      return PaymentLinksResourceShippingAddressCollection(
        allowedCountries = allowedCountries,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceShippingAddressCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceShippingAddressCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allowed_countries", json.encodeToJsonElement(value.allowedCountries))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceShippingAddressCollection(block: PaymentLinksResourceShippingAddressCollection.Builder.() -> Unit): PaymentLinksResourceShippingAddressCollection = PaymentLinksResourceShippingAddressCollection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceShippingAddressCollection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
