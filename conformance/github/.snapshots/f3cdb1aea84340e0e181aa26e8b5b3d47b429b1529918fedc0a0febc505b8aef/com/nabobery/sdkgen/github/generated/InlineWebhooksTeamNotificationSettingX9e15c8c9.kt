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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_team/properties/notification_setting.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team/properties/notification_setting
 */
@Serializable(with = InlineWebhooksTeamNotificationSettingX9e15c8c9.Serializer::class)
public sealed class InlineWebhooksTeamNotificationSettingX9e15c8c9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineWebhooksTeamNotificationSettingX9e15c8c9() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineWebhooksTeamNotificationSettingX9e15c8c9() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeamNotificationSettingX9e15c8c9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeamNotificationSettingX9e15c8c9 = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeamNotificationSettingX9e15c8c9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksTeamNotificationSettingX9e15c8c9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeamNotificationSettingX9e15c8c9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeamNotificationSettingX9e15c8c9) {
      encoder.encodeString(value.value)
    }
  }
}
