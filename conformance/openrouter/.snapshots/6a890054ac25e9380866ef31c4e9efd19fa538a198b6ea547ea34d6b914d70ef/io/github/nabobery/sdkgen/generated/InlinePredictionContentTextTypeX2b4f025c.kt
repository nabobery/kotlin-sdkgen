package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PredictionContentText/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PredictionContentText/properties/type
 */
@Serializable(with = InlinePredictionContentTextTypeX2b4f025c.Serializer::class)
public sealed class InlinePredictionContentTextTypeX2b4f025c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlinePredictionContentTextTypeX2b4f025c() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePredictionContentTextTypeX2b4f025c()

  public companion object {
    public fun fromValue(`value`: String): InlinePredictionContentTextTypeX2b4f025c = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePredictionContentTextTypeX2b4f025c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlinePredictionContentTextTypeX2b4f025c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePredictionContentTextTypeX2b4f025c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePredictionContentTextTypeX2b4f025c) {
      encoder.encodeString(value.value)
    }
  }
}
