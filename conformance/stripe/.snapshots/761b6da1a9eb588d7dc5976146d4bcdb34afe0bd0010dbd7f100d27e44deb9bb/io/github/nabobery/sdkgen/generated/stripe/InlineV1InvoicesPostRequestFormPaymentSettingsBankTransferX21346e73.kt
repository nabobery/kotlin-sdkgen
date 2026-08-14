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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balance/anyOf/0/propert
 * ies/bank_transfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balance/anyOf/0/propert
 * ies/bank_transfer
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73(
  public val euBankTransfer:
      InlineV1InvoicesPostRequestFormPaymentSettingsEuBankTransferX874368a2? = null,
  public val type: String? = null,
) {
  public class Builder {
    public var euBankTransfer:
        InlineV1InvoicesPostRequestFormPaymentSettingsEuBankTransferX874368a2? = null

    public var type: String? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73 = InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73(
      euBankTransfer = euBankTransfer,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73 must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73(
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsEuBankTransferX874368a2>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73(block: InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73 = InlineV1InvoicesPostRequestFormPaymentSettingsBankTransferX21346e73.build(block)
