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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links~1{link}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links~1{link}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1FileLinksPostRequestFormMetadataAnyOf2Xf4d0177f.Serializer::class)
public sealed class InlineV1FileLinksPostRequestFormMetadataAnyOf2Xf4d0177f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1FileLinksPostRequestFormMetadataAnyOf2Xf4d0177f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FileLinksPostRequestFormMetadataAnyOf2Xf4d0177f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FileLinksPostRequestFormMetadataAnyOf2Xf4d0177f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1FileLinksPostRequestFormMetadataAnyOf2Xf4d0177f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1FileLinksPostRequestFormMetadataAnyOf2Xf4d0177f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FileLinksPostRequestFormMetadataAnyOf2Xf4d0177f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FileLinksPostRequestFormMetadataAnyOf2Xf4d0177f) {
      encoder.encodeString(value.value)
    }
  }
}
