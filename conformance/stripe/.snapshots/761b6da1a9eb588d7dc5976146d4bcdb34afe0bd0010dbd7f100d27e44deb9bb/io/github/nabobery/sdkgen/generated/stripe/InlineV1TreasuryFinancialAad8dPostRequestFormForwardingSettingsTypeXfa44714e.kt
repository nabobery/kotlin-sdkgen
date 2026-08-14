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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1close/post/requestBody/c
 * ontent/application~1x-www-form-urlencoded/schema/properties/forwarding_settings/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1close/post/requestBody/c
 * ontent/application~1x-www-form-urlencoded/schema/properties/forwarding_settings/properties/type
 */
@Serializable(with = InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e.Serializer::class)
public sealed class InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `financial_account`.
   */
  public data object FinancialAccount : InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e() {
    public override val `value`: String = "financial_account"
  }

  /**
   * Documented value. Wire value: `payment_method`.
   */
  public data object PaymentMethod : InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e() {
    public override val `value`: String = "payment_method"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e = when (value) {
      FinancialAccount.value -> FinancialAccount
      PaymentMethod.value -> PaymentMethod
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e) {
      encoder.encodeString(value.value)
    }
  }
}
