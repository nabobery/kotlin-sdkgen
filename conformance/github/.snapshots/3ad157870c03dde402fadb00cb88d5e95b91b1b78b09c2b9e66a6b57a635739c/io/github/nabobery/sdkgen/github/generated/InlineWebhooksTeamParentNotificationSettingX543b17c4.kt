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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_team/properties/parent/properties/notification_setting
 */
@Serializable(with = InlineWebhooksTeamParentNotificationSettingX543b17c4.Serializer::class)
public sealed class InlineWebhooksTeamParentNotificationSettingX543b17c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineWebhooksTeamParentNotificationSettingX543b17c4() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineWebhooksTeamParentNotificationSettingX543b17c4() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeamParentNotificationSettingX543b17c4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeamParentNotificationSettingX543b17c4 = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeamParentNotificationSettingX543b17c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksTeamParentNotificationSettingX543b17c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeamParentNotificationSettingX543b17c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeamParentNotificationSettingX543b17c4) {
      encoder.encodeString(value.value)
    }
  }
}
