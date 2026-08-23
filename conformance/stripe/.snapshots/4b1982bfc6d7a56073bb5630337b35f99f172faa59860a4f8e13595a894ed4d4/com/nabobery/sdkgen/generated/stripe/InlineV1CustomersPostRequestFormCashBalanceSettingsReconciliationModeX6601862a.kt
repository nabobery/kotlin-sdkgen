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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/cash_balance/properties/settings/properties/reconciliation_mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/cash_balance/properties/settings/properties/reconciliation_mode
 */
@Serializable(with = InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a() {
    public override val `value`: String = "manual"
  }

  /**
   * Documented value. Wire value: `merchant_default`.
   */
  public data object MerchantDefault : InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a() {
    public override val `value`: String = "merchant_default"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a = when (value) {
      Automatic.value -> Automatic
      Manual.value -> Manual
      MerchantDefault.value -> MerchantDefault
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a) {
      encoder.encodeString(value.value)
    }
  }
}
