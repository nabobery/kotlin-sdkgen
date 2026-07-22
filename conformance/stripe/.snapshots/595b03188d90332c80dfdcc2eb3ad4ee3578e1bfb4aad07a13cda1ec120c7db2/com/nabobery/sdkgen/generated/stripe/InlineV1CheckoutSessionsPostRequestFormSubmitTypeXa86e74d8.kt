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
 * Describes the type of transaction being performed by Checkout in order
 * to customize relevant text on the page, such as the submit button.
 * `submit_type` can only be specified on Checkout Sessions in
 * `payment` or `subscription` mode. If blank or `auto`, `pay` is used.
 * You can't set this parameter if `ui_mode` is `elements`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/submit_type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `auto`.
     */
    public data object Auto : InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8() {
        public override val `value`: String = "auto"
    }

    /**
     * Documented value. Wire value: `book`.
     */
    public data object Book : InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8() {
        public override val `value`: String = "book"
    }

    /**
     * Documented value. Wire value: `donate`.
     */
    public data object Donate : InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8() {
        public override val `value`: String = "donate"
    }

    /**
     * Documented value. Wire value: `pay`.
     */
    public data object Pay : InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8() {
        public override val `value`: String = "pay"
    }

    /**
     * Documented value. Wire value: `subscribe`.
     */
    public data object Subscribe : InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8() {
        public override val `value`: String = "subscribe"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8 =
            when (value) {
                Auto.value -> Auto
                Book.value -> Book
                Donate.value -> Donate
                Pay.value -> Pay
                Subscribe.value -> Subscribe
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
