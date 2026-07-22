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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf(
    public val mandateOptions: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX865b5aa1? = null,
) {
    public class Builder {
        public var mandateOptions:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX865b5aa1? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf =
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf(
                mandateOptions = mandateOptions,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX865b5aa1>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf",
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf =
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitX1c7e1adf.build(block)
