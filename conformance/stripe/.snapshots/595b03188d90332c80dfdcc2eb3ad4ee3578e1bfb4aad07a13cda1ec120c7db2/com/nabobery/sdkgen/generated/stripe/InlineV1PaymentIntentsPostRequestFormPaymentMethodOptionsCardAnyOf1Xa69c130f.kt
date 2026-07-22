package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properties/plan/a
 * nyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properties/plan/a
 * nyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f(
    public val type: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1TypeX45795f19,
    public val count: Int? = null,
    public val interval: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardIntervalXcce4a05b? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1TypeX45795f19? = null

        public var type:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1TypeX45795f19
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var count: Int? = null

        public var interval:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardIntervalXcce4a05b? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f {
            check(typeValue != null) { "type is required" }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f(
                type = type,
                count = count,
                interval = interval,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1TypeX45795f19>(
                    rawObject,
                    "type",
                )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f(
                type = type,
                count = rawObject["count"]?.let { json.decodeFromJsonElement<Int>(it) },
                interval =
                    rawObject["interval"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardIntervalXcce4a05b>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.count?.let { put("count", json.encodeToJsonElement(it)) }
                    value.interval?.let { put("interval", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
