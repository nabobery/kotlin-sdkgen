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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/spending_controls/properties/allowed_card_presences/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/spending_controls/properties/allowed_card_presences/items
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not_present`.
   */
  public data object NotPresent : InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4() {
    public override val `value`: String = "not_present"
  }

  /**
   * Documented value. Wire value: `present`.
   */
  public data object Present : InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4() {
    public override val `value`: String = "present"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4 = when (value) {
      NotPresent.value -> NotPresent
      Present.value -> Present
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4) {
      encoder.encodeString(value.value)
    }
  }
}
