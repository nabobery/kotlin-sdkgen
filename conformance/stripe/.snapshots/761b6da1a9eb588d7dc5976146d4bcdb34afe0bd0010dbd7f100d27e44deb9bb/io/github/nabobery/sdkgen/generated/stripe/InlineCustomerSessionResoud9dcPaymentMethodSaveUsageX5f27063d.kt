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
 * When using PaymentIntents and the customer checks the save checkbox, this field determines the
 * [`setup_future_usage`](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage)
 * value used to confirm the PaymentIntent.
 *
 * When using SetupIntents, directly configure the
 * [`usage`](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-usage) value on SetupIntent creation.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_payment_element_resour
 * ce_features/properties/payment_method_save_usage
 */
@Serializable(with = InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d.Serializer::class)
public sealed class InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d = when (value) {
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d) {
      encoder.encodeString(value.value)
    }
  }
}
