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
 * The member's role on the team. Only present on the `List team members` endpoint, and only when the feature is enabled
 * for the organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-member/properties/role
 */
@Serializable(with = InlineTeamMemberRoleXc77c8cc8.Serializer::class)
public sealed class InlineTeamMemberRoleXc77c8cc8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineTeamMemberRoleXc77c8cc8() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `maintainer`.
   */
  public data object Maintainer : InlineTeamMemberRoleXc77c8cc8() {
    public override val `value`: String = "maintainer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamMemberRoleXc77c8cc8()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamMemberRoleXc77c8cc8 = when (value) {
      Member.value -> Member
      Maintainer.value -> Maintainer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamMemberRoleXc77c8cc8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineTeamMemberRoleXc77c8cc8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamMemberRoleXc77c8cc8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamMemberRoleXc77c8cc8) {
      encoder.encodeString(value.value)
    }
  }
}
