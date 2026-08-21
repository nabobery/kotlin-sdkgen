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
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates~1{shipping_rate_token}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates~1{shipping_rate_token}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527.Serializer::class)
public sealed class InlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527) {
      encoder.encodeString(value.value)
    }
  }
}
