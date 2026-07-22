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
import kotlin.Int
import kotlin.Unit

/**
 * If this is a `card` PaymentMethod, this hash contains the user's card details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/card
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormCardX090df98d.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormCardX090df98d(
    public val expMonth: Int? = null,
    public val expYear: Int? = null,
    public val networks: InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11? = null,
) {
    public class Builder {
        public var expMonth: Int? = null

        public var expYear: Int? = null

        public var networks: InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11? = null

        public fun build(): InlineV1PaymentMethodsPostRequestFormCardX090df98d =
            InlineV1PaymentMethodsPostRequestFormCardX090df98d(
                expMonth = expMonth,
                expYear = expYear,
                networks = networks,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCardX090df98d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormCardX090df98d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormCardX090df98d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormCardX090df98d")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodsPostRequestFormCardX090df98d must be a JSON object",
                    )
            return InlineV1PaymentMethodsPostRequestFormCardX090df98d(
                expMonth = rawObject["exp_month"]?.let { json.decodeFromJsonElement<Int>(it) },
                expYear = rawObject["exp_year"]?.let { json.decodeFromJsonElement<Int>(it) },
                networks =
                    rawObject["networks"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormCardX090df98d,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormCardX090df98d")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expMonth?.let { put("exp_month", json.encodeToJsonElement(it)) }
                    value.expYear?.let { put("exp_year", json.encodeToJsonElement(it)) }
                    value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodsPostRequestFormCardX090df98d(
    block: InlineV1PaymentMethodsPostRequestFormCardX090df98d.Builder.() -> Unit,
): InlineV1PaymentMethodsPostRequestFormCardX090df98d = InlineV1PaymentMethodsPostRequestFormCardX090df98d.build(block)
