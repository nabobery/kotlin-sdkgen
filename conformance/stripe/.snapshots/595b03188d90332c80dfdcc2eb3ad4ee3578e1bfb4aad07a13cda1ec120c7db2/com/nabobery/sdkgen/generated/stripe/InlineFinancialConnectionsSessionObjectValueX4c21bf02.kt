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
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.session/properties/object
 */
@Serializable(with = InlineFinancialConnectionsSessionObjectValueX4c21bf02.Serializer::class)
public sealed class InlineFinancialConnectionsSessionObjectValueX4c21bf02 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `financial_connections.session`.
     */
    public data object FinancialConnectionsSession : InlineFinancialConnectionsSessionObjectValueX4c21bf02() {
        public override val `value`: String = "financial_connections.session"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineFinancialConnectionsSessionObjectValueX4c21bf02()

    public companion object {
        public fun fromValue(`value`: String): InlineFinancialConnectionsSessionObjectValueX4c21bf02 =
            when (value) {
                FinancialConnectionsSession.value -> FinancialConnectionsSession
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineFinancialConnectionsSessionObjectValueX4c21bf02> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsSessionObjectValueX4c21bf02",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineFinancialConnectionsSessionObjectValueX4c21bf02 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineFinancialConnectionsSessionObjectValueX4c21bf02,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
