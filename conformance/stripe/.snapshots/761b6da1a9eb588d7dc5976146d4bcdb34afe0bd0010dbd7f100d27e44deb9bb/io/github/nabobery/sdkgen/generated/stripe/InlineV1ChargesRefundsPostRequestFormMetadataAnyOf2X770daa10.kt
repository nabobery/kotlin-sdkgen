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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds~1{refund}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds~1{refund}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10.Serializer::class)
public sealed class InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10) {
      encoder.encodeString(value.value)
    }
  }
}
