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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b(
    public val restrictions: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250? = null,
) {
    public class Builder {
        public var restrictions:
            InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b =
            InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b(
                restrictions = restrictions,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b must be a JSON object",
                    )
            return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b(
                restrictions =
                    rawObject["restrictions"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b(
    block: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b =
    InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b.build(block)
