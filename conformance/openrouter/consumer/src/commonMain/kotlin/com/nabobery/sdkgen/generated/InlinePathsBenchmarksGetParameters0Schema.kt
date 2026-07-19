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
 * Benchmark source to query. Determines the shape of the returned items. When omitted, returns results from all
 * sources.
 */
@Serializable(with = InlinePathsBenchmarksGetParameters0Schema.Serializer::class)
public sealed class InlinePathsBenchmarksGetParameters0Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `artificial-analysis`.
   */
  public data object ArtificialAnalysis : InlinePathsBenchmarksGetParameters0Schema() {
    public override val `value`: String = "artificial-analysis"
  }

  /**
   * Documented value. Wire value: `design-arena`.
   */
  public data object DesignArena : InlinePathsBenchmarksGetParameters0Schema() {
    public override val `value`: String = "design-arena"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsBenchmarksGetParameters0Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsBenchmarksGetParameters0Schema = when (value) {
      ArtificialAnalysis.value -> ArtificialAnalysis
      DesignArena.value -> DesignArena
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsBenchmarksGetParameters0Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsBenchmarksGetParameters0Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsBenchmarksGetParameters0Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsBenchmarksGetParameters0Schema) {
      encoder.encodeString(value.value)
    }
  }
}
