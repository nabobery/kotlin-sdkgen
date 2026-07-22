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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/schedules_phase_automatic_tax
 */
@Serializable(with = SchedulesPhaseAutomaticTax.Serializer::class)
public class SchedulesPhaseAutomaticTax(
    /**
     * Whether Stripe automatically computes tax on invoices created during this phase.
     */
    public val enabled: Boolean,
    /**
     * If Stripe disabled automatic tax, this enum describes why.
     */
    public val disabledReason: InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67? = null,
    /**
     * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
     * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
     */
    public val liability: InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        /**
         * If Stripe disabled automatic tax, this enum describes why.
         */
        public var disabledReason: InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67? = null

        /**
         * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
         * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
         */
        public var liability: InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f? = null

        public fun build(): SchedulesPhaseAutomaticTax {
            check(enabledValue != null) { "enabled is required" }
            return SchedulesPhaseAutomaticTax(
                enabled = enabled,
                disabledReason = disabledReason,
                liability = liability,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SchedulesPhaseAutomaticTax = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SchedulesPhaseAutomaticTax> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SchedulesPhaseAutomaticTax {
            val jsonDecoder = decoder.requireJsonDecoder("SchedulesPhaseAutomaticTax")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SchedulesPhaseAutomaticTax must be a JSON object")
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return SchedulesPhaseAutomaticTax(
                enabled = enabled,
                disabledReason =
                    rawObject["disabled_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67?>(
                                element,
                            )
                        }
                    },
                liability =
                    rawObject["liability"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SchedulesPhaseAutomaticTax,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SchedulesPhaseAutomaticTax")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    value.disabledReason?.let { put("disabled_reason", json.encodeToJsonElement(it)) }
                    value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun schedulesPhaseAutomaticTax(
    block: SchedulesPhaseAutomaticTax.Builder.() -> Unit,
): SchedulesPhaseAutomaticTax = SchedulesPhaseAutomaticTax.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("SchedulesPhaseAutomaticTax is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
