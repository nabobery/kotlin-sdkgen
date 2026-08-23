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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399(
  public val address:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52? = null,
  public val email:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9? = null,
  public val name:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9? = null,
  public val phone:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159? = null,
  public val taxId: String? = null,
) {
  public class Builder {
    public var address:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52? = null

    public var email: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9? =
        null

    public var name: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9? =
        null

    public var phone: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159? =
        null

    public var taxId: String? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399 = InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399(
      address = address,
      email = email,
      name = name,
      phone = phone,
      taxId = taxId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159>(it) },
        taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399(block: InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399 = InlineV1PaymentIntentsConfirmPostRequestFormBillingDetailsX890d2399.build(block)
