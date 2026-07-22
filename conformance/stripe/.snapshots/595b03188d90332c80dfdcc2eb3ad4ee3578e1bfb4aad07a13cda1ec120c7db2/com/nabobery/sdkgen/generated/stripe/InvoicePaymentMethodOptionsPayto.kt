package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.Unit

@Serializable
public data class InvoicePaymentMethodOptionsPaytoView(
    @SerialName("mandate_options")
    public val mandateOptions: InvoiceMandateOptionsPayto? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_payto
 */
@Serializable(with = InvoicePaymentMethodOptionsPayto.Serializer::class)
public class InvoicePaymentMethodOptionsPayto(
    public val mandateOptions: InvoiceMandateOptionsPayto? = null,
) {
    public class Builder {
        public var mandateOptions: InvoiceMandateOptionsPayto? = null

        public fun build(): InvoicePaymentMethodOptionsPayto =
            InvoicePaymentMethodOptionsPayto(
                mandateOptions = mandateOptions,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsPayto = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoicePaymentMethodOptionsPayto> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsPayto {
            val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsPayto")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoicePaymentMethodOptionsPayto must be a JSON object")
            return InvoicePaymentMethodOptionsPayto(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json.decodeFromJsonElement<InvoiceMandateOptionsPayto>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoicePaymentMethodOptionsPayto,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsPayto")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoicePaymentMethodOptionsPayto(
    block: InvoicePaymentMethodOptionsPayto.Builder.() -> Unit,
): InvoicePaymentMethodOptionsPayto = InvoicePaymentMethodOptionsPayto.build(block)
