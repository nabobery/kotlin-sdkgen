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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_swish_qr_code
 */
@Serializable(with = PaymentIntentNextActionSwishQrCode.Serializer::class)
public class PaymentIntentNextActionSwishQrCode(
    /**
     * The raw data string used to generate QR code, it should be used together with QR code library.
     */
    public val `data`: String,
    /**
     * The image_url_png string used to render QR code
     */
    public val imageUrlPng: String,
    /**
     * The image_url_svg string used to render QR code
     */
    public val imageUrlSvg: String,
) {
    public class Builder {
        private var dataValue: String? = null

        public var `data`: String
            get() = requireNotNull(dataValue) { "data is required" }
            set(`value`) {
                dataValue = value
            }

        private var imageUrlPngValue: String? = null

        public var imageUrlPng: String
            get() = requireNotNull(imageUrlPngValue) { "imageUrlPng is required" }
            set(`value`) {
                imageUrlPngValue = value
            }

        private var imageUrlSvgValue: String? = null

        public var imageUrlSvg: String
            get() = requireNotNull(imageUrlSvgValue) { "imageUrlSvg is required" }
            set(`value`) {
                imageUrlSvgValue = value
            }

        public fun build(): PaymentIntentNextActionSwishQrCode {
            check(dataValue != null) { "data is required" }
            check(imageUrlPngValue != null) { "imageUrlPng is required" }
            check(imageUrlSvgValue != null) { "imageUrlSvg is required" }
            return PaymentIntentNextActionSwishQrCode(
                data = data,
                imageUrlPng = imageUrlPng,
                imageUrlSvg = imageUrlSvg,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentNextActionSwishQrCode = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentNextActionSwishQrCode> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentNextActionSwishQrCode {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionSwishQrCode")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentIntentNextActionSwishQrCode must be a JSON object")
            val data = json.decodeRequired<String>(rawObject, "data")
            val imageUrlPng = json.decodeRequired<String>(rawObject, "image_url_png")
            val imageUrlSvg = json.decodeRequired<String>(rawObject, "image_url_svg")
            return PaymentIntentNextActionSwishQrCode(
                data = data,
                imageUrlPng = imageUrlPng,
                imageUrlSvg = imageUrlSvg,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentIntentNextActionSwishQrCode,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionSwishQrCode")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("data", value.data)
                    put("image_url_png", value.imageUrlPng)
                    put("image_url_svg", value.imageUrlSvg)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentNextActionSwishQrCode(
    block: PaymentIntentNextActionSwishQrCode.Builder.() -> Unit,
): PaymentIntentNextActionSwishQrCode = PaymentIntentNextActionSwishQrCode.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentIntentNextActionSwishQrCode is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
