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
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/schedule/properties/weekly_payout_days/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/schedule/properties/weekly_payout_days/items
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43.Serializer::class)
public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `friday`.
   */
  public data object Friday : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43() {
    public override val `value`: String = "friday"
  }

  /**
   * Documented value. Wire value: `monday`.
   */
  public data object Monday : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43() {
    public override val `value`: String = "monday"
  }

  /**
   * Documented value. Wire value: `thursday`.
   */
  public data object Thursday : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43() {
    public override val `value`: String = "thursday"
  }

  /**
   * Documented value. Wire value: `tuesday`.
   */
  public data object Tuesday : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43() {
    public override val `value`: String = "tuesday"
  }

  /**
   * Documented value. Wire value: `wednesday`.
   */
  public data object Wednesday : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43() {
    public override val `value`: String = "wednesday"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43 = when (value) {
      Friday.value -> Friday
      Monday.value -> Monday
      Thursday.value -> Thursday
      Tuesday.value -> Tuesday
      Wednesday.value -> Wednesday
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleItemXd11baf43) {
      encoder.encodeString(value.value)
    }
  }
}
