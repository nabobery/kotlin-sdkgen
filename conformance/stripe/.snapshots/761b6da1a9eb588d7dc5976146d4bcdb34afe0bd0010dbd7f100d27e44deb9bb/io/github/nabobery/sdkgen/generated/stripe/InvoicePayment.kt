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
 * Invoice Payments represent payments made against invoices. Invoice Payments can
 * be accessed in two ways:
 * 1. By expanding the `payments` field on the [Invoice](https://api.stripe.com#invoice) resource.
 * 2. By using the Invoice Payment retrieve and list endpoints.
 *
 * Invoice Payments include the mapping between payment objects, such as Payment Intent, and Invoices.
 * This resource and its endpoints allows you to easily track if a payment is associated with a specific invoice and
 * monitor the allocation details of the payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment
 */
@Serializable(with = InvoicePayment.Serializer::class)
public class InvoicePayment(
  /**
   * Amount intended to be paid toward this invoice, in cents (or local equivalent)
   */
  public val amountRequested: Int,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  public val currency: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * The invoice that was paid.
   */
  public val invoice: InlineInvoicePaymentInvoiceXd7bd6515,
  /**
   * Stripe automatically creates a default InvoicePayment when the invoice is finalized, and keeps it synchronized with
   * the invoice’s `amount_remaining`. The PaymentIntent associated with the default payment can’t be edited or canceled
   * directly.
   */
  public val isDefault: Boolean,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineInvoicePaymentObjectValueX4efe6dee,
  public val payment: InvoicesPaymentsInvoicePaymentAssociatedPayment,
  /**
   * The status of the payment, one of `open`, `paid`, or `canceled`.
   */
  public val status: String,
  public val statusTransitions: InvoicesPaymentsInvoicePaymentStatusTransitions,
  /**
   * Amount that was actually paid for this invoice, in cents (or local equivalent). This field is null until the
   * payment is `paid`. This amount can be less than the `amount_requested` if the PaymentIntent’s `amount_received` is
   * not sufficient to pay all of the invoices that it is attached to.
   */
  public val amountPaid: Int? = null,
) {
  public class Builder {
    private var amountRequestedValue: Int? = null

    public var amountRequested: Int
      get() = requireNotNull(amountRequestedValue) { "amountRequested is required" }
      set(`value`) {
        amountRequestedValue = value
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

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var invoiceValue: InlineInvoicePaymentInvoiceXd7bd6515? = null

    public var invoice: InlineInvoicePaymentInvoiceXd7bd6515
      get() = requireNotNull(invoiceValue) { "invoice is required" }
      set(`value`) {
        invoiceValue = value
      }

    private var isDefaultValue: Boolean? = null

    public var isDefault: Boolean
      get() = requireNotNull(isDefaultValue) { "isDefault is required" }
      set(`value`) {
        isDefaultValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineInvoicePaymentObjectValueX4efe6dee? = null

    public var objectValue: InlineInvoicePaymentObjectValueX4efe6dee
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paymentValue: InvoicesPaymentsInvoicePaymentAssociatedPayment? = null

    public var payment: InvoicesPaymentsInvoicePaymentAssociatedPayment
      get() = requireNotNull(paymentValue) { "payment is required" }
      set(`value`) {
        paymentValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusTransitionsValue: InvoicesPaymentsInvoicePaymentStatusTransitions? = null

    public var statusTransitions: InvoicesPaymentsInvoicePaymentStatusTransitions
      get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
      set(`value`) {
        statusTransitionsValue = value
      }

    /**
     * Amount that was actually paid for this invoice, in cents (or local equivalent). This field is null until the
     * payment is `paid`. This amount can be less than the `amount_requested` if the PaymentIntent’s `amount_received`
     * is not sufficient to pay all of the invoices that it is attached to.
     */
    public var amountPaid: Int? = null

    public fun build(): InvoicePayment {
      check(amountRequestedValue != null) { "amountRequested is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(invoiceValue != null) { "invoice is required" }
      check(isDefaultValue != null) { "isDefault is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(paymentValue != null) { "payment is required" }
      check(statusValue != null) { "status is required" }
      check(statusTransitionsValue != null) { "statusTransitions is required" }
      return InvoicePayment(
        amountRequested = amountRequested,
        created = created,
        currency = currency,
        id = id,
        invoice = invoice,
        isDefault = isDefault,
        livemode = livemode,
        objectValue = objectValue,
        payment = payment,
        status = status,
        statusTransitions = statusTransitions,
        amountPaid = amountPaid,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePayment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoicePayment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePayment {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePayment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePayment must be a JSON object")
      val amountRequested = json.decodeRequired<Int>(rawObject, "amount_requested")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val invoice = json.decodeRequired<InlineInvoicePaymentInvoiceXd7bd6515>(rawObject, "invoice")
      val isDefault = json.decodeRequired<Boolean>(rawObject, "is_default")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineInvoicePaymentObjectValueX4efe6dee>(rawObject, "object")
      val payment = json.decodeRequired<InvoicesPaymentsInvoicePaymentAssociatedPayment>(rawObject, "payment")
      val status = json.decodeRequired<String>(rawObject, "status")
      val statusTransitions = json.decodeRequired<InvoicesPaymentsInvoicePaymentStatusTransitions>(rawObject, "status_transitions")
      return InvoicePayment(
        amountRequested = amountRequested,
        created = created,
        currency = currency,
        id = id,
        invoice = invoice,
        isDefault = isDefault,
        livemode = livemode,
        objectValue = objectValue,
        payment = payment,
        status = status,
        statusTransitions = statusTransitions,
        amountPaid = rawObject["amount_paid"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePayment) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePayment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_requested", json.encodeToJsonElement(value.amountRequested))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("invoice", json.encodeToJsonElement(value.invoice))
        put("is_default", json.encodeToJsonElement(value.isDefault))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("payment", json.encodeToJsonElement(value.payment))
        put("status", value.status)
        put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
        value.amountPaid?.let { put("amount_paid", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePayment(block: InvoicePayment.Builder.() -> Unit): InvoicePayment = InvoicePayment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InvoicePayment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
