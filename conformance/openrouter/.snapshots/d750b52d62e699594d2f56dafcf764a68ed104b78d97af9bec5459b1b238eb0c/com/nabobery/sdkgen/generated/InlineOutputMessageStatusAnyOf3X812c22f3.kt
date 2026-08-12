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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status/anyOf/2
 */
@Serializable(with = InlineOutputMessageStatusAnyOf3X812c22f3.Serializer::class)
public sealed class InlineOutputMessageStatusAnyOf3X812c22f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineOutputMessageStatusAnyOf3X812c22f3() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMessageStatusAnyOf3X812c22f3()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMessageStatusAnyOf3X812c22f3 = when (value) {
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessageStatusAnyOf3X812c22f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputMessageStatusAnyOf3X812c22f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMessageStatusAnyOf3X812c22f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessageStatusAnyOf3X812c22f3) {
      encoder.encodeString(value.value)
    }
  }
}
