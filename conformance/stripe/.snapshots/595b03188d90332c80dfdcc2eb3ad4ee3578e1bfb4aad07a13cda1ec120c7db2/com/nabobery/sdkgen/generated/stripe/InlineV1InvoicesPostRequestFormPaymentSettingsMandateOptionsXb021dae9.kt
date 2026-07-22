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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9(
    public val amount: Int? = null,
    public val purpose: InlineV1InvoicesPostRequestFormPaymentSettingsPurposeX5d9503be? = null,
) {
    public class Builder {
        public var amount: Int? = null

        public var purpose: InlineV1InvoicesPostRequestFormPaymentSettingsPurposeX5d9503be? = null

        public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9 =
            InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9(
                amount = amount,
                purpose = purpose,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9 must be a JSON object",
                    )
            return InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9(
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                purpose =
                    rawObject["purpose"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPurposeX5d9503be>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9(
    block: InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9 =
    InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9.build(block)
