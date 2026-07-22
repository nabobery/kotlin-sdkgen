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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/notification_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/notification_method
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `deprecated_none`.
     */
    public data object DeprecatedNone : InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70() {
        public override val `value`: String = "deprecated_none"
    }

    /**
     * Documented value. Wire value: `email`.
     */
    public data object Email : InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70() {
        public override val `value`: String = "email"
    }

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70() {
        public override val `value`: String = "manual"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70() {
        public override val `value`: String = "none"
    }

    /**
     * Documented value. Wire value: `stripe_email`.
     */
    public data object StripeEmail : InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70() {
        public override val `value`: String = "stripe_email"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70 =
            when (value) {
                DeprecatedNone.value -> DeprecatedNone
                Email.value -> Email
                Manual.value -> Manual
                None.value -> None
                StripeEmail.value -> StripeEmail
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SourcesPostRequestFormMandateNotificationMethodX084b2c70,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
