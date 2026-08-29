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
 * The level of permission to grant the access token to view and edit custom properties for an organization, when
 * allowed by the property.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/custom_properties_for_organizations
 */
@Serializable(with = InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4.Serializer::class)
public sealed class InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4) {
      encoder.encodeString(value.value)
    }
  }
}
