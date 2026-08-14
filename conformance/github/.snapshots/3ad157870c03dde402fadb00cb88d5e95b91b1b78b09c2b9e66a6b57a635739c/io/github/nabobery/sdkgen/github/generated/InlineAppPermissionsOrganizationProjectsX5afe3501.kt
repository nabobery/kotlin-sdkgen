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
 * The level of permission to grant the access token to manage organization projects and projects public preview (where
 * available).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_projects
 */
@Serializable(with = InlineAppPermissionsOrganizationProjectsX5afe3501.Serializer::class)
public sealed class InlineAppPermissionsOrganizationProjectsX5afe3501 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationProjectsX5afe3501() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationProjectsX5afe3501() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineAppPermissionsOrganizationProjectsX5afe3501() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationProjectsX5afe3501()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationProjectsX5afe3501 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsOrganizationProjectsX5afe3501> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationProjectsX5afe3501", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationProjectsX5afe3501 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationProjectsX5afe3501) {
      encoder.encodeString(value.value)
    }
  }
}
