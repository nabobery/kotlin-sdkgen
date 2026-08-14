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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account/anyOf/0/properties/verification_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account/anyOf/0/properties/verification_method
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXf9ed943e) {
      encoder.encodeString(value.value)
    }
  }
}
