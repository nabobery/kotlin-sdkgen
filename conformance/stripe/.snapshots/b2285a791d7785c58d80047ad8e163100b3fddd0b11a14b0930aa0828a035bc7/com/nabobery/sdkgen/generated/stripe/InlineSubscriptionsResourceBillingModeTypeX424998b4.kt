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
 * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_mode/properties/type
 */
@Serializable(with = InlineSubscriptionsResourceBillingModeTypeX424998b4.Serializer::class)
public sealed class InlineSubscriptionsResourceBillingModeTypeX424998b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `classic`.
   */
  public data object Classic : InlineSubscriptionsResourceBillingModeTypeX424998b4() {
    public override val `value`: String = "classic"
  }

  /**
   * Documented value. Wire value: `flexible`.
   */
  public data object Flexible : InlineSubscriptionsResourceBillingModeTypeX424998b4() {
    public override val `value`: String = "flexible"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionsResourceBillingModeTypeX424998b4()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionsResourceBillingModeTypeX424998b4 = when (value) {
      Classic.value -> Classic
      Flexible.value -> Flexible
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionsResourceBillingModeTypeX424998b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionsResourceBillingModeTypeX424998b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourceBillingModeTypeX424998b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourceBillingModeTypeX424998b4) {
      encoder.encodeString(value.value)
    }
  }
}
