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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/spending_controls/properties/blocked_card_presences/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/spending_controls/properties/blocked_card_presences/items
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281.Serializer::class)
public sealed class InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `not_present`.
     */
    public data object NotPresent : InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281() {
        public override val `value`: String = "not_present"
    }

    /**
     * Documented value. Wire value: `present`.
     */
    public data object Present : InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281() {
        public override val `value`: String = "present"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281 =
            when (value) {
                NotPresent.value -> NotPresent
                Present.value -> Present
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
