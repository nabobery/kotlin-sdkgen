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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_merchandise_not_as_described_evidence/properties/ret
 * urn_status
 */
@Serializable(with = InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985.Serializer::class)
public sealed class InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merchant_rejected`.
   */
  public data object MerchantRejected : InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985() {
    public override val `value`: String = "merchant_rejected"
  }

  /**
   * Documented value. Wire value: `successful`.
   */
  public data object Successful : InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985() {
    public override val `value`: String = "successful"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985 = when (value) {
      MerchantRejected.value -> MerchantRejected
      Successful.value -> Successful
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeMerchandiseNotAsDescribedEvidenceReturnStatusXec050985) {
      encoder.encodeString(value.value)
    }
  }
}
