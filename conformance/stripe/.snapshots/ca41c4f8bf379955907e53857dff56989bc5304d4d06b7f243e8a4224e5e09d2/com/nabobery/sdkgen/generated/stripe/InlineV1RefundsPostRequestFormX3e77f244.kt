package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1refunds/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1refunds/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1RefundsPostRequestFormX3e77f244.Serializer::class)
public class InlineV1RefundsPostRequestFormX3e77f244(
  public val amount: Int? = null,
  /**
   * The identifier of the charge to refund.
   */
  public val charge: String? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * Customer whose customer balance to refund from.
   */
  public val customer: String? = null,
  expand: List<String>? = null,
  /**
   * For payment methods without native refund support (e.g., Konbini, PromptPay), use this email from the customer to
   * receive refund instructions.
   */
  public val instructionsEmail: String? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1RefundsPostRequestFormMetadataX0b919f39? = null,
  /**
   * Origin of the refund
   */
  public val origin: InlineV1RefundsPostRequestFormOriginX66fb951a? = null,
  /**
   * The identifier of the PaymentIntent to refund.
   */
  public val paymentIntent: String? = null,
  /**
   * String indicating the reason for the refund. If set, possible values are `duplicate`, `fraudulent`, and
   * `requested_by_customer`. If you believe the charge to be fraudulent, specifying `fraudulent` as the reason will add
   * the associated card and email to your [block lists](https://docs.stripe.com/radar/lists), and will also help us
   * improve our fraud detection algorithms.
   */
  public val reason: InlineV1RefundsPostRequestFormReasonX6845834e? = null,
  /**
   * Boolean indicating whether the application fee should be refunded when refunding this charge. If a full charge
   * refund is given, the full application fee will be refunded. Otherwise, the application fee will be refunded in an
   * amount proportional to the amount of the charge refunded. An application fee can be refunded only by the
   * application that created the charge.
   */
  public val refundApplicationFee: Boolean? = null,
  /**
   * Boolean indicating whether the transfer should be reversed when refunding this charge. The transfer will be
   * reversed proportionally to the amount being refunded (either the entire or partial amount).<br><br>A transfer can
   * be reversed only by the application that created the charge.
   */
  public val reverseTransfer: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var amount: Int? = null

    /**
     * The identifier of the charge to refund.
     */
    public var charge: String? = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * Customer whose customer balance to refund from.
     */
    public var customer: String? = null

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
     * For payment methods without native refund support (e.g., Konbini, PromptPay), use this email from the customer to
     * receive refund instructions.
     */
    public var instructionsEmail: String? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1RefundsPostRequestFormMetadataX0b919f39? = null

    /**
     * Origin of the refund
     */
    public var origin: InlineV1RefundsPostRequestFormOriginX66fb951a? = null

    /**
     * The identifier of the PaymentIntent to refund.
     */
    public var paymentIntent: String? = null

    /**
     * String indicating the reason for the refund. If set, possible values are `duplicate`, `fraudulent`, and
     * `requested_by_customer`. If you believe the charge to be fraudulent, specifying `fraudulent` as the reason will
     * add the associated card and email to your [block lists](https://docs.stripe.com/radar/lists), and will also help
     * us improve our fraud detection algorithms.
     */
    public var reason: InlineV1RefundsPostRequestFormReasonX6845834e? = null

    /**
     * Boolean indicating whether the application fee should be refunded when refunding this charge. If a full charge
     * refund is given, the full application fee will be refunded. Otherwise, the application fee will be refunded in an
     * amount proportional to the amount of the charge refunded. An application fee can be refunded only by the
     * application that created the charge.
     */
    public var refundApplicationFee: Boolean? = null

    /**
     * Boolean indicating whether the transfer should be reversed when refunding this charge. The transfer will be
     * reversed proportionally to the amount being refunded (either the entire or partial amount).<br><br>A transfer can
     * be reversed only by the application that created the charge.
     */
    public var reverseTransfer: Boolean? = null

    public fun build(): InlineV1RefundsPostRequestFormX3e77f244 = InlineV1RefundsPostRequestFormX3e77f244(
      amount = amount,
      charge = charge,
      currency = currency,
      customer = customer,
      expand = expand,
      instructionsEmail = instructionsEmail,
      metadata = metadata,
      origin = origin,
      paymentIntent = paymentIntent,
      reason = reason,
      refundApplicationFee = refundApplicationFee,
      reverseTransfer = reverseTransfer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1RefundsPostRequestFormX3e77f244 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1RefundsPostRequestFormX3e77f244> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RefundsPostRequestFormX3e77f244 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RefundsPostRequestFormX3e77f244")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1RefundsPostRequestFormX3e77f244 must be a JSON object")
      return InlineV1RefundsPostRequestFormX3e77f244(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        charge = rawObject["charge"]?.let { json.decodeFromJsonElement<String>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        instructionsEmail = rawObject["instructions_email"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1RefundsPostRequestFormMetadataX0b919f39>(it) },
        origin = rawObject["origin"]?.let { json.decodeFromJsonElement<InlineV1RefundsPostRequestFormOriginX66fb951a>(it) },
        paymentIntent = rawObject["payment_intent"]?.let { json.decodeFromJsonElement<String>(it) },
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<InlineV1RefundsPostRequestFormReasonX6845834e>(it) },
        refundApplicationFee = rawObject["refund_application_fee"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        reverseTransfer = rawObject["reverse_transfer"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RefundsPostRequestFormX3e77f244) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1RefundsPostRequestFormX3e77f244")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.charge?.let { put("charge", it) }
        value.currency?.let { put("currency", it) }
        value.customer?.let { put("customer", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.instructionsEmail?.let { put("instructions_email", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.origin?.let { put("origin", json.encodeToJsonElement(it)) }
        value.paymentIntent?.let { put("payment_intent", it) }
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
        value.refundApplicationFee?.let { put("refund_application_fee", json.encodeToJsonElement(it)) }
        value.reverseTransfer?.let { put("reverse_transfer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1RefundsPostRequestFormX3e77f244(block: InlineV1RefundsPostRequestFormX3e77f244.Builder.() -> Unit): InlineV1RefundsPostRequestFormX3e77f244 = InlineV1RefundsPostRequestFormX3e77f244.build(block)
