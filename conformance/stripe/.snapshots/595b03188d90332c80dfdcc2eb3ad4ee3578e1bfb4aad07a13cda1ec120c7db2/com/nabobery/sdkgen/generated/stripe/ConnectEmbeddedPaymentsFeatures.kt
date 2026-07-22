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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_payments_features
 */
@Serializable(with = ConnectEmbeddedPaymentsFeatures.Serializer::class)
public class ConnectEmbeddedPaymentsFeatures(
    /**
     * Whether to allow capturing and cancelling payment intents. This is `true` by default.
     */
    public val capturePayments: Boolean,
    /**
     * Whether connected accounts can manage destination charges that are created on behalf of them. This is `false` by
     * default.
     */
    public val destinationOnBehalfOfChargeManagement: Boolean,
    /**
     * Whether responding to disputes is enabled, including submitting evidence and accepting disputes. This is `true` by
     * default.
     */
    public val disputeManagement: Boolean,
    /**
     * Whether sending refunds is enabled. This is `true` by default.
     */
    public val refundManagement: Boolean,
) {
    public class Builder {
        private var capturePaymentsValue: Boolean? = null

        public var capturePayments: Boolean
            get() = requireNotNull(capturePaymentsValue) { "capturePayments is required" }
            set(`value`) {
                capturePaymentsValue = value
            }

        private var destinationOnBehalfOfChargeManagementValue: Boolean? = null

        public var destinationOnBehalfOfChargeManagement: Boolean
            get() =
                requireNotNull(destinationOnBehalfOfChargeManagementValue) {
                    "destinationOnBehalfOfChargeManagement is required"
                }
            set(`value`) {
                destinationOnBehalfOfChargeManagementValue = value
            }

        private var disputeManagementValue: Boolean? = null

        public var disputeManagement: Boolean
            get() = requireNotNull(disputeManagementValue) { "disputeManagement is required" }
            set(`value`) {
                disputeManagementValue = value
            }

        private var refundManagementValue: Boolean? = null

        public var refundManagement: Boolean
            get() = requireNotNull(refundManagementValue) { "refundManagement is required" }
            set(`value`) {
                refundManagementValue = value
            }

        public fun build(): ConnectEmbeddedPaymentsFeatures {
            check(capturePaymentsValue != null) { "capturePayments is required" }
            check(
                destinationOnBehalfOfChargeManagementValue != null,
            ) { "destinationOnBehalfOfChargeManagement is required" }
            check(disputeManagementValue != null) { "disputeManagement is required" }
            check(refundManagementValue != null) { "refundManagement is required" }
            return ConnectEmbeddedPaymentsFeatures(
                capturePayments = capturePayments,
                destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement,
                disputeManagement = disputeManagement,
                refundManagement = refundManagement,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ConnectEmbeddedPaymentsFeatures = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ConnectEmbeddedPaymentsFeatures> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ConnectEmbeddedPaymentsFeatures {
            val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedPaymentsFeatures")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ConnectEmbeddedPaymentsFeatures must be a JSON object")
            val capturePayments = json.decodeRequired<Boolean>(rawObject, "capture_payments")
            val destinationOnBehalfOfChargeManagement =
                json.decodeRequired<Boolean>(
                    rawObject,
                    "destination_on_behalf_of_charge_management",
                )
            val disputeManagement = json.decodeRequired<Boolean>(rawObject, "dispute_management")
            val refundManagement = json.decodeRequired<Boolean>(rawObject, "refund_management")
            return ConnectEmbeddedPaymentsFeatures(
                capturePayments = capturePayments,
                destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement,
                disputeManagement = disputeManagement,
                refundManagement = refundManagement,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ConnectEmbeddedPaymentsFeatures,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedPaymentsFeatures")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("capture_payments", json.encodeToJsonElement(value.capturePayments))
                    put(
                        "destination_on_behalf_of_charge_management",
                        json.encodeToJsonElement(value.destinationOnBehalfOfChargeManagement),
                    )
                    put("dispute_management", json.encodeToJsonElement(value.disputeManagement))
                    put("refund_management", json.encodeToJsonElement(value.refundManagement))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun connectEmbeddedPaymentsFeatures(
    block: ConnectEmbeddedPaymentsFeatures.Builder.() -> Unit,
): ConnectEmbeddedPaymentsFeatures = ConnectEmbeddedPaymentsFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "ConnectEmbeddedPaymentsFeatures is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
