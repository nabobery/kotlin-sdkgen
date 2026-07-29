package com.nabobery.sdkgen.generated.stripe

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
 * Information about the payment attempt guarantee.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/guaranteed
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c(
  public val guaranteedAt: Int,
) {
  public class Builder {
    private var guaranteedAtValue: Int? = null

    public var guaranteedAt: Int
      get() = requireNotNull(guaranteedAtValue) { "guaranteedAt is required" }
      set(`value`) {
        guaranteedAtValue = value
      }

    public fun build(): InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c {
      check(guaranteedAtValue != null) { "guaranteedAt is required" }
      return InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c(
        guaranteedAt = guaranteedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c must be a JSON object")
      val guaranteedAt = json.decodeRequired<Int>(rawObject, "guaranteed_at")
      return InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c(
        guaranteedAt = guaranteedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("guaranteed_at", json.encodeToJsonElement(value.guaranteedAt))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c(block: InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c.Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c = InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
