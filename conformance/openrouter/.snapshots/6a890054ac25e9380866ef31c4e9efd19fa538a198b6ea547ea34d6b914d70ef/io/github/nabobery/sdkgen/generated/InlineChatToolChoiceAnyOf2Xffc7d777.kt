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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice/anyOf/1
 */
@Serializable(with = InlineChatToolChoiceAnyOf2Xffc7d777.Serializer::class)
public sealed class InlineChatToolChoiceAnyOf2Xffc7d777 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineChatToolChoiceAnyOf2Xffc7d777() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatToolChoiceAnyOf2Xffc7d777()

  public companion object {
    public fun fromValue(`value`: String): InlineChatToolChoiceAnyOf2Xffc7d777 = when (value) {
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatToolChoiceAnyOf2Xffc7d777> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatToolChoiceAnyOf2Xffc7d777", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatToolChoiceAnyOf2Xffc7d777 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatToolChoiceAnyOf2Xffc7d777) {
      encoder.encodeString(value.value)
    }
  }
}
