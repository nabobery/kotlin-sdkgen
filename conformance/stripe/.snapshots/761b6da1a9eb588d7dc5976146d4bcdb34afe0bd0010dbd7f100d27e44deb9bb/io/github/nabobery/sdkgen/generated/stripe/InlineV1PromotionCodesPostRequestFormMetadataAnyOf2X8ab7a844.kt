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
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes~1{promotion_code}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes~1{promotion_code}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844.Serializer::class)
public sealed class InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844) {
      encoder.encodeString(value.value)
    }
  }
}
