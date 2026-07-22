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
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/trial_end/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/trial_end/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `now`.
     */
    public data object Now : InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1() {
        public override val `value`: String = "now"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1 =
            when (value) {
                Now.value -> Now
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
