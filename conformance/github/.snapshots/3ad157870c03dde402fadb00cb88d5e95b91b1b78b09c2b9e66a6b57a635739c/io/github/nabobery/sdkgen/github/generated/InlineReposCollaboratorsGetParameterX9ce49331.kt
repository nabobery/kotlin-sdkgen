package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1collaborators/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1collaborators/get/parameters/2/schema
 */
@Serializable(with = InlineReposCollaboratorsGetParameterX9ce49331.Serializer::class)
public sealed class InlineReposCollaboratorsGetParameterX9ce49331 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `outside`.
   */
  public data object Outside : InlineReposCollaboratorsGetParameterX9ce49331() {
    public override val `value`: String = "outside"
  }

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineReposCollaboratorsGetParameterX9ce49331() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineReposCollaboratorsGetParameterX9ce49331() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCollaboratorsGetParameterX9ce49331()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCollaboratorsGetParameterX9ce49331 = when (value) {
      Outside.value -> Outside
      Direct.value -> Direct
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCollaboratorsGetParameterX9ce49331> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposCollaboratorsGetParameterX9ce49331", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCollaboratorsGetParameterX9ce49331 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCollaboratorsGetParameterX9ce49331) {
      encoder.encodeString(value.value)
    }
  }
}
