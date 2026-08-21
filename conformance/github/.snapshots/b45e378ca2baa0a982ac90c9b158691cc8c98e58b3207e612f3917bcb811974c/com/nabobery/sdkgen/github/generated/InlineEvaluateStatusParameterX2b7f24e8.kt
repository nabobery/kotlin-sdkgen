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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/evaluate-status/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/evaluate-status/schema
 */
@Serializable(with = InlineEvaluateStatusParameterX2b7f24e8.Serializer::class)
public sealed class InlineEvaluateStatusParameterX2b7f24e8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineEvaluateStatusParameterX2b7f24e8() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineEvaluateStatusParameterX2b7f24e8() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `evaluate`.
   */
  public data object Evaluate : InlineEvaluateStatusParameterX2b7f24e8() {
    public override val `value`: String = "evaluate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEvaluateStatusParameterX2b7f24e8()

  public companion object {
    public fun fromValue(`value`: String): InlineEvaluateStatusParameterX2b7f24e8 = when (value) {
      All.value -> All
      Active.value -> Active
      Evaluate.value -> Evaluate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEvaluateStatusParameterX2b7f24e8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEvaluateStatusParameterX2b7f24e8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEvaluateStatusParameterX2b7f24e8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEvaluateStatusParameterX2b7f24e8) {
      encoder.encodeString(value.value)
    }
  }
}
