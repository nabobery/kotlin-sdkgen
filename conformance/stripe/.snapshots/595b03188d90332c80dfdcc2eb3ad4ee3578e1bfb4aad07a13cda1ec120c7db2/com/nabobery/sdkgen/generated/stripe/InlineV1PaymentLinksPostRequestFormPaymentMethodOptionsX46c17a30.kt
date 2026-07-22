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
 * Payment-method-specific configuration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30(
    public val card: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd? = null,
) {
    public class Builder {
        public var card: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30 =
            InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30(
                card = card,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30 must be a JSON object",
                    )
            return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30(
                card =
                    rawObject["card"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.card?.let { put("card", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30(
    block: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30 =
    InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30.build(block)
