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
 * The type of repositories in the organization that the secret is visible to
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespaces-secret/properties/visibility
 */
@Serializable(with = InlineCodespacesSecretVisibilityX1fefb70d.Serializer::class)
public sealed class InlineCodespacesSecretVisibilityX1fefb70d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineCodespacesSecretVisibilityX1fefb70d() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineCodespacesSecretVisibilityX1fefb70d() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineCodespacesSecretVisibilityX1fefb70d() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodespacesSecretVisibilityX1fefb70d()

  public companion object {
    public fun fromValue(`value`: String): InlineCodespacesSecretVisibilityX1fefb70d = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodespacesSecretVisibilityX1fefb70d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodespacesSecretVisibilityX1fefb70d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodespacesSecretVisibilityX1fefb70d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodespacesSecretVisibilityX1fefb70d) {
      encoder.encodeString(value.value)
    }
  }
}
