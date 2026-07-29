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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter/properties/object
 */
@Serializable(with = InlineBillingMeterObjectValueX4f2455fc.Serializer::class)
public sealed class InlineBillingMeterObjectValueX4f2455fc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `billing.meter`.
   */
  public data object BillingMeter : InlineBillingMeterObjectValueX4f2455fc() {
    public override val `value`: String = "billing.meter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingMeterObjectValueX4f2455fc()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingMeterObjectValueX4f2455fc = when (value) {
      BillingMeter.value -> BillingMeter
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBillingMeterObjectValueX4f2455fc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingMeterObjectValueX4f2455fc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingMeterObjectValueX4f2455fc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingMeterObjectValueX4f2455fc) {
      encoder.encodeString(value.value)
    }
  }
}
