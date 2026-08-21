package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The notification setting the team has chosen. Editing teams without specifying this parameter leaves
 * `notification_setting` intact. The options are:
 * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
 * * `notifications_disabled` - no one receives notifications.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}/patch/requestBody/content/application~1json/sch
 * ema/properties/notification_setting
 */
@Serializable(with = InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48.Serializer::class)
public sealed class InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48 = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsPatchRequestJsonNotificationSettingXd5b0ba48) {
      encoder.encodeString(value.value)
    }
  }
}
