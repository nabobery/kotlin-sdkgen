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
 * Whether team members will receive notifications when their team is @mentioned
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/parent/properties/notification_setting
 */
@Serializable(with = InlineWebhooksTeam1ParentNotificationSettingX1aafa799.Serializer::class)
public sealed class InlineWebhooksTeam1ParentNotificationSettingX1aafa799 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineWebhooksTeam1ParentNotificationSettingX1aafa799() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineWebhooksTeam1ParentNotificationSettingX1aafa799() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeam1ParentNotificationSettingX1aafa799()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeam1ParentNotificationSettingX1aafa799 = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeam1ParentNotificationSettingX1aafa799> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksTeam1ParentNotificationSettingX1aafa799", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeam1ParentNotificationSettingX1aafa799 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeam1ParentNotificationSettingX1aafa799) {
      encoder.encodeString(value.value)
    }
  }
}
