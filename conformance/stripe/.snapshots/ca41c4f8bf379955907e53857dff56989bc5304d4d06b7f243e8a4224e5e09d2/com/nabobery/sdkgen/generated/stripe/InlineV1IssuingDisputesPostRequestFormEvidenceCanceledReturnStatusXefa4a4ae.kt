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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/return_status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/return_status
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `merchant_rejected`.
   */
  public data object MerchantRejected : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae() {
    public override val `value`: String = "merchant_rejected"
  }

  /**
   * Documented value. Wire value: `successful`.
   */
  public data object Successful : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae() {
    public override val `value`: String = "successful"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae = when (value) {
      Value.value -> Value
      MerchantRejected.value -> MerchantRejected
      Successful.value -> Successful
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledReturnStatusXefa4a4ae) {
      encoder.encodeString(value.value)
    }
  }
}
