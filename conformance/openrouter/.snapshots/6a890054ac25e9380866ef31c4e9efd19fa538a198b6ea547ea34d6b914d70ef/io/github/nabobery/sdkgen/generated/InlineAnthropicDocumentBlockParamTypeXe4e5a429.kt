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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/type
 */
@Serializable(with = InlineAnthropicDocumentBlockParamTypeXe4e5a429.Serializer::class)
public sealed class InlineAnthropicDocumentBlockParamTypeXe4e5a429 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `document`.
   */
  public data object Document : InlineAnthropicDocumentBlockParamTypeXe4e5a429() {
    public override val `value`: String = "document"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicDocumentBlockParamTypeXe4e5a429()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicDocumentBlockParamTypeXe4e5a429 = when (value) {
      Document.value -> Document
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicDocumentBlockParamTypeXe4e5a429> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicDocumentBlockParamTypeXe4e5a429", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicDocumentBlockParamTypeXe4e5a429 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicDocumentBlockParamTypeXe4e5a429) {
      encoder.encodeString(value.value)
    }
  }
}
