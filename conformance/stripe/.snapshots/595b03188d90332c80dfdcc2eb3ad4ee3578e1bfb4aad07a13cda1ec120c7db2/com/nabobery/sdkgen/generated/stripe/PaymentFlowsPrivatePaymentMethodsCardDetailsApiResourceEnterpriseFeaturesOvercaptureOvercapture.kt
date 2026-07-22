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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_card_details_api_resource_ente
 * rprise_features_overcapture_overcapture
 */
@Serializable(
    with = PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture.Serializer::class,
)
public class PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture(
    /**
     * The maximum amount that can be captured.
     */
    public val maximumAmountCapturable: Int,
    /**
     * Indicates whether or not the authorized amount can be over-captured.
     */
    public val status: InlinePaymentFlowsPrivateP67a2StatusX2dda32c1,
) {
    public class Builder {
        private var maximumAmountCapturableValue: Int? = null

        public var maximumAmountCapturable: Int
            get() = requireNotNull(maximumAmountCapturableValue) { "maximumAmountCapturable is required" }
            set(`value`) {
                maximumAmountCapturableValue = value
            }

        private var statusValue: InlinePaymentFlowsPrivateP67a2StatusX2dda32c1? = null

        public var status: InlinePaymentFlowsPrivateP67a2StatusX2dda32c1
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        public fun build(): PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture {
            check(maximumAmountCapturableValue != null) { "maximumAmountCapturable is required" }
            check(statusValue != null) { "status is required" }
            return PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture(
                maximumAmountCapturable = maximumAmountCapturable,
                status = status,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture must be a JSON object",
                    )
            val maximumAmountCapturable = json.decodeRequired<Int>(rawObject, "maximum_amount_capturable")
            val status = json.decodeRequired<InlinePaymentFlowsPrivateP67a2StatusX2dda32c1>(rawObject, "status")
            return PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture(
                maximumAmountCapturable = maximumAmountCapturable,
                status = status,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("maximum_amount_capturable", json.encodeToJsonElement(value.maximumAmountCapturable))
                    put("status", json.encodeToJsonElement(value.status))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture(
    block:
        PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture.Builder.() -> Unit,
): PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture =
    PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
