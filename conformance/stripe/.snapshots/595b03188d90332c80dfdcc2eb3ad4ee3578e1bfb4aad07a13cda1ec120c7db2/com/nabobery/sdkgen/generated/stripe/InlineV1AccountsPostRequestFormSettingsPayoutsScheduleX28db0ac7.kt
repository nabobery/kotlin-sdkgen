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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts/properties/schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts/properties/schedule
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7(
    public val delayDays: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674? = null,
    public val interval: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX777e235e? = null,
    public val monthlyAnchor: Int? = null,
    public val monthlyPayoutDays: List<Int>? = null,
    public val weeklyAnchor: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX09082814? = null,
    public val weeklyPayoutDays: List<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2>? = null,
) {
    public class Builder {
        public var delayDays: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674? =
            null

        public var interval: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX777e235e? =
            null

        public var monthlyAnchor: Int? = null

        public var monthlyPayoutDays: List<Int>? = null

        public var weeklyAnchor:
            InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX09082814? = null

        public var weeklyPayoutDays:
            List<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2>? = null

        public fun build(): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7 =
            InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7(
                delayDays = delayDays,
                interval = interval,
                monthlyAnchor = monthlyAnchor,
                monthlyPayoutDays = monthlyPayoutDays,
                weeklyAnchor = weeklyAnchor,
                weeklyPayoutDays = weeklyPayoutDays,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7(
                delayDays =
                    rawObject["delay_days"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674>(
                                it,
                            )
                    },
                interval =
                    rawObject["interval"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX777e235e>(
                                it,
                            )
                    },
                monthlyAnchor = rawObject["monthly_anchor"]?.let { json.decodeFromJsonElement<Int>(it) },
                monthlyPayoutDays = rawObject["monthly_payout_days"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
                weeklyAnchor =
                    rawObject["weekly_anchor"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX09082814>(
                                it,
                            )
                    },
                weeklyPayoutDays =
                    rawObject["weekly_payout_days"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7",
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

public fun inlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7(
    block: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7 =
    InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7.build(block)
