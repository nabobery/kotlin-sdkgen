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
 * The level of permission to grant the access token to manage the post-receive hooks for an organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_hooks
 */
@Serializable(with = InlineAppPermissionsOrganizationHooksX2381525d.Serializer::class)
public sealed class InlineAppPermissionsOrganizationHooksX2381525d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationHooksX2381525d() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationHooksX2381525d() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationHooksX2381525d()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationHooksX2381525d = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsOrganizationHooksX2381525d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationHooksX2381525d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationHooksX2381525d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationHooksX2381525d) {
      encoder.encodeString(value.value)
    }
  }
}
