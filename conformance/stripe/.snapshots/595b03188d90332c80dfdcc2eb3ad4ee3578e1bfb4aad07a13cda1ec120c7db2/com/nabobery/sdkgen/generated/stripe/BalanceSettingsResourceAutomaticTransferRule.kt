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
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_automatic_transfer_rule
 */
@Serializable(with = BalanceSettingsResourceAutomaticTransferRule.Serializer::class)
public class BalanceSettingsResourceAutomaticTransferRule(
    /**
     * The ID of the FinancialAccount that funds will be transferred to during automatic transfers.
     */
    public val payoutMethod: String,
    /**
     * The type of automatic transfer rule.
     */
    public val type: InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37,
    /**
     * The maximum amount in minor units to transfer to the FinancialAccount. Only applicable when `type` is
     * `transfer_up_to_amount`.
     */
    public val transferUpToAmount: Int? = null,
) {
    public class Builder {
        private var payoutMethodValue: String? = null

        public var payoutMethod: String
            get() = requireNotNull(payoutMethodValue) { "payoutMethod is required" }
            set(`value`) {
                payoutMethodValue = value
            }

        private var typeValue: InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37? = null

        public var type: InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * The maximum amount in minor units to transfer to the FinancialAccount. Only applicable when `type` is
         * `transfer_up_to_amount`.
         */
        public var transferUpToAmount: Int? = null

        public fun build(): BalanceSettingsResourceAutomaticTransferRule {
            check(payoutMethodValue != null) { "payoutMethod is required" }
            check(typeValue != null) { "type is required" }
            return BalanceSettingsResourceAutomaticTransferRule(
                payoutMethod = payoutMethod,
                type = type,
                transferUpToAmount = transferUpToAmount,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BalanceSettingsResourceAutomaticTransferRule =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BalanceSettingsResourceAutomaticTransferRule> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BalanceSettingsResourceAutomaticTransferRule {
            val jsonDecoder = decoder.requireJsonDecoder("BalanceSettingsResourceAutomaticTransferRule")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "BalanceSettingsResourceAutomaticTransferRule must be a JSON object",
                    )
            val payoutMethod = json.decodeRequired<String>(rawObject, "payout_method")
            val type =
                json.decodeRequired<InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37>(
                    rawObject,
                    "type",
                )
            return BalanceSettingsResourceAutomaticTransferRule(
                payoutMethod = payoutMethod,
                type = type,
                transferUpToAmount =
                    rawObject["transfer_up_to_amount"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BalanceSettingsResourceAutomaticTransferRule,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BalanceSettingsResourceAutomaticTransferRule")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("payout_method", value.payoutMethod)
                    put("type", json.encodeToJsonElement(value.type))
                    value.transferUpToAmount?.let { put("transfer_up_to_amount", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun balanceSettingsResourceAutomaticTransferRule(
    block: BalanceSettingsResourceAutomaticTransferRule.Builder.() -> Unit,
): BalanceSettingsResourceAutomaticTransferRule = BalanceSettingsResourceAutomaticTransferRule.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BalanceSettingsResourceAutomaticTransferRule is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
