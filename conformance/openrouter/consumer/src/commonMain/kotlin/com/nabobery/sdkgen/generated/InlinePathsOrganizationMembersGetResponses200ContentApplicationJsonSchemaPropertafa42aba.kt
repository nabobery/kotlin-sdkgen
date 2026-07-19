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
 */
@Serializable(with = InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba
  .Serializer::class)
public sealed class InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `org:admin`.
   */
  public data object OrgAdmin : InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba() {
    public override val `value`: String = "org:admin"
  }

  /**
   * Documented value. Wire value: `org:member`.
   */
  public data object OrgMember : InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba() {
    public override val `value`: String = "org:member"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba = when (value) {
      OrgAdmin.value -> OrgAdmin
      OrgMember.value -> OrgMember
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropertafa42aba) {
      encoder.encodeString(value.value)
    }
  }
}
