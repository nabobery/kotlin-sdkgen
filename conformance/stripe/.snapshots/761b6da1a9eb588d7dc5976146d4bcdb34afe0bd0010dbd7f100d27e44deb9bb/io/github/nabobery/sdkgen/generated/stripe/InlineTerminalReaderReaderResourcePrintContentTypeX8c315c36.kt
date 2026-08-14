package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The type of content to print. Currently supports `image`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_print_content/properties/type
 */
@Serializable(with = InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36.Serializer::class)
public sealed class InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36() {
    public override val `value`: String = "image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36 = when (value) {
      Image.value -> Image
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36) {
      encoder.encodeString(value.value)
    }
  }
}
