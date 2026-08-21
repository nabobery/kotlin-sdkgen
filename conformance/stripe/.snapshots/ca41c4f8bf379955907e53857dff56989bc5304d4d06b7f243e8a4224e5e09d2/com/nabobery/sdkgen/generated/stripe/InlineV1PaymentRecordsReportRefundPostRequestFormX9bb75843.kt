package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_refund/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_refund/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843.Serializer::class)
public class InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843(
  /**
   * The outcome of the reported refund.
   */
  public val outcome: InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5,
  /**
   * Processor information for this refund.
   */
  public val processorDetails:
      InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2,
  /**
   * A positive integer in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) representing
   * how much of this payment to refund. Can refund only up to the remaining, unrefunded amount of the payment.
   */
  public val amount: InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf? = null,
  expand: List<String>? = null,
  /**
   * When the reported refund was initiated. Measured in seconds since the Unix epoch.
   */
  public val initiatedAt: Int? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1PaymentRecordsReportRefundPostRequestFormMetadataXa3eabd80? = null,
  /**
   * Information about the payment attempt refund.
   */
  public val refunded: InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var outcomeValue: InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5? =
        null

    public var outcome: InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5
      get() = requireNotNull(outcomeValue) { "outcome is required" }
      set(`value`) {
        outcomeValue = value
      }

    private var processorDetailsValue:
        InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2? = null

    public var processorDetails:
        InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2
      get() = requireNotNull(processorDetailsValue) { "processorDetails is required" }
      set(`value`) {
        processorDetailsValue = value
      }

    /**
     * A positive integer in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) representing
     * how much of this payment to refund. Can refund only up to the remaining, unrefunded amount of the payment.
     */
    public var amount: InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf? = null

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
     * When the reported refund was initiated. Measured in seconds since the Unix epoch.
     */
    public var initiatedAt: Int? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1PaymentRecordsReportRefundPostRequestFormMetadataXa3eabd80? = null

    /**
     * Information about the payment attempt refund.
     */
    public var refunded: InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a? = null

    public fun build(): InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843 {
      check(outcomeValue != null) { "outcome is required" }
      check(processorDetailsValue != null) { "processorDetails is required" }
      return InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843(
        outcome = outcome,
        processorDetails = processorDetails,
        amount = amount,
        expand = expand,
        initiatedAt = initiatedAt,
        metadata = metadata,
        refunded = refunded,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843 must be a JSON object")
      val outcome = json.decodeRequired<InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5>(rawObject, "outcome")
      val processorDetails = json.decodeRequired<InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2>(rawObject, "processor_details")
      return InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843(
        outcome = outcome,
        processorDetails = processorDetails,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsReportRefundPostRequestFormAmountXc6fcaaaf>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        initiatedAt = rawObject["initiated_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsReportRefundPostRequestFormMetadataXa3eabd80>(it) },
        refunded = rawObject["refunded"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("outcome", json.encodeToJsonElement(value.outcome))
        put("processor_details", json.encodeToJsonElement(value.processorDetails))
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.initiatedAt?.let { put("initiated_at", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.refunded?.let { put("refunded", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843(block: InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843.Builder.() -> Unit): InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843 = InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
