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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1analyses/get/parameters/10/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1analyses/get/parameters/10/schema
 */
@Serializable(with = InlineReposCodeScanningAnalysesGetParameterX2203addf.Serializer::class)
public sealed class InlineReposCodeScanningAnalysesGetParameterX2203addf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineReposCodeScanningAnalysesGetParameterX2203addf() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCodeScanningAnalysesGetParameterX2203addf()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCodeScanningAnalysesGetParameterX2203addf = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCodeScanningAnalysesGetParameterX2203addf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposCodeScanningAnalysesGetParameterX2203addf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCodeScanningAnalysesGetParameterX2203addf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCodeScanningAnalysesGetParameterX2203addf) {
      encoder.encodeString(value.value)
    }
  }
}
