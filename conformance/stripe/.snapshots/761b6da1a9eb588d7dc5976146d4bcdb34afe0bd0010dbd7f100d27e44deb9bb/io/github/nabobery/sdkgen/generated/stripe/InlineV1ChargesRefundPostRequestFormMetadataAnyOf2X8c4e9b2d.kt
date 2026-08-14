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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refund/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refund/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d.Serializer::class)
public sealed class InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d) {
      encoder.encodeString(value.value)
    }
  }
}
