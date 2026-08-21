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
 * The level of permission to grant the access token for repository custom properties management at the organization
 * level.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_custom_properties
 */
@Serializable(with = InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f.Serializer::class)
public sealed class InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f) {
      encoder.encodeString(value.value)
    }
  }
}
