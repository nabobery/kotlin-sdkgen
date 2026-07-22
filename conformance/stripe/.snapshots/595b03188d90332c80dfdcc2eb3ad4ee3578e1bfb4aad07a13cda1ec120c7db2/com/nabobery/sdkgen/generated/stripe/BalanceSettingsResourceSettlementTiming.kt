package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_settlement_timing
 */
@Serializable(with = BalanceSettingsResourceSettlementTiming.Serializer::class)
public class BalanceSettingsResourceSettlementTiming(
    /**
     * The number of days charge funds are held before becoming available.
     */
    public val delayDays: Int,
    /**
     * The number of days charge funds are held before becoming available. If present, overrides the default, or minimum
     * available, for the account.
     */
    public val delayDaysOverride: Int? = null,
    /**
     * Customized start of day configuration for automatic payouts to group and send payments in local timezones with a
     * customized day starting time. For details, see our [Customized start of day](/connect/customized-start-of-day)
     * documentation.
     */
    public val startOfDay: InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b? = null,
) {
    public class Builder {
        private var delayDaysValue: Int? = null

        public var delayDays: Int
            get() = requireNotNull(delayDaysValue) { "delayDays is required" }
            set(`value`) {
                delayDaysValue = value
            }

        /**
         * The number of days charge funds are held before becoming available. If present, overrides the default, or minimum
         * available, for the account.
         */
        public var delayDaysOverride: Int? = null

        /**
         * Customized start of day configuration for automatic payouts to group and send payments in local timezones with a
         * customized day starting time. For details, see our [Customized start of day](/connect/customized-start-of-day)
         * documentation.
         */
        public var startOfDay: InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b? = null

        public fun build(): BalanceSettingsResourceSettlementTiming {
            check(delayDaysValue != null) { "delayDays is required" }
            return BalanceSettingsResourceSettlementTiming(
                delayDays = delayDays,
                delayDaysOverride = delayDaysOverride,
                startOfDay = startOfDay,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BalanceSettingsResourceSettlementTiming =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BalanceSettingsResourceSettlementTiming> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BalanceSettingsResourceSettlementTiming {
            val jsonDecoder = decoder.requireJsonDecoder("BalanceSettingsResourceSettlementTiming")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BalanceSettingsResourceSettlementTiming must be a JSON object")
            val delayDays = json.decodeRequired<Int>(rawObject, "delay_days")
            return BalanceSettingsResourceSettlementTiming(
                delayDays = delayDays,
                delayDaysOverride = rawObject["delay_days_override"]?.let { json.decodeFromJsonElement<Int>(it) },
                startOfDay =
                    rawObject["start_of_day"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BalanceSettingsResourceSettlementTiming,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BalanceSettingsResourceSettlementTiming")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("delay_days", json.encodeToJsonElement(value.delayDays))
                    value.delayDaysOverride?.let { put("delay_days_override", json.encodeToJsonElement(it)) }
                    value.startOfDay?.let { put("start_of_day", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun balanceSettingsResourceSettlementTiming(
    block: BalanceSettingsResourceSettlementTiming.Builder.() -> Unit,
): BalanceSettingsResourceSettlementTiming = BalanceSettingsResourceSettlementTiming.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BalanceSettingsResourceSettlementTiming is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
