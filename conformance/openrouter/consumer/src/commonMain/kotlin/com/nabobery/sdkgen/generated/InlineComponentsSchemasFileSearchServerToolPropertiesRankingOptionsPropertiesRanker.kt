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
 */
@Serializable(with = InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker
  .Serializer::class)
public sealed class InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `default-2024-11-15`.
   */
  public data object Default20241115 : InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker() {
    public override val `value`: String = "default-2024-11-15"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker = when (value) {
      Auto.value -> Auto
      Default20241115.value -> Default20241115
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker) {
      encoder.encodeString(value.value)
    }
  }
}
