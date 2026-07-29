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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payments_invoice_payment_associated_payment
 */
@Serializable(with = InvoicesPaymentsInvoicePaymentAssociatedPayment.Serializer::class)
public class InvoicesPaymentsInvoicePaymentAssociatedPayment(
  /**
   * Type of payment object associated with this invoice payment.
   */
  public val type: InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0,
  /**
   * ID of the successful charge for this payment when `type` is `charge`.Note: charge is only surfaced if the charge
   * object is not associated with a payment intent. If the charge object does have a payment intent, the Invoice
   * Payment surfaces the payment intent instead.
   */
  public val charge: InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4? = null,
  /**
   * ID of the PaymentIntent associated with this payment when `type` is `payment_intent`. Note: This property is only
   * populated for invoices finalized on or after March 15th, 2019.
   */
  public val paymentIntent:
      InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11? = null,
  /**
   * ID of the PaymentRecord associated with this payment when `type` is `payment_record`.
   */
  public val paymentRecord:
      InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a? = null,
) {
  public class Builder {
    private var typeValue: InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0? =
        null

    public var type: InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * ID of the successful charge for this payment when `type` is `charge`.Note: charge is only surfaced if the charge
     * object is not associated with a payment intent. If the charge object does have a payment intent, the Invoice
     * Payment surfaces the payment intent instead.
     */
    public var charge: InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4? = null

    /**
     * ID of the PaymentIntent associated with this payment when `type` is `payment_intent`. Note: This property is only
     * populated for invoices finalized on or after March 15th, 2019.
     */
    public var paymentIntent:
        InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11? = null

    /**
     * ID of the PaymentRecord associated with this payment when `type` is `payment_record`.
     */
    public var paymentRecord:
        InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a? = null

    public fun build(): InvoicesPaymentsInvoicePaymentAssociatedPayment {
      check(typeValue != null) { "type is required" }
      return InvoicesPaymentsInvoicePaymentAssociatedPayment(
        type = type,
        charge = charge,
        paymentIntent = paymentIntent,
        paymentRecord = paymentRecord,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicesPaymentsInvoicePaymentAssociatedPayment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoicesPaymentsInvoicePaymentAssociatedPayment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicesPaymentsInvoicePaymentAssociatedPayment {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicesPaymentsInvoicePaymentAssociatedPayment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicesPaymentsInvoicePaymentAssociatedPayment must be a JSON object")
      val type = json.decodeRequired<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0>(rawObject, "type")
      return InvoicesPaymentsInvoicePaymentAssociatedPayment(
        type = type,
        charge = rawObject["charge"]?.let { json.decodeFromJsonElement<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4>(it) },
        paymentIntent = rawObject["payment_intent"]?.let { json.decodeFromJsonElement<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11>(it) },
        paymentRecord = rawObject["payment_record"]?.let { json.decodeFromJsonElement<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicesPaymentsInvoicePaymentAssociatedPayment) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicesPaymentsInvoicePaymentAssociatedPayment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.charge?.let { put("charge", json.encodeToJsonElement(it)) }
        value.paymentIntent?.let { put("payment_intent", json.encodeToJsonElement(it)) }
        value.paymentRecord?.let { put("payment_record", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicesPaymentsInvoicePaymentAssociatedPayment(block: InvoicesPaymentsInvoicePaymentAssociatedPayment.Builder.() -> Unit): InvoicesPaymentsInvoicePaymentAssociatedPayment = InvoicesPaymentsInvoicePaymentAssociatedPayment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InvoicesPaymentsInvoicePaymentAssociatedPayment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
