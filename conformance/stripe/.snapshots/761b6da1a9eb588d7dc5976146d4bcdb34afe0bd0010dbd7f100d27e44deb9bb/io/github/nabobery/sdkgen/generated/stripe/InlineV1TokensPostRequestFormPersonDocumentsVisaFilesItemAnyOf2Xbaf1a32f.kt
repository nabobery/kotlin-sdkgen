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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/visa/properties/files/items/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/visa/properties/files/items/anyOf/1
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemAnyOf2Xbaf1a32f.Serializer::class)
public sealed class InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemAnyOf2Xbaf1a32f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemAnyOf2Xbaf1a32f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemAnyOf2Xbaf1a32f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemAnyOf2Xbaf1a32f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemAnyOf2Xbaf1a32f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemAnyOf2Xbaf1a32f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemAnyOf2Xbaf1a32f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemAnyOf2Xbaf1a32f) {
      encoder.encodeString(value.value)
    }
  }
}
