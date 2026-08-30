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
 * Use [InboundTransfers](https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/into/inbound-transfers)
 * to add funds to your [FinancialAccount](https://api.stripe.com#financial_accounts) via a PaymentMethod that is owned
 * by you. The funds will be transferred via an ACH debit.
 *
 * Related guide: [Moving money with Treasury using InboundTransfer
 * objects](https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/into/inbound-transfers)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.inbound_transfer
 */
@Serializable(with = TreasuryInboundTransfer.Serializer::class)
public class TreasuryInboundTransfer(
  /**
   * Amount (in cents) transferred.
   */
  public val amount: Int,
  /**
   * Returns `true` if the InboundTransfer is able to be canceled.
   */
  public val cancelable: Boolean,
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
   * The FinancialAccount that received the funds.
   */
  public val financialAccount: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  public val linkedFlows: TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTreasuryInboundTransferObjectValueX4f5fbcc4,
  /**
   * Statement descriptor shown when funds are debited from the source. Not all payment networks support
   * `statement_descriptor`.
   */
  public val statementDescriptor: String,
  /**
   * Status of the InboundTransfer: `processing`, `succeeded`, `failed`, and `canceled`. An InboundTransfer is
   * `processing` if it is created and pending. The status changes to `succeeded` once the funds have been "confirmed"
   * and a `transaction` is created and posted. The status changes to `failed` if the transfer fails.
   */
  public val status: InlineTreasuryInboundTransferStatusXd06f19cf,
  public val statusTransitions:
      TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * Details about this InboundTransfer's failure. Only set when status is `failed`.
   */
  public val failureDetails: InlineTreasuryInboundTransferFailureDetailsXd5eb6f42? = null,
  /**
   * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
   * provided when money movement is considered regulated under Stripe's money transmission licenses.
   */
  public val hostedRegulatoryReceiptUrl: String? = null,
  /**
   * The origin payment method to be debited for an InboundTransfer.
   */
  public val originPaymentMethod: String? = null,
  /**
   * Details about the PaymentMethod for an InboundTransfer.
   */
  public val originPaymentMethodDetails:
      InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2? = null,
  /**
   * Returns `true` if the funds for an InboundTransfer were returned after the InboundTransfer went to the `succeeded`
   * state.
   */
  public val returned: Boolean? = null,
  /**
   * The Transaction associated with this object.
   */
  public val transaction: InlineTreasuryInboundTransferTransactionX08b12581? = null,
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

    private var cancelableValue: Boolean? = null

    public var cancelable: Boolean
      get() = requireNotNull(cancelableValue) { "cancelable is required" }
      set(`value`) {
        cancelableValue = value
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

    private var linkedFlowsValue:
        TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows? = null

    public var linkedFlows: TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows
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

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineTreasuryInboundTransferObjectValueX4f5fbcc4? = null

    public var objectValue: InlineTreasuryInboundTransferObjectValueX4f5fbcc4
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statementDescriptorValue: String? = null

    public var statementDescriptor: String
      get() = requireNotNull(statementDescriptorValue) { "statementDescriptor is required" }
      set(`value`) {
        statementDescriptorValue = value
      }

    private var statusValue: InlineTreasuryInboundTransferStatusXd06f19cf? = null

    public var status: InlineTreasuryInboundTransferStatusXd06f19cf
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusTransitionsValue:
        TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions? = null

    public var statusTransitions:
        TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions
      get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
      set(`value`) {
        statusTransitionsValue = value
      }

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * Details about this InboundTransfer's failure. Only set when status is `failed`.
     */
    public var failureDetails: InlineTreasuryInboundTransferFailureDetailsXd5eb6f42? = null

    /**
     * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
     * provided when money movement is considered regulated under Stripe's money transmission licenses.
     */
    public var hostedRegulatoryReceiptUrl: String? = null

    /**
     * The origin payment method to be debited for an InboundTransfer.
     */
    public var originPaymentMethod: String? = null

    /**
     * Details about the PaymentMethod for an InboundTransfer.
     */
    public var originPaymentMethodDetails:
        InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2? = null

    /**
     * Returns `true` if the funds for an InboundTransfer were returned after the InboundTransfer went to the
     * `succeeded` state.
     */
    public var returned: Boolean? = null

    /**
     * The Transaction associated with this object.
     */
    public var transaction: InlineTreasuryInboundTransferTransactionX08b12581? = null

    public fun build(): TreasuryInboundTransfer {
      check(amountValue != null) { "amount is required" }
      check(cancelableValue != null) { "cancelable is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(financialAccountValue != null) { "financialAccount is required" }
      check(idValue != null) { "id is required" }
      check(linkedFlowsValue != null) { "linkedFlows is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statementDescriptorValue != null) { "statementDescriptor is required" }
      check(statusValue != null) { "status is required" }
      check(statusTransitionsValue != null) { "statusTransitions is required" }
      return TreasuryInboundTransfer(
        amount = amount,
        cancelable = cancelable,
        created = created,
        currency = currency,
        financialAccount = financialAccount,
        id = id,
        linkedFlows = linkedFlows,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        statementDescriptor = statementDescriptor,
        status = status,
        statusTransitions = statusTransitions,
        description = description,
        failureDetails = failureDetails,
        hostedRegulatoryReceiptUrl = hostedRegulatoryReceiptUrl,
        originPaymentMethod = originPaymentMethod,
        originPaymentMethodDetails = originPaymentMethodDetails,
        returned = returned,
        transaction = transaction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryInboundTransfer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryInboundTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryInboundTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryInboundTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryInboundTransfer must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val cancelable = json.decodeRequired<Boolean>(rawObject, "cancelable")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
      val id = json.decodeRequired<String>(rawObject, "id")
      val linkedFlows = json.decodeRequired<TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows>(rawObject, "linked_flows")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineTreasuryInboundTransferObjectValueX4f5fbcc4>(rawObject, "object")
      val statementDescriptor = json.decodeRequired<String>(rawObject, "statement_descriptor")
      val status = json.decodeRequired<InlineTreasuryInboundTransferStatusXd06f19cf>(rawObject, "status")
      val statusTransitions = json.decodeRequired<TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions>(rawObject, "status_transitions")
      return TreasuryInboundTransfer(
        amount = amount,
        cancelable = cancelable,
        created = created,
        currency = currency,
        financialAccount = financialAccount,
        id = id,
        linkedFlows = linkedFlows,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        statementDescriptor = statementDescriptor,
        status = status,
        statusTransitions = statusTransitions,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        failureDetails = rawObject["failure_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryInboundTransferFailureDetailsXd5eb6f42?>(element) },
        hostedRegulatoryReceiptUrl = rawObject["hosted_regulatory_receipt_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        originPaymentMethod = rawObject["origin_payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        originPaymentMethodDetails = rawObject["origin_payment_method_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2?>(element) },
        returned = rawObject["returned"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        transaction = rawObject["transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryInboundTransferTransactionX08b12581?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryInboundTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryInboundTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("cancelable", json.encodeToJsonElement(value.cancelable))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("financial_account", value.financialAccount)
        put("id", value.id)
        put("linked_flows", json.encodeToJsonElement(value.linkedFlows))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("statement_descriptor", value.statementDescriptor)
        put("status", json.encodeToJsonElement(value.status))
        put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
        value.description?.let { put("description", it) }
        value.failureDetails?.let { put("failure_details", json.encodeToJsonElement(it)) }
        value.hostedRegulatoryReceiptUrl?.let { put("hosted_regulatory_receipt_url", it) }
        value.originPaymentMethod?.let { put("origin_payment_method", it) }
        value.originPaymentMethodDetails?.let { put("origin_payment_method_details", json.encodeToJsonElement(it)) }
        value.returned?.let { put("returned", json.encodeToJsonElement(it)) }
        value.transaction?.let { put("transaction", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryInboundTransfer(block: TreasuryInboundTransfer.Builder.() -> Unit): TreasuryInboundTransfer = TreasuryInboundTransfer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryInboundTransfer is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
