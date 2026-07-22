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
import kotlin.Unit

@Serializable
public data class SetupIntentPaymentMethodOptionsAcssDebitView(
    public val currency: InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c? = null,
    @SerialName("mandate_options")
    public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit? = null,
    @SerialName("verification_method")
    public val verificationMethod: InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_acss_debit
 */
@Serializable(with = SetupIntentPaymentMethodOptionsAcssDebit.Serializer::class)
public class SetupIntentPaymentMethodOptionsAcssDebit(
    /**
     * Currency supported by the bank account
     */
    public val currency: InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c? = null,
    public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit? = null,
    /**
     * Bank account verification method. The default value is `automatic`.
     */
    public val verificationMethod: InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7? = null,
) {
    public class Builder {
        /**
         * Currency supported by the bank account
         */
        public var currency: InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c? = null

        public var mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit? = null

        /**
         * Bank account verification method. The default value is `automatic`.
         */
        public var verificationMethod:
            InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7? = null

        public fun build(): SetupIntentPaymentMethodOptionsAcssDebit =
            SetupIntentPaymentMethodOptionsAcssDebit(
                currency = currency,
                mandateOptions = mandateOptions,
                verificationMethod = verificationMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsAcssDebit =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SetupIntentPaymentMethodOptionsAcssDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsAcssDebit {
            val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsAcssDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SetupIntentPaymentMethodOptionsAcssDebit must be a JSON object")
            return SetupIntentPaymentMethodOptionsAcssDebit(
                currency =
                    rawObject["currency"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c?>(
                                    element,
                                )
                        }
                    },
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsMandateOptionsAcssDebit>(it)
                    },
                verificationMethod =
                    rawObject["verification_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SetupIntentPaymentMethodOptionsAcssDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsAcssDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.currency?.let { put("currency", json.encodeToJsonElement(it)) }
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                    value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun setupIntentPaymentMethodOptionsAcssDebit(
    block: SetupIntentPaymentMethodOptionsAcssDebit.Builder.() -> Unit,
): SetupIntentPaymentMethodOptionsAcssDebit = SetupIntentPaymentMethodOptionsAcssDebit.build(block)
