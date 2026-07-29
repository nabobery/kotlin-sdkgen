package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/spending_controls/properties/allowed_card_presences/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/spending_controls/properties/allowed_card_presences/items
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not_present`.
   */
  public data object NotPresent : InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d() {
    public override val `value`: String = "not_present"
  }

  /**
   * Documented value. Wire value: `present`.
   */
  public data object Present : InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d() {
    public override val `value`: String = "present"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d = when (value) {
      NotPresent.value -> NotPresent
      Present.value -> Present
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d) {
      encoder.encodeString(value.value)
    }
  }
}
