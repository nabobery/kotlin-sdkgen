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
 * The level of permission to grant the access token to list and manage repositories a user is starring.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/starring
 */
@Serializable(with = InlineAppPermissionsStarringX87ff7e81.Serializer::class)
public sealed class InlineAppPermissionsStarringX87ff7e81 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsStarringX87ff7e81() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsStarringX87ff7e81() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsStarringX87ff7e81()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsStarringX87ff7e81 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsStarringX87ff7e81> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsStarringX87ff7e81", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsStarringX87ff7e81 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsStarringX87ff7e81) {
      encoder.encodeString(value.value)
    }
  }
}
