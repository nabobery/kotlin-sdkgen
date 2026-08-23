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
 * If this is a `payto` PaymentMethod, this hash contains details about the PayTo payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payto
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806(
  public val accountNumber: String? = null,
  public val bsbNumber: String? = null,
  public val payId: String? = null,
) {
  public class Builder {
    public var accountNumber: String? = null

    public var bsbNumber: String? = null

    public var payId: String? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806 = InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806(
      accountNumber = accountNumber,
      bsbNumber = bsbNumber,
      payId = payId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806(
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        bsbNumber = rawObject["bsb_number"]?.let { json.decodeFromJsonElement<String>(it) },
        payId = rawObject["pay_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountNumber?.let { put("account_number", it) }
        value.bsbNumber?.let { put("bsb_number", it) }
        value.payId?.let { put("pay_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormPaytoX4cef6806(block: InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806 = InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806.build(block)
