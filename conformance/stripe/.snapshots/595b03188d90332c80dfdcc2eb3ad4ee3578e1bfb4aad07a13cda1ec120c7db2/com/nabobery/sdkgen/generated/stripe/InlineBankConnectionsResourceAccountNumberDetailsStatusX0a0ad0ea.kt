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
 * Whether the account number is currently active and usable for transactions.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_account_number_details/properties/status
 */
@Serializable(with = InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea.Serializer::class)
public sealed class InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `deactivated`.
     */
    public data object Deactivated : InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea() {
        public override val `value`: String = "deactivated"
    }

    /**
     * Documented value. Wire value: `transactable`.
     */
    public data object Transactable : InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea() {
        public override val `value`: String = "transactable"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea()

    public companion object {
        public fun fromValue(`value`: String): InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea =
            when (value) {
                Deactivated.value -> Deactivated
                Transactable.value -> Transactable
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
