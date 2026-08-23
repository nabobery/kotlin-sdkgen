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
 * The policy that controls how immutable releases are enforced in the organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/immutable-releases-organization-settings/properties/enforced_reposit
 * ories
 */
@Serializable(with = InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07.Serializer::class)
public sealed class InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07()

  public companion object {
    public fun fromValue(`value`: String): InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07 = when (value) {
      All.value -> All
      None.value -> None
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07) {
      encoder.encodeString(value.value)
    }
  }
}
