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
 * The current status of a dispute. Possible values include:`warning_needs_response`, `warning_under_review`,
 * `warning_closed`, `needs_response`, `under_review`, `won`, `lost`, or `prevented`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute/properties/status
 */
@Serializable(with = InlineDisputeStatusXfc9cfb04.Serializer::class)
public sealed class InlineDisputeStatusXfc9cfb04 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `lost`.
   */
  public data object Lost : InlineDisputeStatusXfc9cfb04() {
    public override val `value`: String = "lost"
  }

  /**
   * Documented value. Wire value: `needs_response`.
   */
  public data object NeedsResponse : InlineDisputeStatusXfc9cfb04() {
    public override val `value`: String = "needs_response"
  }

  /**
   * Documented value. Wire value: `prevented`.
   */
  public data object Prevented : InlineDisputeStatusXfc9cfb04() {
    public override val `value`: String = "prevented"
  }

  /**
   * Documented value. Wire value: `under_review`.
   */
  public data object UnderReview : InlineDisputeStatusXfc9cfb04() {
    public override val `value`: String = "under_review"
  }

  /**
   * Documented value. Wire value: `warning_closed`.
   */
  public data object WarningClosed : InlineDisputeStatusXfc9cfb04() {
    public override val `value`: String = "warning_closed"
  }

  /**
   * Documented value. Wire value: `warning_needs_response`.
   */
  public data object WarningNeedsResponse : InlineDisputeStatusXfc9cfb04() {
    public override val `value`: String = "warning_needs_response"
  }

  /**
   * Documented value. Wire value: `warning_under_review`.
   */
  public data object WarningUnderReview : InlineDisputeStatusXfc9cfb04() {
    public override val `value`: String = "warning_under_review"
  }

  /**
   * Documented value. Wire value: `won`.
   */
  public data object Won : InlineDisputeStatusXfc9cfb04() {
    public override val `value`: String = "won"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputeStatusXfc9cfb04()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputeStatusXfc9cfb04 = when (value) {
      Lost.value -> Lost
      NeedsResponse.value -> NeedsResponse
      Prevented.value -> Prevented
      UnderReview.value -> UnderReview
      WarningClosed.value -> WarningClosed
      WarningNeedsResponse.value -> WarningNeedsResponse
      WarningUnderReview.value -> WarningUnderReview
      Won.value -> Won
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeStatusXfc9cfb04> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDisputeStatusXfc9cfb04", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputeStatusXfc9cfb04 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputeStatusXfc9cfb04) {
      encoder.encodeString(value.value)
    }
  }
}
