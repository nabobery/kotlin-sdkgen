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
 * If this is a `sofort` PaymentMethod, this hash contains details about the SOFORT payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/sofort
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76(
    public val country: InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa,
) {
    public class Builder {
        private var countryValue: InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa? = null

        public var country: InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        public fun build(): InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76 {
            check(countryValue != null) { "country is required" }
            return InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76(
                country = country,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76 must be a JSON object",
                    )
            val country =
                json.decodeRequired<InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa>(
                    rawObject,
                    "country",
                )
            return InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76(
                country = country,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("country", json.encodeToJsonElement(value.country))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76(
    block: InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76.Builder.() -> Unit,
): InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76 =
    InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
