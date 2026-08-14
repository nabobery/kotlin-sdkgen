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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PromptCacheOptions/properties/mode.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PromptCacheOptions/properties/mode
 */
@Serializable(with = InlinePromptCacheOptionsModeXa05de1e0.Serializer::class)
public sealed class InlinePromptCacheOptionsModeXa05de1e0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `explicit`.
   */
  public data object Explicit : InlinePromptCacheOptionsModeXa05de1e0() {
    public override val `value`: String = "explicit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePromptCacheOptionsModeXa05de1e0()

  public companion object {
    public fun fromValue(`value`: String): InlinePromptCacheOptionsModeXa05de1e0 = when (value) {
      Explicit.value -> Explicit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePromptCacheOptionsModeXa05de1e0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlinePromptCacheOptionsModeXa05de1e0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePromptCacheOptionsModeXa05de1e0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePromptCacheOptionsModeXa05de1e0) {
      encoder.encodeString(value.value)
    }
  }
}
