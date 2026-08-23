package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1pay/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1pay/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema
 */
@Serializable(with = InlineV1InvoicesPayPostRequestFormXa80f3da3.Serializer::class)
public class InlineV1InvoicesPayPostRequestFormXa80f3da3(
  expand: List<String>? = null,
  /**
   * In cases where the source used to pay the invoice has insufficient funds, passing `forgive=true` controls whether a
   * charge should be attempted for the full amount available on the source, up to the amount to fully pay the invoice.
   * This effectively forgives the difference between the amount available on the source and the amount due.
   *
   * Passing `forgive=false` will fail the charge if the source hasn't been pre-funded with the right amount. An example
   * for this case is with ACH Credit Transfers and wires: if the amount wired is less than the amount due by a small
   * amount, you might want to forgive the difference. Defaults to `false`.
   */
  public val forgive: Boolean? = null,
  /**
   * ID of the mandate to be used for this invoice. It must correspond to the payment method used to pay the invoice,
   * including the payment_method param or the invoice's default_payment_method or default_source, if set.
   */
  public val mandate: InlineV1InvoicesPayPostRequestFormMandateXb092602a? = null,
  /**
   * Indicates if a customer is on or off-session while an invoice payment is attempted. Defaults to `true`
   * (off-session).
   */
  public val offSession: Boolean? = null,
  /**
   * Boolean representing whether an invoice is paid outside of Stripe. This will result in no charge being made.
   * Defaults to `false`.
   */
  public val paidOutOfBand: Boolean? = null,
  /**
   * A PaymentMethod to be charged. The PaymentMethod must be the ID of a PaymentMethod belonging to the customer
   * associated with the invoice being paid.
   */
  public val paymentMethod: String? = null,
  /**
   * A payment source to be charged. The source must be the ID of a source belonging to the customer associated with the
   * invoice being paid.
   */
  public val source: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * In cases where the source used to pay the invoice has insufficient funds, passing `forgive=true` controls whether
     * a charge should be attempted for the full amount available on the source, up to the amount to fully pay the
     * invoice. This effectively forgives the difference between the amount available on the source and the amount due.
     *
     * Passing `forgive=false` will fail the charge if the source hasn't been pre-funded with the right amount. An
     * example for this case is with ACH Credit Transfers and wires: if the amount wired is less than the amount due by
     * a small amount, you might want to forgive the difference. Defaults to `false`.
     */
    public var forgive: Boolean? = null

    /**
     * ID of the mandate to be used for this invoice. It must correspond to the payment method used to pay the invoice,
     * including the payment_method param or the invoice's default_payment_method or default_source, if set.
     */
    public var mandate: InlineV1InvoicesPayPostRequestFormMandateXb092602a? = null

    /**
     * Indicates if a customer is on or off-session while an invoice payment is attempted. Defaults to `true`
     * (off-session).
     */
    public var offSession: Boolean? = null

    /**
     * Boolean representing whether an invoice is paid outside of Stripe. This will result in no charge being made.
     * Defaults to `false`.
     */
    public var paidOutOfBand: Boolean? = null

    /**
     * A PaymentMethod to be charged. The PaymentMethod must be the ID of a PaymentMethod belonging to the customer
     * associated with the invoice being paid.
     */
    public var paymentMethod: String? = null

    /**
     * A payment source to be charged. The source must be the ID of a source belonging to the customer associated with
     * the invoice being paid.
     */
    public var source: String? = null

    public fun build(): InlineV1InvoicesPayPostRequestFormXa80f3da3 = InlineV1InvoicesPayPostRequestFormXa80f3da3(
      expand = expand,
      forgive = forgive,
      mandate = mandate,
      offSession = offSession,
      paidOutOfBand = paidOutOfBand,
      paymentMethod = paymentMethod,
      source = source,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPayPostRequestFormXa80f3da3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPayPostRequestFormXa80f3da3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPayPostRequestFormXa80f3da3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPayPostRequestFormXa80f3da3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPayPostRequestFormXa80f3da3 must be a JSON object")
      return InlineV1InvoicesPayPostRequestFormXa80f3da3(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        forgive = rawObject["forgive"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        mandate = rawObject["mandate"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPayPostRequestFormMandateXb092602a>(it) },
        offSession = rawObject["off_session"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        paidOutOfBand = rawObject["paid_out_of_band"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        source = rawObject["source"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPayPostRequestFormXa80f3da3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPayPostRequestFormXa80f3da3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.forgive?.let { put("forgive", json.encodeToJsonElement(it)) }
        value.mandate?.let { put("mandate", json.encodeToJsonElement(it)) }
        value.offSession?.let { put("off_session", json.encodeToJsonElement(it)) }
        value.paidOutOfBand?.let { put("paid_out_of_band", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.source?.let { put("source", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPayPostRequestFormXa80f3da3(block: InlineV1InvoicesPayPostRequestFormXa80f3da3.Builder.() -> Unit): InlineV1InvoicesPayPostRequestFormXa80f3da3 = InlineV1InvoicesPayPostRequestFormXa80f3da3.build(block)
