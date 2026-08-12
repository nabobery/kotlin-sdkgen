package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Type of information to display. Only `cart` is currently supported.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1set_reader_display/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/type
 */
@Serializable(with = InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376.Serializer::class)
public sealed class InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cart`.
   */
  public data object Cart : InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376() {
    public override val `value`: String = "cart"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376 = when (value) {
      Cart.value -> Cart
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376) {
      encoder.encodeString(value.value)
    }
  }
}
