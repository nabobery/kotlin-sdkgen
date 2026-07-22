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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799(
    public val permissions: List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a>? = null,
    public val prefetch: List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992>? = null,
) {
    public class Builder {
        public var permissions:
            List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a>? = null

        public var prefetch:
            List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992>? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799 =
            InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799(
                permissions = permissions,
                prefetch = prefetch,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799(
                permissions =
                    rawObject["permissions"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a>>(
                                it,
                            )
                    },
                prefetch =
                    rawObject["prefetch"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
                    value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799(
    block: InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799 =
    InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799.build(block)
