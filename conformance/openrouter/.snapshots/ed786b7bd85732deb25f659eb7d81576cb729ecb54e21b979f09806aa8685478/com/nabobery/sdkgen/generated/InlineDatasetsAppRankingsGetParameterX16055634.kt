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
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1datasets~1app-rankings/get/parameters/2/schema
 */
@Serializable(with = InlineDatasetsAppRankingsGetParameterX16055634.Serializer::class)
public sealed class InlineDatasetsAppRankingsGetParameterX16055634 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `popular`.
   */
  public data object Popular : InlineDatasetsAppRankingsGetParameterX16055634() {
    public override val `value`: String = "popular"
  }

  /**
   * Documented value. Wire value: `trending`.
   */
  public data object Trending : InlineDatasetsAppRankingsGetParameterX16055634() {
    public override val `value`: String = "trending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDatasetsAppRankingsGetParameterX16055634()

  public companion object {
    public fun fromValue(`value`: String): InlineDatasetsAppRankingsGetParameterX16055634 = when (value) {
      Popular.value -> Popular
      Trending.value -> Trending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDatasetsAppRankingsGetParameterX16055634> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineDatasetsAppRankingsGetParameterX16055634", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDatasetsAppRankingsGetParameterX16055634 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDatasetsAppRankingsGetParameterX16055634) {
      encoder.encodeString(value.value)
    }
  }
}
