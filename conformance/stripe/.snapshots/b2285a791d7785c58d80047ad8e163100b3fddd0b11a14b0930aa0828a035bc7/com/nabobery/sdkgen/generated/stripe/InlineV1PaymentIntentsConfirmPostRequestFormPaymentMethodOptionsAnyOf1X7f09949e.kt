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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e(
  public val financialConnections:
      InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743? = null,
  public val mandateOptions:
      InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7? = null,
  public val networks: InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX7b98b12b? = null,
  public val targetDate: String? = null,
  public val transactionPurpose:
      InlineV1PaymentIntentsConfirmPostRequestFormTransactionPurposeXe9e10e77? = null,
  public val verificationMethod:
      InlineV1PaymentIntentsConfirmPostRequestFormVerificationMethodX9b6c9028? = null,
) {
  public class Builder {
    public var financialConnections:
        InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743? = null

    public var mandateOptions: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7?
        = null

    public var networks: InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6? = null

    public var setupFutureUsage:
        InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX7b98b12b? = null

    public var targetDate: String? = null

    public var transactionPurpose:
        InlineV1PaymentIntentsConfirmPostRequestFormTransactionPurposeXe9e10e77? = null

    public var verificationMethod:
        InlineV1PaymentIntentsConfirmPostRequestFormVerificationMethodX9b6c9028? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e(
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
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormFinancialConnectionsX09afc743>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXa1c633e7>(it) },
        networks = rawObject["networks"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX7b98b12b>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
        transactionPurpose = rawObject["transaction_purpose"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormTransactionPurposeXe9e10e77>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormVerificationMethodX9b6c9028>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X7f09949e.build(block)
