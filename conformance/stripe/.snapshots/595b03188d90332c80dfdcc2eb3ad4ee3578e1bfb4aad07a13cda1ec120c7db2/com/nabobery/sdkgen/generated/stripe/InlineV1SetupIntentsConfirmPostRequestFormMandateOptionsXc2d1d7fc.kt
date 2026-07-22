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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc(
    public val collectionMethod: InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab? = null,
) {
    public class Builder {
        public var collectionMethod:
            InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab? = null

        public fun build(): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc =
            InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc(
                collectionMethod = collectionMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc must be a JSON object",
                    )
            return InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc(
                collectionMethod =
                    rawObject["collection_method"]?.let {
                        json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc",
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

public fun inlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc(
    block: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc.Builder.() -> Unit,
): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc =
    InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc.build(block)
