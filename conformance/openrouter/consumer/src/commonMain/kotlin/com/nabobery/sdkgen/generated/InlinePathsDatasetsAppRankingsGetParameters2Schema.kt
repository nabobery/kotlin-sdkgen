package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * `popular` ranks apps by total token volume inside the date window. `trending` ranks apps by absolute excess token
 * growth: window volume minus the average volume of the three equal-length periods immediately preceding the window.
 * Apps with no excess growth are omitted from `trending` results.
 */
@Serializable(with = InlinePathsDatasetsAppRankingsGetParameters2Schema.Serializer::class)
public sealed class InlinePathsDatasetsAppRankingsGetParameters2Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `popular`.
   */
  public data object Popular : InlinePathsDatasetsAppRankingsGetParameters2Schema() {
    public override val `value`: String = "popular"
  }

  /**
   * Documented value. Wire value: `trending`.
   */
  public data object Trending : InlinePathsDatasetsAppRankingsGetParameters2Schema() {
    public override val `value`: String = "trending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsDatasetsAppRankingsGetParameters2Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsDatasetsAppRankingsGetParameters2Schema = when (value) {
      Popular.value -> Popular
      Trending.value -> Trending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsDatasetsAppRankingsGetParameters2Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsDatasetsAppRankingsGetParameters2Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsDatasetsAppRankingsGetParameters2Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsDatasetsAppRankingsGetParameters2Schema) {
      encoder.encodeString(value.value)
    }
  }
}
