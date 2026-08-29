package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class BalanceSettingsResourcePayoutScheduleView internal constructor(
  public val interval: InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3? = null,
  @SerialName("monthly_payout_days")
  public val monthlyPayoutDays: List<Int>? = null,
  @SerialName("weekly_payout_days")
  public val weeklyPayoutDays:
      List<InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354>? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_payout_schedule
 */
@Serializable(with = BalanceSettingsResourcePayoutSchedule.Serializer::class)
public class BalanceSettingsResourcePayoutSchedule(
  /**
   * How frequently funds will be paid out. One of `manual` (payouts only created via API call), `daily`, `weekly`, or
   * `monthly`.
   */
  public val interval: InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3? = null,
  monthlyPayoutDays: List<Int>? = null,
  weeklyPayoutDays: List<InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354>? = null,
) {
  /**
   * The day of the month funds will be paid out. Only shown if `interval` is monthly. Payouts scheduled between the
   * 29th and 31st of the month are sent on the last day of shorter months.
   */
  public val monthlyPayoutDays: List<Int>? =
      monthlyPayoutDays?.let { collection0 -> collection0.toList() }

  /**
   * The days of the week when available funds are paid out, specified as an array, for example, [`monday`, `tuesday`].
   * Only shown if `interval` is weekly.
   */
  public val weeklyPayoutDays:
      List<InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354>? =
      weeklyPayoutDays?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * How frequently funds will be paid out. One of `manual` (payouts only created via API call), `daily`, `weekly`, or
     * `monthly`.
     */
    public var interval: InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3? = null

    private var monthlyPayoutDaysValue: List<Int>? = null

    /**
     * The day of the month funds will be paid out. Only shown if `interval` is monthly. Payouts scheduled between the
     * 29th and 31st of the month are sent on the last day of shorter months.
     */
    public var monthlyPayoutDays: List<Int>?
      get() = monthlyPayoutDaysValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        monthlyPayoutDaysValue = value?.let { collection0 -> collection0.toList() }
      }

    private var weeklyPayoutDaysValue:
        List<InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354>? = null

    /**
     * The days of the week when available funds are paid out, specified as an array, for example, [`monday`,
     * `tuesday`]. Only shown if `interval` is weekly.
     */
    public var weeklyPayoutDays:
        List<InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354>?
      get() = weeklyPayoutDaysValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        weeklyPayoutDaysValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): BalanceSettingsResourcePayoutSchedule = BalanceSettingsResourcePayoutSchedule(
      interval = interval,
      monthlyPayoutDays = monthlyPayoutDays,
      weeklyPayoutDays = weeklyPayoutDays,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BalanceSettingsResourcePayoutSchedule = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BalanceSettingsResourcePayoutSchedule> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BalanceSettingsResourcePayoutSchedule {
      val jsonDecoder = decoder.requireJsonDecoder("BalanceSettingsResourcePayoutSchedule")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BalanceSettingsResourcePayoutSchedule must be a JSON object")
      return BalanceSettingsResourcePayoutSchedule(
        interval = rawObject["interval"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3?>(element) },
        monthlyPayoutDays = rawObject["monthly_payout_days"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        weeklyPayoutDays = rawObject["weekly_payout_days"]?.let { json.decodeFromJsonElement<List<InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BalanceSettingsResourcePayoutSchedule) {
      val jsonEncoder = encoder.requireJsonEncoder("BalanceSettingsResourcePayoutSchedule")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.interval?.let { put("interval", json.encodeToJsonElement(it)) }
        value.monthlyPayoutDays?.let { put("monthly_payout_days", json.encodeToJsonElement(it)) }
        value.weeklyPayoutDays?.let { put("weekly_payout_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balanceSettingsResourcePayoutSchedule(block: BalanceSettingsResourcePayoutSchedule.Builder.() -> Unit): BalanceSettingsResourcePayoutSchedule = BalanceSettingsResourcePayoutSchedule.build(block)
