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
 * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise the
 * PDF will render the shipping address from the customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_details
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1(
  public val address: InlineV1InvoicesPostRequestFormShippingDetailsAddressXe572a539,
  public val name: String,
  public val phone: InlineV1InvoicesPostRequestFormShippingDetailsPhoneXa271da88? = null,
) {
  public class Builder {
    private var addressValue: InlineV1InvoicesPostRequestFormShippingDetailsAddressXe572a539? = null

    public var address: InlineV1InvoicesPostRequestFormShippingDetailsAddressXe572a539
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

    public var phone: InlineV1InvoicesPostRequestFormShippingDetailsPhoneXa271da88? = null

    public fun build(): InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1 {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1(
        address = address,
        name = name,
        phone = phone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1 must be a JSON object")
      val address = json.decodeRequired<InlineV1InvoicesPostRequestFormShippingDetailsAddressXe572a539>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1(
        address = address,
        name = name,
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingDetailsPhoneXa271da88>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1")
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

public fun inlineV1InvoicesPostRequestFormShippingDetailsX61db64a1(block: InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1 = InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
