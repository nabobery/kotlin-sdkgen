package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1forks/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1forks/get/parameters/2/schema
 */
@Serializable(with = InlineReposForksGetParameterX1b710ed5.Serializer::class)
public sealed class InlineReposForksGetParameterX1b710ed5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `newest`.
   */
  public data object Newest : InlineReposForksGetParameterX1b710ed5() {
    public override val `value`: String = "newest"
  }

  /**
   * Documented value. Wire value: `oldest`.
   */
  public data object Oldest : InlineReposForksGetParameterX1b710ed5() {
    public override val `value`: String = "oldest"
  }

  /**
   * Documented value. Wire value: `stargazers`.
   */
  public data object Stargazers : InlineReposForksGetParameterX1b710ed5() {
    public override val `value`: String = "stargazers"
  }

  /**
   * Documented value. Wire value: `watchers`.
   */
  public data object Watchers : InlineReposForksGetParameterX1b710ed5() {
    public override val `value`: String = "watchers"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposForksGetParameterX1b710ed5()

  public companion object {
    public fun fromValue(`value`: String): InlineReposForksGetParameterX1b710ed5 = when (value) {
      Newest.value -> Newest
      Oldest.value -> Oldest
      Stargazers.value -> Stargazers
      Watchers.value -> Watchers
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposForksGetParameterX1b710ed5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposForksGetParameterX1b710ed5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposForksGetParameterX1b710ed5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposForksGetParameterX1b710ed5) {
      encoder.encodeString(value.value)
    }
  }
}
