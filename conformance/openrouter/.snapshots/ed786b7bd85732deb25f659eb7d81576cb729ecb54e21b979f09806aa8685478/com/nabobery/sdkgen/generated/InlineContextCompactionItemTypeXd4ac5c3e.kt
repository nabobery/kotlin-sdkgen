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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContextCompactionItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContextCompactionItem/properties/type
 */
@Serializable(with = InlineContextCompactionItemTypeXd4ac5c3e.Serializer::class)
public sealed class InlineContextCompactionItemTypeXd4ac5c3e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `context_compaction`.
   */
  public data object ContextCompaction : InlineContextCompactionItemTypeXd4ac5c3e() {
    public override val `value`: String = "context_compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContextCompactionItemTypeXd4ac5c3e()

  public companion object {
    public fun fromValue(`value`: String): InlineContextCompactionItemTypeXd4ac5c3e = when (value) {
      ContextCompaction.value -> ContextCompaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContextCompactionItemTypeXd4ac5c3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineContextCompactionItemTypeXd4ac5c3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContextCompactionItemTypeXd4ac5c3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContextCompactionItemTypeXd4ac5c3e) {
      encoder.encodeString(value.value)
    }
  }
}
