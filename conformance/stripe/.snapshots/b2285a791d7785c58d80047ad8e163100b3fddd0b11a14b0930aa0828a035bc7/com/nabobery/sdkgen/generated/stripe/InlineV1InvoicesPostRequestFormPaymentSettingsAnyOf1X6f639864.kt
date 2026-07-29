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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864(
  public val financialConnections:
      InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e? = null,
  public val verificationMethod:
      InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX82a41510? = null,
) {
  public class Builder {
    public var financialConnections:
        InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e? = null

    public var verificationMethod:
        InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX82a41510? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864 = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864(
      financialConnections = financialConnections,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864 must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsFinancialConnectionsXf3d30f7e>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX82a41510>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.financialConnections?.let { put("financial_connections", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864(block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864 = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864.build(block)
