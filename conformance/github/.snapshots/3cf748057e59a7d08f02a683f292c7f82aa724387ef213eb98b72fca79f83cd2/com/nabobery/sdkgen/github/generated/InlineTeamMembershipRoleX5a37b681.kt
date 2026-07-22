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
 * The role of the user in the team.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-membership/properties/role
 */
@Serializable(with = InlineTeamMembershipRoleX5a37b681.Serializer::class)
public sealed class InlineTeamMembershipRoleX5a37b681 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineTeamMembershipRoleX5a37b681() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `maintainer`.
   */
  public data object Maintainer : InlineTeamMembershipRoleX5a37b681() {
    public override val `value`: String = "maintainer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamMembershipRoleX5a37b681()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamMembershipRoleX5a37b681 = when (value) {
      Member.value -> Member
      Maintainer.value -> Maintainer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTeamMembershipRoleX5a37b681> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamMembershipRoleX5a37b681", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamMembershipRoleX5a37b681 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamMembershipRoleX5a37b681) {
      encoder.encodeString(value.value)
    }
  }
}
