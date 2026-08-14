package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The level of permission to grant the access token for packages published to GitHub Packages.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/packages
 */
@Serializable(with = InlineAppPermissionsPackagesXf9362eb3.Serializer::class)
public sealed class InlineAppPermissionsPackagesXf9362eb3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsPackagesXf9362eb3() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsPackagesXf9362eb3() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsPackagesXf9362eb3()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsPackagesXf9362eb3 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsPackagesXf9362eb3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsPackagesXf9362eb3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsPackagesXf9362eb3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsPackagesXf9362eb3) {
      encoder.encodeString(value.value)
    }
  }
}
