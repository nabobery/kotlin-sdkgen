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
 * Use
 * [OutboundTransfers](https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-transfers)
 * to transfer funds from a [FinancialAccount](https://api.stripe.com#financial_accounts) to a PaymentMethod belonging
 * to the same entity. To send funds to a different party, use
 * [OutboundPayments](https://api.stripe.com#outbound_payments) instead. You can send funds over ACH rails or through a
 * domestic wire transfer to a user's own external bank account.
 *
 * Simulate OutboundTransfer state changes with the `/v1/test_helpers/treasury/outbound_transfers` endpoints. These
 * methods can only be called on test mode objects.
 *
 * Related guide: [Moving money with Treasury using OutboundTransfer
 * objects](https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-transfers)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_transfer
 */
@Serializable(with = TreasuryOutboundTransfer.Serializer::class)
public class TreasuryOutboundTransfer(
  /**
   * Amount (in cents) transferred.
   */
  public val amount: Int,
  /**
   * Returns `true` if the object can be canceled, and `false` otherwise.
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
  public val destinationPaymentMethodDetails: OutboundTransfersPaymentMethodDetails,
  /**
   * The date when funds are expected to arrive in the destination account.
   */
  public val expectedArrivalDate: Int,
  /**
   * The FinancialAccount that funds were pulled from.
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTreasuryOutboundTransferObjectValueXc6c9301e,
  /**
   * Information about the OutboundTransfer to be sent to the recipient account.
   */
  public val statementDescriptor: String,
  /**
   * Current status of the OutboundTransfer: `processing`, `failed`, `canceled`, `posted`, `returned`. An
   * OutboundTransfer is `processing` if it has been created and is pending. The status changes to `posted` once the
   * OutboundTransfer has been "confirmed" and funds have left the account, or to `failed` or `canceled`. If an
   * OutboundTransfer fails to arrive at its destination, its status will change to `returned`.
   */
  public val status: InlineTreasuryOutboundTransferStatusX846ab535,
  public val statusTransitions: TreasuryOutboundTransfersResourceStatusTransitions,
  /**
   * The Transaction associated with this object.
   */
  public val transaction: InlineTreasuryOutboundTransferTransactionXb03a16d6,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * The PaymentMethod used as the payment instrument for an OutboundTransfer.
   */
  public val destinationPaymentMethod: String? = null,
  /**
   * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
   * provided when money movement is considered regulated under Stripe's money transmission licenses.
   */
  public val hostedRegulatoryReceiptUrl: String? = null,
  /**
   * Details about a returned OutboundTransfer. Only set when the status is `returned`.
   */
  public val returnedDetails: InlineTreasuryOutboundTransferReturnedDetailsXab1a286e? = null,
  /**
   * Details about network-specific tracking information if available.
   */
  public val trackingDetails: InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c? = null,
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

    private var destinationPaymentMethodDetailsValue: OutboundTransfersPaymentMethodDetails? = null

    public var destinationPaymentMethodDetails: OutboundTransfersPaymentMethodDetails
      get() = requireNotNull(destinationPaymentMethodDetailsValue) { "destinationPaymentMethodDetails is required" }
      set(`value`) {
        destinationPaymentMethodDetailsValue = value
      }

    private var expectedArrivalDateValue: Int? = null

    public var expectedArrivalDate: Int
      get() = requireNotNull(expectedArrivalDateValue) { "expectedArrivalDate is required" }
      set(`value`) {
        expectedArrivalDateValue = value
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

    private var objectValueValue: InlineTreasuryOutboundTransferObjectValueXc6c9301e? = null

    public var objectValue: InlineTreasuryOutboundTransferObjectValueXc6c9301e
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

    private var statusValue: InlineTreasuryOutboundTransferStatusX846ab535? = null

    public var status: InlineTreasuryOutboundTransferStatusX846ab535
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusTransitionsValue: TreasuryOutboundTransfersResourceStatusTransitions? = null

    public var statusTransitions: TreasuryOutboundTransfersResourceStatusTransitions
      get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
      set(`value`) {
        statusTransitionsValue = value
      }

    private var transactionValue: InlineTreasuryOutboundTransferTransactionXb03a16d6? = null

    public var transaction: InlineTreasuryOutboundTransferTransactionXb03a16d6
      get() = requireNotNull(transactionValue) { "transaction is required" }
      set(`value`) {
        transactionValue = value
      }

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * The PaymentMethod used as the payment instrument for an OutboundTransfer.
     */
    public var destinationPaymentMethod: String? = null

    /**
     * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
     * provided when money movement is considered regulated under Stripe's money transmission licenses.
     */
    public var hostedRegulatoryReceiptUrl: String? = null

    /**
     * Details about a returned OutboundTransfer. Only set when the status is `returned`.
     */
    public var returnedDetails: InlineTreasuryOutboundTransferReturnedDetailsXab1a286e? = null

    /**
     * Details about network-specific tracking information if available.
     */
    public var trackingDetails: InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c? = null

    public fun build(): TreasuryOutboundTransfer {
      check(amountValue != null) { "amount is required" }
      check(cancelableValue != null) { "cancelable is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(destinationPaymentMethodDetailsValue != null) { "destinationPaymentMethodDetails is required" }
      check(expectedArrivalDateValue != null) { "expectedArrivalDate is required" }
      check(financialAccountValue != null) { "financialAccount is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statementDescriptorValue != null) { "statementDescriptor is required" }
      check(statusValue != null) { "status is required" }
      check(statusTransitionsValue != null) { "statusTransitions is required" }
      check(transactionValue != null) { "transaction is required" }
      return TreasuryOutboundTransfer(
        amount = amount,
        cancelable = cancelable,
        created = created,
        currency = currency,
        destinationPaymentMethodDetails = destinationPaymentMethodDetails,
        expectedArrivalDate = expectedArrivalDate,
        financialAccount = financialAccount,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        statementDescriptor = statementDescriptor,
        status = status,
        statusTransitions = statusTransitions,
        transaction = transaction,
        description = description,
        destinationPaymentMethod = destinationPaymentMethod,
        hostedRegulatoryReceiptUrl = hostedRegulatoryReceiptUrl,
        returnedDetails = returnedDetails,
        trackingDetails = trackingDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryOutboundTransfer = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryOutboundTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryOutboundTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryOutboundTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryOutboundTransfer must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val cancelable = json.decodeRequired<Boolean>(rawObject, "cancelable")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val destinationPaymentMethodDetails = json.decodeRequired<OutboundTransfersPaymentMethodDetails>(rawObject, "destination_payment_method_details")
      val expectedArrivalDate = json.decodeRequired<Int>(rawObject, "expected_arrival_date")
      val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineTreasuryOutboundTransferObjectValueXc6c9301e>(rawObject, "object")
      val statementDescriptor = json.decodeRequired<String>(rawObject, "statement_descriptor")
      val status = json.decodeRequired<InlineTreasuryOutboundTransferStatusX846ab535>(rawObject, "status")
      val statusTransitions = json.decodeRequired<TreasuryOutboundTransfersResourceStatusTransitions>(rawObject, "status_transitions")
      val transaction = json.decodeRequired<InlineTreasuryOutboundTransferTransactionXb03a16d6>(rawObject, "transaction")
      return TreasuryOutboundTransfer(
        amount = amount,
        cancelable = cancelable,
        created = created,
        currency = currency,
        destinationPaymentMethodDetails = destinationPaymentMethodDetails,
        expectedArrivalDate = expectedArrivalDate,
        financialAccount = financialAccount,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        statementDescriptor = statementDescriptor,
        status = status,
        statusTransitions = statusTransitions,
        transaction = transaction,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        destinationPaymentMethod = rawObject["destination_payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        hostedRegulatoryReceiptUrl = rawObject["hosted_regulatory_receipt_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        returnedDetails = rawObject["returned_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryOutboundTransferReturnedDetailsXab1a286e?>(element) },
        trackingDetails = rawObject["tracking_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryOutboundTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryOutboundTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("cancelable", json.encodeToJsonElement(value.cancelable))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("destination_payment_method_details", json.encodeToJsonElement(value.destinationPaymentMethodDetails))
        put("expected_arrival_date", json.encodeToJsonElement(value.expectedArrivalDate))
        put("financial_account", value.financialAccount)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("statement_descriptor", value.statementDescriptor)
        put("status", json.encodeToJsonElement(value.status))
        put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
        put("transaction", json.encodeToJsonElement(value.transaction))
        value.description?.let { put("description", it) }
        value.destinationPaymentMethod?.let { put("destination_payment_method", it) }
        value.hostedRegulatoryReceiptUrl?.let { put("hosted_regulatory_receipt_url", it) }
        value.returnedDetails?.let { put("returned_details", json.encodeToJsonElement(it)) }
        value.trackingDetails?.let { put("tracking_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryOutboundTransfer(block: TreasuryOutboundTransfer.Builder.() -> Unit): TreasuryOutboundTransfer = TreasuryOutboundTransfer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryOutboundTransfer is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
