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
 * Dictates whether authorizations can be approved on this card. May be blocked from activating cards depending on
 * past-due Cardholder requirements. Defaults to `inactive`. If this card is being canceled because it was lost or
 * stolen, this information should be provided as `cancellation_reason`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/status
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormStatusX2c1e045b.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormStatusX2c1e045b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineV1IssuingCardsPostRequestFormStatusX2c1e045b() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1IssuingCardsPostRequestFormStatusX2c1e045b() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineV1IssuingCardsPostRequestFormStatusX2c1e045b() {
    public override val `value`: String = "inactive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormStatusX2c1e045b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormStatusX2c1e045b = when (value) {
      Active.value -> Active
      Canceled.value -> Canceled
      Inactive.value -> Inactive
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormStatusX2c1e045b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormStatusX2c1e045b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormStatusX2c1e045b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormStatusX2c1e045b) {
      encoder.encodeString(value.value)
    }
  }
}
