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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_issuing/properties/tos_acceptance/properties/user_agent/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_issuing/properties/tos_acceptance/properties/user_agent/anyOf/1
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2X3c4d860a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
