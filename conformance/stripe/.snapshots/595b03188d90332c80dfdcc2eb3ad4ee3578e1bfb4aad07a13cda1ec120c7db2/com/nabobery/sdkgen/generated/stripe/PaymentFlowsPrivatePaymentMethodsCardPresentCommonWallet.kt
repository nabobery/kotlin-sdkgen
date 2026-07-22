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
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_card_present_common_wallet
 */
@Serializable(with = PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet.Serializer::class)
public class PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet(
    /**
     * The type of mobile wallet, one of `apple_pay`, `google_pay`, `samsung_pay`, or `unknown`.
     */
    public val type: InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa,
) {
    public class Builder {
        private var typeValue:
            InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa? = null

        public var type: InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet {
            check(typeValue != null) { "type is required" }
            return PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet(
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa>(
                    rawObject,
                    "type",
                )
            return PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet(
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentFlowsPrivatePaymentMethodsCardPresentCommonWallet(
    block: PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet.Builder.() -> Unit,
): PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet =
    PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
