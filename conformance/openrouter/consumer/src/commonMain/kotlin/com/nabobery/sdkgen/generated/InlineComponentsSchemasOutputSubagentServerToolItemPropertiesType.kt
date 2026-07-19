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
 */
@Serializable(with = InlineComponentsSchemasOutputSubagentServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputSubagentServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:subagent`.
   */
  public data object OpenrouterSubagent : InlineComponentsSchemasOutputSubagentServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:subagent"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputSubagentServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputSubagentServerToolItemPropertiesType =
      when (value) {
      OpenrouterSubagent.value -> OpenrouterSubagent
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputSubagentServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputSubagentServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputSubagentServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputSubagentServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
