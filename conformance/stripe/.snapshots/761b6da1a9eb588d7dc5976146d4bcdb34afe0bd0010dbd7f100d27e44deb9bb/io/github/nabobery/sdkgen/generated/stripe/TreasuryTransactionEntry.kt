package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
 * TransactionEntries represent individual units of money movements within a single
 * [Transaction](https://api.stripe.com#transactions).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction_entry
 */
@Serializable(with = TreasuryTransactionEntry.Serializer::class)
public class TreasuryTransactionEntry(
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
   * When the TransactionEntry will impact the FinancialAccount's balance.
   */
  public val effectiveAt: Int,
  /**
   * The FinancialAccount associated with this object.
   */
  public val financialAccount: String,
  /**
   * Type of the flow associated with the TransactionEntry.
   */
  public val flowType: InlineTreasuryTransactionEntryFlowTypeXd394617b,
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
  public val objectValue: InlineTreasuryTransactionEntryObjectValueX5712b74d,
  /**
   * The Transaction associated with this object.
   */
  public val transaction: InlineTreasuryTransactionEntryTransactionX0ef108c4,
  /**
   * The specific money movement that generated the TransactionEntry.
   */
  public val type: InlineTreasuryTransactionEntryTypeXdb344cde,
  /**
   * Token of the flow associated with the TransactionEntry.
   */
  public val flow: String? = null,
  /**
   * Details of the flow associated with the TransactionEntry.
   */
  public val flowDetails: InlineTreasuryTransactionEntryFlowDetailsXa78f458e? = null,
) {
  public class Builder {
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

    private var effectiveAtValue: Int? = null

    public var effectiveAt: Int
      get() = requireNotNull(effectiveAtValue) { "effectiveAt is required" }
      set(`value`) {
        effectiveAtValue = value
      }

    private var financialAccountValue: String? = null

    public var financialAccount: String
      get() = requireNotNull(financialAccountValue) { "financialAccount is required" }
      set(`value`) {
        financialAccountValue = value
      }

    private var flowTypeValue: InlineTreasuryTransactionEntryFlowTypeXd394617b? = null

    public var flowType: InlineTreasuryTransactionEntryFlowTypeXd394617b
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

    private var objectValueValue: InlineTreasuryTransactionEntryObjectValueX5712b74d? = null

    public var objectValue: InlineTreasuryTransactionEntryObjectValueX5712b74d
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var transactionValue: InlineTreasuryTransactionEntryTransactionX0ef108c4? = null

    public var transaction: InlineTreasuryTransactionEntryTransactionX0ef108c4
      get() = requireNotNull(transactionValue) { "transaction is required" }
      set(`value`) {
        transactionValue = value
      }

    private var typeValue: InlineTreasuryTransactionEntryTypeXdb344cde? = null

    public var type: InlineTreasuryTransactionEntryTypeXdb344cde
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Token of the flow associated with the TransactionEntry.
     */
    public var flow: String? = null

    /**
     * Details of the flow associated with the TransactionEntry.
     */
    public var flowDetails: InlineTreasuryTransactionEntryFlowDetailsXa78f458e? = null

    public fun build(): TreasuryTransactionEntry {
      check(balanceImpactValue != null) { "balanceImpact is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(effectiveAtValue != null) { "effectiveAt is required" }
      check(financialAccountValue != null) { "financialAccount is required" }
      check(flowTypeValue != null) { "flowType is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(transactionValue != null) { "transaction is required" }
      check(typeValue != null) { "type is required" }
      return TreasuryTransactionEntry(
        balanceImpact = balanceImpact,
        created = created,
        currency = currency,
        effectiveAt = effectiveAt,
        financialAccount = financialAccount,
        flowType = flowType,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        transaction = transaction,
        type = type,
        flow = flow,
        flowDetails = flowDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryTransactionEntry = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryTransactionEntry> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryTransactionEntry {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryTransactionEntry")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryTransactionEntry must be a JSON object")
      val balanceImpact = json.decodeRequired<TreasuryTransactionsResourceBalanceImpact>(rawObject, "balance_impact")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val effectiveAt = json.decodeRequired<Int>(rawObject, "effective_at")
      val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
      val flowType = json.decodeRequired<InlineTreasuryTransactionEntryFlowTypeXd394617b>(rawObject, "flow_type")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTreasuryTransactionEntryObjectValueX5712b74d>(rawObject, "object")
      val transaction = json.decodeRequired<InlineTreasuryTransactionEntryTransactionX0ef108c4>(rawObject, "transaction")
      val type = json.decodeRequired<InlineTreasuryTransactionEntryTypeXdb344cde>(rawObject, "type")
      return TreasuryTransactionEntry(
        balanceImpact = balanceImpact,
        created = created,
        currency = currency,
        effectiveAt = effectiveAt,
        financialAccount = financialAccount,
        flowType = flowType,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        transaction = transaction,
        type = type,
        flow = rawObject["flow"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        flowDetails = rawObject["flow_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryTransactionEntryFlowDetailsXa78f458e?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryTransactionEntry) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryTransactionEntry")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("balance_impact", json.encodeToJsonElement(value.balanceImpact))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("effective_at", json.encodeToJsonElement(value.effectiveAt))
        put("financial_account", value.financialAccount)
        put("flow_type", json.encodeToJsonElement(value.flowType))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("transaction", json.encodeToJsonElement(value.transaction))
        put("type", json.encodeToJsonElement(value.type))
        value.flow?.let { put("flow", it) }
        value.flowDetails?.let { put("flow_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryTransactionEntry(block: TreasuryTransactionEntry.Builder.() -> Unit): TreasuryTransactionEntry = TreasuryTransactionEntry.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryTransactionEntry is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
