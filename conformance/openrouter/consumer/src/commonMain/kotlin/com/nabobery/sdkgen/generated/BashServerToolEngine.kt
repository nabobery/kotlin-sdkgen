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
 * Which bash engine to use. "openrouter" runs commands server-side in the OpenRouter sandbox. "auto" (default) and
 * "native" use native passthrough, returning the tool call to your application to run client-side; OpenRouter does not
 * execute the commands.
 */
@Serializable(with = BashServerToolEngine.Serializer::class)
public sealed class BashServerToolEngine {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : BashServerToolEngine() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `native`.
   */
  public data object Native : BashServerToolEngine() {
    public override val `value`: String = "native"
  }

  /**
   * Documented value. Wire value: `openrouter`.
   */
  public data object Openrouter : BashServerToolEngine() {
    public override val `value`: String = "openrouter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : BashServerToolEngine()

  public companion object {
    public fun fromValue(`value`: String): BashServerToolEngine = when (value) {
      Auto.value -> Auto
      Native.value -> Native
      Openrouter.value -> Openrouter
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<BashServerToolEngine> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.BashServerToolEngine", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): BashServerToolEngine = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: BashServerToolEngine) {
      encoder.encodeString(value.value)
    }
  }
}
