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
 * The level of permission to grant the access token to view and edit custom properties for a repository, when allowed
 * by the property.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/repository_custom_properties
 */
@Serializable(with = InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0.Serializer::class)
public sealed class InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0) {
      encoder.encodeString(value.value)
    }
  }
}
