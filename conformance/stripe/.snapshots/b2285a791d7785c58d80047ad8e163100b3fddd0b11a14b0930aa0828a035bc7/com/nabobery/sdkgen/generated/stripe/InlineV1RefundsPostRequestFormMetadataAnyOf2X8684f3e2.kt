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
 * sdkgen://source/openapi.json#/paths/~1v1~1refunds~1{refund}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1refunds~1{refund}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2.Serializer::class)
public sealed class InlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2) {
      encoder.encodeString(value.value)
    }
  }
}
