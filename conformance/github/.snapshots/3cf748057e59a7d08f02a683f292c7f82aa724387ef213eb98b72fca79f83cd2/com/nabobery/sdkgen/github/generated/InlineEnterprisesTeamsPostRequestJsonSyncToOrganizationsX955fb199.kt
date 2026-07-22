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
 * This value cannot be set.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams/post/requestBody/content/application~1json/sch
 * ema/properties/sync_to_organizations
 */
@Serializable(with = InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199.Serializer::class)
public sealed class InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199 = when (value) {
      All.value -> All
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199) {
      encoder.encodeString(value.value)
    }
  }
}
