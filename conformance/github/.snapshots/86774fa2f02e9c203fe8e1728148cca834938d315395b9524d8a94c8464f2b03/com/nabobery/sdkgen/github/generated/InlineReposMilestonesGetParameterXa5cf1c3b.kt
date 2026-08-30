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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones/get/parameters/2/schema
 */
@Serializable(with = InlineReposMilestonesGetParameterXa5cf1c3b.Serializer::class)
public sealed class InlineReposMilestonesGetParameterXa5cf1c3b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReposMilestonesGetParameterXa5cf1c3b() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineReposMilestonesGetParameterXa5cf1c3b() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineReposMilestonesGetParameterXa5cf1c3b() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposMilestonesGetParameterXa5cf1c3b()

  public companion object {
    public fun fromValue(`value`: String): InlineReposMilestonesGetParameterXa5cf1c3b = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposMilestonesGetParameterXa5cf1c3b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposMilestonesGetParameterXa5cf1c3b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposMilestonesGetParameterXa5cf1c3b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposMilestonesGetParameterXa5cf1c3b) {
      encoder.encodeString(value.value)
    }
  }
}
