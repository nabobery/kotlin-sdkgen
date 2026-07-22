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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/financial_connections.account_ownership/properties/owners/properties
 * /object
 */
@Serializable(with = InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112.Serializer::class)
public sealed class InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112()

    public companion object {
        public fun fromValue(`value`: String): InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112 =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineFinancialConnectionsAccountOwnershipOwnersObjectValueX581c2112,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
