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
 * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all`
 * (visible to all users who can see issues). Only used when the visibility settings feature is enabled. Defaults to
 * `organization_members_only`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-create-issue-field/properties/visibility
 */
@Serializable(with = InlineOrganizationCreateIssueFieldVisibilityX1ecd9997.Serializer::class)
public sealed class InlineOrganizationCreateIssueFieldVisibilityX1ecd9997 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `organization_members_only`.
   */
  public data object OrganizationMembersOnly : InlineOrganizationCreateIssueFieldVisibilityX1ecd9997() {
    public override val `value`: String = "organization_members_only"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrganizationCreateIssueFieldVisibilityX1ecd9997() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationCreateIssueFieldVisibilityX1ecd9997()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationCreateIssueFieldVisibilityX1ecd9997 = when (value) {
      OrganizationMembersOnly.value -> OrganizationMembersOnly
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationCreateIssueFieldVisibilityX1ecd9997> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationCreateIssueFieldVisibilityX1ecd9997", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationCreateIssueFieldVisibilityX1ecd9997 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationCreateIssueFieldVisibilityX1ecd9997) {
      encoder.encodeString(value.value)
    }
  }
}
