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
 * The notification setting the team has set
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-full/properties/notification_setting
 */
@Serializable(with = InlineTeamFullNotificationSettingX733841a7.Serializer::class)
public sealed class InlineTeamFullNotificationSettingX733841a7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notifications_enabled`.
   */
  public data object NotificationsEnabled : InlineTeamFullNotificationSettingX733841a7() {
    public override val `value`: String = "notifications_enabled"
  }

  /**
   * Documented value. Wire value: `notifications_disabled`.
   */
  public data object NotificationsDisabled : InlineTeamFullNotificationSettingX733841a7() {
    public override val `value`: String = "notifications_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamFullNotificationSettingX733841a7()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamFullNotificationSettingX733841a7 = when (value) {
      NotificationsEnabled.value -> NotificationsEnabled
      NotificationsDisabled.value -> NotificationsDisabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTeamFullNotificationSettingX733841a7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamFullNotificationSettingX733841a7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamFullNotificationSettingX733841a7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamFullNotificationSettingX733841a7) {
      encoder.encodeString(value.value)
    }
  }
}
