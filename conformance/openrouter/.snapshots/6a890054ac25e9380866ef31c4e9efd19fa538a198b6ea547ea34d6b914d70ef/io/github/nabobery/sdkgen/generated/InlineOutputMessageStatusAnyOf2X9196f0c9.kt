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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status/anyOf/1
 */
@Serializable(with = InlineOutputMessageStatusAnyOf2X9196f0c9.Serializer::class)
public sealed class InlineOutputMessageStatusAnyOf2X9196f0c9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineOutputMessageStatusAnyOf2X9196f0c9() {
    public override val `value`: String = "incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMessageStatusAnyOf2X9196f0c9()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMessageStatusAnyOf2X9196f0c9 = when (value) {
      Incomplete.value -> Incomplete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessageStatusAnyOf2X9196f0c9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputMessageStatusAnyOf2X9196f0c9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMessageStatusAnyOf2X9196f0c9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessageStatusAnyOf2X9196f0c9) {
      encoder.encodeString(value.value)
    }
  }
}
