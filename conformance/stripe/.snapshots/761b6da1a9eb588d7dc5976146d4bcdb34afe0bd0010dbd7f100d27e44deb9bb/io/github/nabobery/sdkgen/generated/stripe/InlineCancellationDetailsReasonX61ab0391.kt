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
 * Why this subscription was canceled.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/cancellation_details/properties/reason
 */
@Serializable(with = InlineCancellationDetailsReasonX61ab0391.Serializer::class)
public sealed class InlineCancellationDetailsReasonX61ab0391 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled_by_retention_policy`.
   */
  public data object CanceledByRetentionPolicy : InlineCancellationDetailsReasonX61ab0391() {
    public override val `value`: String = "canceled_by_retention_policy"
  }

  /**
   * Documented value. Wire value: `cancellation_requested`.
   */
  public data object CancellationRequested : InlineCancellationDetailsReasonX61ab0391() {
    public override val `value`: String = "cancellation_requested"
  }

  /**
   * Documented value. Wire value: `payment_disputed`.
   */
  public data object PaymentDisputed : InlineCancellationDetailsReasonX61ab0391() {
    public override val `value`: String = "payment_disputed"
  }

  /**
   * Documented value. Wire value: `payment_failed`.
   */
  public data object PaymentFailed : InlineCancellationDetailsReasonX61ab0391() {
    public override val `value`: String = "payment_failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCancellationDetailsReasonX61ab0391()

  public companion object {
    public fun fromValue(`value`: String): InlineCancellationDetailsReasonX61ab0391 = when (value) {
      CanceledByRetentionPolicy.value -> CanceledByRetentionPolicy
      CancellationRequested.value -> CancellationRequested
      PaymentDisputed.value -> PaymentDisputed
      PaymentFailed.value -> PaymentFailed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCancellationDetailsReasonX61ab0391> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCancellationDetailsReasonX61ab0391", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCancellationDetailsReasonX61ab0391 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCancellationDetailsReasonX61ab0391) {
      encoder.encodeString(value.value)
    }
  }
}
