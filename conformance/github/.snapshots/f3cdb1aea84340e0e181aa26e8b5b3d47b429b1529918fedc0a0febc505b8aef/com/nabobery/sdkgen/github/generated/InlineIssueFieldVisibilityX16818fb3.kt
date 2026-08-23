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
 * (visible to all users who can see issues).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field/properties/visibility
 */
@Serializable(with = InlineIssueFieldVisibilityX16818fb3.Serializer::class)
public sealed class InlineIssueFieldVisibilityX16818fb3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `organization_members_only`.
   */
  public data object OrganizationMembersOnly : InlineIssueFieldVisibilityX16818fb3() {
    public override val `value`: String = "organization_members_only"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineIssueFieldVisibilityX16818fb3() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssueFieldVisibilityX16818fb3()

  public companion object {
    public fun fromValue(`value`: String): InlineIssueFieldVisibilityX16818fb3 = when (value) {
      OrganizationMembersOnly.value -> OrganizationMembersOnly
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssueFieldVisibilityX16818fb3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineIssueFieldVisibilityX16818fb3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssueFieldVisibilityX16818fb3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssueFieldVisibilityX16818fb3) {
      encoder.encodeString(value.value)
    }
  }
}
