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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/pending_invoice_item_interval/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/pending_invoice_item_interval/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd(
  public val interval:
      InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74? = null

    public var interval:
        InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd {
      check(intervalValue != null) { "interval is required" }
      return InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd must be a JSON object")
      val interval = json.decodeRequired<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74>(rawObject, "interval")
      return InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd(block: InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd = InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
