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
 * The category of this credit grant. This is for tracking purposes and isn't displayed to the customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_grant/properties/category
 */
@Serializable(with = InlineBillingCreditGrantCategoryXda8e84e5.Serializer::class)
public sealed class InlineBillingCreditGrantCategoryXda8e84e5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `paid`.
   */
  public data object Paid : InlineBillingCreditGrantCategoryXda8e84e5() {
    public override val `value`: String = "paid"
  }

  /**
   * Documented value. Wire value: `promotional`.
   */
  public data object Promotional : InlineBillingCreditGrantCategoryXda8e84e5() {
    public override val `value`: String = "promotional"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingCreditGrantCategoryXda8e84e5()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingCreditGrantCategoryXda8e84e5 = when (value) {
      Paid.value -> Paid
      Promotional.value -> Promotional
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditGrantCategoryXda8e84e5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingCreditGrantCategoryXda8e84e5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantCategoryXda8e84e5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantCategoryXda8e84e5) {
      encoder.encodeString(value.value)
    }
  }
}
