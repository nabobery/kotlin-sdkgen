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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1subscribe/post/requestBody/cont
 * ent/application~1x-www-form-urlencoded/schema/properties/features/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1subscribe/post/requestBody/cont
 * ent/application~1x-www-form-urlencoded/schema/properties/features/items
 */
@Serializable(with = InlineV1FinancialConnectio3ed8PostRequestFormFeaturesItemX53a5688e.Serializer::class)
public sealed class InlineV1FinancialConnectio3ed8PostRequestFormFeaturesItemX53a5688e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `transactions`.
     */
    public data object Transactions : InlineV1FinancialConnectio3ed8PostRequestFormFeaturesItemX53a5688e() {
        public override val `value`: String = "transactions"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1FinancialConnectio3ed8PostRequestFormFeaturesItemX53a5688e()

    public companion object {
        public fun fromValue(`value`: String): InlineV1FinancialConnectio3ed8PostRequestFormFeaturesItemX53a5688e =
            when (value) {
                Transactions.value -> Transactions
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1FinancialConnectio3ed8PostRequestFormFeaturesItemX53a5688e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectio3ed8PostRequestFormFeaturesItemX53a5688e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1FinancialConnectio3ed8PostRequestFormFeaturesItemX53a5688e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1FinancialConnectio3ed8PostRequestFormFeaturesItemX53a5688e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
