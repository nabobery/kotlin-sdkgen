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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/sofort.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/sofort
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a(
    public val country: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataCountryXe81864d6,
) {
    public class Builder {
        private var countryValue:
            InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataCountryXe81864d6? = null

        public var country: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataCountryXe81864d6
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a {
            check(countryValue != null) { "country is required" }
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a(
                country = country,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a must be a JSON object",
                    )
            val country =
                json.decodeRequired<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataCountryXe81864d6>(
                    rawObject,
                    "country",
                )
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a(
                country = country,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("country", json.encodeToJsonElement(value.country))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a(
    block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a.Builder.() -> Unit,
): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a =
    InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataSofortX9f294e8a is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
