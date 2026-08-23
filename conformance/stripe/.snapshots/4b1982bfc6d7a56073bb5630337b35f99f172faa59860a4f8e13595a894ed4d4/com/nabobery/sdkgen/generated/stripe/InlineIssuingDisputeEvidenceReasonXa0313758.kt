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
 * The reason for filing the dispute. Its value will match the field containing the evidence.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_evidence/properties/reason
 */
@Serializable(with = InlineIssuingDisputeEvidenceReasonXa0313758.Serializer::class)
public sealed class InlineIssuingDisputeEvidenceReasonXa0313758 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineIssuingDisputeEvidenceReasonXa0313758() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineIssuingDisputeEvidenceReasonXa0313758() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `fraudulent`.
   */
  public data object Fraudulent : InlineIssuingDisputeEvidenceReasonXa0313758() {
    public override val `value`: String = "fraudulent"
  }

  /**
   * Documented value. Wire value: `merchandise_not_as_described`.
   */
  public data object MerchandiseNotAsDescribed : InlineIssuingDisputeEvidenceReasonXa0313758() {
    public override val `value`: String = "merchandise_not_as_described"
  }

  /**
   * Documented value. Wire value: `no_valid_authorization`.
   */
  public data object NoValidAuthorization : InlineIssuingDisputeEvidenceReasonXa0313758() {
    public override val `value`: String = "no_valid_authorization"
  }

  /**
   * Documented value. Wire value: `not_received`.
   */
  public data object NotReceived : InlineIssuingDisputeEvidenceReasonXa0313758() {
    public override val `value`: String = "not_received"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineIssuingDisputeEvidenceReasonXa0313758() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `service_not_as_described`.
   */
  public data object ServiceNotAsDescribed : InlineIssuingDisputeEvidenceReasonXa0313758() {
    public override val `value`: String = "service_not_as_described"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingDisputeEvidenceReasonXa0313758()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingDisputeEvidenceReasonXa0313758 = when (value) {
      Canceled.value -> Canceled
      Duplicate.value -> Duplicate
      Fraudulent.value -> Fraudulent
      MerchandiseNotAsDescribed.value -> MerchandiseNotAsDescribed
      NoValidAuthorization.value -> NoValidAuthorization
      NotReceived.value -> NotReceived
      Other.value -> Other
      ServiceNotAsDescribed.value -> ServiceNotAsDescribed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeEvidenceReasonXa0313758> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingDisputeEvidenceReasonXa0313758", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeEvidenceReasonXa0313758 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeEvidenceReasonXa0313758) {
      encoder.encodeString(value.value)
    }
  }
}
