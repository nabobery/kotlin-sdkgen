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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account_owner/properties/object
 */
@Serializable(with = InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b.Serializer::class)
public sealed class InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `financial_connections.account_owner`.
     */
    public data object FinancialConnectionsAccountOwner : InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b() {
        public override val `value`: String = "financial_connections.account_owner"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b()

    public companion object {
        public fun fromValue(`value`: String): InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b =
            when (value) {
                FinancialConnectionsAccountOwner.value -> FinancialConnectionsAccountOwner
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
