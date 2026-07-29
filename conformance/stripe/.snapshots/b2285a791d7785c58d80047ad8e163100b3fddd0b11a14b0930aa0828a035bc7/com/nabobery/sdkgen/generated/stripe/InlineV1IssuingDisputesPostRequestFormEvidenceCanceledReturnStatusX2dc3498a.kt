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
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/return_status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/return_status
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `merchant_rejected`.
   */
  public data object MerchantRejected : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a() {
    public override val `value`: String = "merchant_rejected"
  }

  /**
   * Documented value. Wire value: `successful`.
   */
  public data object Successful : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a() {
    public override val `value`: String = "successful"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a = when (value) {
      Value.value -> Value
      MerchantRejected.value -> MerchantRejected
      Successful.value -> Successful
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusX2dc3498a) {
      encoder.encodeString(value.value)
    }
  }
}
