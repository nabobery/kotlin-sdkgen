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
 * The notification setting the team is set to. The options are:
 *
 * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
 * * `notifications_disabled` - no one receives notifications.
 *
 * Default: `notifications_enabled`
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams/post/requestBody/content/application~1json/sch
 * ema/properties/notification_setting
 */
@Serializable(with = InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28.Serializer::class)
public sealed class InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28 = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28) {
      encoder.encodeString(value.value)
    }
  }
}
