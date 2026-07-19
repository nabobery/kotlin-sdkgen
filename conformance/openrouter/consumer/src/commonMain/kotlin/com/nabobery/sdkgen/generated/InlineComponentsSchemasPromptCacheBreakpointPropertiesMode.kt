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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PromptCacheBreakpoint/properties/mode.
 */
@Serializable(with = InlineComponentsSchemasPromptCacheBreakpointPropertiesMode.Serializer::class)
public sealed class InlineComponentsSchemasPromptCacheBreakpointPropertiesMode {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `explicit`.
   */
  public data object Explicit : InlineComponentsSchemasPromptCacheBreakpointPropertiesMode() {
    public override val `value`: String = "explicit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasPromptCacheBreakpointPropertiesMode()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasPromptCacheBreakpointPropertiesMode = when (value) {
      Explicit.value -> Explicit
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPromptCacheBreakpointPropertiesMode> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasPromptCacheBreakpointPropertiesMode", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPromptCacheBreakpointPropertiesMode =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasPromptCacheBreakpointPropertiesMode) {
      encoder.encodeString(value.value)
    }
  }
}
