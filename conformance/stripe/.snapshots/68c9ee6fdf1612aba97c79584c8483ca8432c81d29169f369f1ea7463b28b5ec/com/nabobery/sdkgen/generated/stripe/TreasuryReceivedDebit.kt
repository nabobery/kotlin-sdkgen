package com.nabobery.sdkgen.generated.stripe

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
 * ReceivedDebits represent funds pulled from a [FinancialAccount](https://api.stripe.com#financial_accounts). These are
 * not initiated from the FinancialAccount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_debit
 */
@Serializable(with = TreasuryReceivedDebit.Serializer::class)
public class TreasuryReceivedDebit(
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
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  public val linkedFlows: TreasuryReceivedDebitsResourceLinkedFlows,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * The network used for the ReceivedDebit.
   */
  public val network: InlineTreasuryReceivedDebitNetworkX92a873d8,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTreasuryReceivedDebitObjectValueX2627e8ba,
  /**
   * Status of the ReceivedDebit. ReceivedDebits are created with a status of either `succeeded` (approved) or `failed`
   * (declined). The failure reason can be found under the `failure_code`.
   */
  public val status: InlineTreasuryReceivedDebitStatusXdf22d6dc,
  /**
   * Reason for the failure. A ReceivedDebit might fail because the FinancialAccount doesn't have sufficient funds, is
   * closed, or is frozen.
   */
  public val failureCode: InlineTreasuryReceivedDebitFailureCodeXd516aadd? = null,
  /**
   * The FinancialAccount that funds were pulled from.
   */
  public val financialAccount: String? = null,
  /**
   * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
   * provided when money movement is considered regulated under Stripe's money transmission licenses.
   */
  public val hostedRegulatoryReceiptUrl: String? = null,
  public val initiatingPaymentMethodDetails:
      TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails? = null,
  /**
   * Details describing when a ReceivedDebit might be reversed.
   */
  public val reversalDetails: InlineTreasuryReceivedDebitReversalDetailsX208cee01? = null,
  /**
   * The Transaction associated with this object.
   */
  public val transaction: InlineTreasuryReceivedDebitTransactionX78b9e912? = null,
) {
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

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var linkedFlowsValue: TreasuryReceivedDebitsResourceLinkedFlows? = null

    public var linkedFlows: TreasuryReceivedDebitsResourceLinkedFlows
      get() = requireNotNull(linkedFlowsValue) { "linkedFlows is required" }
      set(`value`) {
        linkedFlowsValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var networkValue: InlineTreasuryReceivedDebitNetworkX92a873d8? = null

    public var network: InlineTreasuryReceivedDebitNetworkX92a873d8
      get() = requireNotNull(networkValue) { "network is required" }
      set(`value`) {
        networkValue = value
      }

    private var objectValueValue: InlineTreasuryReceivedDebitObjectValueX2627e8ba? = null

    public var objectValue: InlineTreasuryReceivedDebitObjectValueX2627e8ba
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineTreasuryReceivedDebitStatusXdf22d6dc? = null

    public var status: InlineTreasuryReceivedDebitStatusXdf22d6dc
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * Reason for the failure. A ReceivedDebit might fail because the FinancialAccount doesn't have sufficient funds, is
     * closed, or is frozen.
     */
    public var failureCode: InlineTreasuryReceivedDebitFailureCodeXd516aadd? = null

    /**
     * The FinancialAccount that funds were pulled from.
     */
    public var financialAccount: String? = null

    /**
     * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
     * provided when money movement is considered regulated under Stripe's money transmission licenses.
     */
    public var hostedRegulatoryReceiptUrl: String? = null

    public var initiatingPaymentMethodDetails:
        TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails? = null

    /**
     * Details describing when a ReceivedDebit might be reversed.
     */
    public var reversalDetails: InlineTreasuryReceivedDebitReversalDetailsX208cee01? = null

    /**
     * The Transaction associated with this object.
     */
    public var transaction: InlineTreasuryReceivedDebitTransactionX78b9e912? = null

    public fun build(): TreasuryReceivedDebit {
      check(amountValue != null) { "amount is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(linkedFlowsValue != null) { "linkedFlows is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(networkValue != null) { "network is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      return TreasuryReceivedDebit(
        amount = amount,
        created = created,
        currency = currency,
        description = description,
        id = id,
        linkedFlows = linkedFlows,
        livemode = livemode,
        network = network,
        objectValue = objectValue,
        status = status,
        failureCode = failureCode,
        financialAccount = financialAccount,
        hostedRegulatoryReceiptUrl = hostedRegulatoryReceiptUrl,
        initiatingPaymentMethodDetails = initiatingPaymentMethodDetails,
        reversalDetails = reversalDetails,
        transaction = transaction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryReceivedDebit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryReceivedDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryReceivedDebit {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryReceivedDebit must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val description = json.decodeRequired<String>(rawObject, "description")
      val id = json.decodeRequired<String>(rawObject, "id")
      val linkedFlows = json.decodeRequired<TreasuryReceivedDebitsResourceLinkedFlows>(rawObject, "linked_flows")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val network = json.decodeRequired<InlineTreasuryReceivedDebitNetworkX92a873d8>(rawObject, "network")
      val objectValue = json.decodeRequired<InlineTreasuryReceivedDebitObjectValueX2627e8ba>(rawObject, "object")
      val status = json.decodeRequired<InlineTreasuryReceivedDebitStatusXdf22d6dc>(rawObject, "status")
      return TreasuryReceivedDebit(
        amount = amount,
        created = created,
        currency = currency,
        description = description,
        id = id,
        linkedFlows = linkedFlows,
        livemode = livemode,
        network = network,
        objectValue = objectValue,
        status = status,
        failureCode = rawObject["failure_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryReceivedDebitFailureCodeXd516aadd?>(element) },
        financialAccount = rawObject["financial_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        hostedRegulatoryReceiptUrl = rawObject["hosted_regulatory_receipt_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        initiatingPaymentMethodDetails = rawObject["initiating_payment_method_details"]?.let { json.decodeFromJsonElement<TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails>(it) },
        reversalDetails = rawObject["reversal_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryReceivedDebitReversalDetailsX208cee01?>(element) },
        transaction = rawObject["transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryReceivedDebitTransactionX78b9e912?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryReceivedDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("description", value.description)
        put("id", value.id)
        put("linked_flows", json.encodeToJsonElement(value.linkedFlows))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("network", json.encodeToJsonElement(value.network))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        value.failureCode?.let { put("failure_code", json.encodeToJsonElement(it)) }
        value.financialAccount?.let { put("financial_account", it) }
        value.hostedRegulatoryReceiptUrl?.let { put("hosted_regulatory_receipt_url", it) }
        value.initiatingPaymentMethodDetails?.let { put("initiating_payment_method_details", json.encodeToJsonElement(it)) }
        value.reversalDetails?.let { put("reversal_details", json.encodeToJsonElement(it)) }
        value.transaction?.let { put("transaction", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryReceivedDebit(block: TreasuryReceivedDebit.Builder.() -> Unit): TreasuryReceivedDebit = TreasuryReceivedDebit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryReceivedDebit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
