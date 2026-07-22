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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account/anyOf/0/properties/financial_connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account/anyOf/0/properties/financial_connections
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6(
    public val filters: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef? = null,
    public val permissions: List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX63156cdd>? = null,
    public val prefetch: List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXb7090838>? = null,
) {
    public class Builder {
        public var filters:
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef? = null

        public var permissions:
            List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX63156cdd>? = null

        public var prefetch:
            List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXb7090838>? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6 =
            InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6(
                filters = filters,
                permissions = permissions,
                prefetch = prefetch,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6 must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6(
                filters =
                    rawObject["filters"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsFiltersXa98764ef>(
                                it,
                            )
                    },
                permissions =
                    rawObject["permissions"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX63156cdd>>(
                                it,
                            )
                    },
                prefetch =
                    rawObject["prefetch"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemXb7090838>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
                    value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
                    value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6(
    block: InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6 =
    InlineV1CustomersSubscriptionsPostRequestFormFinancialConnectionsXa9508bc6.build(block)
