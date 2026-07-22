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
 * /properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3(
    public val mandateOptions: InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9? = null,
) {
    public class Builder {
        public var mandateOptions:
            InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9? = null

        public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3 =
            InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3(
                mandateOptions = mandateOptions,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3 must be a JSON object",
                    )
            return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXb021dae9>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3(
    block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3 =
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3.build(block)
