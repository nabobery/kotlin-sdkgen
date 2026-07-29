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
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons~1{coupon}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons~1{coupon}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252.Serializer::class)
public sealed class InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252) {
      encoder.encodeString(value.value)
    }
  }
}
