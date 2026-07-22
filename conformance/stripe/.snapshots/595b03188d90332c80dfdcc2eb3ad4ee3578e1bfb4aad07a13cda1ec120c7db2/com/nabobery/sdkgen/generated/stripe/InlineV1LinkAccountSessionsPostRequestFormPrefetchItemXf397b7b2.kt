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
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/prefetch/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/prefetch/items
 */
@Serializable(with = InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2.Serializer::class)
public sealed class InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `balances`.
     */
    public data object Balances : InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2() {
        public override val `value`: String = "balances"
    }

    /**
     * Documented value. Wire value: `ownership`.
     */
    public data object Ownership : InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2() {
        public override val `value`: String = "ownership"
    }

    /**
     * Documented value. Wire value: `transactions`.
     */
    public data object Transactions : InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2() {
        public override val `value`: String = "transactions"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2()

    public companion object {
        public fun fromValue(`value`: String): InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2 =
            when (value) {
                Balances.value -> Balances
                Ownership.value -> Ownership
                Transactions.value -> Transactions
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
