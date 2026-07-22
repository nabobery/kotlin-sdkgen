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
import kotlin.String
import kotlin.Unit

/**
 * If this is an `fpx` PaymentMethod, this hash contains details about the FPX payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/fpx
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd(
    public val bank: InlineV1PaymentMethodsPostRequestFormFpxBankXdf248614,
) {
    public class Builder {
        private var bankValue: InlineV1PaymentMethodsPostRequestFormFpxBankXdf248614? = null

        public var bank: InlineV1PaymentMethodsPostRequestFormFpxBankXdf248614
            get() = requireNotNull(bankValue) { "bank is required" }
            set(`value`) {
                bankValue = value
            }

        public fun build(): InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd {
            check(bankValue != null) { "bank is required" }
            return InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd(
                bank = bank,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd must be a JSON object",
                    )
            val bank = json.decodeRequired<InlineV1PaymentMethodsPostRequestFormFpxBankXdf248614>(rawObject, "bank")
            return InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd(
                bank = bank,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("bank", json.encodeToJsonElement(value.bank))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd(
    block: InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd.Builder.() -> Unit,
): InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd = InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
