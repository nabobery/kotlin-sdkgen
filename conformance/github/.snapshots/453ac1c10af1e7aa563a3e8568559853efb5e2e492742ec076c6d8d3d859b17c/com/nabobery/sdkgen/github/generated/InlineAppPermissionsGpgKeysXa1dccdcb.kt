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
 * The level of permission to grant the access token to view and manage GPG keys belonging to a user.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/gpg_keys
 */
@Serializable(with = InlineAppPermissionsGpgKeysXa1dccdcb.Serializer::class)
public sealed class InlineAppPermissionsGpgKeysXa1dccdcb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsGpgKeysXa1dccdcb() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsGpgKeysXa1dccdcb() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsGpgKeysXa1dccdcb()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsGpgKeysXa1dccdcb = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsGpgKeysXa1dccdcb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsGpgKeysXa1dccdcb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsGpgKeysXa1dccdcb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsGpgKeysXa1dccdcb) {
      encoder.encodeString(value.value)
    }
  }
}
