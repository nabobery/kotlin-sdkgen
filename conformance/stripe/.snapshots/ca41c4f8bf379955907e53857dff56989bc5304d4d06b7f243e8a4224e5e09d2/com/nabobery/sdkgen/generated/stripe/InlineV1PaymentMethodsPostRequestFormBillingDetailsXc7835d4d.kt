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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d(
  public val address: InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad? = null,
  public val email: InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f? = null,
  public val name: InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7? = null,
  public val phone: InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f? = null,
  public val taxId: String? = null,
) {
  public class Builder {
    public var address: InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad? = null

    public var email: InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f? = null

    public var name: InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7? = null

    public var phone: InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f? = null

    public var taxId: String? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d = InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d(
      address = address,
      email = email,
      name = name,
      phone = phone,
      taxId = taxId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f>(it) },
        taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d")
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

public fun inlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d(block: InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d = InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d.build(block)
