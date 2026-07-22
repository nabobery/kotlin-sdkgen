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
 * The type of the account. Account category is further divided in `subcategory`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/category
 */
@Serializable(with = InlineFinancialConnectionsAccountCategoryX1214ba08.Serializer::class)
public sealed class InlineFinancialConnectionsAccountCategoryX1214ba08 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `cash`.
     */
    public data object Cash : InlineFinancialConnectionsAccountCategoryX1214ba08() {
        public override val `value`: String = "cash"
    }

    /**
     * Documented value. Wire value: `credit`.
     */
    public data object Credit : InlineFinancialConnectionsAccountCategoryX1214ba08() {
        public override val `value`: String = "credit"
    }

    /**
     * Documented value. Wire value: `investment`.
     */
    public data object Investment : InlineFinancialConnectionsAccountCategoryX1214ba08() {
        public override val `value`: String = "investment"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineFinancialConnectionsAccountCategoryX1214ba08() {
        public override val `value`: String = "other"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineFinancialConnectionsAccountCategoryX1214ba08()

    public companion object {
        public fun fromValue(`value`: String): InlineFinancialConnectionsAccountCategoryX1214ba08 =
            when (value) {
                Cash.value -> Cash
                Credit.value -> Credit
                Investment.value -> Investment
                Other.value -> Other
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineFinancialConnectionsAccountCategoryX1214ba08> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountCategoryX1214ba08",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountCategoryX1214ba08 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineFinancialConnectionsAccountCategoryX1214ba08,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
