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
 * A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependency/properties/relationship
 */
@Serializable(with = InlineDependencyRelationshipX0ca4becb.Serializer::class)
public sealed class InlineDependencyRelationshipX0ca4becb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineDependencyRelationshipX0ca4becb() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `indirect`.
   */
  public data object Indirect : InlineDependencyRelationshipX0ca4becb() {
    public override val `value`: String = "indirect"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependencyRelationshipX0ca4becb()

  public companion object {
    public fun fromValue(`value`: String): InlineDependencyRelationshipX0ca4becb = when (value) {
      Direct.value -> Direct
      Indirect.value -> Indirect
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependencyRelationshipX0ca4becb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependencyRelationshipX0ca4becb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependencyRelationshipX0ca4becb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependencyRelationshipX0ca4becb) {
      encoder.encodeString(value.value)
    }
  }
}
