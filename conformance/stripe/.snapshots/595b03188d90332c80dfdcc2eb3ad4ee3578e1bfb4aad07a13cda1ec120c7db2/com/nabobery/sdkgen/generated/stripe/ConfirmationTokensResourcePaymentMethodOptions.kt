package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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
import kotlin.Unit

@Serializable
public data class ConfirmationTokensResourcePaymentMethodOptionsView(
    public val card: InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05? = null,
)

/**
 * Payment-method-specific configuration
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_payment_method_options
 */
@Serializable(with = ConfirmationTokensResourcePaymentMethodOptions.Serializer::class)
public class ConfirmationTokensResourcePaymentMethodOptions(
    /**
     * This hash contains the card payment method options.
     */
    public val card: InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05? = null,
) {
    public class Builder {
        /**
         * This hash contains the card payment method options.
         */
        public var card: InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05? = null

        public fun build(): ConfirmationTokensResourcePaymentMethodOptions =
            ConfirmationTokensResourcePaymentMethodOptions(
                card = card,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ConfirmationTokensResourcePaymentMethodOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ConfirmationTokensResourcePaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ConfirmationTokensResourcePaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("ConfirmationTokensResourcePaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "ConfirmationTokensResourcePaymentMethodOptions must be a JSON object",
                    )
            return ConfirmationTokensResourcePaymentMethodOptions(
                card =
                    rawObject["card"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ConfirmationTokensResourcePaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ConfirmationTokensResourcePaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.card?.let { put("card", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun confirmationTokensResourcePaymentMethodOptions(
    block: ConfirmationTokensResourcePaymentMethodOptions.Builder.() -> Unit,
): ConfirmationTokensResourcePaymentMethodOptions = ConfirmationTokensResourcePaymentMethodOptions.build(block)
