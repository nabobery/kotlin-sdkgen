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
 * Defines the type of the alert.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.alert/properties/alert_type
 */
@Serializable(with = InlineBillingAlertAlertTypeX831d1d2e.Serializer::class)
public sealed class InlineBillingAlertAlertTypeX831d1d2e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `usage_threshold`.
   */
  public data object UsageThreshold : InlineBillingAlertAlertTypeX831d1d2e() {
    public override val `value`: String = "usage_threshold"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingAlertAlertTypeX831d1d2e()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingAlertAlertTypeX831d1d2e = when (value) {
      UsageThreshold.value -> UsageThreshold
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingAlertAlertTypeX831d1d2e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingAlertAlertTypeX831d1d2e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingAlertAlertTypeX831d1d2e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingAlertAlertTypeX831d1d2e) {
      encoder.encodeString(value.value)
    }
  }
}
