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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/forwarding_settings/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/forwarding_settings/properties/type
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866.Serializer::class)
public sealed class InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `financial_account`.
   */
  public data object FinancialAccount : InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866() {
    public override val `value`: String = "financial_account"
  }

  /**
   * Documented value. Wire value: `payment_method`.
   */
  public data object PaymentMethod : InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866() {
    public override val `value`: String = "payment_method"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866 = when (value) {
      FinancialAccount.value -> FinancialAccount
      PaymentMethod.value -> PaymentMethod
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsTypeXd4f8a866) {
      encoder.encodeString(value.value)
    }
  }
}
