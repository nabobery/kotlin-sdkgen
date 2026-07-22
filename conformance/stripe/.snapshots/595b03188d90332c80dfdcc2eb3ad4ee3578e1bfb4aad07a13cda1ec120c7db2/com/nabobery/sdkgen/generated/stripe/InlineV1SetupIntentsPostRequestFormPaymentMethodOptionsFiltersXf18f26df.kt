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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/properties/filter
 * s.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/properties/filter
 * s
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df(
    public val accountSubcategories: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX76304f61>? = null,
) {
    public class Builder {
        public var accountSubcategories:
            List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX76304f61>? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df =
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df(
                accountSubcategories = accountSubcategories,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df(
                accountSubcategories =
                    rawObject["account_subcategories"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX76304f61>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df =
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsFiltersXf18f26df.build(block)
