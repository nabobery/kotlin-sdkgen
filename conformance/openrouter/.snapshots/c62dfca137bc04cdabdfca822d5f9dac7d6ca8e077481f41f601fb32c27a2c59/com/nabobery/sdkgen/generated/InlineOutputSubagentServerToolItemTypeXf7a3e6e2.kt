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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputSubagentServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputSubagentServerToolItem/properties/type
 */
@Serializable(with = InlineOutputSubagentServerToolItemTypeXf7a3e6e2.Serializer::class)
public sealed class InlineOutputSubagentServerToolItemTypeXf7a3e6e2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:subagent`.
   */
  public data object OpenrouterSubagent : InlineOutputSubagentServerToolItemTypeXf7a3e6e2() {
    public override val `value`: String = "openrouter:subagent"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputSubagentServerToolItemTypeXf7a3e6e2()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputSubagentServerToolItemTypeXf7a3e6e2 = when (value) {
      OpenrouterSubagent.value -> OpenrouterSubagent
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputSubagentServerToolItemTypeXf7a3e6e2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputSubagentServerToolItemTypeXf7a3e6e2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputSubagentServerToolItemTypeXf7a3e6e2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputSubagentServerToolItemTypeXf7a3e6e2) {
      encoder.encodeString(value.value)
    }
  }
}
