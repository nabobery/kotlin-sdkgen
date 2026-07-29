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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_schedule
 */
@Serializable(with = TransferSchedule.Serializer::class)
public class TransferSchedule(
  /**
   * The number of days charges for the account will be held before being paid out.
   */
  public val delayDays: Int,
  /**
   * How frequently funds will be paid out. One of `manual` (payouts only created via API call), `daily`, `weekly`, or
   * `monthly`.
   */
  public val interval: String,
  /**
   * The day of the month funds will be paid out. Only shown if `interval` is monthly. Payouts scheduled between the
   * 29th and 31st of the month are sent on the last day of shorter months.
   */
  public val monthlyAnchor: Int? = null,
  monthlyPayoutDays: List<Int>? = null,
  /**
   * The day of the week funds will be paid out, of the style 'monday', 'tuesday', etc. Only shown if `interval` is
   * weekly.
   */
  public val weeklyAnchor: String? = null,
  weeklyPayoutDays: List<InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e>? = null,
) {
  /**
   * The days of the month funds will be paid out. Only shown if `interval` is monthly. Payouts scheduled between the
   * 29th and 31st of the month are sent on the last day of shorter months.
   */
  public val monthlyPayoutDays: List<Int>? =
      monthlyPayoutDays?.let { collection0 -> collection0.toList() }

  /**
   * The days of the week when available funds are paid out, specified as an array, for example, [`monday`, `tuesday`].
   * Only shown if `interval` is weekly.
   */
  public val weeklyPayoutDays: List<InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e>? =
      weeklyPayoutDays?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var delayDaysValue: Int? = null

    public var delayDays: Int
      get() = requireNotNull(delayDaysValue) { "delayDays is required" }
      set(`value`) {
        delayDaysValue = value
      }

    private var intervalValue: String? = null

    public var interval: String
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    /**
     * The day of the month funds will be paid out. Only shown if `interval` is monthly. Payouts scheduled between the
     * 29th and 31st of the month are sent on the last day of shorter months.
     */
    public var monthlyAnchor: Int? = null

    private var monthlyPayoutDaysValue: List<Int>? = null

    /**
     * The days of the month funds will be paid out. Only shown if `interval` is monthly. Payouts scheduled between the
     * 29th and 31st of the month are sent on the last day of shorter months.
     */
    public var monthlyPayoutDays: List<Int>?
      get() = monthlyPayoutDaysValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        monthlyPayoutDaysValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The day of the week funds will be paid out, of the style 'monday', 'tuesday', etc. Only shown if `interval` is
     * weekly.
     */
    public var weeklyAnchor: String? = null

    private var weeklyPayoutDaysValue: List<InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e>? =
        null

    /**
     * The days of the week when available funds are paid out, specified as an array, for example, [`monday`,
     * `tuesday`]. Only shown if `interval` is weekly.
     */
    public var weeklyPayoutDays: List<InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e>?
      get() = weeklyPayoutDaysValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        weeklyPayoutDaysValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): TransferSchedule {
      check(delayDaysValue != null) { "delayDays is required" }
      check(intervalValue != null) { "interval is required" }
      return TransferSchedule(
        delayDays = delayDays,
        interval = interval,
        monthlyAnchor = monthlyAnchor,
        monthlyPayoutDays = monthlyPayoutDays,
        weeklyAnchor = weeklyAnchor,
        weeklyPayoutDays = weeklyPayoutDays,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TransferSchedule = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TransferSchedule> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TransferSchedule {
      val jsonDecoder = decoder.requireJsonDecoder("TransferSchedule")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TransferSchedule must be a JSON object")
      val delayDays = json.decodeRequired<Int>(rawObject, "delay_days")
      val interval = json.decodeRequired<String>(rawObject, "interval")
      return TransferSchedule(
        delayDays = delayDays,
        interval = interval,
        monthlyAnchor = rawObject["monthly_anchor"]?.let { json.decodeFromJsonElement<Int>(it) },
        monthlyPayoutDays = rawObject["monthly_payout_days"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        weeklyAnchor = rawObject["weekly_anchor"]?.let { json.decodeFromJsonElement<String>(it) },
        weeklyPayoutDays = rawObject["weekly_payout_days"]?.let { json.decodeFromJsonElement<List<InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TransferSchedule) {
      val jsonEncoder = encoder.requireJsonEncoder("TransferSchedule")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("delay_days", json.encodeToJsonElement(value.delayDays))
        put("interval", value.interval)
        value.monthlyAnchor?.let { put("monthly_anchor", json.encodeToJsonElement(it)) }
        value.monthlyPayoutDays?.let { put("monthly_payout_days", json.encodeToJsonElement(it)) }
        value.weeklyAnchor?.let { put("weekly_anchor", it) }
        value.weeklyPayoutDays?.let { put("weekly_payout_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun transferSchedule(block: TransferSchedule.Builder.() -> Unit): TransferSchedule = TransferSchedule.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TransferSchedule is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
