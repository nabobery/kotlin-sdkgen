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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/spending_controls/properties/allowed_card_presences/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/spending_controls/properties/allowed_card_presences/items
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe.Serializer::class)
public sealed class InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `not_present`.
     */
    public data object NotPresent : InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe() {
        public override val `value`: String = "not_present"
    }

    /**
     * Documented value. Wire value: `present`.
     */
    public data object Present : InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe() {
        public override val `value`: String = "present"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe =
            when (value) {
                NotPresent.value -> NotPresent
                Present.value -> Present
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
