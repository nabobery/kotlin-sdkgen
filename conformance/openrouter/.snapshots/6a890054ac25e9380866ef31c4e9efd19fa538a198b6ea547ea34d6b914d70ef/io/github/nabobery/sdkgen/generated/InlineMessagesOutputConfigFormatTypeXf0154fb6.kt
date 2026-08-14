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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesOutputConfig/properties/format/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesOutputConfig/properties/format/properties/type
 */
@Serializable(with = InlineMessagesOutputConfigFormatTypeXf0154fb6.Serializer::class)
public sealed class InlineMessagesOutputConfigFormatTypeXf0154fb6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_schema`.
   */
  public data object JsonSchema : InlineMessagesOutputConfigFormatTypeXf0154fb6() {
    public override val `value`: String = "json_schema"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesOutputConfigFormatTypeXf0154fb6()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesOutputConfigFormatTypeXf0154fb6 = when (value) {
      JsonSchema.value -> JsonSchema
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesOutputConfigFormatTypeXf0154fb6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesOutputConfigFormatTypeXf0154fb6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesOutputConfigFormatTypeXf0154fb6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesOutputConfigFormatTypeXf0154fb6) {
      encoder.encodeString(value.value)
    }
  }
}
