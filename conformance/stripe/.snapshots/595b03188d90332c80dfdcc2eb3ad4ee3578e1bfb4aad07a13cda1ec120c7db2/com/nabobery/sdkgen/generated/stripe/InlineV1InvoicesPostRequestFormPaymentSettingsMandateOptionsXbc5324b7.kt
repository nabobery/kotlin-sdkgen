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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_optio
 * ns.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_optio
 * ns
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7(
    public val transactionType: InlineV1InvoicesPostRequestFormPaymentSettingsTransactionTypeXdfa863a5? = null,
) {
    public class Builder {
        public var transactionType:
            InlineV1InvoicesPostRequestFormPaymentSettingsTransactionTypeXdfa863a5? = null

        public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7 =
            InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7(
                transactionType = transactionType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7 must be a JSON object",
                    )
            return InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7(
                transactionType =
                    rawObject["transaction_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsTransactionTypeXdfa863a5>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7(
    block: InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7 =
    InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7.build(block)
