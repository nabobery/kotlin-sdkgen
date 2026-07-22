package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.Unit

@Serializable
public data class InvoicePaymentMethodOptionsPixView(
    @SerialName("amount_includes_iof")
    public val amountIncludesIof: InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152? = null,
    @SerialName("expires_after_seconds")
    public val expiresAfterSeconds: Int? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_pix
 */
@Serializable(with = InvoicePaymentMethodOptionsPix.Serializer::class)
public class InvoicePaymentMethodOptionsPix(
    /**
     * Determines if the amount includes the IOF tax.
     */
    public val amountIncludesIof: InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152? = null,
    /**
     * The number of seconds (between 10 and 1209600) after which Pix payment will expire. Defaults to 86400 seconds.
     */
    public val expiresAfterSeconds: Int? = null,
) {
    public class Builder {
        /**
         * Determines if the amount includes the IOF tax.
         */
        public var amountIncludesIof: InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152? =
            null

        /**
         * The number of seconds (between 10 and 1209600) after which Pix payment will expire. Defaults to 86400 seconds.
         */
        public var expiresAfterSeconds: Int? = null

        public fun build(): InvoicePaymentMethodOptionsPix =
            InvoicePaymentMethodOptionsPix(
                amountIncludesIof = amountIncludesIof,
                expiresAfterSeconds = expiresAfterSeconds,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsPix = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoicePaymentMethodOptionsPix> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsPix {
            val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsPix")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoicePaymentMethodOptionsPix must be a JSON object")
            return InvoicePaymentMethodOptionsPix(
                amountIncludesIof =
                    rawObject["amount_includes_iof"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152?>(
                                element,
                            )
                        }
                    },
                expiresAfterSeconds = rawObject["expires_after_seconds"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoicePaymentMethodOptionsPix,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsPix")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
                    value.expiresAfterSeconds?.let { put("expires_after_seconds", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoicePaymentMethodOptionsPix(
    block: InvoicePaymentMethodOptionsPix.Builder.() -> Unit,
): InvoicePaymentMethodOptionsPix = InvoicePaymentMethodOptionsPix.build(block)
