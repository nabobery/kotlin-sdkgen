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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones/get/parameters/3/schema
 */
@Serializable(with = InlineReposMilestonesGetParameterX8cb0fde4.Serializer::class)
public sealed class InlineReposMilestonesGetParameterX8cb0fde4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `due_on`.
   */
  public data object DueOn : InlineReposMilestonesGetParameterX8cb0fde4() {
    public override val `value`: String = "due_on"
  }

  /**
   * Documented value. Wire value: `completeness`.
   */
  public data object Completeness : InlineReposMilestonesGetParameterX8cb0fde4() {
    public override val `value`: String = "completeness"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposMilestonesGetParameterX8cb0fde4()

  public companion object {
    public fun fromValue(`value`: String): InlineReposMilestonesGetParameterX8cb0fde4 = when (value) {
      DueOn.value -> DueOn
      Completeness.value -> Completeness
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposMilestonesGetParameterX8cb0fde4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposMilestonesGetParameterX8cb0fde4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposMilestonesGetParameterX8cb0fde4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposMilestonesGetParameterX8cb0fde4) {
      encoder.encodeString(value.value)
    }
  }
}
