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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesTruncation.
 */
@Serializable(with = OpenAiResponsesTruncation.Serializer::class)
public sealed class OpenAiResponsesTruncation {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : OpenAiResponsesTruncation() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : OpenAiResponsesTruncation() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : OpenAiResponsesTruncation()

  public companion object {
    public fun fromValue(`value`: String): OpenAiResponsesTruncation = when (value) {
      Auto.value -> Auto
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<OpenAiResponsesTruncation> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.OpenAiResponsesTruncation", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): OpenAiResponsesTruncation = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: OpenAiResponsesTruncation) {
      encoder.encodeString(value.value)
    }
  }
}
