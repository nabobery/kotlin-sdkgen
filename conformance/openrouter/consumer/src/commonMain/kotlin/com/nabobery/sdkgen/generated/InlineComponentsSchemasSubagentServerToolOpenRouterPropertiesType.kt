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
 */
@Serializable(with = InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:subagent`.
   */
  public data object OpenrouterSubagent : InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType() {
    public override val `value`: String = "openrouter:subagent"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType =
      when (value) {
      OpenrouterSubagent.value -> OpenrouterSubagent
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasSubagentServerToolOpenRouterPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
