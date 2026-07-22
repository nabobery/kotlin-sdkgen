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
 * Indicates if the person or any of their representatives, family members, or other closely related persons, declares
 * that they hold or have held an important public job or function, in any jurisdiction.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/political_exposure
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `existing`.
     */
    public data object Existing : InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1() {
        public override val `value`: String = "existing"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1 =
            when (value) {
                Existing.value -> Existing
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormPoliticalExposureXdc1040a1,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
