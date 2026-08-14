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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6(
  public val interval:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsIntervalXa164a440,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsIntervalXa164a440? = null

    public var interval:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsIntervalXa164a440
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6 {
      check(intervalValue != null) { "interval is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6 must be a JSON object")
      val interval = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsIntervalXa164a440>(rawObject, "interval")
      return InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6(block: InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6 = InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormRecurringXe262fbc6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
