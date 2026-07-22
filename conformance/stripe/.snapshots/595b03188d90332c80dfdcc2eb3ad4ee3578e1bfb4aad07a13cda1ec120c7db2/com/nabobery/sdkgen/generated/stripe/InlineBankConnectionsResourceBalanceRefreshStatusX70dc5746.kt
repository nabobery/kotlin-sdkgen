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
 * The status of the last refresh attempt.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_balance_refresh/properties/status
 */
@Serializable(with = InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746.Serializer::class)
public sealed class InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `failed`.
     */
    public data object Failed : InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746() {
        public override val `value`: String = "failed"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746() {
        public override val `value`: String = "pending"
    }

    /**
     * Documented value. Wire value: `succeeded`.
     */
    public data object Succeeded : InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746() {
        public override val `value`: String = "succeeded"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746()

    public companion object {
        public fun fromValue(`value`: String): InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746 =
            when (value) {
                Failed.value -> Failed
                Pending.value -> Pending
                Succeeded.value -> Succeeded
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBankConnectionsResourceBalanceRefreshStatusX70dc5746,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
