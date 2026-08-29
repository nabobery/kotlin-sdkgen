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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status/anyOf/0
 */
@Serializable(with = InlineOutputMessageStatusAnyOf1X07bfa0d6.Serializer::class)
public sealed class InlineOutputMessageStatusAnyOf1X07bfa0d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineOutputMessageStatusAnyOf1X07bfa0d6() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMessageStatusAnyOf1X07bfa0d6()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMessageStatusAnyOf1X07bfa0d6 = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessageStatusAnyOf1X07bfa0d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputMessageStatusAnyOf1X07bfa0d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMessageStatusAnyOf1X07bfa0d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessageStatusAnyOf1X07bfa0d6) {
      encoder.encodeString(value.value)
    }
  }
}
