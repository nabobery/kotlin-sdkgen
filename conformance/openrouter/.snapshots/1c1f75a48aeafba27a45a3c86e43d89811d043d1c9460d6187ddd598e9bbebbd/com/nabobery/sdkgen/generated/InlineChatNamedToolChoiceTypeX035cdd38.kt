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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatNamedToolChoice/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatNamedToolChoice/properties/type
 */
@Serializable(with = InlineChatNamedToolChoiceTypeX035cdd38.Serializer::class)
public sealed class InlineChatNamedToolChoiceTypeX035cdd38 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineChatNamedToolChoiceTypeX035cdd38() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatNamedToolChoiceTypeX035cdd38()

  public companion object {
    public fun fromValue(`value`: String): InlineChatNamedToolChoiceTypeX035cdd38 = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatNamedToolChoiceTypeX035cdd38> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatNamedToolChoiceTypeX035cdd38", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatNamedToolChoiceTypeX035cdd38 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatNamedToolChoiceTypeX035cdd38) {
      encoder.encodeString(value.value)
    }
  }
}
