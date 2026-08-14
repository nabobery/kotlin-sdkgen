package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768(
  public val financialConnections:
      InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX3277c8da? = null,
  public val mandateOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14? = null,
  public val networks:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX663c7ce7? = null,
  public val targetDate: String? = null,
  public val transactionPurpose:
      InlineV1PaymentIntentsPostRequestFormTransactionPurposeXe750d50c? = null,
  public val verificationMethod:
      InlineV1PaymentIntentsPostRequestFormVerificationMethodX5f5e2bb8? = null,
) {
  public class Builder {
    public var financialConnections:
        InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX3277c8da? = null

    public var mandateOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14? = null

    public var networks: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3?
        = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX663c7ce7? =
        null

    public var targetDate: String? = null

    public var transactionPurpose: InlineV1PaymentIntentsPostRequestFormTransactionPurposeXe750d50c?
        = null

    public var verificationMethod: InlineV1PaymentIntentsPostRequestFormVerificationMethodX5f5e2bb8?
        = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768(
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
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormFinancialConnectionsX3277c8da>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe394eb14>(it) },
        networks = rawObject["networks"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX663c7ce7>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
        transactionPurpose = rawObject["transaction_purpose"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransactionPurposeXe750d50c>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormVerificationMethodX5f5e2bb8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768.build(block)
