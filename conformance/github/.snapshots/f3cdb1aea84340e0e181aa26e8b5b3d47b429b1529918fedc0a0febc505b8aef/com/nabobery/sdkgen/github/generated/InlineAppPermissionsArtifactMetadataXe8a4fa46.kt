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
 * The level of permission to grant the access token to create and retrieve build artifact metadata records.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/artifact_metadata
 */
@Serializable(with = InlineAppPermissionsArtifactMetadataXe8a4fa46.Serializer::class)
public sealed class InlineAppPermissionsArtifactMetadataXe8a4fa46 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsArtifactMetadataXe8a4fa46() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsArtifactMetadataXe8a4fa46() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsArtifactMetadataXe8a4fa46()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsArtifactMetadataXe8a4fa46 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsArtifactMetadataXe8a4fa46> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsArtifactMetadataXe8a4fa46", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsArtifactMetadataXe8a4fa46 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsArtifactMetadataXe8a4fa46) {
      encoder.encodeString(value.value)
    }
  }
}
