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
 * Retired: this field is no longer supported.
 * Whether the enterprise team should be reflected in each organization.
 * This value cannot be changed.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{team_slug}/patch/requestBody/content/applica
 * tion~1json/schema/properties/sync_to_organizations
 */
@Serializable(with = InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9.Serializer::class)
public sealed class InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9 = when (value) {
      All.value -> All
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9) {
      encoder.encodeString(value.value)
    }
  }
}
