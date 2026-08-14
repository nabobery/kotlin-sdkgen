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
 * Specifies whether to cancel a single event or a range of events for a time period. Time period cancellation is not
 * supported yet.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter_event_adjustment/properties/type
 */
@Serializable(with = InlineBillingMeterEventAdjustmentTypeX3b9f2ee3.Serializer::class)
public sealed class InlineBillingMeterEventAdjustmentTypeX3b9f2ee3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancel`.
   */
  public data object Cancel : InlineBillingMeterEventAdjustmentTypeX3b9f2ee3() {
    public override val `value`: String = "cancel"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingMeterEventAdjustmentTypeX3b9f2ee3()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingMeterEventAdjustmentTypeX3b9f2ee3 = when (value) {
      Cancel.value -> Cancel
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingMeterEventAdjustmentTypeX3b9f2ee3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingMeterEventAdjustmentTypeX3b9f2ee3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingMeterEventAdjustmentTypeX3b9f2ee3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingMeterEventAdjustmentTypeX3b9f2ee3) {
      encoder.encodeString(value.value)
    }
  }
}
