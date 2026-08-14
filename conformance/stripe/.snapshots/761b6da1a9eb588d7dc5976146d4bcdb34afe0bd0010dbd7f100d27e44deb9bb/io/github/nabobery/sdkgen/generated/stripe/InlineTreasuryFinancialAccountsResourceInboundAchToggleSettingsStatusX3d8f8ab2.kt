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
 * Whether the Feature is operational.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_inbound_ach_toggle_settings/pro
 * perties/status
 */
@Serializable(with = InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2.Serializer::class)
public sealed class InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `restricted`.
   */
  public data object Restricted : InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2() {
    public override val `value`: String = "restricted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2 = when (value) {
      Active.value -> Active
      Pending.value -> Pending
      Restricted.value -> Restricted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2) {
      encoder.encodeString(value.value)
    }
  }
}
