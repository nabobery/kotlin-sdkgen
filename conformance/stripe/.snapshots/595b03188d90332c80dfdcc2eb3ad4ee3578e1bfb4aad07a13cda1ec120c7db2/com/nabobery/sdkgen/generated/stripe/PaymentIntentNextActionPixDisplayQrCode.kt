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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_pix_display_qr_code
 */
@Serializable(with = PaymentIntentNextActionPixDisplayQrCode.Serializer::class)
public class PaymentIntentNextActionPixDisplayQrCode(
    /**
     * The raw data string used to generate QR code, it should be used together with QR code library.
     */
    public val `data`: String? = null,
    /**
     * The date (unix timestamp) when the PIX expires.
     */
    public val expiresAt: Int? = null,
    /**
     * The URL to the hosted pix instructions page, which allows customers to view the pix QR code.
     */
    public val hostedInstructionsUrl: String? = null,
    /**
     * The image_url_png string used to render png QR code
     */
    public val imageUrlPng: String? = null,
    /**
     * The image_url_svg string used to render svg QR code
     */
    public val imageUrlSvg: String? = null,
) {
    public class Builder {
        /**
         * The raw data string used to generate QR code, it should be used together with QR code library.
         */
        public var `data`: String? = null

        /**
         * The date (unix timestamp) when the PIX expires.
         */
        public var expiresAt: Int? = null

        /**
         * The URL to the hosted pix instructions page, which allows customers to view the pix QR code.
         */
        public var hostedInstructionsUrl: String? = null

        /**
         * The image_url_png string used to render png QR code
         */
        public var imageUrlPng: String? = null

        /**
         * The image_url_svg string used to render svg QR code
         */
        public var imageUrlSvg: String? = null

        public fun build(): PaymentIntentNextActionPixDisplayQrCode =
            PaymentIntentNextActionPixDisplayQrCode(
                data = data,
                expiresAt = expiresAt,
                hostedInstructionsUrl = hostedInstructionsUrl,
                imageUrlPng = imageUrlPng,
                imageUrlSvg = imageUrlSvg,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentNextActionPixDisplayQrCode =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentNextActionPixDisplayQrCode> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentNextActionPixDisplayQrCode {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionPixDisplayQrCode")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentIntentNextActionPixDisplayQrCode must be a JSON object")
            return PaymentIntentNextActionPixDisplayQrCode(
                data = rawObject["data"]?.let { json.decodeFromJsonElement<String>(it) },
                expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
                hostedInstructionsUrl =
                    rawObject["hosted_instructions_url"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                imageUrlPng = rawObject["image_url_png"]?.let { json.decodeFromJsonElement<String>(it) },
                imageUrlSvg = rawObject["image_url_svg"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentIntentNextActionPixDisplayQrCode,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionPixDisplayQrCode")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.data?.let { put("data", it) }
                    value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
                    value.hostedInstructionsUrl?.let { put("hosted_instructions_url", it) }
                    value.imageUrlPng?.let { put("image_url_png", it) }
                    value.imageUrlSvg?.let { put("image_url_svg", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentNextActionPixDisplayQrCode(
    block: PaymentIntentNextActionPixDisplayQrCode.Builder.() -> Unit,
): PaymentIntentNextActionPixDisplayQrCode = PaymentIntentNextActionPixDisplayQrCode.build(block)
