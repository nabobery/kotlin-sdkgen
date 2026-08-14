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
 * The role for the new member.
 * * `admin` - Organization owners with full administrative rights to the organization and complete access to all
 * repositories and teams.
 * * `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.
 * * `billing_manager` - Non-owner organization members with ability to manage the billing settings of your
 * organization.
 * * `reinstate` - The previous role assigned to the invitee before they were removed from your organization. Can be one
 * of the roles listed above. Only works if the invitee was previously part of your organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1invitations/post/requestBody/content/application~1json/schema/prop
 * erties/role
 */
@Serializable(with = InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1.Serializer::class)
public sealed class InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `direct_member`.
   */
  public data object DirectMember : InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1() {
    public override val `value`: String = "direct_member"
  }

  /**
   * Documented value. Wire value: `billing_manager`.
   */
  public data object BillingManager : InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1() {
    public override val `value`: String = "billing_manager"
  }

  /**
   * Documented value. Wire value: `reinstate`.
   */
  public data object Reinstate : InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1() {
    public override val `value`: String = "reinstate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1 = when (value) {
      Admin.value -> Admin
      DirectMember.value -> DirectMember
      BillingManager.value -> BillingManager
      Reinstate.value -> Reinstate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1) {
      encoder.encodeString(value.value)
    }
  }
}
