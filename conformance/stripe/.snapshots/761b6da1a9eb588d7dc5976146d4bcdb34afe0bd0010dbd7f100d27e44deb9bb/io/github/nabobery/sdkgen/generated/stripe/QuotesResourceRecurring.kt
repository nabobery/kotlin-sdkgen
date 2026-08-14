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
public data class QuotesResourceRecurringView(
  @SerialName("amount_subtotal")
  public val amountSubtotal: Int,
  @SerialName("amount_total")
  public val amountTotal: Int,
  public val interval: InlineQuotesResourceRecurringIntervalXfb12c2aa,
  @SerialName("interval_count")
  public val intervalCount: Int,
  @SerialName("total_details")
  public val totalDetails: QuotesResourceTotalDetails,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_recurring
 */
@Serializable(with = QuotesResourceRecurring.Serializer::class)
public class QuotesResourceRecurring(
  /**
   * Total before any discounts or taxes are applied.
   */
  public val amountSubtotal: Int,
  /**
   * Total after discounts and taxes are applied.
   */
  public val amountTotal: Int,
  /**
   * The frequency at which a subscription is billed. One of `day`, `week`, `month` or `year`.
   */
  public val interval: InlineQuotesResourceRecurringIntervalXfb12c2aa,
  /**
   * The number of intervals (specified in the `interval` attribute) between subscription billings. For example,
   * `interval=month` and `interval_count=3` bills every 3 months.
   */
  public val intervalCount: Int,
  public val totalDetails: QuotesResourceTotalDetails,
) {
  public class Builder {
    private var amountSubtotalValue: Int? = null

    public var amountSubtotal: Int
      get() = requireNotNull(amountSubtotalValue) { "amountSubtotal is required" }
      set(`value`) {
        amountSubtotalValue = value
      }

    private var amountTotalValue: Int? = null

    public var amountTotal: Int
      get() = requireNotNull(amountTotalValue) { "amountTotal is required" }
      set(`value`) {
        amountTotalValue = value
      }

    private var intervalValue: InlineQuotesResourceRecurringIntervalXfb12c2aa? = null

    public var interval: InlineQuotesResourceRecurringIntervalXfb12c2aa
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

    private var totalDetailsValue: QuotesResourceTotalDetails? = null

    public var totalDetails: QuotesResourceTotalDetails
      get() = requireNotNull(totalDetailsValue) { "totalDetails is required" }
      set(`value`) {
        totalDetailsValue = value
      }

    public fun build(): QuotesResourceRecurring {
      check(amountSubtotalValue != null) { "amountSubtotal is required" }
      check(amountTotalValue != null) { "amountTotal is required" }
      check(intervalValue != null) { "interval is required" }
      check(intervalCountValue != null) { "intervalCount is required" }
      check(totalDetailsValue != null) { "totalDetails is required" }
      return QuotesResourceRecurring(
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
        interval = interval,
        intervalCount = intervalCount,
        totalDetails = totalDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceRecurring = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<QuotesResourceRecurring> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceRecurring {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceRecurring")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceRecurring must be a JSON object")
      val amountSubtotal = json.decodeRequired<Int>(rawObject, "amount_subtotal")
      val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
      val interval = json.decodeRequired<InlineQuotesResourceRecurringIntervalXfb12c2aa>(rawObject, "interval")
      val intervalCount = json.decodeRequired<Int>(rawObject, "interval_count")
      val totalDetails = json.decodeRequired<QuotesResourceTotalDetails>(rawObject, "total_details")
      return QuotesResourceRecurring(
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
        interval = interval,
        intervalCount = intervalCount,
        totalDetails = totalDetails,
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceRecurring) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceRecurring")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_subtotal", json.encodeToJsonElement(value.amountSubtotal))
        put("amount_total", json.encodeToJsonElement(value.amountTotal))
        put("interval", json.encodeToJsonElement(value.interval))
        put("interval_count", json.encodeToJsonElement(value.intervalCount))
        put("total_details", json.encodeToJsonElement(value.totalDetails))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceRecurring(block: QuotesResourceRecurring.Builder.() -> Unit): QuotesResourceRecurring = QuotesResourceRecurring.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("QuotesResourceRecurring is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
