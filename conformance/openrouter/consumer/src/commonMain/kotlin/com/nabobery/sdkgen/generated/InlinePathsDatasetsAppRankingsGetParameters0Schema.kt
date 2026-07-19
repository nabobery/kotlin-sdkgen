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
 * Marketplace category group to filter by (e.g. `coding`). Only apps tagged with a subcategory inside this group are
 * returned. Mutually combinable with `subcategory` — when both are supplied the `subcategory` must belong to the
 * `category` group.
 */
@Serializable(with = InlinePathsDatasetsAppRankingsGetParameters0Schema.Serializer::class)
public sealed class InlinePathsDatasetsAppRankingsGetParameters0Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coding`.
   */
  public data object Coding : InlinePathsDatasetsAppRankingsGetParameters0Schema() {
    public override val `value`: String = "coding"
  }

  /**
   * Documented value. Wire value: `creative`.
   */
  public data object Creative : InlinePathsDatasetsAppRankingsGetParameters0Schema() {
    public override val `value`: String = "creative"
  }

  /**
   * Documented value. Wire value: `productivity`.
   */
  public data object Productivity : InlinePathsDatasetsAppRankingsGetParameters0Schema() {
    public override val `value`: String = "productivity"
  }

  /**
   * Documented value. Wire value: `entertainment`.
   */
  public data object Entertainment : InlinePathsDatasetsAppRankingsGetParameters0Schema() {
    public override val `value`: String = "entertainment"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsDatasetsAppRankingsGetParameters0Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsDatasetsAppRankingsGetParameters0Schema = when (value) {
      Coding.value -> Coding
      Creative.value -> Creative
      Productivity.value -> Productivity
      Entertainment.value -> Entertainment
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsDatasetsAppRankingsGetParameters0Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsDatasetsAppRankingsGetParameters0Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsDatasetsAppRankingsGetParameters0Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsDatasetsAppRankingsGetParameters0Schema) {
      encoder.encodeString(value.value)
    }
  }
}
