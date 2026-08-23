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
 * Set if a ReceivedDebit can't be reversed.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_received_debits_resource_reversal_details/properties/restri
 * cted_reason
 */
@Serializable(with = InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc.Serializer::class)
public sealed class InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `already_reversed`.
   */
  public data object AlreadyReversed : InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc() {
    public override val `value`: String = "already_reversed"
  }

  /**
   * Documented value. Wire value: `deadline_passed`.
   */
  public data object DeadlinePassed : InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc() {
    public override val `value`: String = "deadline_passed"
  }

  /**
   * Documented value. Wire value: `network_restricted`.
   */
  public data object NetworkRestricted : InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc() {
    public override val `value`: String = "network_restricted"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `source_flow_restricted`.
   */
  public data object SourceFlowRestricted : InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc() {
    public override val `value`: String = "source_flow_restricted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc = when (value) {
      AlreadyReversed.value -> AlreadyReversed
      DeadlinePassed.value -> DeadlinePassed
      NetworkRestricted.value -> NetworkRestricted
      Other.value -> Other
      SourceFlowRestricted.value -> SourceFlowRestricted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc) {
      encoder.encodeString(value.value)
    }
  }
}
