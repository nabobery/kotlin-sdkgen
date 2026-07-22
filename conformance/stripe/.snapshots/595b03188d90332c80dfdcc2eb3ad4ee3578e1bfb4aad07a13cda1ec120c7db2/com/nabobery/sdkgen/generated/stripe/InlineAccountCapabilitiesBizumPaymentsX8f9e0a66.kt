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
 * The status of the Bizum capability of the account, or whether the account can directly process Bizum payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/bizum_payments
 */
@Serializable(with = InlineAccountCapabilitiesBizumPaymentsX8f9e0a66.Serializer::class)
public sealed class InlineAccountCapabilitiesBizumPaymentsX8f9e0a66 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesBizumPaymentsX8f9e0a66() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesBizumPaymentsX8f9e0a66() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesBizumPaymentsX8f9e0a66() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesBizumPaymentsX8f9e0a66()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesBizumPaymentsX8f9e0a66 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesBizumPaymentsX8f9e0a66> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesBizumPaymentsX8f9e0a66",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesBizumPaymentsX8f9e0a66 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesBizumPaymentsX8f9e0a66,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
