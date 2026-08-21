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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balance/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balance/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2(
  public val bankTransfer:
      InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73? = null,
  public val fundingType: String? = null,
) {
  public class Builder {
    public var bankTransfer: InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73? =
        null

    public var fundingType: String? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2 = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2(
      bankTransfer = bankTransfer,
      fundingType = fundingType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2 must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2(
        bankTransfer = rawObject["bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73>(it) },
        fundingType = rawObject["funding_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankTransfer?.let { put("bank_transfer", json.encodeToJsonElement(it)) }
        value.fundingType?.let { put("funding_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2(block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2 = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2.build(block)
