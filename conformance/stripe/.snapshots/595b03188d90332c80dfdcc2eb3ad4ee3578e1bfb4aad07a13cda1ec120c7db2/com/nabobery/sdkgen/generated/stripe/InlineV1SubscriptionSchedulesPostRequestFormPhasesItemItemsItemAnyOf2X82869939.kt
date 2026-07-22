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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/billing_thresholds/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/billing_thresholds/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
