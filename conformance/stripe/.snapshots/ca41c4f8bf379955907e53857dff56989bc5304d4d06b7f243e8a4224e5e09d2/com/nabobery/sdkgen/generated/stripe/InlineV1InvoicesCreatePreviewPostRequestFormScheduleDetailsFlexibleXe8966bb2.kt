package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/billing_mode/properties/flexible.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/billing_mode/properties/flexible
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2(
  public val prorationDiscounts:
      InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28? = null,
) {
  public class Builder {
    public var prorationDiscounts:
        InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2 = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2(
      prorationDiscounts = prorationDiscounts,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2 must be a JSON object")
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2(
        prorationDiscounts = rawObject["proration_discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.prorationDiscounts?.let { put("proration_discounts", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2(block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2 = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2.build(block)
