package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * You can reverse some [ReceivedCredits](https://api.stripe.com#received_credits) depending on their network and source
 * flow. Reversing a ReceivedCredit leads to the creation of a new object known as a CreditReversal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.credit_reversal
 */
@Serializable(with = TreasuryCreditReversal.Serializer::class)
public class TreasuryCreditReversal(
  /**
   * Amount (in cents) transferred.
   */
  public val amount: Int,
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
   * The FinancialAccount to reverse funds from.
   */
  public val financialAccount: String,
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
   * The rails used to reverse the funds.
   */
  public val network: InlineTreasuryCreditReversalNetworkX36ea954e,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTreasuryCreditReversalObjectValueXba655c7c,
  /**
   * The ReceivedCredit being reversed.
   */
  public val receivedCredit: String,
  /**
   * Status of the CreditReversal
   */
  public val status: InlineTreasuryCreditReversalStatusX9b936dd1,
  public val statusTransitions: TreasuryReceivedCreditsResourceStatusTransitions,
  /**
   * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
   * provided when money movement is considered regulated under Stripe's money transmission licenses.
   */
  public val hostedRegulatoryReceiptUrl: String? = null,
  /**
   * The Transaction associated with this object.
   */
  public val transaction: InlineTreasuryCreditReversalTransactionXa5ee8634? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

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

    private var financialAccountValue: String? = null

    public var financialAccount: String
      get() = requireNotNull(financialAccountValue) { "financialAccount is required" }
      set(`value`) {
        financialAccountValue = value
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

    private var networkValue: InlineTreasuryCreditReversalNetworkX36ea954e? = null

    public var network: InlineTreasuryCreditReversalNetworkX36ea954e
      get() = requireNotNull(networkValue) { "network is required" }
      set(`value`) {
        networkValue = value
      }

    private var objectValueValue: InlineTreasuryCreditReversalObjectValueXba655c7c? = null

    public var objectValue: InlineTreasuryCreditReversalObjectValueXba655c7c
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var receivedCreditValue: String? = null

    public var receivedCredit: String
      get() = requireNotNull(receivedCreditValue) { "receivedCredit is required" }
      set(`value`) {
        receivedCreditValue = value
      }

    private var statusValue: InlineTreasuryCreditReversalStatusX9b936dd1? = null

    public var status: InlineTreasuryCreditReversalStatusX9b936dd1
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusTransitionsValue: TreasuryReceivedCreditsResourceStatusTransitions? = null

    public var statusTransitions: TreasuryReceivedCreditsResourceStatusTransitions
      get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
      set(`value`) {
        statusTransitionsValue = value
      }

    /**
     * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
     * provided when money movement is considered regulated under Stripe's money transmission licenses.
     */
    public var hostedRegulatoryReceiptUrl: String? = null

    /**
     * The Transaction associated with this object.
     */
    public var transaction: InlineTreasuryCreditReversalTransactionXa5ee8634? = null

    public fun build(): TreasuryCreditReversal {
      check(amountValue != null) { "amount is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(financialAccountValue != null) { "financialAccount is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(networkValue != null) { "network is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(receivedCreditValue != null) { "receivedCredit is required" }
      check(statusValue != null) { "status is required" }
      check(statusTransitionsValue != null) { "statusTransitions is required" }
      return TreasuryCreditReversal(
        amount = amount,
        created = created,
        currency = currency,
        financialAccount = financialAccount,
        id = id,
        livemode = livemode,
        metadata = metadata,
        network = network,
        objectValue = objectValue,
        receivedCredit = receivedCredit,
        status = status,
        statusTransitions = statusTransitions,
        hostedRegulatoryReceiptUrl = hostedRegulatoryReceiptUrl,
        transaction = transaction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryCreditReversal = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryCreditReversal> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryCreditReversal {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryCreditReversal")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryCreditReversal must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val network = json.decodeRequired<InlineTreasuryCreditReversalNetworkX36ea954e>(rawObject, "network")
      val objectValue = json.decodeRequired<InlineTreasuryCreditReversalObjectValueXba655c7c>(rawObject, "object")
      val receivedCredit = json.decodeRequired<String>(rawObject, "received_credit")
      val status = json.decodeRequired<InlineTreasuryCreditReversalStatusX9b936dd1>(rawObject, "status")
      val statusTransitions = json.decodeRequired<TreasuryReceivedCreditsResourceStatusTransitions>(rawObject, "status_transitions")
      return TreasuryCreditReversal(
        amount = amount,
        created = created,
        currency = currency,
        financialAccount = financialAccount,
        id = id,
        livemode = livemode,
        metadata = metadata,
        network = network,
        objectValue = objectValue,
        receivedCredit = receivedCredit,
        status = status,
        statusTransitions = statusTransitions,
        hostedRegulatoryReceiptUrl = rawObject["hosted_regulatory_receipt_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transaction = rawObject["transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryCreditReversalTransactionXa5ee8634?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryCreditReversal) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryCreditReversal")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("financial_account", value.financialAccount)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("network", json.encodeToJsonElement(value.network))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("received_credit", value.receivedCredit)
        put("status", json.encodeToJsonElement(value.status))
        put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
        value.hostedRegulatoryReceiptUrl?.let { put("hosted_regulatory_receipt_url", it) }
        value.transaction?.let { put("transaction", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryCreditReversal(block: TreasuryCreditReversal.Builder.() -> Unit): TreasuryCreditReversal = TreasuryCreditReversal.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryCreditReversal is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
