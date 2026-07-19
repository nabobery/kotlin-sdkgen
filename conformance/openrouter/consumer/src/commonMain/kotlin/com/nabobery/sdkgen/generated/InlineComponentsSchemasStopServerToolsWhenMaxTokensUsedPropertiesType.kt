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
 * sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenMaxTokensUsed/properties/type.
 */
@Serializable(with = InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_tokens_used`.
   */
  public data object MaxTokensUsed : InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType() {
    public override val `value`: String = "max_tokens_used"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType =
      when (value) {
      MaxTokensUsed.value -> MaxTokensUsed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasStopServerToolsWhenMaxTokensUsedPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
