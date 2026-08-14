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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1comments/get/parameters/4/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1comments/get/parameters/4/schema
 */
@Serializable(with = InlineReposPullsCommentsGetParameterX049d1ea8.Serializer::class)
public sealed class InlineReposPullsCommentsGetParameterX049d1ea8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineReposPullsCommentsGetParameterX049d1ea8() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineReposPullsCommentsGetParameterX049d1ea8() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsCommentsGetParameterX049d1ea8()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsCommentsGetParameterX049d1ea8 = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsGetParameterX049d1ea8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPullsCommentsGetParameterX049d1ea8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsGetParameterX049d1ea8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsGetParameterX049d1ea8) {
      encoder.encodeString(value.value)
    }
  }
}
