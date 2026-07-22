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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping/properties/address_validation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping/properties/address_validation
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4(
    public val mode: InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38,
) {
    public class Builder {
        private var modeValue:
            InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38? = null

        public var mode: InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38
            get() = requireNotNull(modeValue) { "mode is required" }
            set(`value`) {
                modeValue = value
            }

        public fun build(): InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4 {
            check(modeValue != null) { "mode is required" }
            return InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4(
                mode = mode,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4 must be a JSON object",
                    )
            val mode =
                json.decodeRequired<InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeXd87c8b38>(
                    rawObject,
                    "mode",
                )
            return InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4(
                mode = mode,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("mode", json.encodeToJsonElement(value.mode))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4(
    block: InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4.Builder.() -> Unit,
): InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4 =
    InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1IssuingCardsPostRequestFormShippingAddressValidationX3040c1e4 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
