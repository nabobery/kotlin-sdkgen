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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/settlement_timing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/settlement_timing
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d(
    public val delayDaysOverride: InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef? = null,
    public val startOfDay: InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d? = null,
) {
    public class Builder {
        public var delayDaysOverride:
            InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef? = null

        public var startOfDay: InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d? = null

        public fun build(): InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d =
            InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d(
                delayDaysOverride = delayDaysOverride,
                startOfDay = startOfDay,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d must be a JSON object",
                    )
            return InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d(
                delayDaysOverride =
                    rawObject["delay_days_override"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef>(
                                it,
                            )
                    },
                startOfDay =
                    rawObject["start_of_day"]?.let {
                        json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.delayDaysOverride?.let { put("delay_days_override", json.encodeToJsonElement(it)) }
                    value.startOfDay?.let { put("start_of_day", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d(
    block: InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d.Builder.() -> Unit,
): InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d =
    InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d.build(block)
