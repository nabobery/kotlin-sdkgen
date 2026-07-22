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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones/get/parameters/4/schema
 */
@Serializable(with = InlineReposMilestonesGetParameterX9f0c461a.Serializer::class)
public sealed class InlineReposMilestonesGetParameterX9f0c461a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineReposMilestonesGetParameterX9f0c461a() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineReposMilestonesGetParameterX9f0c461a() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposMilestonesGetParameterX9f0c461a()

  public companion object {
    public fun fromValue(`value`: String): InlineReposMilestonesGetParameterX9f0c461a = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposMilestonesGetParameterX9f0c461a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposMilestonesGetParameterX9f0c461a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposMilestonesGetParameterX9f0c461a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposMilestonesGetParameterX9f0c461a) {
      encoder.encodeString(value.value)
    }
  }
}
