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
 * sdkgen://source/openapi.json#/components/schemas/financial_connections.session/properties/accounts/properties/object
 */
@Serializable(with = InlineFinancialConnectionsSessionAccountsObjectValueXd956019d.Serializer::class)
public sealed class InlineFinancialConnectionsSessionAccountsObjectValueXd956019d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineFinancialConnectionsSessionAccountsObjectValueXd956019d() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineFinancialConnectionsSessionAccountsObjectValueXd956019d()

    public companion object {
        public fun fromValue(`value`: String): InlineFinancialConnectionsSessionAccountsObjectValueXd956019d =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineFinancialConnectionsSessionAccountsObjectValueXd956019d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsSessionAccountsObjectValueXd956019d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineFinancialConnectionsSessionAccountsObjectValueXd956019d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineFinancialConnectionsSessionAccountsObjectValueXd956019d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
