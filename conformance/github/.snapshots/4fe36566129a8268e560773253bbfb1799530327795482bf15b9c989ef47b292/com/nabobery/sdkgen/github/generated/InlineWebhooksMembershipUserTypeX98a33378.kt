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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_membership/properties/user/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_membership/properties/user/properties/type
 */
@Serializable(with = InlineWebhooksMembershipUserTypeX98a33378.Serializer::class)
public sealed class InlineWebhooksMembershipUserTypeX98a33378 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksMembershipUserTypeX98a33378() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksMembershipUserTypeX98a33378() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksMembershipUserTypeX98a33378() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksMembershipUserTypeX98a33378()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksMembershipUserTypeX98a33378 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksMembershipUserTypeX98a33378> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksMembershipUserTypeX98a33378", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksMembershipUserTypeX98a33378 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksMembershipUserTypeX98a33378) {
      encoder.encodeString(value.value)
    }
  }
}
