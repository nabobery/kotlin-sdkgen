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
 * ransaction_resource_bank_transfer_resource_gb_bank_transfer
 */
@Serializable(with = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer.Serializer::class)
public class CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer(
  /**
   * The last 4 digits of the account number of the sender of the funding.
   */
  public val accountNumberLast4: String? = null,
  /**
   * The full name of the sender, as supplied by the sending bank.
   */
  public val senderName: String? = null,
  /**
   * The sort code of the bank of the sender of the funding
   */
  public val sortCode: String? = null,
) {
  public class Builder {
    /**
     * The last 4 digits of the account number of the sender of the funding.
     */
    public var accountNumberLast4: String? = null

    /**
     * The full name of the sender, as supplied by the sending bank.
     */
    public var senderName: String? = null

    /**
     * The sort code of the bank of the sender of the funding
     */
    public var sortCode: String? = null

    public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer(
      accountNumberLast4 = accountNumberLast4,
      senderName = senderName,
      sortCode = sortCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer must be a JSON object")
      return CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer(
        accountNumberLast4 = rawObject["account_number_last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        senderName = rawObject["sender_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        sortCode = rawObject["sort_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountNumberLast4?.let { put("account_number_last4", it) }
        value.senderName?.let { put("sender_name", it) }
        value.sortCode?.let { put("sort_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer(block: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer.Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer.build(block)
