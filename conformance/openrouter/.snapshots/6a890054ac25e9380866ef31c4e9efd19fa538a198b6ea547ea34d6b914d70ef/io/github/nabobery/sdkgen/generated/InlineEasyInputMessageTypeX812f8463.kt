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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/type
 */
@Serializable(with = InlineEasyInputMessageTypeX812f8463.Serializer::class)
public sealed class InlineEasyInputMessageTypeX812f8463 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineEasyInputMessageTypeX812f8463() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEasyInputMessageTypeX812f8463()

  public companion object {
    public fun fromValue(`value`: String): InlineEasyInputMessageTypeX812f8463 = when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessageTypeX812f8463> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineEasyInputMessageTypeX812f8463", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEasyInputMessageTypeX812f8463 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessageTypeX812f8463) {
      encoder.encodeString(value.value)
    }
  }
}
