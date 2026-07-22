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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/acss_debit/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/acss_debit/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee(
    public val transactionType: InlineV1CustomersSubscriptionsPostRequestFormTransactionTypeX212747a7? = null,
) {
    public class Builder {
        public var transactionType:
            InlineV1CustomersSubscriptionsPostRequestFormTransactionTypeX212747a7? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee =
            InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee(
                transactionType = transactionType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee(
                transactionType =
                    rawObject["transaction_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormTransactionTypeX212747a7>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee(
    block: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee =
    InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee.build(block)
