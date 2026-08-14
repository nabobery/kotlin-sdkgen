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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6.Serializer::class)
public sealed class InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6) {
      encoder.encodeString(value.value)
    }
  }
}
