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
 * Indicates the status of a specific payment method on a payment method domain.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_domain_resource_payment_method_status
 */
@Serializable(with = PaymentMethodDomainResourcePaymentMethodStatus.Serializer::class)
public class PaymentMethodDomainResourcePaymentMethodStatus(
    /**
     * The status of the payment method on the domain.
     */
    public val status: InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d,
    public val statusDetails: PaymentMethodDomainResourcePaymentMethodStatusDetails? = null,
) {
    public class Builder {
        private var statusValue: InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d? =
            null

        public var status: InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        public var statusDetails: PaymentMethodDomainResourcePaymentMethodStatusDetails? = null

        public fun build(): PaymentMethodDomainResourcePaymentMethodStatus {
            check(statusValue != null) { "status is required" }
            return PaymentMethodDomainResourcePaymentMethodStatus(
                status = status,
                statusDetails = statusDetails,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDomainResourcePaymentMethodStatus =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDomainResourcePaymentMethodStatus> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDomainResourcePaymentMethodStatus {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDomainResourcePaymentMethodStatus")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentMethodDomainResourcePaymentMethodStatus must be a JSON object",
                    )
            val status =
                json.decodeRequired<InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d>(
                    rawObject,
                    "status",
                )
            return PaymentMethodDomainResourcePaymentMethodStatus(
                status = status,
                statusDetails =
                    rawObject["status_details"]?.let {
                        json.decodeFromJsonElement<PaymentMethodDomainResourcePaymentMethodStatusDetails>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDomainResourcePaymentMethodStatus,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDomainResourcePaymentMethodStatus")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("status", json.encodeToJsonElement(value.status))
                    value.statusDetails?.let { put("status_details", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDomainResourcePaymentMethodStatus(
    block: PaymentMethodDomainResourcePaymentMethodStatus.Builder.() -> Unit,
): PaymentMethodDomainResourcePaymentMethodStatus = PaymentMethodDomainResourcePaymentMethodStatus.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentMethodDomainResourcePaymentMethodStatus is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
