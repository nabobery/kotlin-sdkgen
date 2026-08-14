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
 * The level of permission to grant the access token to manage the followers belonging to a user.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/followers
 */
@Serializable(with = InlineAppPermissionsFollowersX2e17ce08.Serializer::class)
public sealed class InlineAppPermissionsFollowersX2e17ce08 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsFollowersX2e17ce08() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsFollowersX2e17ce08() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsFollowersX2e17ce08()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsFollowersX2e17ce08 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsFollowersX2e17ce08> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsFollowersX2e17ce08", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsFollowersX2e17ce08 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsFollowersX2e17ce08) {
      encoder.encodeString(value.value)
    }
  }
}
