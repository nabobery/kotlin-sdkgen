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
 * If Stripe disabled automatic tax, this enum describes why.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_automatic_tax/properties/disabled_reason
 */
@Serializable(with = InlineSubscriptionAutomaticTaxDisabledReasonXda31318a.Serializer::class)
public sealed class InlineSubscriptionAutomaticTaxDisabledReasonXda31318a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requires_location_inputs`.
   */
  public data object RequiresLocationInputs : InlineSubscriptionAutomaticTaxDisabledReasonXda31318a() {
    public override val `value`: String = "requires_location_inputs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionAutomaticTaxDisabledReasonXda31318a()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionAutomaticTaxDisabledReasonXda31318a = when (value) {
      RequiresLocationInputs.value -> RequiresLocationInputs
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionAutomaticTaxDisabledReasonXda31318a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionAutomaticTaxDisabledReasonXda31318a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionAutomaticTaxDisabledReasonXda31318a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionAutomaticTaxDisabledReasonXda31318a) {
      encoder.encodeString(value.value)
    }
  }
}
