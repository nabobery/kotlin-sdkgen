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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseMessagesResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseMessagesResult/properties/type
 */
@Serializable(with = InlineBaseMessagesResultTypeXf865734d.Serializer::class)
public sealed class InlineBaseMessagesResultTypeXf865734d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineBaseMessagesResultTypeXf865734d() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseMessagesResultTypeXf865734d()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseMessagesResultTypeXf865734d = when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseMessagesResultTypeXf865734d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseMessagesResultTypeXf865734d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseMessagesResultTypeXf865734d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseMessagesResultTypeXf865734d) {
      encoder.encodeString(value.value)
    }
  }
}
