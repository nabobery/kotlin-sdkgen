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
 * Current status of the dispute.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.dispute/properties/status
 */
@Serializable(with = InlineIssuingDisputeStatusXedda5fca.Serializer::class)
public sealed class InlineIssuingDisputeStatusXedda5fca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineIssuingDisputeStatusXedda5fca() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `lost`.
   */
  public data object Lost : InlineIssuingDisputeStatusXedda5fca() {
    public override val `value`: String = "lost"
  }

  /**
   * Documented value. Wire value: `submitted`.
   */
  public data object Submitted : InlineIssuingDisputeStatusXedda5fca() {
    public override val `value`: String = "submitted"
  }

  /**
   * Documented value. Wire value: `unsubmitted`.
   */
  public data object Unsubmitted : InlineIssuingDisputeStatusXedda5fca() {
    public override val `value`: String = "unsubmitted"
  }

  /**
   * Documented value. Wire value: `won`.
   */
  public data object Won : InlineIssuingDisputeStatusXedda5fca() {
    public override val `value`: String = "won"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingDisputeStatusXedda5fca()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingDisputeStatusXedda5fca = when (value) {
      Expired.value -> Expired
      Lost.value -> Lost
      Submitted.value -> Submitted
      Unsubmitted.value -> Unsubmitted
      Won.value -> Won
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingDisputeStatusXedda5fca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingDisputeStatusXedda5fca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeStatusXedda5fca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeStatusXedda5fca) {
      encoder.encodeString(value.value)
    }
  }
}
