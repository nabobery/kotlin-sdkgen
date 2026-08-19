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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlock/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlock/properties/type
 */
@Serializable(with = InlineAnthropicDocumentBlockTypeX02c563ca.Serializer::class)
public sealed class InlineAnthropicDocumentBlockTypeX02c563ca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `document`.
   */
  public data object Document : InlineAnthropicDocumentBlockTypeX02c563ca() {
    public override val `value`: String = "document"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicDocumentBlockTypeX02c563ca()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicDocumentBlockTypeX02c563ca = when (value) {
      Document.value -> Document
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicDocumentBlockTypeX02c563ca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicDocumentBlockTypeX02c563ca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicDocumentBlockTypeX02c563ca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicDocumentBlockTypeX02c563ca) {
      encoder.encodeString(value.value)
    }
  }
}
