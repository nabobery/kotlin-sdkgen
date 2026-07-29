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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_tr
 * ansfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_tr
 * ansfer
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f(
  public val euBankTransfer:
      InlineV1InvoicesPostRequestFormPaymentSettingsEuBankTransferXe1315bd8? = null,
  public val type: String? = null,
) {
  public class Builder {
    public var euBankTransfer:
        InlineV1InvoicesPostRequestFormPaymentSettingsEuBankTransferXe1315bd8? = null

    public var type: String? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f = InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f(
      euBankTransfer = euBankTransfer,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f(
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsEuBankTransferXe1315bd8>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f(block: InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f = InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX2686873f.build(block)
