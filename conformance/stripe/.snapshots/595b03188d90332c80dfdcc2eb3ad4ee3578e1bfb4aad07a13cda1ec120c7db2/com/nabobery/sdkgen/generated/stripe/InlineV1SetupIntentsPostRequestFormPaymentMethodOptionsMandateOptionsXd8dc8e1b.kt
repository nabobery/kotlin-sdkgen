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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b(
    public val collectionMethod: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX8b8401c4? = null,
) {
    public class Builder {
        public var collectionMethod:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX8b8401c4? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b =
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b(
                collectionMethod = collectionMethod,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b(
                collectionMethod =
                    rawObject["collection_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX8b8401c4>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b",
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b =
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b.build(block)
