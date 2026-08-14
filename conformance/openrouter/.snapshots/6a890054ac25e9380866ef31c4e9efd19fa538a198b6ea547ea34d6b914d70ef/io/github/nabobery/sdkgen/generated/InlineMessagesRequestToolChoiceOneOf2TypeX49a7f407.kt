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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/1/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/1/properties/type
 */
@Serializable(with = InlineMessagesRequestToolChoiceOneOf2TypeX49a7f407.Serializer::class)
public sealed class InlineMessagesRequestToolChoiceOneOf2TypeX49a7f407 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `any`.
   */
  public data object Any : InlineMessagesRequestToolChoiceOneOf2TypeX49a7f407() {
    public override val `value`: String = "any"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolChoiceOneOf2TypeX49a7f407()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolChoiceOneOf2TypeX49a7f407 = when (value) {
      Any.value -> Any
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolChoiceOneOf2TypeX49a7f407> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesRequestToolChoiceOneOf2TypeX49a7f407", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolChoiceOneOf2TypeX49a7f407 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolChoiceOneOf2TypeX49a7f407) {
      encoder.encodeString(value.value)
    }
  }
}
