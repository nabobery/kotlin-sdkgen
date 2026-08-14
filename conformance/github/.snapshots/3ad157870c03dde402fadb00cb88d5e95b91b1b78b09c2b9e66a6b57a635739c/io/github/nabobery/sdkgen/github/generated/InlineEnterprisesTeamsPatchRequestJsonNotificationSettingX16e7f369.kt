package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The notification setting the team is set to. The options are:
 *
 * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
 * * `notifications_disabled` - no one receives notifications.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{team_slug}/patch/requestBody/content/applica
 * tion~1json/schema/properties/notification_setting
 */
@Serializable(with = InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369.Serializer::class)
public sealed class InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369 = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369) {
      encoder.encodeString(value.value)
    }
  }
}
