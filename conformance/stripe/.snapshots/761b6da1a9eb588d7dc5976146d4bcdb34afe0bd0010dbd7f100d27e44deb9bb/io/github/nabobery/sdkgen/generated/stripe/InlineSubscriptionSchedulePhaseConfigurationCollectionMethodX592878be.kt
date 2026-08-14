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
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedule_phase_configuration/properties/collection_meth
 * od
 */
@Serializable(with = InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be.Serializer::class)
public sealed class InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be) {
      encoder.encodeString(value.value)
    }
  }
}
