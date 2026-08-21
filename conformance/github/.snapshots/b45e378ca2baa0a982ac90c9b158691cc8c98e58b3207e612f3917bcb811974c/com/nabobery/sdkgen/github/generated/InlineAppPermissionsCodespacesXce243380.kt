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
 * The level of permission to grant the access token to create, edit, delete, and list Codespaces.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/codespaces
 */
@Serializable(with = InlineAppPermissionsCodespacesXce243380.Serializer::class)
public sealed class InlineAppPermissionsCodespacesXce243380 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsCodespacesXce243380() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsCodespacesXce243380() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsCodespacesXce243380()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsCodespacesXce243380 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsCodespacesXce243380> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsCodespacesXce243380", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsCodespacesXce243380 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsCodespacesXce243380) {
      encoder.encodeString(value.value)
    }
  }
}
