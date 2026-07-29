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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_summary/properties/object
 */
@Serializable(with = InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20.Serializer::class)
public sealed class InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `billing.credit_balance_summary`.
   */
  public data object BillingCreditBalanceSummary : InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20() {
    public override val `value`: String = "billing.credit_balance_summary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20 = when (value) {
      BillingCreditBalanceSummary.value -> BillingCreditBalanceSummary
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20) {
      encoder.encodeString(value.value)
    }
  }
}
