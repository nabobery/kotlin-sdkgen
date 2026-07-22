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
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}~1memberships~1{username}/put/requestBody/content/application~1
 * json/schema/properties/role
 */
@Serializable(with = InlineTeamsMembershipsPutRequestJsonRoleXf176fad0.Serializer::class)
public sealed class InlineTeamsMembershipsPutRequestJsonRoleXf176fad0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineTeamsMembershipsPutRequestJsonRoleXf176fad0() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `maintainer`.
   */
  public data object Maintainer : InlineTeamsMembershipsPutRequestJsonRoleXf176fad0() {
    public override val `value`: String = "maintainer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamsMembershipsPutRequestJsonRoleXf176fad0()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamsMembershipsPutRequestJsonRoleXf176fad0 = when (value) {
      Member.value -> Member
      Maintainer.value -> Maintainer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTeamsMembershipsPutRequestJsonRoleXf176fad0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamsMembershipsPutRequestJsonRoleXf176fad0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamsMembershipsPutRequestJsonRoleXf176fad0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamsMembershipsPutRequestJsonRoleXf176fad0) {
      encoder.encodeString(value.value)
    }
  }
}
