package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts/properties/schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts/properties/schedule
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562(
    public val delayDays: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c? = null,
    public val interval: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52? = null,
    public val monthlyAnchor: Int? = null,
    public val monthlyPayoutDays: List<Int>? = null,
    public val weeklyAnchor: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf? = null,
    public val weeklyPayoutDays: List<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff>? = null,
) {
    public class Builder {
        public var delayDays: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c? =
            null

        public var interval: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52? =
            null

        public var monthlyAnchor: Int? = null

        public var monthlyPayoutDays: List<Int>? = null

        public var weeklyAnchor:
            InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf? = null

        public var weeklyPayoutDays:
            List<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff>? = null

        public fun build(): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562 =
            InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562(
                delayDays = delayDays,
                interval = interval,
                monthlyAnchor = monthlyAnchor,
                monthlyPayoutDays = monthlyPayoutDays,
                weeklyAnchor = weeklyAnchor,
                weeklyPayoutDays = weeklyPayoutDays,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562(
                delayDays =
                    rawObject["delay_days"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c>(
                                it,
                            )
                    },
                interval =
                    rawObject["interval"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52>(
                                it,
                            )
                    },
                monthlyAnchor = rawObject["monthly_anchor"]?.let { json.decodeFromJsonElement<Int>(it) },
                monthlyPayoutDays = rawObject["monthly_payout_days"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
                weeklyAnchor =
                    rawObject["weekly_anchor"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf>(
                                it,
                            )
                    },
                weeklyPayoutDays =
                    rawObject["weekly_payout_days"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.delayDays?.let { put("delay_days", json.encodeToJsonElement(it)) }
                    value.interval?.let { put("interval", json.encodeToJsonElement(it)) }
                    value.monthlyAnchor?.let { put("monthly_anchor", json.encodeToJsonElement(it)) }
                    value.monthlyPayoutDays?.let { put("monthly_payout_days", json.encodeToJsonElement(it)) }
                    value.weeklyAnchor?.let { put("weekly_anchor", json.encodeToJsonElement(it)) }
                    value.weeklyPayoutDays?.let { put("weekly_payout_days", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562(
    block: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562 =
    InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562.build(block)
