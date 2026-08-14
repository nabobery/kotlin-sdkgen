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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-quality~1findings/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-quality~1findings/get/parameters/6/schema
 */
@Serializable(with = InlineReposCodeQualityFindingsGetParameterXcc6159d8.Serializer::class)
public sealed class InlineReposCodeQualityFindingsGetParameterXcc6159d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReposCodeQualityFindingsGetParameterXcc6159d8() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineReposCodeQualityFindingsGetParameterXcc6159d8() {
    public override val `value`: String = "dismissed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCodeQualityFindingsGetParameterXcc6159d8()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCodeQualityFindingsGetParameterXcc6159d8 = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCodeQualityFindingsGetParameterXcc6159d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposCodeQualityFindingsGetParameterXcc6159d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCodeQualityFindingsGetParameterXcc6159d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCodeQualityFindingsGetParameterXcc6159d8) {
      encoder.encodeString(value.value)
    }
  }
}
