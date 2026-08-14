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
 * Result of cardholder's attempt to return the product.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_canceled_evidence/properties/return_status
 */
@Serializable(with = InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee.Serializer::class)
public sealed class InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merchant_rejected`.
   */
  public data object MerchantRejected : InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee() {
    public override val `value`: String = "merchant_rejected"
  }

  /**
   * Documented value. Wire value: `successful`.
   */
  public data object Successful : InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee() {
    public override val `value`: String = "successful"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee = when (value) {
      MerchantRejected.value -> MerchantRejected
      Successful.value -> Successful
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeCanceledEvidenceReturnStatusXcb1fe3ee) {
      encoder.encodeString(value.value)
    }
  }
}
