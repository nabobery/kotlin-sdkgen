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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/notification_setting
 */
@Serializable(with = InlineWebhooksTeam1NotificationSettingXb566738d.Serializer::class)
public sealed class InlineWebhooksTeam1NotificationSettingXb566738d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineWebhooksTeam1NotificationSettingXb566738d() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineWebhooksTeam1NotificationSettingXb566738d() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeam1NotificationSettingXb566738d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeam1NotificationSettingXb566738d = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeam1NotificationSettingXb566738d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksTeam1NotificationSettingXb566738d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeam1NotificationSettingXb566738d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeam1NotificationSettingXb566738d) {
      encoder.encodeString(value.value)
    }
  }
}
