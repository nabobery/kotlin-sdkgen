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
 * The level of permission to grant the access token for organization custom properties management at the enterprise
 * level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/enterprise_custom_properties_for_organiza
 * tions
 */
@Serializable(with = InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96.Serializer::class)
public sealed class InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96) {
      encoder.encodeString(value.value)
    }
  }
}
