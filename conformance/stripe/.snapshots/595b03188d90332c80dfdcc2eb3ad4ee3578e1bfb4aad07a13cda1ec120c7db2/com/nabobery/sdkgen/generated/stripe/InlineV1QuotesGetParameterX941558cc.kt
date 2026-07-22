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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1quotes/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1quotes/get/parameters/6/schema
 */
@Serializable(with = InlineV1QuotesGetParameterX941558cc.Serializer::class)
public sealed class InlineV1QuotesGetParameterX941558cc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `accepted`.
     */
    public data object Accepted : InlineV1QuotesGetParameterX941558cc() {
        public override val `value`: String = "accepted"
    }

    /**
     * Documented value. Wire value: `canceled`.
     */
    public data object Canceled : InlineV1QuotesGetParameterX941558cc() {
        public override val `value`: String = "canceled"
    }

    /**
     * Documented value. Wire value: `draft`.
     */
    public data object Draft : InlineV1QuotesGetParameterX941558cc() {
        public override val `value`: String = "draft"
    }

    /**
     * Documented value. Wire value: `open`.
     */
    public data object Open : InlineV1QuotesGetParameterX941558cc() {
        public override val `value`: String = "open"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1QuotesGetParameterX941558cc()

    public companion object {
        public fun fromValue(`value`: String): InlineV1QuotesGetParameterX941558cc =
            when (value) {
                Accepted.value -> Accepted
                Canceled.value -> Canceled
                Draft.value -> Draft
                Open.value -> Open
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1QuotesGetParameterX941558cc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1QuotesGetParameterX941558cc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1QuotesGetParameterX941558cc =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesGetParameterX941558cc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
