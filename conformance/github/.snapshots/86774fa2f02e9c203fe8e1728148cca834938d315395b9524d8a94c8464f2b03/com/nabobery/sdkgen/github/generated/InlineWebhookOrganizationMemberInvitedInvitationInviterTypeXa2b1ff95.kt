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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-invited/properties/invitation/properties
 * /inviter/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-invited/properties/invitation/properties
 * /inviter/properties/type
 */
@Serializable(with = InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95.Serializer::class)
public sealed class InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrganizationMemberInvitedInvitationInviterTypeXa2b1ff95) {
      encoder.encodeString(value.value)
    }
  }
}
