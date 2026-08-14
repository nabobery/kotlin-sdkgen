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
 * Type of repository selection requested.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/personal-access-token-request/properties/repository_selection
 */
@Serializable(with = InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb.Serializer::class)
public sealed class InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `subset`.
   */
  public data object Subset : InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb() {
    public override val `value`: String = "subset"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb()

  public companion object {
    public fun fromValue(`value`: String): InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb = when (value) {
      None.value -> None
      All.value -> All
      Subset.value -> Subset
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb) {
      encoder.encodeString(value.value)
    }
  }
}
