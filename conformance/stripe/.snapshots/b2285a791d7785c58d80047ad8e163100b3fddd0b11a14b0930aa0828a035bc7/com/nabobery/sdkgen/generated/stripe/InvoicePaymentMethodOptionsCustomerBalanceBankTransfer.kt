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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_customer_balance_bank_transfer
 */
@Serializable(with = InvoicePaymentMethodOptionsCustomerBalanceBankTransfer.Serializer::class)
public class InvoicePaymentMethodOptionsCustomerBalanceBankTransfer(
  public val euBankTransfer:
      InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer? = null,
  /**
   * The bank transfer type that can be used for funding. Permitted values include: `eu_bank_transfer`,
   * `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
   */
  public val type: String? = null,
) {
  public class Builder {
    public var euBankTransfer: InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer?
        = null

    /**
     * The bank transfer type that can be used for funding. Permitted values include: `eu_bank_transfer`,
     * `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
     */
    public var type: String? = null

    public fun build(): InvoicePaymentMethodOptionsCustomerBalanceBankTransfer = InvoicePaymentMethodOptionsCustomerBalanceBankTransfer(
      euBankTransfer = euBankTransfer,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsCustomerBalanceBankTransfer = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoicePaymentMethodOptionsCustomerBalanceBankTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsCustomerBalanceBankTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsCustomerBalanceBankTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePaymentMethodOptionsCustomerBalanceBankTransfer must be a JSON object")
      return InvoicePaymentMethodOptionsCustomerBalanceBankTransfer(
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<InvoicePaymentMethodOptionsCustomerBalanceBankTransferEuBankTransfer>(it) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePaymentMethodOptionsCustomerBalanceBankTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsCustomerBalanceBankTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePaymentMethodOptionsCustomerBalanceBankTransfer(block: InvoicePaymentMethodOptionsCustomerBalanceBankTransfer.Builder.() -> Unit): InvoicePaymentMethodOptionsCustomerBalanceBankTransfer = InvoicePaymentMethodOptionsCustomerBalanceBankTransfer.build(block)
