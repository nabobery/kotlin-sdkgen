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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_upi_handle_redirect_or_display_qr_code
 */
@Serializable(with = PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode.Serializer::class)
public class PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode(
    /**
     * The URL to the hosted UPI instructions page, which allows customers to view the QR code.
     */
    public val hostedInstructionsUrl: String,
    public val qrCode: PaymentIntentNextActionUpiqrCode,
) {
    public class Builder {
        private var hostedInstructionsUrlValue: String? = null

        public var hostedInstructionsUrl: String
            get() = requireNotNull(hostedInstructionsUrlValue) { "hostedInstructionsUrl is required" }
            set(`value`) {
                hostedInstructionsUrlValue = value
            }

        private var qrCodeValue: PaymentIntentNextActionUpiqrCode? = null

        public var qrCode: PaymentIntentNextActionUpiqrCode
            get() = requireNotNull(qrCodeValue) { "qrCode is required" }
            set(`value`) {
                qrCodeValue = value
            }

        public fun build(): PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode {
            check(hostedInstructionsUrlValue != null) { "hostedInstructionsUrl is required" }
            check(qrCodeValue != null) { "qrCode is required" }
            return PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode(
                hostedInstructionsUrl = hostedInstructionsUrl,
                qrCode = qrCode,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode must be a JSON object",
                    )
            val hostedInstructionsUrl = json.decodeRequired<String>(rawObject, "hosted_instructions_url")
            val qrCode = json.decodeRequired<PaymentIntentNextActionUpiqrCode>(rawObject, "qr_code")
            return PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode(
                hostedInstructionsUrl = hostedInstructionsUrl,
                qrCode = qrCode,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("hosted_instructions_url", value.hostedInstructionsUrl)
                    put("qr_code", json.encodeToJsonElement(value.qrCode))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentNextActionUpiHandleRedirectOrDisplayQrCode(
    block: PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode.Builder.() -> Unit,
): PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode =
    PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
