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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items/properties/bill_until/pro
 * perties/duration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items/properties/bill_until/pro
 * perties/duration
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb(
  public val interval:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsIntervalX67fc9dfa,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsIntervalX67fc9dfa? = null

    public var interval:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsIntervalX67fc9dfa
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb {
      check(intervalValue != null) { "interval is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb must be a JSON object")
      val interval = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsIntervalX67fc9dfa>(rawObject, "interval")
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb(block: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsDurationXc349d5eb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
