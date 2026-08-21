package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
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
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_funded_t
 * ransaction_resource_bank_transfer
 */
@Serializable(with = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer.Serializer::class)
public class CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer(
  /**
   * The funding method type used to fund the customer balance. Permitted values include: `eu_bank_transfer`,
   * `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
   */
  public val type: InlineCustomerBalanceResou7eccTypeXf7687e39,
  public val euBankTransfer:
      CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer? = null,
  public val gbBankTransfer:
      CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer? = null,
  public val jpBankTransfer:
      CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer? = null,
  /**
   * The user-supplied reference field on the bank transfer.
   */
  public val reference: String? = null,
  public val usBankTransfer:
      CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer? = null,
) {
  public class Builder {
    private var typeValue: InlineCustomerBalanceResou7eccTypeXf7687e39? = null

    public var type: InlineCustomerBalanceResou7eccTypeXf7687e39
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var euBankTransfer:
        CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer?
        = null

    public var gbBankTransfer:
        CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer?
        = null

    public var jpBankTransfer:
        CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer?
        = null

    /**
     * The user-supplied reference field on the bank transfer.
     */
    public var reference: String? = null

    public var usBankTransfer:
        CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer?
        = null

    public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer {
      check(typeValue != null) { "type is required" }
      return CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer(
        type = type,
        euBankTransfer = euBankTransfer,
        gbBankTransfer = gbBankTransfer,
        jpBankTransfer = jpBankTransfer,
        reference = reference,
        usBankTransfer = usBankTransfer,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer must be a JSON object")
      val type = json.decodeRequired<InlineCustomerBalanceResou7eccTypeXf7687e39>(rawObject, "type")
      return CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer(
        type = type,
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceEuBankTransfer>(it) },
        gbBankTransfer = rawObject["gb_bank_transfer"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceGbBankTransfer>(it) },
        jpBankTransfer = rawObject["jp_bank_transfer"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceJpBankTransfer>(it) },
        reference = rawObject["reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        usBankTransfer = rawObject["us_bank_transfer"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
        value.gbBankTransfer?.let { put("gb_bank_transfer", json.encodeToJsonElement(it)) }
        value.jpBankTransfer?.let { put("jp_bank_transfer", json.encodeToJsonElement(it)) }
        value.reference?.let { put("reference", it) }
        value.usBankTransfer?.let { put("us_bank_transfer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer(block: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer.Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
