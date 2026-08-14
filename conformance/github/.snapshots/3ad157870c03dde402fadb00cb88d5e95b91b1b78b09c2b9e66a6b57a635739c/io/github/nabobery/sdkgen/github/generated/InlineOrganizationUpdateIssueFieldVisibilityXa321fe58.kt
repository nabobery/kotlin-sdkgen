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
 * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all`
 * (visible to all users who can see issues). Only used when the visibility settings feature is enabled.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-update-issue-field/properties/visibility
 */
@Serializable(with = InlineOrganizationUpdateIssueFieldVisibilityXa321fe58.Serializer::class)
public sealed class InlineOrganizationUpdateIssueFieldVisibilityXa321fe58 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `organization_members_only`.
   */
  public data object OrganizationMembersOnly : InlineOrganizationUpdateIssueFieldVisibilityXa321fe58() {
    public override val `value`: String = "organization_members_only"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrganizationUpdateIssueFieldVisibilityXa321fe58() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationUpdateIssueFieldVisibilityXa321fe58()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationUpdateIssueFieldVisibilityXa321fe58 = when (value) {
      OrganizationMembersOnly.value -> OrganizationMembersOnly
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationUpdateIssueFieldVisibilityXa321fe58> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationUpdateIssueFieldVisibilityXa321fe58", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationUpdateIssueFieldVisibilityXa321fe58 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationUpdateIssueFieldVisibilityXa321fe58) {
      encoder.encodeString(value.value)
    }
  }
}
