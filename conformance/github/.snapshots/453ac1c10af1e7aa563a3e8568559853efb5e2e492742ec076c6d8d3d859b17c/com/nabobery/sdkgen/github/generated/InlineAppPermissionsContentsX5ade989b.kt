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
 * The level of permission to grant the access token for repository contents, commits, branches, downloads, releases,
 * and merges.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/contents
 */
@Serializable(with = InlineAppPermissionsContentsX5ade989b.Serializer::class)
public sealed class InlineAppPermissionsContentsX5ade989b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsContentsX5ade989b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsContentsX5ade989b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsContentsX5ade989b()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsContentsX5ade989b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsContentsX5ade989b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsContentsX5ade989b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsContentsX5ade989b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsContentsX5ade989b) {
      encoder.encodeString(value.value)
    }
  }
}
