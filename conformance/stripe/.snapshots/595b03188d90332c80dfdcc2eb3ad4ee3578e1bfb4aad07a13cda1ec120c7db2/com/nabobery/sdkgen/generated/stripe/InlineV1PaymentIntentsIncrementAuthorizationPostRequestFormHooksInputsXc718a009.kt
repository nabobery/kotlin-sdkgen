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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/hooks/properties/inputs.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/hooks/properties/inputs
 */
@Serializable(with = InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009.Serializer::class)
public class InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009(
    public val tax: InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559? = null,
) {
    public class Builder {
        public var tax: InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559? = null

        public fun build(): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009 =
            InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009(
                tax = tax,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009 must be a JSON object",
                    )
            return InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009(
                tax =
                    rawObject["tax"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009(
    block: InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009.Builder.() -> Unit,
): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009 =
    InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksInputsXc718a009.build(block)
