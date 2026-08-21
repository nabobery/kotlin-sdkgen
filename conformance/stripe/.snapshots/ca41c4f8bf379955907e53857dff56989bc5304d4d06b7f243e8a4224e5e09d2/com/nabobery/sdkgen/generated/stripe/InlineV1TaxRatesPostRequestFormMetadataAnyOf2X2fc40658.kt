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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_rates~1{tax_rate}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_rates~1{tax_rate}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658.Serializer::class)
public sealed class InlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658) {
      encoder.encodeString(value.value)
    }
  }
}
