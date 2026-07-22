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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connection
 * s.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connection
 * s
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05(
    public val filters: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsFiltersX35520a5d? = null,
    public val permissions: List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX57a04c21>? = null,
    public val prefetch: List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemXe216cdaa>? = null,
    public val returnUrl: String? = null,
) {
    public class Builder {
        public var filters:
            InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsFiltersX35520a5d? = null

        public var permissions:
            List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX57a04c21>? = null

        public var prefetch:
            List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemXe216cdaa>? = null

        public var returnUrl: String? = null

        public fun build(): InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05 =
            InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05(
                filters = filters,
                permissions = permissions,
                prefetch = prefetch,
                returnUrl = returnUrl,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05 must be a JSON object",
                    )
            return InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05(
                filters =
                    rawObject["filters"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsFiltersX35520a5d>(
                                it,
                            )
                    },
                permissions =
                    rawObject["permissions"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX57a04c21>>(
                                it,
                            )
                    },
                prefetch =
                    rawObject["prefetch"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemXe216cdaa>>(
                                it,
                            )
                    },
                returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
                    value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
                    value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
                    value.returnUrl?.let { put("return_url", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05(
    block: InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05.Builder.() -> Unit,
): InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05 =
    InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05.build(block)
