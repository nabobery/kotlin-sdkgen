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
 * The level of permission to grant the access token for viewing and managing fine-grained personal access tokens that
 * have been approved by an organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_personal_access_token_reques
 * ts
 */
@Serializable(with = InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b.Serializer::class)
public sealed class InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b) {
      encoder.encodeString(value.value)
    }
  }
}
