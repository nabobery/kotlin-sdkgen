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
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_balance_transaction/properties/object
 */
@Serializable(with = InlineCustomerBalanceTransactionObjectValueXfd80c0ef.Serializer::class)
public sealed class InlineCustomerBalanceTransactionObjectValueXfd80c0ef {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `customer_balance_transaction`.
     */
    public data object CustomerBalanceTransaction : InlineCustomerBalanceTransactionObjectValueXfd80c0ef() {
        public override val `value`: String = "customer_balance_transaction"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCustomerBalanceTransactionObjectValueXfd80c0ef()

    public companion object {
        public fun fromValue(`value`: String): InlineCustomerBalanceTransactionObjectValueXfd80c0ef =
            when (value) {
                CustomerBalanceTransaction.value -> CustomerBalanceTransaction
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCustomerBalanceTransactionObjectValueXfd80c0ef> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCustomerBalanceTransactionObjectValueXfd80c0ef",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCustomerBalanceTransactionObjectValueXfd80c0ef =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerBalanceTransactionObjectValueXfd80c0ef,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
