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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/bancontact/anyOf/0/properties/preferred_langu
 * age.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/bancontact/anyOf/0/properties/preferred_langu
 * age
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `de`.
     */
    public data object De : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a() {
        public override val `value`: String = "de"
    }

    /**
     * Documented value. Wire value: `en`.
     */
    public data object En : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a() {
        public override val `value`: String = "en"
    }

    /**
     * Documented value. Wire value: `fr`.
     */
    public data object Fr : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a() {
        public override val `value`: String = "fr"
    }

    /**
     * Documented value. Wire value: `nl`.
     */
    public data object Nl : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a() {
        public override val `value`: String = "nl"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a =
            when (value) {
                De.value -> De
                En.value -> En
                Fr.value -> Fr
                Nl.value -> Nl
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX5d4fc31a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
