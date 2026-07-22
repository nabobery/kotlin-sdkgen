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
 * Specifies which organizations in the enterprise should have access to this team. Can be one of `disabled`,
 * `selected`, or `all`.
 * `disabled`: The team is not assigned to any organizations. This is the default when you create a new team.
 * `selected`: The team is assigned to specific organizations. You can then use the [add organization assignments
 * API](https://docs.github.com/rest/enterprise-teams/enterprise-team-organizations#add-organization-assignments)
 * endpoint.
 * `all`: The team is assigned to all current and future organizations in the enterprise.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams/post/requestBody/content/application~1json/sch
 * ema/properties/organization_selection_type
 */
@Serializable(with = InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a.Serializer::class)
public sealed class InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a() {
    public override val `value`: String = "selected"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a = when (value) {
      Disabled.value -> Disabled
      Selected.value -> Selected
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a) {
      encoder.encodeString(value.value)
    }
  }
}
