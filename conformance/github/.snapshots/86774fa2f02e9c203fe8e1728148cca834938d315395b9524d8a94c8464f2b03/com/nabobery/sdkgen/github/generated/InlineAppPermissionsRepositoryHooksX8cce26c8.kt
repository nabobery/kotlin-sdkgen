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
 * The level of permission to grant the access token to manage the post-receive hooks for a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/repository_hooks
 */
@Serializable(with = InlineAppPermissionsRepositoryHooksX8cce26c8.Serializer::class)
public sealed class InlineAppPermissionsRepositoryHooksX8cce26c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsRepositoryHooksX8cce26c8() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsRepositoryHooksX8cce26c8() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsRepositoryHooksX8cce26c8()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsRepositoryHooksX8cce26c8 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsRepositoryHooksX8cce26c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsRepositoryHooksX8cce26c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsRepositoryHooksX8cce26c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsRepositoryHooksX8cce26c8) {
      encoder.encodeString(value.value)
    }
  }
}
