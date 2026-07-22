package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentIntentNextActionView(
    @SerialName("alipay_handle_redirect")
    public val alipayHandleRedirect: PaymentIntentNextActionAlipayHandleRedirect? = null,
    @SerialName("blik_authorize")
    public val blikAuthorize: JsonObject? = null,
    @SerialName("boleto_display_details")
    public val boletoDisplayDetails: PaymentIntentNextActionBoleto? = null,
    @SerialName("card_await_notification")
    public val cardAwaitNotification: PaymentIntentNextActionCardAwaitNotification? = null,
    @SerialName("cashapp_handle_redirect_or_display_qr_code")
    public val cashappHandleRedirectOrDisplayQrCode: PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode? = null,
    @SerialName("display_bank_transfer_instructions")
    public val displayBankTransferInstructions: PaymentIntentNextActionDisplayBankTransferInstructions? = null,
    @SerialName("klarna_display_qr_code")
    public val klarnaDisplayQrCode: PaymentIntentNextActionKlarnaDisplayQrCode? = null,
    @SerialName("konbini_display_details")
    public val konbiniDisplayDetails: PaymentIntentNextActionKonbini? = null,
    @SerialName("multibanco_display_details")
    public val multibancoDisplayDetails: PaymentIntentNextActionDisplayMultibancoDetails? = null,
    @SerialName("oxxo_display_details")
    public val oxxoDisplayDetails: PaymentIntentNextActionDisplayOxxoDetails? = null,
    @SerialName("paynow_display_qr_code")
    public val paynowDisplayQrCode: PaymentIntentNextActionPaynowDisplayQrCode? = null,
    @SerialName("pix_display_qr_code")
    public val pixDisplayQrCode: PaymentIntentNextActionPixDisplayQrCode? = null,
    @SerialName("promptpay_display_qr_code")
    public val promptpayDisplayQrCode: PaymentIntentNextActionPromptpayDisplayQrCode? = null,
    @SerialName("redirect_to_url")
    public val redirectToUrl: PaymentIntentNextActionRedirectToUrl? = null,
    @SerialName("swish_handle_redirect_or_display_qr_code")
    public val swishHandleRedirectOrDisplayQrCode: PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode? = null,
    public val type: String,
    @SerialName("upi_handle_redirect_or_display_qr_code")
    public val upiHandleRedirectOrDisplayQrCode: PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode? = null,
    @SerialName("use_stripe_sdk")
    public val useStripeSdk: JsonObject? = null,
    @SerialName("verify_with_microdeposits")
    public val verifyWithMicrodeposits: PaymentIntentNextActionVerifyWithMicrodeposits? = null,
    @SerialName("wechat_pay_display_qr_code")
    public val wechatPayDisplayQrCode: PaymentIntentNextActionWechatPayDisplayQrCode? = null,
    @SerialName("wechat_pay_redirect_to_android_app")
    public val wechatPayRedirectToAndroidApp: PaymentIntentNextActionWechatPayRedirectToAndroidApp? = null,
    @SerialName("wechat_pay_redirect_to_ios_app")
    public val wechatPayRedirectToIosApp: PaymentIntentNextActionWechatPayRedirectToIosApp? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action
 */
@Serializable(with = PaymentIntentNextAction.Serializer::class)
public class PaymentIntentNextAction(
    /**
     * Type of the next action to perform. Refer to the other child attributes under `next_action` for available values.
     * Examples include: `redirect_to_url`, `use_stripe_sdk`, `alipay_handle_redirect`, `oxxo_display_details`, or
     * `verify_with_microdeposits`.
     */
    public val type: String,
    public val alipayHandleRedirect: PaymentIntentNextActionAlipayHandleRedirect? = null,
    public val blikAuthorize: JsonObject? = null,
    public val boletoDisplayDetails: PaymentIntentNextActionBoleto? = null,
    public val cardAwaitNotification: PaymentIntentNextActionCardAwaitNotification? = null,
    public val cashappHandleRedirectOrDisplayQrCode: PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode? = null,
    public val displayBankTransferInstructions: PaymentIntentNextActionDisplayBankTransferInstructions? = null,
    public val klarnaDisplayQrCode: PaymentIntentNextActionKlarnaDisplayQrCode? = null,
    public val konbiniDisplayDetails: PaymentIntentNextActionKonbini? = null,
    public val multibancoDisplayDetails: PaymentIntentNextActionDisplayMultibancoDetails? = null,
    public val oxxoDisplayDetails: PaymentIntentNextActionDisplayOxxoDetails? = null,
    public val paynowDisplayQrCode: PaymentIntentNextActionPaynowDisplayQrCode? = null,
    public val pixDisplayQrCode: PaymentIntentNextActionPixDisplayQrCode? = null,
    public val promptpayDisplayQrCode: PaymentIntentNextActionPromptpayDisplayQrCode? = null,
    public val redirectToUrl: PaymentIntentNextActionRedirectToUrl? = null,
    public val swishHandleRedirectOrDisplayQrCode: PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode? = null,
    public val upiHandleRedirectOrDisplayQrCode: PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode? = null,
    /**
     * When confirming a PaymentIntent with Stripe.js, Stripe.js depends on the contents of this dictionary to invoke
     * authentication flows. The shape of the contents is subject to change and is only intended to be used by Stripe.js.
     */
    public val useStripeSdk: JsonObject? = null,
    public val verifyWithMicrodeposits: PaymentIntentNextActionVerifyWithMicrodeposits? = null,
    public val wechatPayDisplayQrCode: PaymentIntentNextActionWechatPayDisplayQrCode? = null,
    public val wechatPayRedirectToAndroidApp: PaymentIntentNextActionWechatPayRedirectToAndroidApp? = null,
    public val wechatPayRedirectToIosApp: PaymentIntentNextActionWechatPayRedirectToIosApp? = null,
) {
    public class Builder {
        private var typeValue: String? = null

        public var type: String
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var alipayHandleRedirect: PaymentIntentNextActionAlipayHandleRedirect? = null

        public var blikAuthorize: JsonObject? = null

        public var boletoDisplayDetails: PaymentIntentNextActionBoleto? = null

        public var cardAwaitNotification: PaymentIntentNextActionCardAwaitNotification? = null

        public var cashappHandleRedirectOrDisplayQrCode:
            PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode? = null

        public var displayBankTransferInstructions:
            PaymentIntentNextActionDisplayBankTransferInstructions? = null

        public var klarnaDisplayQrCode: PaymentIntentNextActionKlarnaDisplayQrCode? = null

        public var konbiniDisplayDetails: PaymentIntentNextActionKonbini? = null

        public var multibancoDisplayDetails: PaymentIntentNextActionDisplayMultibancoDetails? = null

        public var oxxoDisplayDetails: PaymentIntentNextActionDisplayOxxoDetails? = null

        public var paynowDisplayQrCode: PaymentIntentNextActionPaynowDisplayQrCode? = null

        public var pixDisplayQrCode: PaymentIntentNextActionPixDisplayQrCode? = null

        public var promptpayDisplayQrCode: PaymentIntentNextActionPromptpayDisplayQrCode? = null

        public var redirectToUrl: PaymentIntentNextActionRedirectToUrl? = null

        public var swishHandleRedirectOrDisplayQrCode:
            PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode? = null

        public var upiHandleRedirectOrDisplayQrCode:
            PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode? = null

        /**
         * When confirming a PaymentIntent with Stripe.js, Stripe.js depends on the contents of this dictionary to invoke
         * authentication flows. The shape of the contents is subject to change and is only intended to be used by
         * Stripe.js.
         */
        public var useStripeSdk: JsonObject? = null

        public var verifyWithMicrodeposits: PaymentIntentNextActionVerifyWithMicrodeposits? = null

        public var wechatPayDisplayQrCode: PaymentIntentNextActionWechatPayDisplayQrCode? = null

        public var wechatPayRedirectToAndroidApp: PaymentIntentNextActionWechatPayRedirectToAndroidApp? =
            null

        public var wechatPayRedirectToIosApp: PaymentIntentNextActionWechatPayRedirectToIosApp? = null

        public fun build(): PaymentIntentNextAction {
            check(typeValue != null) { "type is required" }
            return PaymentIntentNextAction(
                type = type,
                alipayHandleRedirect = alipayHandleRedirect,
                blikAuthorize = blikAuthorize,
                boletoDisplayDetails = boletoDisplayDetails,
                cardAwaitNotification = cardAwaitNotification,
                cashappHandleRedirectOrDisplayQrCode = cashappHandleRedirectOrDisplayQrCode,
                displayBankTransferInstructions = displayBankTransferInstructions,
                klarnaDisplayQrCode = klarnaDisplayQrCode,
                konbiniDisplayDetails = konbiniDisplayDetails,
                multibancoDisplayDetails = multibancoDisplayDetails,
                oxxoDisplayDetails = oxxoDisplayDetails,
                paynowDisplayQrCode = paynowDisplayQrCode,
                pixDisplayQrCode = pixDisplayQrCode,
                promptpayDisplayQrCode = promptpayDisplayQrCode,
                redirectToUrl = redirectToUrl,
                swishHandleRedirectOrDisplayQrCode = swishHandleRedirectOrDisplayQrCode,
                upiHandleRedirectOrDisplayQrCode = upiHandleRedirectOrDisplayQrCode,
                useStripeSdk = useStripeSdk,
                verifyWithMicrodeposits = verifyWithMicrodeposits,
                wechatPayDisplayQrCode = wechatPayDisplayQrCode,
                wechatPayRedirectToAndroidApp = wechatPayRedirectToAndroidApp,
                wechatPayRedirectToIosApp = wechatPayRedirectToIosApp,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentNextAction = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentNextAction> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentNextAction {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextAction")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentIntentNextAction must be a JSON object")
            val type = json.decodeRequired<String>(rawObject, "type")
            return PaymentIntentNextAction(
                type = type,
                alipayHandleRedirect =
                    rawObject["alipay_handle_redirect"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionAlipayHandleRedirect>(it)
                    },
                blikAuthorize = rawObject["blik_authorize"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
                boletoDisplayDetails =
                    rawObject["boleto_display_details"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionBoleto>(it)
                    },
                cardAwaitNotification =
                    rawObject["card_await_notification"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionCardAwaitNotification>(it)
                    },
                cashappHandleRedirectOrDisplayQrCode =
                    rawObject["cashapp_handle_redirect_or_display_qr_code"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode>(it)
                    },
                displayBankTransferInstructions =
                    rawObject["display_bank_transfer_instructions"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionDisplayBankTransferInstructions>(it)
                    },
                klarnaDisplayQrCode =
                    rawObject["klarna_display_qr_code"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionKlarnaDisplayQrCode>(it)
                    },
                konbiniDisplayDetails =
                    rawObject["konbini_display_details"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionKonbini>(it)
                    },
                multibancoDisplayDetails =
                    rawObject["multibanco_display_details"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionDisplayMultibancoDetails>(it)
                    },
                oxxoDisplayDetails =
                    rawObject["oxxo_display_details"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionDisplayOxxoDetails>(it)
                    },
                paynowDisplayQrCode =
                    rawObject["paynow_display_qr_code"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionPaynowDisplayQrCode>(it)
                    },
                pixDisplayQrCode =
                    rawObject["pix_display_qr_code"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionPixDisplayQrCode>(it)
                    },
                promptpayDisplayQrCode =
                    rawObject["promptpay_display_qr_code"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionPromptpayDisplayQrCode>(it)
                    },
                redirectToUrl =
                    rawObject["redirect_to_url"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionRedirectToUrl>(it)
                    },
                swishHandleRedirectOrDisplayQrCode =
                    rawObject["swish_handle_redirect_or_display_qr_code"]
                        ?.let {
                            json.decodeFromJsonElement<PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode>(it)
                        },
                upiHandleRedirectOrDisplayQrCode =
                    rawObject["upi_handle_redirect_or_display_qr_code"]
                        ?.let {
                            json.decodeFromJsonElement<PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode>(it)
                        },
                useStripeSdk =
                    rawObject["use_stripe_sdk"]?.let {
                        json
                            .decodeFromJsonElement<JsonObject>(
                                it,
                            )
                    },
                verifyWithMicrodeposits =
                    rawObject["verify_with_microdeposits"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionVerifyWithMicrodeposits>(it)
                    },
                wechatPayDisplayQrCode =
                    rawObject["wechat_pay_display_qr_code"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionWechatPayDisplayQrCode>(it)
                    },
                wechatPayRedirectToAndroidApp =
                    rawObject["wechat_pay_redirect_to_android_app"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionWechatPayRedirectToAndroidApp>(it)
                    },
                wechatPayRedirectToIosApp =
                    rawObject["wechat_pay_redirect_to_ios_app"]?.let {
                        json.decodeFromJsonElement<PaymentIntentNextActionWechatPayRedirectToIosApp>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentIntentNextAction,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextAction")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", value.type)
                    value.alipayHandleRedirect?.let { put("alipay_handle_redirect", json.encodeToJsonElement(it)) }
                    value.blikAuthorize?.let { put("blik_authorize", json.encodeToJsonElement(it)) }
                    value.boletoDisplayDetails?.let { put("boleto_display_details", json.encodeToJsonElement(it)) }
                    value.cardAwaitNotification?.let { put("card_await_notification", json.encodeToJsonElement(it)) }
                    value.cashappHandleRedirectOrDisplayQrCode?.let {
                        put("cashapp_handle_redirect_or_display_qr_code", json.encodeToJsonElement(it))
                    }
                    value.displayBankTransferInstructions?.let {
                        put(
                            "display_bank_transfer_instructions",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.klarnaDisplayQrCode?.let { put("klarna_display_qr_code", json.encodeToJsonElement(it)) }
                    value.konbiniDisplayDetails?.let { put("konbini_display_details", json.encodeToJsonElement(it)) }
                    value.multibancoDisplayDetails?.let {
                        put(
                            "multibanco_display_details",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.oxxoDisplayDetails?.let { put("oxxo_display_details", json.encodeToJsonElement(it)) }
                    value.paynowDisplayQrCode?.let { put("paynow_display_qr_code", json.encodeToJsonElement(it)) }
                    value.pixDisplayQrCode?.let { put("pix_display_qr_code", json.encodeToJsonElement(it)) }
                    value.promptpayDisplayQrCode?.let { put("promptpay_display_qr_code", json.encodeToJsonElement(it)) }
                    value.redirectToUrl?.let { put("redirect_to_url", json.encodeToJsonElement(it)) }
                    value.swishHandleRedirectOrDisplayQrCode?.let {
                        put("swish_handle_redirect_or_display_qr_code", json.encodeToJsonElement(it))
                    }
                    value.upiHandleRedirectOrDisplayQrCode?.let {
                        put("upi_handle_redirect_or_display_qr_code", json.encodeToJsonElement(it))
                    }
                    value.useStripeSdk?.let { put("use_stripe_sdk", json.encodeToJsonElement(it)) }
                    value.verifyWithMicrodeposits?.let {
                        put(
                            "verify_with_microdeposits",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.wechatPayDisplayQrCode?.let {
                        put(
                            "wechat_pay_display_qr_code",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.wechatPayRedirectToAndroidApp?.let {
                        put(
                            "wechat_pay_redirect_to_android_app",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.wechatPayRedirectToIosApp?.let {
                        put(
                            "wechat_pay_redirect_to_ios_app",
                            json.encodeToJsonElement(it),
                        )
                    }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentNextAction(block: PaymentIntentNextAction.Builder.() -> Unit): PaymentIntentNextAction =
    PaymentIntentNextAction.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("PaymentIntentNextAction is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
