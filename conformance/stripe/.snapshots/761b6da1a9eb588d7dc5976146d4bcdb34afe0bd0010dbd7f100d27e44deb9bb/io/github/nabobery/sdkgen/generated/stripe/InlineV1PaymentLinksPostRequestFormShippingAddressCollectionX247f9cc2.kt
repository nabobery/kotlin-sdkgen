package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
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

/**
 * Configuration for collecting the customer's shipping address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/shipping_address_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2(
  allowedCountries: List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84ItemX30ef8e72>,
) {
  public val allowedCountries:
      List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84ItemX30ef8e72> =
      allowedCountries.toList()

  public class Builder {
    private var allowedCountriesValue:
        List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84ItemX30ef8e72>? = null

    public var allowedCountries:
        List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84ItemX30ef8e72>
      get() = requireNotNull(allowedCountriesValue) { "allowedCountries is required" }.toList()
      set(`value`) {
        allowedCountriesValue = value.toList()
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2 {
      check(allowedCountriesValue != null) { "allowedCountries is required" }
      return InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2(
        allowedCountries = allowedCountries,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2 must be a JSON object")
      val allowedCountries = json.decodeRequired<List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84ItemX30ef8e72>>(rawObject, "allowed_countries")
      return InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2(
        allowedCountries = allowedCountries,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allowed_countries", json.encodeToJsonElement(value.allowedCountries))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2(block: InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2 = InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
