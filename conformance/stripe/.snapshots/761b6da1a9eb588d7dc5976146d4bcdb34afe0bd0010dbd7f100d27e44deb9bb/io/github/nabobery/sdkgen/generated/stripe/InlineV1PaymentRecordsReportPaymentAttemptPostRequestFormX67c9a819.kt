package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819(
  /**
   * When the reported payment was initiated. Measured in seconds since the Unix epoch.
   */
  public val initiatedAt: Int,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  expand: List<String>? = null,
  /**
   * Information about the payment attempt failure.
   */
  public val failed:
      InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormFailedX060677f3? = null,
  /**
   * Information about the payment attempt guarantee.
   */
  public val guaranteed:
      InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata:
      InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0? = null,
  /**
   * The outcome of the reported payment.
   */
  public val outcome:
      InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab? = null,
  /**
   * Information about the Payment Method debited for this payment.
   */
  public val paymentMethodDetails:
      InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b? = null,
  /**
   * Shipping information for this payment.
   */
  public val shippingDetails:
      InlineV1PaymentRecordsRepob3f9PostRequestFormShippingDetailsX6f22cc30? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var initiatedAtValue: Int? = null

    public var initiatedAt: Int
      get() = requireNotNull(initiatedAtValue) { "initiatedAt is required" }
      set(`value`) {
        initiatedAtValue = value
      }

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

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
     * Information about the payment attempt failure.
     */
    public var failed: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormFailedX060677f3? =
        null

    /**
     * Information about the payment attempt guarantee.
     */
    public var guaranteed:
        InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0?
        = null

    /**
     * The outcome of the reported payment.
     */
    public var outcome: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab? =
        null

    /**
     * Information about the Payment Method debited for this payment.
     */
    public var paymentMethodDetails:
        InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b? = null

    /**
     * Shipping information for this payment.
     */
    public var shippingDetails:
        InlineV1PaymentRecordsRepob3f9PostRequestFormShippingDetailsX6f22cc30? = null

    public fun build(): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819 {
      check(initiatedAtValue != null) { "initiatedAt is required" }
      return InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819(
        initiatedAt = initiatedAt,
        description = description,
        expand = expand,
        failed = failed,
        guaranteed = guaranteed,
        metadata = metadata,
        outcome = outcome,
        paymentMethodDetails = paymentMethodDetails,
        shippingDetails = shippingDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819 must be a JSON object")
      val initiatedAt = json.decodeRequired<Int>(rawObject, "initiated_at")
      return InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819(
        initiatedAt = initiatedAt,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        failed = rawObject["failed"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormFailedX060677f3>(it) },
        guaranteed = rawObject["guaranteed"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormGuaranteedX78f865ee>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0>(it) },
        outcome = rawObject["outcome"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab>(it) },
        paymentMethodDetails = rawObject["payment_method_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsX55715b8b>(it) },
        shippingDetails = rawObject["shipping_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsRepob3f9PostRequestFormShippingDetailsX6f22cc30>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("initiated_at", json.encodeToJsonElement(value.initiatedAt))
        value.description?.let { put("description", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.failed?.let { put("failed", json.encodeToJsonElement(it)) }
        value.guaranteed?.let { put("guaranteed", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.outcome?.let { put("outcome", json.encodeToJsonElement(it)) }
        value.paymentMethodDetails?.let { put("payment_method_details", json.encodeToJsonElement(it)) }
        value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819(block: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819.Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819 = InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
