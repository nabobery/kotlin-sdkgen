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
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/automatic_transfer_rules_by_currency/anyOf/0/additionalPro
 * perties/anyOf/0/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/automatic_transfer_rules_by_currency/anyOf/0/additionalPro
 * perties/anyOf/0/items/properties/type
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754.Serializer::class)
public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transfer_all`.
   */
  public data object TransferAll : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754() {
    public override val `value`: String = "transfer_all"
  }

  /**
   * Documented value. Wire value: `transfer_up_to_amount`.
   */
  public data object TransferUpToAmount : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754() {
    public override val `value`: String = "transfer_up_to_amount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754 = when (value) {
      TransferAll.value -> TransferAll
      TransferUpToAmount.value -> TransferUpToAmount
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754) {
      encoder.encodeString(value.value)
    }
  }
}
