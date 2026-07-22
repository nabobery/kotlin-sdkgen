package com.nabobery.sdkgen.generated.stripe

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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/outbound_payments_payment_method_details_financial_account
 */
@Serializable(with = OutboundPaymentsPaymentMethodDetailsFinancialAccount.Serializer::class)
public class OutboundPaymentsPaymentMethodDetailsFinancialAccount(
    /**
     * Token of the FinancialAccount.
     */
    public val id: String,
    /**
     * The rails used to send funds.
     */
    public val network: InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22,
) {
    public class Builder {
        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var networkValue:
            InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22? = null

        public var network: InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22
            get() = requireNotNull(networkValue) { "network is required" }
            set(`value`) {
                networkValue = value
            }

        public fun build(): OutboundPaymentsPaymentMethodDetailsFinancialAccount {
            check(idValue != null) { "id is required" }
            check(networkValue != null) { "network is required" }
            return OutboundPaymentsPaymentMethodDetailsFinancialAccount(
                id = id,
                network = network,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): OutboundPaymentsPaymentMethodDetailsFinancialAccount =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<OutboundPaymentsPaymentMethodDetailsFinancialAccount> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): OutboundPaymentsPaymentMethodDetailsFinancialAccount {
            val jsonDecoder = decoder.requireJsonDecoder("OutboundPaymentsPaymentMethodDetailsFinancialAccount")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "OutboundPaymentsPaymentMethodDetailsFinancialAccount must be a JSON object",
                    )
            val id = json.decodeRequired<String>(rawObject, "id")
            val network =
                json.decodeRequired<InlineOutboundPaymentsPaymentMethodDetailsFinancialAccountNetworkXbe57ed22>(
                    rawObject,
                    "network",
                )
            return OutboundPaymentsPaymentMethodDetailsFinancialAccount(
                id = id,
                network = network,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: OutboundPaymentsPaymentMethodDetailsFinancialAccount,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("OutboundPaymentsPaymentMethodDetailsFinancialAccount")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("id", value.id)
                    put("network", json.encodeToJsonElement(value.network))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun outboundPaymentsPaymentMethodDetailsFinancialAccount(
    block: OutboundPaymentsPaymentMethodDetailsFinancialAccount.Builder.() -> Unit,
): OutboundPaymentsPaymentMethodDetailsFinancialAccount =
    OutboundPaymentsPaymentMethodDetailsFinancialAccount.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "OutboundPaymentsPaymentMethodDetailsFinancialAccount is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
