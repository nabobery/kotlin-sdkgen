package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1datasets~1app-rankings/get/parameters/0/schema
 */
@Serializable(with = InlineDatasetsAppRankingsGetParameterX9098751d.Serializer::class)
public sealed class InlineDatasetsAppRankingsGetParameterX9098751d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coding`.
   */
  public data object Coding : InlineDatasetsAppRankingsGetParameterX9098751d() {
    public override val `value`: String = "coding"
  }

  /**
   * Documented value. Wire value: `creative`.
   */
  public data object Creative : InlineDatasetsAppRankingsGetParameterX9098751d() {
    public override val `value`: String = "creative"
  }

  /**
   * Documented value. Wire value: `productivity`.
   */
  public data object Productivity : InlineDatasetsAppRankingsGetParameterX9098751d() {
    public override val `value`: String = "productivity"
  }

  /**
   * Documented value. Wire value: `entertainment`.
   */
  public data object Entertainment : InlineDatasetsAppRankingsGetParameterX9098751d() {
    public override val `value`: String = "entertainment"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDatasetsAppRankingsGetParameterX9098751d()

  public companion object {
    public fun fromValue(`value`: String): InlineDatasetsAppRankingsGetParameterX9098751d = when (value) {
      Coding.value -> Coding
      Creative.value -> Creative
      Productivity.value -> Productivity
      Entertainment.value -> Entertainment
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDatasetsAppRankingsGetParameterX9098751d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineDatasetsAppRankingsGetParameterX9098751d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDatasetsAppRankingsGetParameterX9098751d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDatasetsAppRankingsGetParameterX9098751d) {
      encoder.encodeString(value.value)
    }
  }
}
