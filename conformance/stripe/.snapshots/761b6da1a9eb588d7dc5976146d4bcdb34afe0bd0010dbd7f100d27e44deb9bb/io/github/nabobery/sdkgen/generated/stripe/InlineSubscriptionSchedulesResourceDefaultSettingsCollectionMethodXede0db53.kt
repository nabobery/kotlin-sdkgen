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
 * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay the
 * underlying subscription at the end of each billing cycle using the default source attached to the customer. When
 * sending an invoice, Stripe will email your customer an invoice with payment instructions and mark the subscription as
 * `active`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings/properties/collecti
 * on_method
 */
@Serializable(with = InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53.Serializer::class)
public sealed class InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53 = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53) {
      encoder.encodeString(value.value)
    }
  }
}
