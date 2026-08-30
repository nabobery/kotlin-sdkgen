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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-page-build/properties/build/properties/pusher/properties/typ
 * e.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-page-build/properties/build/properties/pusher/properties/typ
 * e
 */
@Serializable(with = InlineWebhookPageBuildBuildPusherTypeX8c76a1c4.Serializer::class)
public sealed class InlineWebhookPageBuildBuildPusherTypeX8c76a1c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPageBuildBuildPusherTypeX8c76a1c4() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPageBuildBuildPusherTypeX8c76a1c4() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPageBuildBuildPusherTypeX8c76a1c4() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPageBuildBuildPusherTypeX8c76a1c4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPageBuildBuildPusherTypeX8c76a1c4 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPageBuildBuildPusherTypeX8c76a1c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPageBuildBuildPusherTypeX8c76a1c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPageBuildBuildPusherTypeX8c76a1c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPageBuildBuildPusherTypeX8c76a1c4) {
      encoder.encodeString(value.value)
    }
  }
}
