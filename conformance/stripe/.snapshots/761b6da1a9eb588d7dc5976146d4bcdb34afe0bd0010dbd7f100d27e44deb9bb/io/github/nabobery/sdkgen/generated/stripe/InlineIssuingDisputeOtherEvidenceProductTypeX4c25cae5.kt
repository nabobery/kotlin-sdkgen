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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_other_evidence/properties/product_type
 */
@Serializable(with = InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5.Serializer::class)
public sealed class InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merchandise`.
   */
  public data object Merchandise : InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5() {
    public override val `value`: String = "merchandise"
  }

  /**
   * Documented value. Wire value: `service`.
   */
  public data object Service : InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5() {
    public override val `value`: String = "service"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5 = when (value) {
      Merchandise.value -> Merchandise
      Service.value -> Service
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeOtherEvidenceProductTypeX4c25cae5) {
      encoder.encodeString(value.value)
    }
  }
}
