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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received/anyOf/0/properties/product_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received/anyOf/0/properties/product_type
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `merchandise`.
   */
  public data object Merchandise : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289() {
    public override val `value`: String = "merchandise"
  }

  /**
   * Documented value. Wire value: `service`.
   */
  public data object Service : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289() {
    public override val `value`: String = "service"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289 = when (value) {
      Value.value -> Value
      Merchandise.value -> Merchandise
      Service.value -> Service
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeX9ed03289) {
      encoder.encodeString(value.value)
    }
  }
}
