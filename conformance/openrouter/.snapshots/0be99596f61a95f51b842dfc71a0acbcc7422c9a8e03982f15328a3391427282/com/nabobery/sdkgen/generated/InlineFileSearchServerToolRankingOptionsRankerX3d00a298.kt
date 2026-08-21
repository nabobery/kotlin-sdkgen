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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/ranking_options/properties/ranker.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/ranking_options/properties/ranker
 */
@Serializable(with = InlineFileSearchServerToolRankingOptionsRankerX3d00a298.Serializer::class)
public sealed class InlineFileSearchServerToolRankingOptionsRankerX3d00a298 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineFileSearchServerToolRankingOptionsRankerX3d00a298() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `default-2024-11-15`.
   */
  public data object Default20241115 : InlineFileSearchServerToolRankingOptionsRankerX3d00a298() {
    public override val `value`: String = "default-2024-11-15"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFileSearchServerToolRankingOptionsRankerX3d00a298()

  public companion object {
    public fun fromValue(`value`: String): InlineFileSearchServerToolRankingOptionsRankerX3d00a298 = when (value) {
      Auto.value -> Auto
      Default20241115.value -> Default20241115
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFileSearchServerToolRankingOptionsRankerX3d00a298> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFileSearchServerToolRankingOptionsRankerX3d00a298", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFileSearchServerToolRankingOptionsRankerX3d00a298 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFileSearchServerToolRankingOptionsRankerX3d00a298) {
      encoder.encodeString(value.value)
    }
  }
}
