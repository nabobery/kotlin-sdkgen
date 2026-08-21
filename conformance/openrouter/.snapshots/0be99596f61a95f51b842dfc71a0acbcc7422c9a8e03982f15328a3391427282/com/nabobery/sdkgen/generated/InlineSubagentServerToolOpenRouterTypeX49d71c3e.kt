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
 * sdkgen://source/openapi.yaml#/components/schemas/SubagentServerTool_OpenRouter/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SubagentServerTool_OpenRouter/properties/type
 */
@Serializable(with = InlineSubagentServerToolOpenRouterTypeX49d71c3e.Serializer::class)
public sealed class InlineSubagentServerToolOpenRouterTypeX49d71c3e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:subagent`.
   */
  public data object OpenrouterSubagent : InlineSubagentServerToolOpenRouterTypeX49d71c3e() {
    public override val `value`: String = "openrouter:subagent"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubagentServerToolOpenRouterTypeX49d71c3e()

  public companion object {
    public fun fromValue(`value`: String): InlineSubagentServerToolOpenRouterTypeX49d71c3e = when (value) {
      OpenrouterSubagent.value -> OpenrouterSubagent
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubagentServerToolOpenRouterTypeX49d71c3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineSubagentServerToolOpenRouterTypeX49d71c3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubagentServerToolOpenRouterTypeX49d71c3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubagentServerToolOpenRouterTypeX49d71c3e) {
      encoder.encodeString(value.value)
    }
  }
}
