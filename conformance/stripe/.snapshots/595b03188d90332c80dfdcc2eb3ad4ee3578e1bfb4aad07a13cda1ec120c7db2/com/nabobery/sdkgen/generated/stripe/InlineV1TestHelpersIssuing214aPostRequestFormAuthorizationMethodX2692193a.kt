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
 * How the card details were provided. Defaults to online.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/authorization_method
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a.Serializer::class)
public sealed class InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `chip`.
     */
    public data object Chip : InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a() {
        public override val `value`: String = "chip"
    }

    /**
     * Documented value. Wire value: `contactless`.
     */
    public data object Contactless : InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a() {
        public override val `value`: String = "contactless"
    }

    /**
     * Documented value. Wire value: `keyed_in`.
     */
    public data object KeyedIn : InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a() {
        public override val `value`: String = "keyed_in"
    }

    /**
     * Documented value. Wire value: `online`.
     */
    public data object Online : InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a() {
        public override val `value`: String = "online"
    }

    /**
     * Documented value. Wire value: `swipe`.
     */
    public data object Swipe : InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a() {
        public override val `value`: String = "swipe"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a =
            when (value) {
                Chip.value -> Chip
                Contactless.value -> Contactless
                KeyedIn.value -> KeyedIn
                Online.value -> Online
                Swipe.value -> Swipe
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
