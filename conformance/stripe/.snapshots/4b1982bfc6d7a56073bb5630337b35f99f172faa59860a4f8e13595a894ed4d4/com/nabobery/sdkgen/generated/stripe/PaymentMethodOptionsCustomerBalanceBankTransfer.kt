package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_customer_balance_bank_transfer
 */
@Serializable(with = PaymentMethodOptionsCustomerBalanceBankTransfer.Serializer::class)
public class PaymentMethodOptionsCustomerBalanceBankTransfer(
  public val euBankTransfer: PaymentMethodOptionsCustomerBalanceEuBankAccount? = null,
  requestedAddressTypes: List<InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55>? = null,
  /**
   * The bank transfer type that this PaymentIntent is allowed to use for funding Permitted values include:
   * `eu_bank_transfer`, `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
   */
  public val type: InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26? = null,
) {
  /**
   * List of address types that should be returned in the financial_addresses response. If not specified, all valid
   * types will be returned.
   *
   * Permitted values include: `sort_code`, `zengin`, `iban`, or `spei`.
   */
  public val requestedAddressTypes:
      List<InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55>? =
      requestedAddressTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var euBankTransfer: PaymentMethodOptionsCustomerBalanceEuBankAccount? = null

    private var requestedAddressTypesValue:
        List<InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55>? = null

    /**
     * List of address types that should be returned in the financial_addresses response. If not specified, all valid
     * types will be returned.
     *
     * Permitted values include: `sort_code`, `zengin`, `iban`, or `spei`.
     */
    public var requestedAddressTypes:
        List<InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55>?
      get() = requestedAddressTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        requestedAddressTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The bank transfer type that this PaymentIntent is allowed to use for funding Permitted values include:
     * `eu_bank_transfer`, `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
     */
    public var type: InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26? = null

    public fun build(): PaymentMethodOptionsCustomerBalanceBankTransfer = PaymentMethodOptionsCustomerBalanceBankTransfer(
      euBankTransfer = euBankTransfer,
      requestedAddressTypes = requestedAddressTypes,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsCustomerBalanceBankTransfer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodOptionsCustomerBalanceBankTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsCustomerBalanceBankTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsCustomerBalanceBankTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsCustomerBalanceBankTransfer must be a JSON object")
      return PaymentMethodOptionsCustomerBalanceBankTransfer(
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<PaymentMethodOptionsCustomerBalanceEuBankAccount>(it) },
        requestedAddressTypes = rawObject["requested_address_types"]?.let { json.decodeFromJsonElement<List<InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55>>(it) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsCustomerBalanceBankTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsCustomerBalanceBankTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
        value.requestedAddressTypes?.let { put("requested_address_types", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsCustomerBalanceBankTransfer(block: PaymentMethodOptionsCustomerBalanceBankTransfer.Builder.() -> Unit): PaymentMethodOptionsCustomerBalanceBankTransfer = PaymentMethodOptionsCustomerBalanceBankTransfer.build(block)
