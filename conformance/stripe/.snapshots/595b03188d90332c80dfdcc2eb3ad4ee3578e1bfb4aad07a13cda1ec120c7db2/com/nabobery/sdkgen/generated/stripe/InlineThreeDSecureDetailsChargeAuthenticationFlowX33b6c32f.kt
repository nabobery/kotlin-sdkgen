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
 * For authenticated transactions: how the customer was authenticated by
 * the issuing bank.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details_charge/properties/authentication_flow
 */
@Serializable(with = InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f.Serializer::class)
public sealed class InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `challenge`.
     */
    public data object Challenge : InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f() {
        public override val `value`: String = "challenge"
    }

    /**
     * Documented value. Wire value: `frictionless`.
     */
    public data object Frictionless : InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f() {
        public override val `value`: String = "frictionless"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f()

    public companion object {
        public fun fromValue(`value`: String): InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f =
            when (value) {
                Challenge.value -> Challenge
                Frictionless.value -> Frictionless
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineThreeDSecureDetailsChargeAuthenticationFlowX33b6c32f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
