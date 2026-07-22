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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97(
    public val collectionMethod: InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59? = null,
) {
    public class Builder {
        public var collectionMethod: InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97(
                collectionMethod = collectionMethod,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97(
                collectionMethod =
                    rawObject["collection_method"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd9513f97.build(block)
