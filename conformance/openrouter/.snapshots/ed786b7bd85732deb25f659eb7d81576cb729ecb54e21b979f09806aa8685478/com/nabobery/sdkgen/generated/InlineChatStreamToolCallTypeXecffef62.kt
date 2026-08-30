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
 * Tool call type
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatStreamToolCall/properties/type
 */
@Serializable(with = InlineChatStreamToolCallTypeXecffef62.Serializer::class)
public sealed class InlineChatStreamToolCallTypeXecffef62 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineChatStreamToolCallTypeXecffef62() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatStreamToolCallTypeXecffef62()

  public companion object {
    public fun fromValue(`value`: String): InlineChatStreamToolCallTypeXecffef62 = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatStreamToolCallTypeXecffef62> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatStreamToolCallTypeXecffef62", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatStreamToolCallTypeXecffef62 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatStreamToolCallTypeXecffef62) {
      encoder.encodeString(value.value)
    }
  }
}
