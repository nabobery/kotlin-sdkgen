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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/pause_collection/anyOf/0/properties/behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/pause_collection/anyOf/0/properties/behavior
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `keep_as_draft`.
     */
    public data object KeepAsDraft : InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23() {
        public override val `value`: String = "keep_as_draft"
    }

    /**
     * Documented value. Wire value: `mark_uncollectible`.
     */
    public data object MarkUncollectible : InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23() {
        public override val `value`: String = "mark_uncollectible"
    }

    /**
     * Documented value. Wire value: `void`.
     */
    public data object Void : InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23() {
        public override val `value`: String = "void"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23 =
            when (value) {
                KeepAsDraft.value -> KeepAsDraft
                MarkUncollectible.value -> MarkUncollectible
                Void.value -> Void
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
