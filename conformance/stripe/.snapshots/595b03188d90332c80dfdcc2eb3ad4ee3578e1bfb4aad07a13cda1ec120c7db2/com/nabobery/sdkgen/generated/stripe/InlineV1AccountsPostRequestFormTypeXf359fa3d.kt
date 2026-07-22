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
 * The `type` parameter is deprecated. Use [`controller`](/api/accounts/create#create_account-controller) instead to
 * configure dashboard access, fee payer, loss liability, and requirement collection.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/type
 */
@Serializable(with = InlineV1AccountsPostRequestFormTypeXf359fa3d.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormTypeXf359fa3d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `custom`.
     */
    public data object Custom : InlineV1AccountsPostRequestFormTypeXf359fa3d() {
        public override val `value`: String = "custom"
    }

    /**
     * Documented value. Wire value: `express`.
     */
    public data object Express : InlineV1AccountsPostRequestFormTypeXf359fa3d() {
        public override val `value`: String = "express"
    }

    /**
     * Documented value. Wire value: `standard`.
     */
    public data object Standard : InlineV1AccountsPostRequestFormTypeXf359fa3d() {
        public override val `value`: String = "standard"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormTypeXf359fa3d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormTypeXf359fa3d =
            when (value) {
                Custom.value -> Custom
                Express.value -> Express
                Standard.value -> Standard
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormTypeXf359fa3d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormTypeXf359fa3d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormTypeXf359fa3d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormTypeXf359fa3d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
