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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1attach_payment/post/requestBody/content/application~1x
 * -www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1attach_payment/post/requestBody/content/application~1x
 * -www-form-urlencoded/schema
 */
@Serializable(with = InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621.Serializer::class)
public class InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621(
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * The ID of the PaymentIntent to attach to the invoice.
     */
    public val paymentIntent: String? = null,
    /**
     * The ID of the PaymentRecord to attach to the invoice.
     */
    public val paymentRecord: String? = null,
) {
    public class Builder {
        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * The ID of the PaymentIntent to attach to the invoice.
         */
        public var paymentIntent: String? = null

        /**
         * The ID of the PaymentRecord to attach to the invoice.
         */
        public var paymentRecord: String? = null

        public fun build(): InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621 =
            InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621(
                expand = expand,
                paymentIntent = paymentIntent,
                paymentRecord = paymentRecord,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621 must be a JSON object",
                    )
            return InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                paymentIntent = rawObject["payment_intent"]?.let { json.decodeFromJsonElement<String>(it) },
                paymentRecord = rawObject["payment_record"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.paymentIntent?.let { put("payment_intent", it) }
                    value.paymentRecord?.let { put("payment_record", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesAttachPaymentPostRequestFormX4b78a621(
    block: InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621.Builder.() -> Unit,
): InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621 =
    InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621.build(block)
