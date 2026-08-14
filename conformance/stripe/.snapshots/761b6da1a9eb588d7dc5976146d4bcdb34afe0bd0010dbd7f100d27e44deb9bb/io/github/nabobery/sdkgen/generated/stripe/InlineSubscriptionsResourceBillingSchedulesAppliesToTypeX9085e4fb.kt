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
 * Controls which subscription items the billing schedule applies to.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_schedules_applies_to/properties/type
 */
@Serializable(with = InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb.Serializer::class)
public sealed class InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `price`.
   */
  public data object Price : InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb() {
    public override val `value`: String = "price"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb = when (value) {
      Price.value -> Price
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb) {
      encoder.encodeString(value.value)
    }
  }
}
