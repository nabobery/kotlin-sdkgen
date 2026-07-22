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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_alert/properties/dismisser/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_alert/properties/dismisser/properties/type
 */
@Serializable(with = InlineWebhooksAlertDismisserTypeX333af9d4.Serializer::class)
public sealed class InlineWebhooksAlertDismisserTypeX333af9d4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksAlertDismisserTypeX333af9d4() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksAlertDismisserTypeX333af9d4() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksAlertDismisserTypeX333af9d4() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksAlertDismisserTypeX333af9d4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksAlertDismisserTypeX333af9d4 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksAlertDismisserTypeX333af9d4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksAlertDismisserTypeX333af9d4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksAlertDismisserTypeX333af9d4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksAlertDismisserTypeX333af9d4) {
      encoder.encodeString(value.value)
    }
  }
}
