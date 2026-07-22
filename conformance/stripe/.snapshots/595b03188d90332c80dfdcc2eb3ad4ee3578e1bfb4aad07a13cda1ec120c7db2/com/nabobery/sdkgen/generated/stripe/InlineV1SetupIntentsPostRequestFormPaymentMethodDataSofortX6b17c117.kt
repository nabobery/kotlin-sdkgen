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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/sofort.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/sofort
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117(
    public val country: InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortCountryX17f2a37a,
) {
    public class Builder {
        private var countryValue:
            InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortCountryX17f2a37a? = null

        public var country: InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortCountryX17f2a37a
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117 {
            check(countryValue != null) { "country is required" }
            return InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117(
                country = country,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117 must be a JSON object",
                    )
            val country =
                json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortCountryX17f2a37a>(
                    rawObject,
                    "country",
                )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117(
                country = country,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117",
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117 =
    InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortX6b17c117 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
