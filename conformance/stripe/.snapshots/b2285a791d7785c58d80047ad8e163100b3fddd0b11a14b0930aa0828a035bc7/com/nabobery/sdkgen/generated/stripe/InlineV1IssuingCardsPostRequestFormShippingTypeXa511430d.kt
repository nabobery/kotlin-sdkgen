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
 * schema/properties/shipping/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/shipping/properties/type
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bulk`.
   */
  public data object Bulk : InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d() {
    public override val `value`: String = "bulk"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d = when (value) {
      Bulk.value -> Bulk
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormShippingTypeXa511430d) {
      encoder.encodeString(value.value)
    }
  }
}
