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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_failed/post/requestBody/conte
 * nt/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_failed/post/requestBody/conte
 * nt/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739(
  /**
   * When the reported payment failed. Measured in seconds since the Unix epoch.
   */
  public val failedAt: Int,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata:
      InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormMetadataX6b2ecfb7? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var failedAtValue: Int? = null

    public var failedAt: Int
      get() = requireNotNull(failedAtValue) { "failedAt is required" }
      set(`value`) {
        failedAtValue = value
      }

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
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata:
        InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormMetadataX6b2ecfb7? = null

    public fun build(): InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739 {
      check(failedAtValue != null) { "failedAt is required" }
      return InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739(
        failedAt = failedAt,
        expand = expand,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739 must be a JSON object")
      val failedAt = json.decodeRequired<Int>(rawObject, "failed_at")
      return InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739(
        failedAt = failedAt,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormMetadataX6b2ecfb7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("failed_at", json.encodeToJsonElement(value.failedAt))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739(block: InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739.Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739 = InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
