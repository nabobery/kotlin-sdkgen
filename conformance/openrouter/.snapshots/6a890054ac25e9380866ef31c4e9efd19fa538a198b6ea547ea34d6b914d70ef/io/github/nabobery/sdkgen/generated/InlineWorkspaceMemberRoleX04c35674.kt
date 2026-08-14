package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Role of the member in the workspace
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WorkspaceMember/properties/role
 */
@Serializable(with = InlineWorkspaceMemberRoleX04c35674.Serializer::class)
public sealed class InlineWorkspaceMemberRoleX04c35674 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineWorkspaceMemberRoleX04c35674() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineWorkspaceMemberRoleX04c35674() {
    public override val `value`: String = "member"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWorkspaceMemberRoleX04c35674()

  public companion object {
    public fun fromValue(`value`: String): InlineWorkspaceMemberRoleX04c35674 = when (value) {
      Admin.value -> Admin
      Member.value -> Member
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWorkspaceMemberRoleX04c35674> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineWorkspaceMemberRoleX04c35674", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWorkspaceMemberRoleX04c35674 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWorkspaceMemberRoleX04c35674) {
      encoder.encodeString(value.value)
    }
  }
}
