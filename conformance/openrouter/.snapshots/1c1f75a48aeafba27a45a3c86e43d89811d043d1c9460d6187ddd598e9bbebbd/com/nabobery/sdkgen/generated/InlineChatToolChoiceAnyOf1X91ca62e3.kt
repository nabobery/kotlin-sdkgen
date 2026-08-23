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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice/anyOf/0
 */
@Serializable(with = InlineChatToolChoiceAnyOf1X91ca62e3.Serializer::class)
public sealed class InlineChatToolChoiceAnyOf1X91ca62e3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineChatToolChoiceAnyOf1X91ca62e3() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatToolChoiceAnyOf1X91ca62e3()

  public companion object {
    public fun fromValue(`value`: String): InlineChatToolChoiceAnyOf1X91ca62e3 = when (value) {
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatToolChoiceAnyOf1X91ca62e3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatToolChoiceAnyOf1X91ca62e3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatToolChoiceAnyOf1X91ca62e3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatToolChoiceAnyOf1X91ca62e3) {
      encoder.encodeString(value.value)
    }
  }
}
