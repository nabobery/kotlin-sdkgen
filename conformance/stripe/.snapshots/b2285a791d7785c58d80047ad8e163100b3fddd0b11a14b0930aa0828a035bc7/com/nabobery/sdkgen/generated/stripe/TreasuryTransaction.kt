package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class TreasuryTransactionView(
  public val amount: Int,
  @SerialName("balance_impact")
  public val balanceImpact: TreasuryTransactionsResourceBalanceImpact,
  public val created: Int,
  public val currency: String,
  public val description: String,
  public val entries: InlineTreasuryTransactionEntriesX6cf91389? = null,
  @SerialName("financial_account")
  public val financialAccount: String,
  public val flow: String? = null,
  @SerialName("flow_details")
  public val flowDetails: InlineTreasuryTransactionFlowDetailsX79bb758a? = null,
  @SerialName("flow_type")
  public val flowType: InlineTreasuryTransactionFlowTypeX6ff984c1,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("object")
  public val objectValue: InlineTreasuryTransactionObjectValueX0eec1401,
  public val status: InlineTreasuryTransactionStatusXeebb9cef,
  @SerialName("status_transitions")
  public val statusTransitions:
      TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions,
)

/**
 * Transactions represent changes to a [FinancialAccount's](https://api.stripe.com#financial_accounts) balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction
 */
@Serializable(with = TreasuryTransaction.Serializer::class)
public class TreasuryTransaction(
  /**
   * Amount (in cents) transferred.
   */
  public val amount: Int,
  public val balanceImpact: TreasuryTransactionsResourceBalanceImpact,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String,
  /**
   * The FinancialAccount associated with this object.
   */
  public val financialAccount: String,
  /**
   * Type of the flow that created the Transaction.
   */
  public val flowType: InlineTreasuryTransactionFlowTypeX6ff984c1,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTreasuryTransactionObjectValueX0eec1401,
  /**
   * Status of the Transaction.
   */
  public val status: InlineTreasuryTransactionStatusXeebb9cef,
  public val statusTransitions:
      TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions,
  /**
   * A list of TransactionEntries that are part of this Transaction. This cannot be expanded in any list endpoints.
   */
  public val entries: InlineTreasuryTransactionEntriesX6cf91389? = null,
  /**
   * ID of the flow that created the Transaction.
   */
  public val flow: String? = null,
  /**
   * Details of the flow that created the Transaction.
   */
  public val flowDetails: InlineTreasuryTransactionFlowDetailsX79bb758a? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var balanceImpactValue: TreasuryTransactionsResourceBalanceImpact? = null

    public var balanceImpact: TreasuryTransactionsResourceBalanceImpact
      get() = requireNotNull(balanceImpactValue) { "balanceImpact is required" }
      set(`value`) {
        balanceImpactValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var financialAccountValue: String? = null

    public var financialAccount: String
      get() = requireNotNull(financialAccountValue) { "financialAccount is required" }
      set(`value`) {
        financialAccountValue = value
      }

    private var flowTypeValue: InlineTreasuryTransactionFlowTypeX6ff984c1? = null

    public var flowType: InlineTreasuryTransactionFlowTypeX6ff984c1
      get() = requireNotNull(flowTypeValue) { "flowType is required" }
      set(`value`) {
        flowTypeValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTreasuryTransactionObjectValueX0eec1401? = null

    public var objectValue: InlineTreasuryTransactionObjectValueX0eec1401
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineTreasuryTransactionStatusXeebb9cef? = null

    public var status: InlineTreasuryTransactionStatusXeebb9cef
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusTransitionsValue:
        TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions? = null

    public var statusTransitions:
        TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions
      get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
      set(`value`) {
        statusTransitionsValue = value
      }

    /**
     * A list of TransactionEntries that are part of this Transaction. This cannot be expanded in any list endpoints.
     */
    public var entries: InlineTreasuryTransactionEntriesX6cf91389? = null

    /**
     * ID of the flow that created the Transaction.
     */
    public var flow: String? = null

    /**
     * Details of the flow that created the Transaction.
     */
    public var flowDetails: InlineTreasuryTransactionFlowDetailsX79bb758a? = null

    public fun build(): TreasuryTransaction {
      check(amountValue != null) { "amount is required" }
      check(balanceImpactValue != null) { "balanceImpact is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(descriptionValue != null) { "description is required" }
      check(financialAccountValue != null) { "financialAccount is required" }
      check(flowTypeValue != null) { "flowType is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(statusTransitionsValue != null) { "statusTransitions is required" }
      return TreasuryTransaction(
        amount = amount,
        balanceImpact = balanceImpact,
        created = created,
        currency = currency,
        description = description,
        financialAccount = financialAccount,
        flowType = flowType,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        statusTransitions = statusTransitions,
        entries = entries,
        flow = flow,
        flowDetails = flowDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryTransaction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryTransaction must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val balanceImpact = json.decodeRequired<TreasuryTransactionsResourceBalanceImpact>(rawObject, "balance_impact")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val description = json.decodeRequired<String>(rawObject, "description")
      val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
      val flowType = json.decodeRequired<InlineTreasuryTransactionFlowTypeX6ff984c1>(rawObject, "flow_type")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTreasuryTransactionObjectValueX0eec1401>(rawObject, "object")
      val status = json.decodeRequired<InlineTreasuryTransactionStatusXeebb9cef>(rawObject, "status")
      val statusTransitions = json.decodeRequired<TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions>(rawObject, "status_transitions")
      return TreasuryTransaction(
        amount = amount,
        balanceImpact = balanceImpact,
        created = created,
        currency = currency,
        description = description,
        financialAccount = financialAccount,
        flowType = flowType,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        statusTransitions = statusTransitions,
        entries = rawObject["entries"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryTransactionEntriesX6cf91389?>(element) },
        flow = rawObject["flow"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        flowDetails = rawObject["flow_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryTransactionFlowDetailsX79bb758a?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("balance_impact", json.encodeToJsonElement(value.balanceImpact))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("description", value.description)
        put("financial_account", value.financialAccount)
        put("flow_type", json.encodeToJsonElement(value.flowType))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
        value.entries?.let { put("entries", json.encodeToJsonElement(it)) }
        value.flow?.let { put("flow", it) }
        value.flowDetails?.let { put("flow_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryTransaction(block: TreasuryTransaction.Builder.() -> Unit): TreasuryTransaction = TreasuryTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
