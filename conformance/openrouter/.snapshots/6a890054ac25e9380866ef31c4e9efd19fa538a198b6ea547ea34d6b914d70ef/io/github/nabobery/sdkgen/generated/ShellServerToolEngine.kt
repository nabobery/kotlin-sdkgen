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
 * Which shell engine to use. "openrouter" runs commands server-side in the OpenRouter sandbox. "auto" (default) keeps
 * the provider's native hosted shell when available (OpenAI); on other providers the call is routed to the OpenRouter
 * sandbox.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ShellServerToolEngine
 */
@Serializable(with = ShellServerToolEngine.Serializer::class)
public sealed class ShellServerToolEngine {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : ShellServerToolEngine() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `openrouter`.
   */
  public data object Openrouter : ShellServerToolEngine() {
    public override val `value`: String = "openrouter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ShellServerToolEngine()

  public companion object {
    public fun fromValue(`value`: String): ShellServerToolEngine = when (value) {
      Auto.value -> Auto
      Openrouter.value -> Openrouter
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ShellServerToolEngine> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.ShellServerToolEngine", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ShellServerToolEngine = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ShellServerToolEngine) {
      encoder.encodeString(value.value)
    }
  }
}
