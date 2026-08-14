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
 * The user's membership type in the organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-membership/properties/role
 */
@Serializable(with = InlineOrgMembershipRoleXb8da7817.Serializer::class)
public sealed class InlineOrgMembershipRoleXb8da7817 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgMembershipRoleXb8da7817() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineOrgMembershipRoleXb8da7817() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `billing_manager`.
   */
  public data object BillingManager : InlineOrgMembershipRoleXb8da7817() {
    public override val `value`: String = "billing_manager"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgMembershipRoleXb8da7817()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgMembershipRoleXb8da7817 = when (value) {
      Admin.value -> Admin
      Member.value -> Member
      BillingManager.value -> BillingManager
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgMembershipRoleXb8da7817> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgMembershipRoleXb8da7817", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgMembershipRoleXb8da7817 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgMembershipRoleXb8da7817) {
      encoder.encodeString(value.value)
    }
  }
}
