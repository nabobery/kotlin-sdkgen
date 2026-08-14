package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information about the payment attempt refund.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_refund/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/refunded
 */
@Serializable(with = InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a.Serializer::class)
public class InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a(
  public val refundedAt: Int,
) {
  public class Builder {
    private var refundedAtValue: Int? = null

    public var refundedAt: Int
      get() = requireNotNull(refundedAtValue) { "refundedAt is required" }
      set(`value`) {
        refundedAtValue = value
      }

    public fun build(): InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a {
      check(refundedAtValue != null) { "refundedAt is required" }
      return InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a(
        refundedAt = refundedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a must be a JSON object")
      val refundedAt = json.decodeRequired<Int>(rawObject, "refunded_at")
      return InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a(
        refundedAt = refundedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("refunded_at", json.encodeToJsonElement(value.refundedAt))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a(block: InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a.Builder.() -> Unit): InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a = InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentRecordsReportRefundPostRequestFormRefundedX8664755a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
