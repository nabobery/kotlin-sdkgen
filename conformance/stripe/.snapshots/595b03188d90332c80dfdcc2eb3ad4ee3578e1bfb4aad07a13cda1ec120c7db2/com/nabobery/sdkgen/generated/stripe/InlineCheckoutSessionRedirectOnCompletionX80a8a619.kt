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
 * This parameter applies to `ui_mode: embedded_page`. Learn more about the [redirect
 * behavior](https://docs.stripe.com/payments/checkout/custom-success-page?payment-ui=embedded-form) of embedded
 * sessions. Defaults to `always`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/redirect_on_completion
 */
@Serializable(with = InlineCheckoutSessionRedirectOnCompletionX80a8a619.Serializer::class)
public sealed class InlineCheckoutSessionRedirectOnCompletionX80a8a619 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineCheckoutSessionRedirectOnCompletionX80a8a619() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `if_required`.
     */
    public data object IfRequired : InlineCheckoutSessionRedirectOnCompletionX80a8a619() {
        public override val `value`: String = "if_required"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlineCheckoutSessionRedirectOnCompletionX80a8a619() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutSessionRedirectOnCompletionX80a8a619()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutSessionRedirectOnCompletionX80a8a619 =
            when (value) {
                Always.value -> Always
                IfRequired.value -> IfRequired
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutSessionRedirectOnCompletionX80a8a619> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionRedirectOnCompletionX80a8a619",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutSessionRedirectOnCompletionX80a8a619 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSessionRedirectOnCompletionX80a8a619,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
