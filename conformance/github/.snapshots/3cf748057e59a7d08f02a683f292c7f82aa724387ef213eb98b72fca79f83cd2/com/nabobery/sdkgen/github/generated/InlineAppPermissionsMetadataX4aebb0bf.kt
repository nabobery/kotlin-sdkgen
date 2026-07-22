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
 * The level of permission to grant the access token to search repositories, list collaborators, and access repository
 * metadata.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/metadata
 */
@Serializable(with = InlineAppPermissionsMetadataX4aebb0bf.Serializer::class)
public sealed class InlineAppPermissionsMetadataX4aebb0bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsMetadataX4aebb0bf() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsMetadataX4aebb0bf() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsMetadataX4aebb0bf()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsMetadataX4aebb0bf = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsMetadataX4aebb0bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsMetadataX4aebb0bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsMetadataX4aebb0bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsMetadataX4aebb0bf) {
      encoder.encodeString(value.value)
    }
  }
}
