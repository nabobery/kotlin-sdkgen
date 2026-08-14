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
 * The level of permission to grant the access token for custom organization roles management.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_custom_org_roles
 */
@Serializable(with = InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2.Serializer::class)
public sealed class InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2) {
      encoder.encodeString(value.value)
    }
  }
}
