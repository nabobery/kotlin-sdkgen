package com.nabobery.sdkgen.generated.stripe

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
 * When set, provides configuration for Checkout to collect a shipping address from a customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_address_collection
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb(
  allowedCountries: List<InlineV1CheckoutSessionsPostRequestFormShippingAddressCollebe84ItemXb8fd1f6e>,
) {
  public val allowedCountries:
      List<InlineV1CheckoutSessionsPostRequestFormShippingAddressCollebe84ItemXb8fd1f6e> =
      allowedCountries.toList()

  public class Builder {
    private var allowedCountriesValue:
        List<InlineV1CheckoutSessionsPostRequestFormShippingAddressCollebe84ItemXb8fd1f6e>? = null

    public var allowedCountries:
        List<InlineV1CheckoutSessionsPostRequestFormShippingAddressCollebe84ItemXb8fd1f6e>
      get() = requireNotNull(allowedCountriesValue) { "allowedCountries is required" }.toList()
      set(`value`) {
        allowedCountriesValue = value.toList()
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb {
      check(allowedCountriesValue != null) { "allowedCountries is required" }
      return InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb(
        allowedCountries = allowedCountries,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb must be a JSON object")
      val allowedCountries = json.decodeRequired<List<InlineV1CheckoutSessionsPostRequestFormShippingAddressCollebe84ItemXb8fd1f6e>>(rawObject, "allowed_countries")
      return InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb(
        allowedCountries = allowedCountries,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allowed_countries", json.encodeToJsonElement(value.allowedCountries))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb(block: InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb = InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
