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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f.Serializer::class)
public sealed class InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f) {
      encoder.encodeString(value.value)
    }
  }
}
