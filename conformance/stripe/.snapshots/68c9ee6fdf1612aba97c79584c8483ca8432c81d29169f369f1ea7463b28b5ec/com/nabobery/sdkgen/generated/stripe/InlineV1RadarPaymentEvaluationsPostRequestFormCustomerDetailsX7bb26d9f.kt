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
import kotlinx.serialization.json.put

/**
 * Details about the customer associated with the payment evaluation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/customer_details
 */
@Serializable(with = InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f.Serializer::class)
public class InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f(
  public val customer: String? = null,
  public val customerAccount: String? = null,
  public val email: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
) {
  public class Builder {
    public var customer: String? = null

    public var customerAccount: String? = null

    public var email: String? = null

    public var name: String? = null

    public var phone: String? = null

    public fun build(): InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f = InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f(
      customer = customer,
      customerAccount = customerAccount,
      email = email,
      name = name,
      phone = phone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f must be a JSON object")
      return InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f(
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f(block: InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f.Builder.() -> Unit): InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f = InlineV1RadarPaymentEvaluationsPostRequestFormCustomerDetailsX7bb26d9f.build(block)
