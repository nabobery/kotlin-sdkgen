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
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_toggle_settings/properties/stat
 * us
 */
@Serializable(with = InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635.Serializer::class)
public sealed class InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `restricted`.
   */
  public data object Restricted : InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635() {
    public override val `value`: String = "restricted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635 = when (value) {
      Active.value -> Active
      Pending.value -> Pending
      Restricted.value -> Restricted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635) {
      encoder.encodeString(value.value)
    }
  }
}
