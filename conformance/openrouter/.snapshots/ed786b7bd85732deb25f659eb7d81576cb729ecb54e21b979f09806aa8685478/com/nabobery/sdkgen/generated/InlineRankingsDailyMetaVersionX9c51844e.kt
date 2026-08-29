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
 * Dataset version. Field names and grain are stable for the life of `v1`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/RankingsDailyMeta/properties/version
 */
@Serializable(with = InlineRankingsDailyMetaVersionX9c51844e.Serializer::class)
public sealed class InlineRankingsDailyMetaVersionX9c51844e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `v1`.
   */
  public data object V1 : InlineRankingsDailyMetaVersionX9c51844e() {
    public override val `value`: String = "v1"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRankingsDailyMetaVersionX9c51844e()

  public companion object {
    public fun fromValue(`value`: String): InlineRankingsDailyMetaVersionX9c51844e = when (value) {
      V1.value -> V1
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRankingsDailyMetaVersionX9c51844e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineRankingsDailyMetaVersionX9c51844e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRankingsDailyMetaVersionX9c51844e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRankingsDailyMetaVersionX9c51844e) {
      encoder.encodeString(value.value)
    }
  }
}
