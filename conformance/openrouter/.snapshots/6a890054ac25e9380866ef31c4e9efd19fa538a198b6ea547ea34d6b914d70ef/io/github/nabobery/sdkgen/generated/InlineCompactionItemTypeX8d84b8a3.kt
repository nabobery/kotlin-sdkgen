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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CompactionItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CompactionItem/properties/type
 */
@Serializable(with = InlineCompactionItemTypeX8d84b8a3.Serializer::class)
public sealed class InlineCompactionItemTypeX8d84b8a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `compaction`.
   */
  public data object Compaction : InlineCompactionItemTypeX8d84b8a3() {
    public override val `value`: String = "compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCompactionItemTypeX8d84b8a3()

  public companion object {
    public fun fromValue(`value`: String): InlineCompactionItemTypeX8d84b8a3 = when (value) {
      Compaction.value -> Compaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCompactionItemTypeX8d84b8a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineCompactionItemTypeX8d84b8a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCompactionItemTypeX8d84b8a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCompactionItemTypeX8d84b8a3) {
      encoder.encodeString(value.value)
    }
  }
}
