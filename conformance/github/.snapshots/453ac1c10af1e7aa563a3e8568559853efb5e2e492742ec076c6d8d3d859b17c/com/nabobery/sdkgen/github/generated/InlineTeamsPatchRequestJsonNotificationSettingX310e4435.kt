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
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}/patch/requestBody/content/application~1json/schema/properties/
 * notification_setting
 */
@Serializable(with = InlineTeamsPatchRequestJsonNotificationSettingX310e4435.Serializer::class)
public sealed class InlineTeamsPatchRequestJsonNotificationSettingX310e4435 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineTeamsPatchRequestJsonNotificationSettingX310e4435() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineTeamsPatchRequestJsonNotificationSettingX310e4435() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamsPatchRequestJsonNotificationSettingX310e4435()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamsPatchRequestJsonNotificationSettingX310e4435 = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTeamsPatchRequestJsonNotificationSettingX310e4435> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamsPatchRequestJsonNotificationSettingX310e4435", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamsPatchRequestJsonNotificationSettingX310e4435 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamsPatchRequestJsonNotificationSettingX310e4435) {
      encoder.encodeString(value.value)
    }
  }
}
