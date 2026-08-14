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
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_outbound_ach_toggle_settings/pr
 * operties/status
 */
@Serializable(with = InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8.Serializer::class)
public sealed class InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `restricted`.
   */
  public data object Restricted : InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8() {
    public override val `value`: String = "restricted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8 = when (value) {
      Active.value -> Active
      Pending.value -> Pending
      Restricted.value -> Restricted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountsResourceOutboundAchToggleSettingsStatusXc0fe3ef8) {
      encoder.encodeString(value.value)
    }
  }
}
