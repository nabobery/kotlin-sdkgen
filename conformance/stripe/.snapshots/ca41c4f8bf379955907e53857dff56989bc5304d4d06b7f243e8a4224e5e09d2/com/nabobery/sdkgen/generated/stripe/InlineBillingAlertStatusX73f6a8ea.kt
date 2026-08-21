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
 * Status of the alert. This can be active, inactive or archived.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.alert/properties/status
 */
@Serializable(with = InlineBillingAlertStatusX73f6a8ea.Serializer::class)
public sealed class InlineBillingAlertStatusX73f6a8ea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineBillingAlertStatusX73f6a8ea() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `archived`.
   */
  public data object Archived : InlineBillingAlertStatusX73f6a8ea() {
    public override val `value`: String = "archived"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineBillingAlertStatusX73f6a8ea() {
    public override val `value`: String = "inactive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingAlertStatusX73f6a8ea()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingAlertStatusX73f6a8ea = when (value) {
      Active.value -> Active
      Archived.value -> Archived
      Inactive.value -> Inactive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingAlertStatusX73f6a8ea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingAlertStatusX73f6a8ea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingAlertStatusX73f6a8ea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingAlertStatusX73f6a8ea) {
      encoder.encodeString(value.value)
    }
  }
}
