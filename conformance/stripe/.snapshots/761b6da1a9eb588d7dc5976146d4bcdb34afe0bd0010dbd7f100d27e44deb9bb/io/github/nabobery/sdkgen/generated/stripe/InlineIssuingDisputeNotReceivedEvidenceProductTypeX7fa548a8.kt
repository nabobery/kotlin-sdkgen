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
 * Whether the product was a merchandise or service.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_not_received_evidence/properties/product_type
 */
@Serializable(with = InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8.Serializer::class)
public sealed class InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merchandise`.
   */
  public data object Merchandise : InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8() {
    public override val `value`: String = "merchandise"
  }

  /**
   * Documented value. Wire value: `service`.
   */
  public data object Service : InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8() {
    public override val `value`: String = "service"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8 = when (value) {
      Merchandise.value -> Merchandise
      Service.value -> Service
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeNotReceivedEvidenceProductTypeX7fa548a8) {
      encoder.encodeString(value.value)
    }
  }
}
