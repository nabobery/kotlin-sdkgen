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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PromptCacheBreakpoint/properties/mode.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PromptCacheBreakpoint/properties/mode
 */
@Serializable(with = InlinePromptCacheBreakpointModeX7348b3f4.Serializer::class)
public sealed class InlinePromptCacheBreakpointModeX7348b3f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `explicit`.
   */
  public data object Explicit : InlinePromptCacheBreakpointModeX7348b3f4() {
    public override val `value`: String = "explicit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePromptCacheBreakpointModeX7348b3f4()

  public companion object {
    public fun fromValue(`value`: String): InlinePromptCacheBreakpointModeX7348b3f4 = when (value) {
      Explicit.value -> Explicit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePromptCacheBreakpointModeX7348b3f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlinePromptCacheBreakpointModeX7348b3f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePromptCacheBreakpointModeX7348b3f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePromptCacheBreakpointModeX7348b3f4) {
      encoder.encodeString(value.value)
    }
  }
}
