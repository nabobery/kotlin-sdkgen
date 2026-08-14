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
 * The level of permission to grant the access token to view and manage users blocked by the organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_user_blocking
 */
@Serializable(with = InlineAppPermissionsOrganizationUserBlockingX03acce02.Serializer::class)
public sealed class InlineAppPermissionsOrganizationUserBlockingX03acce02 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationUserBlockingX03acce02() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationUserBlockingX03acce02() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationUserBlockingX03acce02()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationUserBlockingX03acce02 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsOrganizationUserBlockingX03acce02> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationUserBlockingX03acce02", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationUserBlockingX03acce02 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationUserBlockingX03acce02) {
      encoder.encodeString(value.value)
    }
  }
}
