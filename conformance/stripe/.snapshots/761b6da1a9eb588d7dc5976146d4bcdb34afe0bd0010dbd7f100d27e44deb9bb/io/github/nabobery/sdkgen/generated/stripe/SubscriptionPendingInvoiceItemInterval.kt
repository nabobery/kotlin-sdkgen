package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class SubscriptionPendingInvoiceItemIntervalView(
  public val interval: InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5,
  @SerialName("interval_count")
  public val intervalCount: Int,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_pending_invoice_item_interval
 */
@Serializable(with = SubscriptionPendingInvoiceItemInterval.Serializer::class)
public class SubscriptionPendingInvoiceItemInterval(
  /**
   * Specifies invoicing frequency. Either `day`, `week`, `month` or `year`.
   */
  public val interval: InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5,
  /**
   * The number of intervals between invoices. For example, `interval=month` and `interval_count=3` bills every 3
   * months. Maximum of one year interval allowed (1 year, 12 months, or 52 weeks).
   */
  public val intervalCount: Int,
) {
  public class Builder {
    private var intervalValue: InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5? = null

    public var interval: InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    private var intervalCountValue: Int? = null

    public var intervalCount: Int
      get() = requireNotNull(intervalCountValue) { "intervalCount is required" }
      set(`value`) {
        intervalCountValue = value
      }

    public fun build(): SubscriptionPendingInvoiceItemInterval {
      check(intervalValue != null) { "interval is required" }
      check(intervalCountValue != null) { "intervalCount is required" }
      return SubscriptionPendingInvoiceItemInterval(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionPendingInvoiceItemInterval = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionPendingInvoiceItemInterval> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionPendingInvoiceItemInterval {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionPendingInvoiceItemInterval")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionPendingInvoiceItemInterval must be a JSON object")
      val interval = json.decodeRequired<InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5>(rawObject, "interval")
      val intervalCount = json.decodeRequired<Int>(rawObject, "interval_count")
      return SubscriptionPendingInvoiceItemInterval(
        interval = interval,
        intervalCount = intervalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionPendingInvoiceItemInterval) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionPendingInvoiceItemInterval")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        put("interval_count", json.encodeToJsonElement(value.intervalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionPendingInvoiceItemInterval(block: SubscriptionPendingInvoiceItemInterval.Builder.() -> Unit): SubscriptionPendingInvoiceItemInterval = SubscriptionPendingInvoiceItemInterval.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionPendingInvoiceItemInterval is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
