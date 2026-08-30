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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_comment/properties/user/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_comment/properties/user/properties/type
 */
@Serializable(with = InlineWebhooksCommentUserTypeX4f3017de.Serializer::class)
public sealed class InlineWebhooksCommentUserTypeX4f3017de {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksCommentUserTypeX4f3017de() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksCommentUserTypeX4f3017de() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksCommentUserTypeX4f3017de() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksCommentUserTypeX4f3017de()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksCommentUserTypeX4f3017de = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksCommentUserTypeX4f3017de> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksCommentUserTypeX4f3017de", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksCommentUserTypeX4f3017de = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksCommentUserTypeX4f3017de) {
      encoder.encodeString(value.value)
    }
  }
}
