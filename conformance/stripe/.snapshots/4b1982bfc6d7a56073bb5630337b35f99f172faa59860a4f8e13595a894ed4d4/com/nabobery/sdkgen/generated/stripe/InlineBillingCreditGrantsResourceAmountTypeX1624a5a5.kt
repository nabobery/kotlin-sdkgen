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
 * The type of this amount. We currently only support `monetary` billing credits.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_amount/properties/type
 */
@Serializable(with = InlineBillingCreditGrantsResourceAmountTypeX1624a5a5.Serializer::class)
public sealed class InlineBillingCreditGrantsResourceAmountTypeX1624a5a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `monetary`.
   */
  public data object Monetary : InlineBillingCreditGrantsResourceAmountTypeX1624a5a5() {
    public override val `value`: String = "monetary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingCreditGrantsResourceAmountTypeX1624a5a5()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingCreditGrantsResourceAmountTypeX1624a5a5 = when (value) {
      Monetary.value -> Monetary
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditGrantsResourceAmountTypeX1624a5a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingCreditGrantsResourceAmountTypeX1624a5a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantsResourceAmountTypeX1624a5a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantsResourceAmountTypeX1624a5a5) {
      encoder.encodeString(value.value)
    }
  }
}
