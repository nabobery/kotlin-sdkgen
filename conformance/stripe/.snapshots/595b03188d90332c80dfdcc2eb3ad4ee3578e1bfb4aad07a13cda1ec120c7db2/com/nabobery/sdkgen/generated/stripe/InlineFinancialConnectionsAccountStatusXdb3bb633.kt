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
 * The status of the link to the account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/status
 */
@Serializable(with = InlineFinancialConnectionsAccountStatusXdb3bb633.Serializer::class)
public sealed class InlineFinancialConnectionsAccountStatusXdb3bb633 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineFinancialConnectionsAccountStatusXdb3bb633() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `disconnected`.
     */
    public data object Disconnected : InlineFinancialConnectionsAccountStatusXdb3bb633() {
        public override val `value`: String = "disconnected"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineFinancialConnectionsAccountStatusXdb3bb633() {
        public override val `value`: String = "inactive"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineFinancialConnectionsAccountStatusXdb3bb633()

    public companion object {
        public fun fromValue(`value`: String): InlineFinancialConnectionsAccountStatusXdb3bb633 =
            when (value) {
                Active.value -> Active
                Disconnected.value -> Disconnected
                Inactive.value -> Inactive
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineFinancialConnectionsAccountStatusXdb3bb633> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountStatusXdb3bb633",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountStatusXdb3bb633 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineFinancialConnectionsAccountStatusXdb3bb633,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
