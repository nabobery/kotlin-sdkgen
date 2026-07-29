package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_details/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_details/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79(
  public val address: InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef,
  public val name: String,
  public val phone: InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1PhoneX9e04fbf9? = null,
) {
  public class Builder {
    private var addressValue: InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef?
        = null

    public var address: InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var phone: InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1PhoneX9e04fbf9? = null

    public fun build(): InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79 {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79(
        address = address,
        name = name,
        phone = phone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79 must be a JSON object")
      val address = json.decodeRequired<InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1AddressX782bd5ef>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79(
        address = address,
        name = name,
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1PhoneX9e04fbf9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        put("name", value.name)
        value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79(block: InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79 = InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
