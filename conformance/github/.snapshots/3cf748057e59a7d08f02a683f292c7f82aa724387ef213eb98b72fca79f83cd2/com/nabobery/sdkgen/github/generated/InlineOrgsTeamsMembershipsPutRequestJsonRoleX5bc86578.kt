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
 * The role that this user should have in the team.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}~1memberships~1{username}/put/requestBody/conten
 * t/application~1json/schema/properties/role
 */
@Serializable(with = InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578.Serializer::class)
public sealed class InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `maintainer`.
   */
  public data object Maintainer : InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578() {
    public override val `value`: String = "maintainer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578 = when (value) {
      Member.value -> Member
      Maintainer.value -> Maintainer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578) {
      encoder.encodeString(value.value)
    }
  }
}
