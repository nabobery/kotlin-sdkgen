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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/phase/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/phase/anyOf/0
 */
@Serializable(with = InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7.Serializer::class)
public sealed class InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `commentary`.
   */
  public data object Commentary : InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7() {
    public override val `value`: String = "commentary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7()

  public companion object {
    public fun fromValue(`value`: String): InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7 = when (value) {
      Commentary.value -> Commentary
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7) {
      encoder.encodeString(value.value)
    }
  }
}
