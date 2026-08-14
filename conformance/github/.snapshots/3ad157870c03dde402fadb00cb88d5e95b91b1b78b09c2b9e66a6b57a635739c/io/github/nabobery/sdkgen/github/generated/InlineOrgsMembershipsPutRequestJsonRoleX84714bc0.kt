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
 * The role to give the user in the organization. Can be one of:
 * * `admin` - The user will become an owner of the organization.
 * * `member` - The user will become a non-owner member of the organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1memberships~1{username}/put/requestBody/content/application~1json/
 * schema/properties/role
 */
@Serializable(with = InlineOrgsMembershipsPutRequestJsonRoleX84714bc0.Serializer::class)
public sealed class InlineOrgsMembershipsPutRequestJsonRoleX84714bc0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsMembershipsPutRequestJsonRoleX84714bc0() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineOrgsMembershipsPutRequestJsonRoleX84714bc0() {
    public override val `value`: String = "member"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsMembershipsPutRequestJsonRoleX84714bc0()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsMembershipsPutRequestJsonRoleX84714bc0 = when (value) {
      Admin.value -> Admin
      Member.value -> Member
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsMembershipsPutRequestJsonRoleX84714bc0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsMembershipsPutRequestJsonRoleX84714bc0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsMembershipsPutRequestJsonRoleX84714bc0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsMembershipsPutRequestJsonRoleX84714bc0) {
      encoder.encodeString(value.value)
    }
  }
}
