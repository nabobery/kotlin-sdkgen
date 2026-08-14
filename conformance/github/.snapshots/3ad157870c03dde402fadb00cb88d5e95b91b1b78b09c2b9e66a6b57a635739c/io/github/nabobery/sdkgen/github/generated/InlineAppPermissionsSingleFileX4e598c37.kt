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
 * The level of permission to grant the access token to manage just a single file.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/single_file
 */
@Serializable(with = InlineAppPermissionsSingleFileX4e598c37.Serializer::class)
public sealed class InlineAppPermissionsSingleFileX4e598c37 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsSingleFileX4e598c37() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsSingleFileX4e598c37() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsSingleFileX4e598c37()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsSingleFileX4e598c37 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsSingleFileX4e598c37> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsSingleFileX4e598c37", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsSingleFileX4e598c37 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsSingleFileX4e598c37) {
      encoder.encodeString(value.value)
    }
  }
}
