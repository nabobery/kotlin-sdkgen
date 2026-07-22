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
 * The type of error returned. One of `api_error`, `card_error`, `idempotency_error`, or `invalid_request_error`
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/api_errors/properties/type
 */
@Serializable(with = InlineApiErrorsTypeX8f5e1aa3.Serializer::class)
public sealed class InlineApiErrorsTypeX8f5e1aa3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `api_error`.
     */
    public data object ApiError : InlineApiErrorsTypeX8f5e1aa3() {
        public override val `value`: String = "api_error"
    }

    /**
     * Documented value. Wire value: `card_error`.
     */
    public data object CardError : InlineApiErrorsTypeX8f5e1aa3() {
        public override val `value`: String = "card_error"
    }

    /**
     * Documented value. Wire value: `idempotency_error`.
     */
    public data object IdempotencyError : InlineApiErrorsTypeX8f5e1aa3() {
        public override val `value`: String = "idempotency_error"
    }

    /**
     * Documented value. Wire value: `invalid_request_error`.
     */
    public data object InvalidRequestError : InlineApiErrorsTypeX8f5e1aa3() {
        public override val `value`: String = "invalid_request_error"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineApiErrorsTypeX8f5e1aa3()

    public companion object {
        public fun fromValue(`value`: String): InlineApiErrorsTypeX8f5e1aa3 =
            when (value) {
                ApiError.value -> ApiError
                CardError.value -> CardError
                IdempotencyError.value -> IdempotencyError
                InvalidRequestError.value -> InvalidRequestError
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineApiErrorsTypeX8f5e1aa3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineApiErrorsTypeX8f5e1aa3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineApiErrorsTypeX8f5e1aa3 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineApiErrorsTypeX8f5e1aa3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
