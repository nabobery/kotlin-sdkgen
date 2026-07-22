package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_card_mandate_options/properties/
 * supported_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_card_mandate_options/properties/
 * supported_types/items
 */
@Serializable(with = InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e.Serializer::class)
public sealed class InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `india`.
     */
    public data object India : InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e() {
        public override val `value`: String = "india"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e()

    public companion object {
        public fun fromValue(`value`: String): InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e =
            when (value) {
                India.value -> India
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
