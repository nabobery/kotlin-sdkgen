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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f(
  public val financialConnections:
      InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a? = null,
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX1a998710? = null,
  public val networks:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df? = null,
  public val verificationMethod:
      InlineV1SetupIntentsPostRequestFormVerificationMethodX22d241a7? = null,
) {
  public class Builder {
    public var financialConnections:
        InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a? = null

    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX1a998710? = null

    public var networks: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df? =
        null

    public var verificationMethod: InlineV1SetupIntentsPostRequestFormVerificationMethodX22d241a7? =
        null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f(
      financialConnections = financialConnections,
      mandateOptions = mandateOptions,
      networks = networks,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormFinancialConnectionsXa3c9b85a>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX1a998710>(it) },
        networks = rawObject["networks"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormVerificationMethodX22d241a7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.financialConnections?.let { put("financial_connections", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f.build(block)
