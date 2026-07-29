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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/billing_details
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639(
  public val address:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209? = null,
  public val email:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473? = null,
  public val name: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea? = null,
  public val phone:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataPhoneXf1170165? = null,
  public val taxId: String? = null,
) {
  public class Builder {
    public var address: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209?
        = null

    public var email: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473? =
        null

    public var name: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea? =
        null

    public var phone: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataPhoneXf1170165? =
        null

    public var taxId: String? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639 = InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639(
      address = address,
      email = email,
      name = name,
      phone = phone,
      taxId = taxId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataPhoneXf1170165>(it) },
        taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639")
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

public fun inlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639(block: InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639 = InlineV1SetupIntentsConfirmPostRequestFormBillingDetailsXc59ec639.build(block)
