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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/customer_balance/anyOf/0/properties/bank_transfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/customer_balance/anyOf/0/properties/bank_transfer
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a(
    public val euBankTransfer: InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX6da2c6fd? = null,
    public val type: String? = null,
) {
    public class Builder {
        public var euBankTransfer: InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX6da2c6fd? =
            null

        public var type: String? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a =
            InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a(
                euBankTransfer = euBankTransfer,
                type = type,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a(
                euBankTransfer =
                    rawObject["eu_bank_transfer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX6da2c6fd>(
                                it,
                            )
                    },
                type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
                    value.type?.let { put("type", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a(
    block: InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a =
    InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a.build(block)
