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
 * Configure whether Stripe updates `subscription.default_payment_method` when payment succeeds. Defaults to `off`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_settings/properties/save_default_paym
 * ent_method
 */
@Serializable(with = InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b.Serializer::class)
public sealed class InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `on_subscription`.
   */
  public data object OnSubscription : InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b() {
    public override val `value`: String = "on_subscription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b = when (value) {
      Off.value -> Off
      OnSubscription.value -> OnSubscription
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b) {
      encoder.encodeString(value.value)
    }
  }
}
