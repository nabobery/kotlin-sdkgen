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
 * encoded/schema/properties/shipping/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping/properties/type
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bulk`.
   */
  public data object Bulk : InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3() {
    public override val `value`: String = "bulk"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3 = when (value) {
      Bulk.value -> Bulk
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormShippingTypeXa94242c3) {
      encoder.encodeString(value.value)
    }
  }
}
