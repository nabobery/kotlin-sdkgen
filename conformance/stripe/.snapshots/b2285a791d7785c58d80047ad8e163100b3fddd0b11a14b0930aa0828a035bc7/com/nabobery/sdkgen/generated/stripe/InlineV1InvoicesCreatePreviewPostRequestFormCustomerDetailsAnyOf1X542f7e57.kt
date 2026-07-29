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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/shipping/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/shipping/anyOf/0
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57(
  public val address: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressX80f77ec8,
  public val name: String,
  public val phone: String? = null,
) {
  public class Builder {
    private var addressValue:
        InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressX80f77ec8? = null

    public var address: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressX80f77ec8
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

    public var phone: String? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57 {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57(
        address = address,
        name = name,
        phone = phone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57 must be a JSON object")
      val address = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressX80f77ec8>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57(
        address = address,
        name = name,
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        put("name", value.name)
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57(block: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57 = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
