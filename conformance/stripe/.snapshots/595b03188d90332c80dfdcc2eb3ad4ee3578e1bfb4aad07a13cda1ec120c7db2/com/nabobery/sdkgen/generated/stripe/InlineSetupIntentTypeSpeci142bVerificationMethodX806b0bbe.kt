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
 * Bank account verification method. The default value is `automatic`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_type_specific_payment_method_options_client/properties/
 * verification_method
 */
@Serializable(with = InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe.Serializer::class)
public sealed class InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `instant`.
     */
    public data object Instant : InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe() {
        public override val `value`: String = "instant"
    }

    /**
     * Documented value. Wire value: `microdeposits`.
     */
    public data object Microdeposits : InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe() {
        public override val `value`: String = "microdeposits"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe()

    public companion object {
        public fun fromValue(`value`: String): InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe =
            when (value) {
                Automatic.value -> Automatic
                Instant.value -> Instant
                Microdeposits.value -> Microdeposits
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
