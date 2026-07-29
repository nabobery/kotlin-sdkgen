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
 * sdkgen://source/openapi.json#/components/schemas/issuing_network_token_wallet_provider/properties/reason_codes/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_network_token_wallet_provider/properties/reason_codes/items
 */
@Serializable(with = InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5.Serializer::class)
public sealed class InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_card_too_new`.
   */
  public data object AccountCardTooNew : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "account_card_too_new"
  }

  /**
   * Documented value. Wire value: `account_recently_changed`.
   */
  public data object AccountRecentlyChanged : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "account_recently_changed"
  }

  /**
   * Documented value. Wire value: `account_too_new`.
   */
  public data object AccountTooNew : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "account_too_new"
  }

  /**
   * Documented value. Wire value: `account_too_new_since_launch`.
   */
  public data object AccountTooNewSinceLaunch : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "account_too_new_since_launch"
  }

  /**
   * Documented value. Wire value: `additional_device`.
   */
  public data object AdditionalDevice : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "additional_device"
  }

  /**
   * Documented value. Wire value: `data_expired`.
   */
  public data object DataExpired : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "data_expired"
  }

  /**
   * Documented value. Wire value: `defer_id_v_decision`.
   */
  public data object DeferIdVDecision : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "defer_id_v_decision"
  }

  /**
   * Documented value. Wire value: `device_recently_lost`.
   */
  public data object DeviceRecentlyLost : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "device_recently_lost"
  }

  /**
   * Documented value. Wire value: `good_activity_history`.
   */
  public data object GoodActivityHistory : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "good_activity_history"
  }

  /**
   * Documented value. Wire value: `has_suspended_tokens`.
   */
  public data object HasSuspendedTokens : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "has_suspended_tokens"
  }

  /**
   * Documented value. Wire value: `high_risk`.
   */
  public data object HighRisk : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "high_risk"
  }

  /**
   * Documented value. Wire value: `inactive_account`.
   */
  public data object InactiveAccount : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "inactive_account"
  }

  /**
   * Documented value. Wire value: `long_account_tenure`.
   */
  public data object LongAccountTenure : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "long_account_tenure"
  }

  /**
   * Documented value. Wire value: `low_account_score`.
   */
  public data object LowAccountScore : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "low_account_score"
  }

  /**
   * Documented value. Wire value: `low_device_score`.
   */
  public data object LowDeviceScore : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "low_device_score"
  }

  /**
   * Documented value. Wire value: `low_phone_number_score`.
   */
  public data object LowPhoneNumberScore : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "low_phone_number_score"
  }

  /**
   * Documented value. Wire value: `network_service_error`.
   */
  public data object NetworkServiceError : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "network_service_error"
  }

  /**
   * Documented value. Wire value: `outside_home_territory`.
   */
  public data object OutsideHomeTerritory : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "outside_home_territory"
  }

  /**
   * Documented value. Wire value: `provisioning_cardholder_mismatch`.
   */
  public data object ProvisioningCardholderMismatch : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "provisioning_cardholder_mismatch"
  }

  /**
   * Documented value. Wire value: `provisioning_device_and_cardholder_mismatch`.
   */
  public data object ProvisioningDeviceAndCardholderMismatch : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "provisioning_device_and_cardholder_mismatch"
  }

  /**
   * Documented value. Wire value: `provisioning_device_mismatch`.
   */
  public data object ProvisioningDeviceMismatch : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "provisioning_device_mismatch"
  }

  /**
   * Documented value. Wire value: `same_device_no_prior_authentication`.
   */
  public data object SameDeviceNoPriorAuthentication : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "same_device_no_prior_authentication"
  }

  /**
   * Documented value. Wire value: `same_device_successful_prior_authentication`.
   */
  public data object SameDeviceSuccessfulPriorAuthentication : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "same_device_successful_prior_authentication"
  }

  /**
   * Documented value. Wire value: `software_update`.
   */
  public data object SoftwareUpdate : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "software_update"
  }

  /**
   * Documented value. Wire value: `suspicious_activity`.
   */
  public data object SuspiciousActivity : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "suspicious_activity"
  }

  /**
   * Documented value. Wire value: `too_many_different_cardholders`.
   */
  public data object TooManyDifferentCardholders : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "too_many_different_cardholders"
  }

  /**
   * Documented value. Wire value: `too_many_recent_attempts`.
   */
  public data object TooManyRecentAttempts : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "too_many_recent_attempts"
  }

  /**
   * Documented value. Wire value: `too_many_recent_tokens`.
   */
  public data object TooManyRecentTokens : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5() {
    public override val `value`: String = "too_many_recent_tokens"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5 = when (value) {
      AccountCardTooNew.value -> AccountCardTooNew
      AccountRecentlyChanged.value -> AccountRecentlyChanged
      AccountTooNew.value -> AccountTooNew
      AccountTooNewSinceLaunch.value -> AccountTooNewSinceLaunch
      AdditionalDevice.value -> AdditionalDevice
      DataExpired.value -> DataExpired
      DeferIdVDecision.value -> DeferIdVDecision
      DeviceRecentlyLost.value -> DeviceRecentlyLost
      GoodActivityHistory.value -> GoodActivityHistory
      HasSuspendedTokens.value -> HasSuspendedTokens
      HighRisk.value -> HighRisk
      InactiveAccount.value -> InactiveAccount
      LongAccountTenure.value -> LongAccountTenure
      LowAccountScore.value -> LowAccountScore
      LowDeviceScore.value -> LowDeviceScore
      LowPhoneNumberScore.value -> LowPhoneNumberScore
      NetworkServiceError.value -> NetworkServiceError
      OutsideHomeTerritory.value -> OutsideHomeTerritory
      ProvisioningCardholderMismatch.value -> ProvisioningCardholderMismatch
      ProvisioningDeviceAndCardholderMismatch.value -> ProvisioningDeviceAndCardholderMismatch
      ProvisioningDeviceMismatch.value -> ProvisioningDeviceMismatch
      SameDeviceNoPriorAuthentication.value -> SameDeviceNoPriorAuthentication
      SameDeviceSuccessfulPriorAuthentication.value -> SameDeviceSuccessfulPriorAuthentication
      SoftwareUpdate.value -> SoftwareUpdate
      SuspiciousActivity.value -> SuspiciousActivity
      TooManyDifferentCardholders.value -> TooManyDifferentCardholders
      TooManyRecentAttempts.value -> TooManyRecentAttempts
      TooManyRecentTokens.value -> TooManyRecentTokens
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingNetworkTokenWalletProviderReasonCodesItemXcb5712c5) {
      encoder.encodeString(value.value)
    }
  }
}
