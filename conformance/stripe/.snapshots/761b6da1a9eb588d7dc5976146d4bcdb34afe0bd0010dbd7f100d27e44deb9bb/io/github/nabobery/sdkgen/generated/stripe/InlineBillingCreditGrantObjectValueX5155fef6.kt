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
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_grant/properties/object
 */
@Serializable(with = InlineBillingCreditGrantObjectValueX5155fef6.Serializer::class)
public sealed class InlineBillingCreditGrantObjectValueX5155fef6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `billing.credit_grant`.
   */
  public data object BillingCreditGrant : InlineBillingCreditGrantObjectValueX5155fef6() {
    public override val `value`: String = "billing.credit_grant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingCreditGrantObjectValueX5155fef6()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingCreditGrantObjectValueX5155fef6 = when (value) {
      BillingCreditGrant.value -> BillingCreditGrant
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditGrantObjectValueX5155fef6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingCreditGrantObjectValueX5155fef6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantObjectValueX5155fef6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantObjectValueX5155fef6) {
      encoder.encodeString(value.value)
    }
  }
}
