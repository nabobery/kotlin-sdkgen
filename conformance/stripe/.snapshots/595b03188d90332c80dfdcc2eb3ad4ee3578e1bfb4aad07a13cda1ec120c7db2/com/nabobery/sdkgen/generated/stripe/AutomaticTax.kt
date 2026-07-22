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
 * Source: sdkgen://source/openapi.json#/components/schemas/automatic_tax
 */
@Serializable(with = AutomaticTax.Serializer::class)
public class AutomaticTax(
    /**
     * Whether Stripe automatically computes tax on this invoice. Note that incompatible invoice items (invoice items with
     * manually specified [tax rates](https://docs.stripe.com/api/tax_rates), negative amounts, or
     * `tax_behavior=unspecified`) cannot be added to automatic tax invoices.
     */
    public val enabled: Boolean,
    /**
     * If Stripe disabled automatic tax, this enum describes why.
     */
    public val disabledReason: InlineAutomaticTaxDisabledReasonXdaa0977e? = null,
    /**
     * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
     * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
     */
    public val liability: InlineAutomaticTaxLiabilityX958f05b7? = null,
    /**
     * The tax provider powering automatic tax.
     */
    public val provider: String? = null,
    /**
     * The status of the most recent automated tax calculation for this invoice.
     */
    public val status: InlineAutomaticTaxStatusX9f5176f7? = null,
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
        public var disabledReason: InlineAutomaticTaxDisabledReasonXdaa0977e? = null

        /**
         * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
         * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
         */
        public var liability: InlineAutomaticTaxLiabilityX958f05b7? = null

        /**
         * The tax provider powering automatic tax.
         */
        public var provider: String? = null

        /**
         * The status of the most recent automated tax calculation for this invoice.
         */
        public var status: InlineAutomaticTaxStatusX9f5176f7? = null

        public fun build(): AutomaticTax {
            check(enabledValue != null) { "enabled is required" }
            return AutomaticTax(
                enabled = enabled,
                disabledReason = disabledReason,
                liability = liability,
                provider = provider,
                status = status,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): AutomaticTax = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<AutomaticTax> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): AutomaticTax {
            val jsonDecoder = decoder.requireJsonDecoder("AutomaticTax")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("AutomaticTax must be a JSON object")
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return AutomaticTax(
                enabled = enabled,
                disabledReason =
                    rawObject["disabled_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineAutomaticTaxDisabledReasonXdaa0977e?>(element)
                        }
                    },
                liability =
                    rawObject["liability"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineAutomaticTaxLiabilityX958f05b7?>(element)
                        }
                    },
                provider =
                    rawObject["provider"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                status =
                    rawObject["status"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineAutomaticTaxStatusX9f5176f7?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: AutomaticTax,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("AutomaticTax")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    value.disabledReason?.let { put("disabled_reason", json.encodeToJsonElement(it)) }
                    value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
                    value.provider?.let { put("provider", it) }
                    value.status?.let { put("status", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun automaticTax(block: AutomaticTax.Builder.() -> Unit): AutomaticTax = AutomaticTax.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("AutomaticTax is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
