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
 * A value indicating the responsible payer of a bundle of Stripe fees for pricing-control eligible products on this
 * account. Learn more about [fee behavior on connected
 * accounts](https://docs.stripe.com/connect/direct-charges-fee-payer-behavior).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_unification_account_controller_fees/properties/payer
 */
@Serializable(with = InlineAccountUnificationAccountControllerFeesPayerXf588ffe2.Serializer::class)
public sealed class InlineAccountUnificationAccountControllerFeesPayerXf588ffe2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineAccountUnificationAccountControllerFeesPayerXf588ffe2() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `application`.
     */
    public data object Application : InlineAccountUnificationAccountControllerFeesPayerXf588ffe2() {
        public override val `value`: String = "application"
    }

    /**
     * Documented value. Wire value: `application_custom`.
     */
    public data object ApplicationCustom : InlineAccountUnificationAccountControllerFeesPayerXf588ffe2() {
        public override val `value`: String = "application_custom"
    }

    /**
     * Documented value. Wire value: `application_express`.
     */
    public data object ApplicationExpress : InlineAccountUnificationAccountControllerFeesPayerXf588ffe2() {
        public override val `value`: String = "application_express"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountUnificationAccountControllerFeesPayerXf588ffe2()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountUnificationAccountControllerFeesPayerXf588ffe2 =
            when (value) {
                Account.value -> Account
                Application.value -> Application
                ApplicationCustom.value -> ApplicationCustom
                ApplicationExpress.value -> ApplicationExpress
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountUnificationAccountControllerFeesPayerXf588ffe2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountUnificationAccountControllerFeesPayerXf588ffe2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountUnificationAccountControllerFeesPayerXf588ffe2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountUnificationAccountControllerFeesPayerXf588ffe2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
