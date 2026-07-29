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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20(
  public val financialConnections:
      InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd? = null,
  public val mandateOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97? = null,
  public val networks:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b? = null,
  public val targetDate: String? = null,
  public val transactionPurpose:
      InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47? = null,
  public val verificationMethod:
      InlineV1PaymentIntentsPostRequestFormVerificationMethodX6fde7bc7? = null,
) {
  public class Builder {
    public var financialConnections:
        InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd? = null

    public var mandateOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97? = null

    public var networks: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95?
        = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b? =
        null

    public var targetDate: String? = null

    public var transactionPurpose: InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47?
        = null

    public var verificationMethod: InlineV1PaymentIntentsPostRequestFormVerificationMethodX6fde7bc7?
        = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20(
      financialConnections = financialConnections,
      mandateOptions = mandateOptions,
      networks = networks,
      setupFutureUsage = setupFutureUsage,
      targetDate = targetDate,
      transactionPurpose = transactionPurpose,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX8f29f0dd>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97>(it) },
        networks = rawObject["networks"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
        transactionPurpose = rawObject["transaction_purpose"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormVerificationMethodX6fde7bc7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.financialConnections?.let { put("financial_connections", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.targetDate?.let { put("target_date", it) }
        value.transactionPurpose?.let { put("transaction_purpose", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X1ed37f20.build(block)
