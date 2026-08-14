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
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_portal.configuration/properties/object
 */
@Serializable(with = InlineBillingPortalConfigurationObjectValueX67d405e0.Serializer::class)
public sealed class InlineBillingPortalConfigurationObjectValueX67d405e0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `billing_portal.configuration`.
   */
  public data object BillingPortalConfiguration : InlineBillingPortalConfigurationObjectValueX67d405e0() {
    public override val `value`: String = "billing_portal.configuration"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingPortalConfigurationObjectValueX67d405e0()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingPortalConfigurationObjectValueX67d405e0 = when (value) {
      BillingPortalConfiguration.value -> BillingPortalConfiguration
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingPortalConfigurationObjectValueX67d405e0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingPortalConfigurationObjectValueX67d405e0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingPortalConfigurationObjectValueX67d405e0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingPortalConfigurationObjectValueX67d405e0) {
      encoder.encodeString(value.value)
    }
  }
}
