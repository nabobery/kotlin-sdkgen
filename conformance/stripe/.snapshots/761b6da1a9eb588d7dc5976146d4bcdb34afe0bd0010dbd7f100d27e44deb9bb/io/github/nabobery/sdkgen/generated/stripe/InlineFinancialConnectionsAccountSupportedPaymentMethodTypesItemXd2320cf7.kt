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
 * sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/supported_payment_method_ty
 * pes/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/supported_payment_method_ty
 * pes/items
 */
@Serializable(with = InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7.Serializer::class)
public sealed class InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `us_bank_account`.
   */
  public data object UsBankAccount : InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7() {
    public override val `value`: String = "us_bank_account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7 = when (value) {
      Link.value -> Link
      UsBankAccount.value -> UsBankAccount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7) {
      encoder.encodeString(value.value)
    }
  }
}
