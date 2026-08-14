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
 * The level of permission to grant the access token to manage access to an organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_administration
 */
@Serializable(with = InlineAppPermissionsOrganizationAdministrationX9cab22d8.Serializer::class)
public sealed class InlineAppPermissionsOrganizationAdministrationX9cab22d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationAdministrationX9cab22d8() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationAdministrationX9cab22d8() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationAdministrationX9cab22d8()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationAdministrationX9cab22d8 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsOrganizationAdministrationX9cab22d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationAdministrationX9cab22d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationAdministrationX9cab22d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationAdministrationX9cab22d8) {
      encoder.encodeString(value.value)
    }
  }
}
