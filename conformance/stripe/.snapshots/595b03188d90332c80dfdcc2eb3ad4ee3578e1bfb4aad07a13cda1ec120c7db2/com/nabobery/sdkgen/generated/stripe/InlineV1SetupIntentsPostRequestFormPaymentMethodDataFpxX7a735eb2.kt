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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/fpx.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/fpx
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2(
    public val bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d,
) {
    public class Builder {
        private var bankValue: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d? =
            null

        public var bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d
            get() = requireNotNull(bankValue) { "bank is required" }
            set(`value`) {
                bankValue = value
            }

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2 {
            check(bankValue != null) { "bank is required" }
            return InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2(
                bank = bank,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2 must be a JSON object",
                    )
            val bank =
                json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d>(
                    rawObject,
                    "bank",
                )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2(
                bank = bank,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("bank", json.encodeToJsonElement(value.bank))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2 =
    InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxX7a735eb2 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
