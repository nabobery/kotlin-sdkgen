package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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

@ConsistentCopyVisibility
@Serializable
public data class IssuingDisputeView internal constructor(
  public val amount: Int,
  @SerialName("balance_transactions")
  public val balanceTransactions: List<BalanceTransaction>? = null,
  public val created: Int,
  public val currency: String,
  public val evidence: IssuingDisputeEvidence,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("loss_reason")
  public val lossReason: InlineIssuingDisputeLossReasonXaa48fc42? = null,
  public val metadata: Map<String, String>,
  @SerialName("object")
  public val objectValue: InlineIssuingDisputeObjectValueXba94c5a1,
  public val status: InlineIssuingDisputeStatusXedda5fca,
  public val transaction: InlineIssuingDisputeTransactionX33211390,
  public val treasury: InlineIssuingDisputeTreasuryXcbdcc676? = null,
)

/**
 * As a [card issuer](https://docs.stripe.com/issuing), you can dispute transactions that the cardholder does not
 * recognize, suspects to be fraudulent, or has other issues with.
 *
 * Related guide: [Issuing disputes](https://docs.stripe.com/issuing/purchases/disputes)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.dispute
 */
@Serializable(with = IssuingDispute.Serializer::class)
public class IssuingDispute(
  /**
   * Disputed amount in the card's currency and in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). Usually the amount of the `transaction`, but can differ
   * (usually because of currency fluctuation).
   */
  public val amount: Int,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * The currency the `transaction` was made in.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val evidence: IssuingDisputeEvidence,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineIssuingDisputeObjectValueXba94c5a1,
  /**
   * Current status of the dispute.
   */
  public val status: InlineIssuingDisputeStatusXedda5fca,
  /**
   * The transaction being disputed.
   */
  public val transaction: InlineIssuingDisputeTransactionX33211390,
  balanceTransactions: List<BalanceTransaction>? = null,
  /**
   * The enum that describes the dispute loss outcome. If the dispute is not lost, this field will be absent. New enum
   * values may be added in the future, so be sure to handle unknown values.
   */
  public val lossReason: InlineIssuingDisputeLossReasonXaa48fc42? = null,
  /**
   * [Treasury](https://docs.stripe.com/api/treasury) details related to this dispute if it was created on a
   * [FinancialAccount](https://docs.stripe.com/api/treasury/financial_accounts)
   */
  public val treasury: InlineIssuingDisputeTreasuryXcbdcc676? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  /**
   * List of balance transactions associated with the dispute.
   */
  public val balanceTransactions: List<BalanceTransaction>? =
      balanceTransactions?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
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

    private var evidenceValue: IssuingDisputeEvidence? = null

    public var evidence: IssuingDisputeEvidence
      get() = requireNotNull(evidenceValue) { "evidence is required" }
      set(`value`) {
        evidenceValue = value
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

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineIssuingDisputeObjectValueXba94c5a1? = null

    public var objectValue: InlineIssuingDisputeObjectValueXba94c5a1
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineIssuingDisputeStatusXedda5fca? = null

    public var status: InlineIssuingDisputeStatusXedda5fca
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var transactionValue: InlineIssuingDisputeTransactionX33211390? = null

    public var transaction: InlineIssuingDisputeTransactionX33211390
      get() = requireNotNull(transactionValue) { "transaction is required" }
      set(`value`) {
        transactionValue = value
      }

    private var balanceTransactionsValue: List<BalanceTransaction>? = null

    /**
     * List of balance transactions associated with the dispute.
     */
    public var balanceTransactions: List<BalanceTransaction>?
      get() = balanceTransactionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        balanceTransactionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The enum that describes the dispute loss outcome. If the dispute is not lost, this field will be absent. New enum
     * values may be added in the future, so be sure to handle unknown values.
     */
    public var lossReason: InlineIssuingDisputeLossReasonXaa48fc42? = null

    /**
     * [Treasury](https://docs.stripe.com/api/treasury) details related to this dispute if it was created on a
     * [FinancialAccount](https://docs.stripe.com/api/treasury/financial_accounts)
     */
    public var treasury: InlineIssuingDisputeTreasuryXcbdcc676? = null

    public fun build(): IssuingDispute {
      check(amountValue != null) { "amount is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(evidenceValue != null) { "evidence is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(transactionValue != null) { "transaction is required" }
      return IssuingDispute(
        amount = amount,
        created = created,
        currency = currency,
        evidence = evidence,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        status = status,
        transaction = transaction,
        balanceTransactions = balanceTransactions,
        lossReason = lossReason,
        treasury = treasury,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingDispute = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingDispute> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingDispute {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingDispute")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingDispute must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val evidence = json.decodeRequired<IssuingDisputeEvidence>(rawObject, "evidence")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineIssuingDisputeObjectValueXba94c5a1>(rawObject, "object")
      val status = json.decodeRequired<InlineIssuingDisputeStatusXedda5fca>(rawObject, "status")
      val transaction = json.decodeRequired<InlineIssuingDisputeTransactionX33211390>(rawObject, "transaction")
      return IssuingDispute(
        amount = amount,
        created = created,
        currency = currency,
        evidence = evidence,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        status = status,
        transaction = transaction,
        balanceTransactions = rawObject["balance_transactions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<BalanceTransaction>?>(element) },
        lossReason = rawObject["loss_reason"]?.let { json.decodeFromJsonElement<InlineIssuingDisputeLossReasonXaa48fc42>(it) },
        treasury = rawObject["treasury"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingDisputeTreasuryXcbdcc676?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingDispute) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingDispute")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("evidence", json.encodeToJsonElement(value.evidence))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        put("transaction", json.encodeToJsonElement(value.transaction))
        value.balanceTransactions?.let { put("balance_transactions", json.encodeToJsonElement(it)) }
        value.lossReason?.let { put("loss_reason", json.encodeToJsonElement(it)) }
        value.treasury?.let { put("treasury", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingDispute(block: IssuingDispute.Builder.() -> Unit): IssuingDispute = IssuingDispute.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingDispute is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
