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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicFileDocumentSource/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicFileDocumentSource/properties/type
 */
@Serializable(with = InlineAnthropicFileDocumentSourceTypeX87400e76.Serializer::class)
public sealed class InlineAnthropicFileDocumentSourceTypeX87400e76 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineAnthropicFileDocumentSourceTypeX87400e76() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicFileDocumentSourceTypeX87400e76()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicFileDocumentSourceTypeX87400e76 = when (value) {
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicFileDocumentSourceTypeX87400e76> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicFileDocumentSourceTypeX87400e76", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicFileDocumentSourceTypeX87400e76 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicFileDocumentSourceTypeX87400e76) {
      encoder.encodeString(value.value)
    }
  }
}
