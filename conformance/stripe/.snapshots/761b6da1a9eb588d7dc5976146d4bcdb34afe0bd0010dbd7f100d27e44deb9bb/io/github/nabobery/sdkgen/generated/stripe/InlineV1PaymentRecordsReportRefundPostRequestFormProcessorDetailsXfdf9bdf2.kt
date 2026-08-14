package io.github.nabobery.sdkgen.generated.stripe

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
 * Processor information for this refund.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_refund/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/processor_details
 */
@Serializable(with = InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2.Serializer::class)
public class InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2(
  public val type: InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839,
  public val custom:
      InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsCustomXd2830381? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839? = null

    public var type: InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var custom:
        InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsCustomXd2830381? = null

    public fun build(): InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2 {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2(
        type = type,
        custom = custom,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2 must be a JSON object")
      val type = json.decodeRequired<InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839>(rawObject, "type")
      return InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2(
        type = type,
        custom = rawObject["custom"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsCustomXd2830381>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.custom?.let { put("custom", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2(block: InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2.Builder.() -> Unit): InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2 = InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsXfdf9bdf2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
