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
 * Specifies which organizations in the enterprise should have access to this team. Can be one of `disabled`,
 * `selected`, or `all`.
 * `disabled`: The team is not assigned to any organizations. This is the default when you create a new team.
 * `selected`: The team is assigned to specific organizations. You can then use the [add organization assignments
 * API](https://docs.github.com/rest/enterprise-teams/enterprise-team-organizations#add-organization-assignments).
 * `all`: The team is assigned to all current and future organizations in the enterprise.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{team_slug}/patch/requestBody/content/applica
 * tion~1json/schema/properties/organization_selection_type
 */
@Serializable(with = InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a.Serializer::class)
public sealed class InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a() {
    public override val `value`: String = "selected"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a = when (value) {
      Disabled.value -> Disabled
      Selected.value -> Selected
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a) {
      encoder.encodeString(value.value)
    }
  }
}
