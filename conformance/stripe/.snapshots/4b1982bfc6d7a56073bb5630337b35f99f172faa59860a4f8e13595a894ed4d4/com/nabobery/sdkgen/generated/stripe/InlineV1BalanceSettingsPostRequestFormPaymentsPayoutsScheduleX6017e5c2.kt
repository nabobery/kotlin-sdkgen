package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/schedule
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2(
  public val interval:
      InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleIntervalXc0de2e63? = null,
  monthlyPayoutDays: List<Int>? = null,
  weeklyPayoutDays: List<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43>? = null,
) {
  public val monthlyPayoutDays: List<Int>? =
      monthlyPayoutDays?.let { collection0 -> collection0.toList() }

  public val weeklyPayoutDays:
      List<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43>? =
      weeklyPayoutDays?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var interval:
        InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleIntervalXc0de2e63? = null

    private var monthlyPayoutDaysValue: List<Int>? = null

    public var monthlyPayoutDays: List<Int>?
      get() = monthlyPayoutDaysValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        monthlyPayoutDaysValue = value?.let { collection0 -> collection0.toList() }
      }

    private var weeklyPayoutDaysValue:
        List<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43>? = null

    public var weeklyPayoutDays:
        List<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43>?
      get() = weeklyPayoutDaysValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        weeklyPayoutDaysValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2 = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2(
      interval = interval,
      monthlyPayoutDays = monthlyPayoutDays,
      weeklyPayoutDays = weeklyPayoutDays,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2 must be a JSON object")
      return InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2(
        interval = rawObject["interval"]?.let { json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleIntervalXc0de2e63>(it) },
        monthlyPayoutDays = rawObject["monthly_payout_days"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        weeklyPayoutDays = rawObject["weekly_payout_days"]?.let { json.decodeFromJsonElement<List<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2")
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

public fun inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2(block: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2.Builder.() -> Unit): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2 = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2.build(block)
