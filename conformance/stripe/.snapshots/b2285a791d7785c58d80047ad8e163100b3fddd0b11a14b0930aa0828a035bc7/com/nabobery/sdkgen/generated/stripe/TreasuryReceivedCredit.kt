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
 * ReceivedCredits represent funds sent to a [FinancialAccount](https://api.stripe.com#financial_accounts) (for example,
 * via ACH or wire). These money movements are not initiated from the FinancialAccount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_credit
 */
@Serializable(with = TreasuryReceivedCredit.Serializer::class)
public class TreasuryReceivedCredit(
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
  public val initiatingPaymentMethodDetails:
      TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails,
  public val linkedFlows: TreasuryReceivedCreditsResourceLinkedFlows,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * The rails used to send the funds.
   */
  public val network: InlineTreasuryReceivedCreditNetworkXdca8dbfb,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTreasuryReceivedCreditObjectValueXf14e10c7,
  /**
   * Status of the ReceivedCredit. ReceivedCredits are created either `succeeded` (approved) or `failed` (declined). If
   * a ReceivedCredit is declined, the failure reason can be found in the `failure_code` field.
   */
  public val status: InlineTreasuryReceivedCreditStatusXe441ec62,
  /**
   * Reason for the failure. A ReceivedCredit might fail because the receiving FinancialAccount is closed or frozen.
   */
  public val failureCode: InlineTreasuryReceivedCreditFailureCodeX69f05247? = null,
  /**
   * The FinancialAccount that received the funds.
   */
  public val financialAccount: String? = null,
  /**
   * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
   * provided when money movement is considered regulated under Stripe's money transmission licenses.
   */
  public val hostedRegulatoryReceiptUrl: String? = null,
  /**
   * Details describing when a ReceivedCredit may be reversed.
   */
  public val reversalDetails: InlineTreasuryReceivedCreditReversalDetailsX2cda43a1? = null,
  /**
   * The Transaction associated with this object.
   */
  public val transaction: InlineTreasuryReceivedCreditTransactionXdd1d426d? = null,
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

    private var initiatingPaymentMethodDetailsValue:
        TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails? = null

    public var initiatingPaymentMethodDetails:
        TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails
      get() = requireNotNull(initiatingPaymentMethodDetailsValue) { "initiatingPaymentMethodDetails is required" }
      set(`value`) {
        initiatingPaymentMethodDetailsValue = value
      }

    private var linkedFlowsValue: TreasuryReceivedCreditsResourceLinkedFlows? = null

    public var linkedFlows: TreasuryReceivedCreditsResourceLinkedFlows
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

    private var networkValue: InlineTreasuryReceivedCreditNetworkXdca8dbfb? = null

    public var network: InlineTreasuryReceivedCreditNetworkXdca8dbfb
      get() = requireNotNull(networkValue) { "network is required" }
      set(`value`) {
        networkValue = value
      }

    private var objectValueValue: InlineTreasuryReceivedCreditObjectValueXf14e10c7? = null

    public var objectValue: InlineTreasuryReceivedCreditObjectValueXf14e10c7
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineTreasuryReceivedCreditStatusXe441ec62? = null

    public var status: InlineTreasuryReceivedCreditStatusXe441ec62
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * Reason for the failure. A ReceivedCredit might fail because the receiving FinancialAccount is closed or frozen.
     */
    public var failureCode: InlineTreasuryReceivedCreditFailureCodeX69f05247? = null

    /**
     * The FinancialAccount that received the funds.
     */
    public var financialAccount: String? = null

    /**
     * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
     * provided when money movement is considered regulated under Stripe's money transmission licenses.
     */
    public var hostedRegulatoryReceiptUrl: String? = null

    /**
     * Details describing when a ReceivedCredit may be reversed.
     */
    public var reversalDetails: InlineTreasuryReceivedCreditReversalDetailsX2cda43a1? = null

    /**
     * The Transaction associated with this object.
     */
    public var transaction: InlineTreasuryReceivedCreditTransactionXdd1d426d? = null

    public fun build(): TreasuryReceivedCredit {
      check(amountValue != null) { "amount is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(initiatingPaymentMethodDetailsValue != null) { "initiatingPaymentMethodDetails is required" }
      check(linkedFlowsValue != null) { "linkedFlows is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(networkValue != null) { "network is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      return TreasuryReceivedCredit(
        amount = amount,
        created = created,
        currency = currency,
        description = description,
        id = id,
        initiatingPaymentMethodDetails = initiatingPaymentMethodDetails,
        linkedFlows = linkedFlows,
        livemode = livemode,
        network = network,
        objectValue = objectValue,
        status = status,
        failureCode = failureCode,
        financialAccount = financialAccount,
        hostedRegulatoryReceiptUrl = hostedRegulatoryReceiptUrl,
        reversalDetails = reversalDetails,
        transaction = transaction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryReceivedCredit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryReceivedCredit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryReceivedCredit {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedCredit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryReceivedCredit must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val description = json.decodeRequired<String>(rawObject, "description")
      val id = json.decodeRequired<String>(rawObject, "id")
      val initiatingPaymentMethodDetails = json.decodeRequired<TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails>(rawObject, "initiating_payment_method_details")
      val linkedFlows = json.decodeRequired<TreasuryReceivedCreditsResourceLinkedFlows>(rawObject, "linked_flows")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val network = json.decodeRequired<InlineTreasuryReceivedCreditNetworkXdca8dbfb>(rawObject, "network")
      val objectValue = json.decodeRequired<InlineTreasuryReceivedCreditObjectValueXf14e10c7>(rawObject, "object")
      val status = json.decodeRequired<InlineTreasuryReceivedCreditStatusXe441ec62>(rawObject, "status")
      return TreasuryReceivedCredit(
        amount = amount,
        created = created,
        currency = currency,
        description = description,
        id = id,
        initiatingPaymentMethodDetails = initiatingPaymentMethodDetails,
        linkedFlows = linkedFlows,
        livemode = livemode,
        network = network,
        objectValue = objectValue,
        status = status,
        failureCode = rawObject["failure_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryReceivedCreditFailureCodeX69f05247?>(element) },
        financialAccount = rawObject["financial_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        hostedRegulatoryReceiptUrl = rawObject["hosted_regulatory_receipt_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reversalDetails = rawObject["reversal_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryReceivedCreditReversalDetailsX2cda43a1?>(element) },
        transaction = rawObject["transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryReceivedCreditTransactionXdd1d426d?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryReceivedCredit) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedCredit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("description", value.description)
        put("id", value.id)
        put("initiating_payment_method_details", json.encodeToJsonElement(value.initiatingPaymentMethodDetails))
        put("linked_flows", json.encodeToJsonElement(value.linkedFlows))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("network", json.encodeToJsonElement(value.network))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        value.failureCode?.let { put("failure_code", json.encodeToJsonElement(it)) }
        value.financialAccount?.let { put("financial_account", it) }
        value.hostedRegulatoryReceiptUrl?.let { put("hosted_regulatory_receipt_url", it) }
        value.reversalDetails?.let { put("reversal_details", json.encodeToJsonElement(it)) }
        value.transaction?.let { put("transaction", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryReceivedCredit(block: TreasuryReceivedCredit.Builder.() -> Unit): TreasuryReceivedCredit = TreasuryReceivedCredit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryReceivedCredit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
