package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Billing information associated with the PaymentMethod that may be used or required by particular types of payment
 * methods.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/billing_details
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975(
  public val address: InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9? = null,
  public val email: InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailX15c9d09b? = null,
  public val name: InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed? = null,
  public val phone: InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX83105b17? = null,
  public val taxId: String? = null,
) {
  public class Builder {
    public var address: InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9? = null

    public var email: InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailX15c9d09b? = null

    public var name: InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed? = null

    public var phone: InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX83105b17? = null

    public var taxId: String? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975 = InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975(
      address = address,
      email = email,
      name = name,
      phone = phone,
      taxId = taxId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailX15c9d09b>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX83105b17>(it) },
        taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
        value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
        value.taxId?.let { put("tax_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975(block: InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975 = InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975.build(block)
