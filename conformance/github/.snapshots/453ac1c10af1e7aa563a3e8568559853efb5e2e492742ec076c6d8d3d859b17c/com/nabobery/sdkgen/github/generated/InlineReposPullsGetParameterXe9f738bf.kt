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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls/get/parameters/5/schema
 */
@Serializable(with = InlineReposPullsGetParameterXe9f738bf.Serializer::class)
public sealed class InlineReposPullsGetParameterXe9f738bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineReposPullsGetParameterXe9f738bf() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineReposPullsGetParameterXe9f738bf() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `popularity`.
   */
  public data object Popularity : InlineReposPullsGetParameterXe9f738bf() {
    public override val `value`: String = "popularity"
  }

  /**
   * Documented value. Wire value: `long-running`.
   */
  public data object LongRunning : InlineReposPullsGetParameterXe9f738bf() {
    public override val `value`: String = "long-running"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsGetParameterXe9f738bf()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsGetParameterXe9f738bf = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Popularity.value -> Popularity
      LongRunning.value -> LongRunning
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposPullsGetParameterXe9f738bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPullsGetParameterXe9f738bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsGetParameterXe9f738bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsGetParameterXe9f738bf) {
      encoder.encodeString(value.value)
    }
  }
}
