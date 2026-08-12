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
 * The level of permission to grant the access token to manage repository projects, columns, and cards.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/repository_projects
 */
@Serializable(with = InlineAppPermissionsRepositoryProjectsX19913fb9.Serializer::class)
public sealed class InlineAppPermissionsRepositoryProjectsX19913fb9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsRepositoryProjectsX19913fb9() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsRepositoryProjectsX19913fb9() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineAppPermissionsRepositoryProjectsX19913fb9() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsRepositoryProjectsX19913fb9()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsRepositoryProjectsX19913fb9 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsRepositoryProjectsX19913fb9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsRepositoryProjectsX19913fb9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsRepositoryProjectsX19913fb9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsRepositoryProjectsX19913fb9) {
      encoder.encodeString(value.value)
    }
  }
}
