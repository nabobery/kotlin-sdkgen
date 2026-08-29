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
 * The configuration for how funds that land in the customer cash balance are reconciled.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_customer_balance_settings/properties/reconciliation
 * _mode
 */
@Serializable(with = InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4.Serializer::class)
public sealed class InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4 = when (value) {
      Automatic.value -> Automatic
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4) {
      encoder.encodeString(value.value)
    }
  }
}
