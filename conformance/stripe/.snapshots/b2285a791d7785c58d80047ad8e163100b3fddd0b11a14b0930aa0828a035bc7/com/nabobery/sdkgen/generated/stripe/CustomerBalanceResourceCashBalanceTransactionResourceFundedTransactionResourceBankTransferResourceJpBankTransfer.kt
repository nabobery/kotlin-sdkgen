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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_funded_t
 * ransaction_resource_bank_transfer_resource_jp_bank_transfer
 */
@Serializable(with = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer.Serializer::class)
public class CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer(
  /**
   * The name of the bank of the sender of the funding.
   */
  public val senderBank: String? = null,
  /**
   * The name of the bank branch of the sender of the funding.
   */
  public val senderBranch: String? = null,
  /**
   * The full name of the sender, as supplied by the sending bank.
   */
  public val senderName: String? = null,
) {
  public class Builder {
    /**
     * The name of the bank of the sender of the funding.
     */
    public var senderBank: String? = null

    /**
     * The name of the bank branch of the sender of the funding.
     */
    public var senderBranch: String? = null

    /**
     * The full name of the sender, as supplied by the sending bank.
     */
    public var senderName: String? = null

    public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer(
      senderBank = senderBank,
      senderBranch = senderBranch,
      senderName = senderName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer must be a JSON object")
      return CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer(
        senderBank = rawObject["sender_bank"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        senderBranch = rawObject["sender_branch"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        senderName = rawObject["sender_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.senderBank?.let { put("sender_bank", it) }
        value.senderBranch?.let { put("sender_branch", it) }
        value.senderName?.let { put("sender_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer(block: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer.Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer.build(block)
