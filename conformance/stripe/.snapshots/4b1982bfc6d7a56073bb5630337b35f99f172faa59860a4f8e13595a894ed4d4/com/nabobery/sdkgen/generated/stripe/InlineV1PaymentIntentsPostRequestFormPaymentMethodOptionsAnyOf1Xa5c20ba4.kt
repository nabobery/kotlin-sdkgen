package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4(
  public val bankTransfer:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf? = null,
  public val fundingType:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFundingTypeXdc00ee45? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXa00cf2b1? = null,
) {
  public class Builder {
    public var bankTransfer:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf? = null

    public var fundingType:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFundingTypeXdc00ee45? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXa00cf2b1? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4(
      bankTransfer = bankTransfer,
      fundingType = fundingType,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4(
        bankTransfer = rawObject["bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf>(it) },
        fundingType = rawObject["funding_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFundingTypeXdc00ee45>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXa00cf2b1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankTransfer?.let { put("bank_transfer", json.encodeToJsonElement(it)) }
        value.fundingType?.let { put("funding_type", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4.build(block)
