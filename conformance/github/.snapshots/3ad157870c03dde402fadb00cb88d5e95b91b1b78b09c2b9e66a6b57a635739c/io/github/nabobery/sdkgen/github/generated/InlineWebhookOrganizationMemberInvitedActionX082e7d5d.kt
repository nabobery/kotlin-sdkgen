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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-invited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-invited/properties/action
 */
@Serializable(with = InlineWebhookOrganizationMemberInvitedActionX082e7d5d.Serializer::class)
public sealed class InlineWebhookOrganizationMemberInvitedActionX082e7d5d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `member_invited`.
   */
  public data object MemberInvited : InlineWebhookOrganizationMemberInvitedActionX082e7d5d() {
    public override val `value`: String = "member_invited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookOrganizationMemberInvitedActionX082e7d5d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookOrganizationMemberInvitedActionX082e7d5d = when (value) {
      MemberInvited.value -> MemberInvited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookOrganizationMemberInvitedActionX082e7d5d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookOrganizationMemberInvitedActionX082e7d5d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookOrganizationMemberInvitedActionX082e7d5d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrganizationMemberInvitedActionX082e7d5d) {
      encoder.encodeString(value.value)
    }
  }
}
