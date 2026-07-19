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
 * Selects the reasoning mode. `standard` is the default; `pro` engages deeper reasoning on models that support it,
 * billed at standard token rates. Only supported by OpenAI GPT-5.6 and newer.
 */
@Serializable(with = ReasoningMode.Serializer::class)
public sealed class ReasoningMode {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : ReasoningMode() {
    public override val `value`: String = "standard"
  }

  /**
   * Documented value. Wire value: `pro`.
   */
  public data object Pro : ReasoningMode() {
    public override val `value`: String = "pro"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ReasoningMode()

  public companion object {
    public fun fromValue(`value`: String): ReasoningMode = when (value) {
      Standard.value -> Standard
      Pro.value -> Pro
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<ReasoningMode> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ReasoningMode", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ReasoningMode = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ReasoningMode) {
      encoder.encodeString(value.value)
    }
  }
}
