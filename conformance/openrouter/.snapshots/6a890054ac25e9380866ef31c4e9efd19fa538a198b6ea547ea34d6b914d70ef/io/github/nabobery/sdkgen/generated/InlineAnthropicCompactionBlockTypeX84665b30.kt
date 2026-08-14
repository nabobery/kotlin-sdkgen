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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionBlock/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionBlock/properties/type
 */
@Serializable(with = InlineAnthropicCompactionBlockTypeX84665b30.Serializer::class)
public sealed class InlineAnthropicCompactionBlockTypeX84665b30 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `compaction`.
   */
  public data object Compaction : InlineAnthropicCompactionBlockTypeX84665b30() {
    public override val `value`: String = "compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCompactionBlockTypeX84665b30()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCompactionBlockTypeX84665b30 = when (value) {
      Compaction.value -> Compaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCompactionBlockTypeX84665b30> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCompactionBlockTypeX84665b30", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCompactionBlockTypeX84665b30 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCompactionBlockTypeX84665b30) {
      encoder.encodeString(value.value)
    }
  }
}
