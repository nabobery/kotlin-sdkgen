package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/Prediction/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Prediction/properties/type
 */
@Serializable(with = InlinePredictionTypeX161c578b.Serializer::class)
public sealed class InlinePredictionTypeX161c578b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content`.
   */
  public data object Content : InlinePredictionTypeX161c578b() {
    public override val `value`: String = "content"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePredictionTypeX161c578b()

  public companion object {
    public fun fromValue(`value`: String): InlinePredictionTypeX161c578b = when (value) {
      Content.value -> Content
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePredictionTypeX161c578b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePredictionTypeX161c578b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePredictionTypeX161c578b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePredictionTypeX161c578b) {
      encoder.encodeString(value.value)
    }
  }
}
