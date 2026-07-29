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
 * perties/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/automatic_transfer_rules_by_currency/anyOf/0/additionalPro
 * perties/anyOf/1
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34.Serializer::class)
public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34) {
      encoder.encodeString(value.value)
    }
  }
}
