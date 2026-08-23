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
 * The meter's status.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter/properties/status
 */
@Serializable(with = InlineBillingMeterStatusXc97e094c.Serializer::class)
public sealed class InlineBillingMeterStatusXc97e094c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineBillingMeterStatusXc97e094c() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineBillingMeterStatusXc97e094c() {
    public override val `value`: String = "inactive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingMeterStatusXc97e094c()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingMeterStatusXc97e094c = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingMeterStatusXc97e094c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingMeterStatusXc97e094c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingMeterStatusXc97e094c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingMeterStatusXc97e094c) {
      encoder.encodeString(value.value)
    }
  }
}
