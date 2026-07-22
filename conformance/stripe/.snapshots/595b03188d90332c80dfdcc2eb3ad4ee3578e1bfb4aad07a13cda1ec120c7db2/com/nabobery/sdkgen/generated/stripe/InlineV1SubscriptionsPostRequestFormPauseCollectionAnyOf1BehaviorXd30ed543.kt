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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/pause_collection/anyOf/0/properties/behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/pause_collection/anyOf/0/properties/behavior
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `keep_as_draft`.
     */
    public data object KeepAsDraft : InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543() {
        public override val `value`: String = "keep_as_draft"
    }

    /**
     * Documented value. Wire value: `mark_uncollectible`.
     */
    public data object MarkUncollectible : InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543() {
        public override val `value`: String = "mark_uncollectible"
    }

    /**
     * Documented value. Wire value: `void`.
     */
    public data object Void : InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543() {
        public override val `value`: String = "void"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543 =
            when (value) {
                KeepAsDraft.value -> KeepAsDraft
                MarkUncollectible.value -> MarkUncollectible
                Void.value -> Void
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1BehaviorXd30ed543,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
