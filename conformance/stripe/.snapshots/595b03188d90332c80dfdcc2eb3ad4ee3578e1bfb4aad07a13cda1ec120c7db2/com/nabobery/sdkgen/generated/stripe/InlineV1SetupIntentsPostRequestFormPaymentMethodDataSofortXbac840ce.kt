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
 * chema/properties/payment_method_data/properties/sofort.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/sofort
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce(
    public val country: InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortCountryX92f88322,
) {
    public class Builder {
        private var countryValue:
            InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortCountryX92f88322? = null

        public var country: InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortCountryX92f88322
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce {
            check(countryValue != null) { "country is required" }
            return InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce(
                country = country,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce must be a JSON object",
                    )
            val country =
                json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortCountryX92f88322>(
                    rawObject,
                    "country",
                )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce(
                country = country,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce",
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce =
    InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SetupIntentsPostRequestFormPaymentMethodDataSofortXbac840ce is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
