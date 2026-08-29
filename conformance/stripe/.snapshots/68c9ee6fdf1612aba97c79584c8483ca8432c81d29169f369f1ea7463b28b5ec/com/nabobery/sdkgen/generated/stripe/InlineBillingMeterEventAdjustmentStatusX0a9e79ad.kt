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
 * The meter event adjustment's status.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter_event_adjustment/properties/status
 */
@Serializable(with = InlineBillingMeterEventAdjustmentStatusX0a9e79ad.Serializer::class)
public sealed class InlineBillingMeterEventAdjustmentStatusX0a9e79ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `complete`.
   */
  public data object Complete : InlineBillingMeterEventAdjustmentStatusX0a9e79ad() {
    public override val `value`: String = "complete"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineBillingMeterEventAdjustmentStatusX0a9e79ad() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingMeterEventAdjustmentStatusX0a9e79ad()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingMeterEventAdjustmentStatusX0a9e79ad = when (value) {
      Complete.value -> Complete
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingMeterEventAdjustmentStatusX0a9e79ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingMeterEventAdjustmentStatusX0a9e79ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingMeterEventAdjustmentStatusX0a9e79ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingMeterEventAdjustmentStatusX0a9e79ad) {
      encoder.encodeString(value.value)
    }
  }
}
