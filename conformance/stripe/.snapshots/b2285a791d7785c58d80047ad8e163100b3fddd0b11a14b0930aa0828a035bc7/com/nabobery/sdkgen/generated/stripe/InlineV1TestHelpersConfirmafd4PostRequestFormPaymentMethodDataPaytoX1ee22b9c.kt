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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/payto
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c(
  public val accountNumber: String? = null,
  public val bsbNumber: String? = null,
  public val payId: String? = null,
) {
  public class Builder {
    public var accountNumber: String? = null

    public var bsbNumber: String? = null

    public var payId: String? = null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c(
      accountNumber = accountNumber,
      bsbNumber = bsbNumber,
      payId = payId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c must be a JSON object")
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c(
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        bsbNumber = rawObject["bsb_number"]?.let { json.decodeFromJsonElement<String>(it) },
        payId = rawObject["pay_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c")
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

public fun inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c(block: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPaytoX1ee22b9c.build(block)
