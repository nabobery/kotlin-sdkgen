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
 * The status of the KakaoPay capability of the account, or whether the account can directly process KakaoPay payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/kakao_pay_payments
 */
@Serializable(with = InlineAccountCapabilitiesKakaoPayPaymentsXc2958402.Serializer::class)
public sealed class InlineAccountCapabilitiesKakaoPayPaymentsXc2958402 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesKakaoPayPaymentsXc2958402() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesKakaoPayPaymentsXc2958402() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesKakaoPayPaymentsXc2958402() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesKakaoPayPaymentsXc2958402()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesKakaoPayPaymentsXc2958402 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesKakaoPayPaymentsXc2958402> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesKakaoPayPaymentsXc2958402",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesKakaoPayPaymentsXc2958402 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesKakaoPayPaymentsXc2958402,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
