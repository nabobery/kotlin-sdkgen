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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_funded_t
 * ransaction_resource_bank_transfer_resource_eu_bank_transfer
 */
@Serializable(with = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer.Serializer::class)
public class CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer(
  /**
   * The BIC of the bank of the sender of the funding.
   */
  public val bic: String? = null,
  /**
   * The last 4 digits of the IBAN of the sender of the funding.
   */
  public val ibanLast4: String? = null,
  /**
   * The full name of the sender, as supplied by the sending bank.
   */
  public val senderName: String? = null,
) {
  public class Builder {
    /**
     * The BIC of the bank of the sender of the funding.
     */
    public var bic: String? = null

    /**
     * The last 4 digits of the IBAN of the sender of the funding.
     */
    public var ibanLast4: String? = null

    /**
     * The full name of the sender, as supplied by the sending bank.
     */
    public var senderName: String? = null

    public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer(
      bic = bic,
      ibanLast4 = ibanLast4,
      senderName = senderName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer must be a JSON object")
      return CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer(
        bic = rawObject["bic"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        ibanLast4 = rawObject["iban_last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        senderName = rawObject["sender_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bic?.let { put("bic", it) }
        value.ibanLast4?.let { put("iban_last4", it) }
        value.senderName?.let { put("sender_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer(block: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer.Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer.build(block)
