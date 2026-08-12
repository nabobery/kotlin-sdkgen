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
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.alert/properties/object
 */
@Serializable(with = InlineBillingAlertObjectValueX4f411e63.Serializer::class)
public sealed class InlineBillingAlertObjectValueX4f411e63 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `billing.alert`.
   */
  public data object BillingAlert : InlineBillingAlertObjectValueX4f411e63() {
    public override val `value`: String = "billing.alert"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingAlertObjectValueX4f411e63()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingAlertObjectValueX4f411e63 = when (value) {
      BillingAlert.value -> BillingAlert
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingAlertObjectValueX4f411e63> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingAlertObjectValueX4f411e63", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingAlertObjectValueX4f411e63 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingAlertObjectValueX4f411e63) {
      encoder.encodeString(value.value)
    }
  }
}
