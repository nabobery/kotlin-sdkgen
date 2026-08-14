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
 * The notification setting the team has chosen. The options are:
 * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
 * * `notifications_disabled` - no one receives notifications.
 * Default: `notifications_enabled`
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams/post/requestBody/content/application~1json/schema/properties
 * /notification_setting
 */
@Serializable(with = InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed.Serializer::class)
public sealed class InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsPostRequestJsonNotificationSettingX8c27f7ed) {
      encoder.encodeString(value.value)
    }
  }
}
