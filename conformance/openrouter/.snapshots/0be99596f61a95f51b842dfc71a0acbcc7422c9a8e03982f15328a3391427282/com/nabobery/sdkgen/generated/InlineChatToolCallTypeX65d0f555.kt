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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolCall/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatToolCall/properties/type
 */
@Serializable(with = InlineChatToolCallTypeX65d0f555.Serializer::class)
public sealed class InlineChatToolCallTypeX65d0f555 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineChatToolCallTypeX65d0f555() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatToolCallTypeX65d0f555()

  public companion object {
    public fun fromValue(`value`: String): InlineChatToolCallTypeX65d0f555 = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatToolCallTypeX65d0f555> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatToolCallTypeX65d0f555", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatToolCallTypeX65d0f555 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatToolCallTypeX65d0f555) {
      encoder.encodeString(value.value)
    }
  }
}
