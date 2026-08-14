package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_details/anyOf/0/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_details/anyOf/0/properties/address
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef(
  public val city: String? = null,
  public val country: String? = null,
  public val line1: String? = null,
  public val line2: String? = null,
  public val postalCode: String? = null,
  public val state: String? = null,
) {
  public class Builder {
    public var city: String? = null

    public var country: String? = null

    public var line1: String? = null

    public var line2: String? = null

    public var postalCode: String? = null

    public var state: String? = null

    public fun build(): InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef = InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef(
      city = city,
      country = country,
      line1 = line1,
      line2 = line2,
      postalCode = postalCode,
      state = state,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef must be a JSON object")
      return InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef(
        city = rawObject["city"]?.let { json.decodeFromJsonElement<String>(it) },
        country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
        line1 = rawObject["line1"]?.let { json.decodeFromJsonElement<String>(it) },
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<String>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.line1?.let { put("line1", it) }
        value.line2?.let { put("line2", it) }
        value.postalCode?.let { put("postal_code", it) }
        value.state?.let { put("state", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef(block: InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef = InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef.build(block)
