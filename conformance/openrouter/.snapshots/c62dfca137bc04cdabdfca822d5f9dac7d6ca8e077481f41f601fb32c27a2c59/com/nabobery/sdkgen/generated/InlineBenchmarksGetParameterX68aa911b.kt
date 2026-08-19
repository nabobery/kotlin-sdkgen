package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Filter results by task type. For Artificial Analysis, maps to the corresponding index. For Design Arena, maps to the
 * matching category.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1benchmarks/get/parameters/1/schema
 */
@Serializable(with = InlineBenchmarksGetParameterX68aa911b.Serializer::class)
public sealed class InlineBenchmarksGetParameterX68aa911b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coding`.
   */
  public data object Coding : InlineBenchmarksGetParameterX68aa911b() {
    public override val `value`: String = "coding"
  }

  /**
   * Documented value. Wire value: `intelligence`.
   */
  public data object Intelligence : InlineBenchmarksGetParameterX68aa911b() {
    public override val `value`: String = "intelligence"
  }

  /**
   * Documented value. Wire value: `agentic`.
   */
  public data object Agentic : InlineBenchmarksGetParameterX68aa911b() {
    public override val `value`: String = "agentic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBenchmarksGetParameterX68aa911b()

  public companion object {
    public fun fromValue(`value`: String): InlineBenchmarksGetParameterX68aa911b = when (value) {
      Coding.value -> Coding
      Intelligence.value -> Intelligence
      Agentic.value -> Agentic
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBenchmarksGetParameterX68aa911b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBenchmarksGetParameterX68aa911b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBenchmarksGetParameterX68aa911b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBenchmarksGetParameterX68aa911b) {
      encoder.encodeString(value.value)
    }
  }
}
