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
 * The level of permission to grant the access token to manage git SSH keys.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/git_ssh_keys
 */
@Serializable(with = InlineAppPermissionsGitSshKeysX8e69e547.Serializer::class)
public sealed class InlineAppPermissionsGitSshKeysX8e69e547 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsGitSshKeysX8e69e547() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsGitSshKeysX8e69e547() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsGitSshKeysX8e69e547()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsGitSshKeysX8e69e547 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsGitSshKeysX8e69e547> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsGitSshKeysX8e69e547", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsGitSshKeysX8e69e547 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsGitSshKeysX8e69e547) {
      encoder.encodeString(value.value)
    }
  }
}
