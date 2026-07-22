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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/spending_controls/properties/blocked_card_presences/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/spending_controls/properties/blocked_card_presences/items
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `not_present`.
     */
    public data object NotPresent : InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415() {
        public override val `value`: String = "not_present"
    }

    /**
     * Documented value. Wire value: `present`.
     */
    public data object Present : InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415() {
        public override val `value`: String = "present"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415 =
            when (value) {
                NotPresent.value -> NotPresent
                Present.value -> Present
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
