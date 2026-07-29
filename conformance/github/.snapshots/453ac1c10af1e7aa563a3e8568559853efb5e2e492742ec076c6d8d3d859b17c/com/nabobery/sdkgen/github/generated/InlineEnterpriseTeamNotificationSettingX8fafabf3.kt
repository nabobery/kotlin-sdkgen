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
 * Whether team members will receive notifications when the team is mentioned.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/enterprise-team/properties/notification_setting
 */
@Serializable(with = InlineEnterpriseTeamNotificationSettingX8fafabf3.Serializer::class)
public sealed class InlineEnterpriseTeamNotificationSettingX8fafabf3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineEnterpriseTeamNotificationSettingX8fafabf3() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineEnterpriseTeamNotificationSettingX8fafabf3() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterpriseTeamNotificationSettingX8fafabf3()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterpriseTeamNotificationSettingX8fafabf3 = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineEnterpriseTeamNotificationSettingX8fafabf3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterpriseTeamNotificationSettingX8fafabf3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterpriseTeamNotificationSettingX8fafabf3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterpriseTeamNotificationSettingX8fafabf3) {
      encoder.encodeString(value.value)
    }
  }
}
