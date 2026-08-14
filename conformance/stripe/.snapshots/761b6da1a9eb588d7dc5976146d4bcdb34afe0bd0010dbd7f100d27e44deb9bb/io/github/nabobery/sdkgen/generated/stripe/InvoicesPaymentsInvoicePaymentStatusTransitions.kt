package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payments_invoice_payment_status_transitions
 */
@Serializable(with = InvoicesPaymentsInvoicePaymentStatusTransitions.Serializer::class)
public class InvoicesPaymentsInvoicePaymentStatusTransitions(
  /**
   * The time that the payment was canceled.
   */
  public val canceledAt: Int? = null,
  /**
   * The time that the payment succeeded.
   */
  public val paidAt: Int? = null,
) {
  public class Builder {
    /**
     * The time that the payment was canceled.
     */
    public var canceledAt: Int? = null

    /**
     * The time that the payment succeeded.
     */
    public var paidAt: Int? = null

    public fun build(): InvoicesPaymentsInvoicePaymentStatusTransitions = InvoicesPaymentsInvoicePaymentStatusTransitions(
      canceledAt = canceledAt,
      paidAt = paidAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicesPaymentsInvoicePaymentStatusTransitions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoicesPaymentsInvoicePaymentStatusTransitions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicesPaymentsInvoicePaymentStatusTransitions {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicesPaymentsInvoicePaymentStatusTransitions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicesPaymentsInvoicePaymentStatusTransitions must be a JSON object")
      return InvoicesPaymentsInvoicePaymentStatusTransitions(
        canceledAt = rawObject["canceled_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        paidAt = rawObject["paid_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicesPaymentsInvoicePaymentStatusTransitions) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicesPaymentsInvoicePaymentStatusTransitions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
        value.paidAt?.let { put("paid_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicesPaymentsInvoicePaymentStatusTransitions(block: InvoicesPaymentsInvoicePaymentStatusTransitions.Builder.() -> Unit): InvoicesPaymentsInvoicePaymentStatusTransitions = InvoicesPaymentsInvoicePaymentStatusTransitions.build(block)
