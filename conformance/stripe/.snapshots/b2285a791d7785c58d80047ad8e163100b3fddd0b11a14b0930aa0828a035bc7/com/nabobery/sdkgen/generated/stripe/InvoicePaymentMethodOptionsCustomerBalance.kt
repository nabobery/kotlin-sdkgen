package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class InvoicePaymentMethodOptionsCustomerBalanceView(
  @SerialName("bank_transfer")
  public val bankTransfer: InvoicePaymentMethodOptionsCustomerBalanceBankTransfer? = null,
  @SerialName("funding_type")
  public val fundingType:
      InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_customer_balance
 */
@Serializable(with = InvoicePaymentMethodOptionsCustomerBalance.Serializer::class)
public class InvoicePaymentMethodOptionsCustomerBalance(
  public val bankTransfer: InvoicePaymentMethodOptionsCustomerBalanceBankTransfer? = null,
  /**
   * The funding method type to be used when there are not enough funds in the customer balance. Permitted values
   * include: `bank_transfer`.
   */
  public val fundingType:
      InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61? = null,
) {
  public class Builder {
    public var bankTransfer: InvoicePaymentMethodOptionsCustomerBalanceBankTransfer? = null

    /**
     * The funding method type to be used when there are not enough funds in the customer balance. Permitted values
     * include: `bank_transfer`.
     */
    public var fundingType: InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61? =
        null

    public fun build(): InvoicePaymentMethodOptionsCustomerBalance = InvoicePaymentMethodOptionsCustomerBalance(
      bankTransfer = bankTransfer,
      fundingType = fundingType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsCustomerBalance = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoicePaymentMethodOptionsCustomerBalance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsCustomerBalance {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsCustomerBalance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePaymentMethodOptionsCustomerBalance must be a JSON object")
      return InvoicePaymentMethodOptionsCustomerBalance(
        bankTransfer = rawObject["bank_transfer"]?.let { json.decodeFromJsonElement<InvoicePaymentMethodOptionsCustomerBalanceBankTransfer>(it) },
        fundingType = rawObject["funding_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePaymentMethodOptionsCustomerBalance) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsCustomerBalance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankTransfer?.let { put("bank_transfer", json.encodeToJsonElement(it)) }
        value.fundingType?.let { put("funding_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePaymentMethodOptionsCustomerBalance(block: InvoicePaymentMethodOptionsCustomerBalance.Builder.() -> Unit): InvoicePaymentMethodOptionsCustomerBalance = InvoicePaymentMethodOptionsCustomerBalance.build(block)
