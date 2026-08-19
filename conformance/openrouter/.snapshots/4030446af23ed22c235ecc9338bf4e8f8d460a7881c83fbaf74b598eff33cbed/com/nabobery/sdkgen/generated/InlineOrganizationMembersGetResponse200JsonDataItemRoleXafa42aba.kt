package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Role of the member in the organization
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organization~1members/get/responses/200/content/application~1json/schema/proper
 * ties/data/items/properties/role
 */
@Serializable(with = InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba.Serializer::class)
public sealed class InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `org:admin`.
   */
  public data object OrgAdmin : InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba() {
    public override val `value`: String = "org:admin"
  }

  /**
   * Documented value. Wire value: `org:member`.
   */
  public data object OrgMember : InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba() {
    public override val `value`: String = "org:member"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba = when (value) {
      OrgAdmin.value -> OrgAdmin
      OrgMember.value -> OrgMember
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationMembersGetResponse200JsonDataItemRoleXafa42aba) {
      encoder.encodeString(value.value)
    }
  }
}
