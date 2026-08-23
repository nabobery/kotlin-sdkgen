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
 * Set if a ReceivedCredit cannot be reversed.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_received_credits_resource_reversal_details/properties/restr
 * icted_reason
 */
@Serializable(with = InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab.Serializer::class)
public sealed class InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `already_reversed`.
   */
  public data object AlreadyReversed : InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab() {
    public override val `value`: String = "already_reversed"
  }

  /**
   * Documented value. Wire value: `deadline_passed`.
   */
  public data object DeadlinePassed : InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab() {
    public override val `value`: String = "deadline_passed"
  }

  /**
   * Documented value. Wire value: `network_restricted`.
   */
  public data object NetworkRestricted : InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab() {
    public override val `value`: String = "network_restricted"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `source_flow_restricted`.
   */
  public data object SourceFlowRestricted : InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab() {
    public override val `value`: String = "source_flow_restricted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab = when (value) {
      AlreadyReversed.value -> AlreadyReversed
      DeadlinePassed.value -> DeadlinePassed
      NetworkRestricted.value -> NetworkRestricted
      Other.value -> Other
      SourceFlowRestricted.value -> SourceFlowRestricted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab) {
      encoder.encodeString(value.value)
    }
  }
}
