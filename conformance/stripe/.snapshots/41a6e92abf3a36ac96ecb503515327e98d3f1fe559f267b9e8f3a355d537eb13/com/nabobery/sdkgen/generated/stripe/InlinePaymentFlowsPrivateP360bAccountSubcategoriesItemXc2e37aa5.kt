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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_financial_connections_common_l
 * inked_account_options_filters/properties/account_subcategories/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_financial_connections_common_l
 * inked_account_options_filters/properties/account_subcategories/items
 */
@Serializable(with = InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5.Serializer::class)
public sealed class InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5 = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5) {
      encoder.encodeString(value.value)
    }
  }
}
