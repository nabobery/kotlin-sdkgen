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
 * The collect parameter is deprecated. Use `collection_options` instead.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/collect
 */
@Serializable(with = InlineV1AccountLinksPostRequestFormCollectXcde1cfeb.Serializer::class)
public sealed class InlineV1AccountLinksPostRequestFormCollectXcde1cfeb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `currently_due`.
     */
    public data object CurrentlyDue : InlineV1AccountLinksPostRequestFormCollectXcde1cfeb() {
        public override val `value`: String = "currently_due"
    }

    /**
     * Documented value. Wire value: `eventually_due`.
     */
    public data object EventuallyDue : InlineV1AccountLinksPostRequestFormCollectXcde1cfeb() {
        public override val `value`: String = "eventually_due"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountLinksPostRequestFormCollectXcde1cfeb()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountLinksPostRequestFormCollectXcde1cfeb =
            when (value) {
                CurrentlyDue.value -> CurrentlyDue
                EventuallyDue.value -> EventuallyDue
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountLinksPostRequestFormCollectXcde1cfeb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountLinksPostRequestFormCollectXcde1cfeb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1AccountLinksPostRequestFormCollectXcde1cfeb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountLinksPostRequestFormCollectXcde1cfeb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
