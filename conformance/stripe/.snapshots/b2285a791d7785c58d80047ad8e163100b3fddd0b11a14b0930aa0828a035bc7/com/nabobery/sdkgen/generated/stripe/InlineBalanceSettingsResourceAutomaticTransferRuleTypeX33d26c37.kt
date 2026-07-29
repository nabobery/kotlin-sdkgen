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
 * The type of automatic transfer rule.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_automatic_transfer_rule/properties/type
 */
@Serializable(with = InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37.Serializer::class)
public sealed class InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transfer_all`.
   */
  public data object TransferAll : InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37() {
    public override val `value`: String = "transfer_all"
  }

  /**
   * Documented value. Wire value: `transfer_up_to_amount`.
   */
  public data object TransferUpToAmount : InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37() {
    public override val `value`: String = "transfer_up_to_amount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37()

  public companion object {
    public fun fromValue(`value`: String): InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37 = when (value) {
      TransferAll.value -> TransferAll
      TransferUpToAmount.value -> TransferUpToAmount
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBalanceSettingsResourceAutomaticTransferRuleTypeX33d26c37) {
      encoder.encodeString(value.value)
    }
  }
}
