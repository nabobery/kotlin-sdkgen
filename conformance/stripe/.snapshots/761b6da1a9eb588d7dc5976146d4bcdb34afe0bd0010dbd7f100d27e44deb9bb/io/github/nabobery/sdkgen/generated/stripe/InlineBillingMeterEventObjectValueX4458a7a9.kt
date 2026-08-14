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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter_event/properties/object
 */
@Serializable(with = InlineBillingMeterEventObjectValueX4458a7a9.Serializer::class)
public sealed class InlineBillingMeterEventObjectValueX4458a7a9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `billing.meter_event`.
   */
  public data object BillingMeterEvent : InlineBillingMeterEventObjectValueX4458a7a9() {
    public override val `value`: String = "billing.meter_event"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingMeterEventObjectValueX4458a7a9()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingMeterEventObjectValueX4458a7a9 = when (value) {
      BillingMeterEvent.value -> BillingMeterEvent
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingMeterEventObjectValueX4458a7a9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingMeterEventObjectValueX4458a7a9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingMeterEventObjectValueX4458a7a9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingMeterEventObjectValueX4458a7a9) {
      encoder.encodeString(value.value)
    }
  }
}
