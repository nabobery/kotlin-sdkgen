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
 * schema/properties/second_line/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/second_line/anyOf/1
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d) {
      encoder.encodeString(value.value)
    }
  }
}
