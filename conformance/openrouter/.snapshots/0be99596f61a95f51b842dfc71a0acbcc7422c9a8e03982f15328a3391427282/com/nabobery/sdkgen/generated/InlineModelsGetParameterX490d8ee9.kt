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
 * Filter by distillation capability. "true" returns only distillable models, "false" excludes them.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1models/get/parameters/14/schema
 */
@Serializable(with = InlineModelsGetParameterX490d8ee9.Serializer::class)
public sealed class InlineModelsGetParameterX490d8ee9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `true`.
   */
  public data object TrueValue : InlineModelsGetParameterX490d8ee9() {
    public override val `value`: String = "true"
  }

  /**
   * Documented value. Wire value: `false`.
   */
  public data object FalseValue : InlineModelsGetParameterX490d8ee9() {
    public override val `value`: String = "false"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineModelsGetParameterX490d8ee9()

  public companion object {
    public fun fromValue(`value`: String): InlineModelsGetParameterX490d8ee9 = when (value) {
      TrueValue.value -> TrueValue
      FalseValue.value -> FalseValue
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineModelsGetParameterX490d8ee9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineModelsGetParameterX490d8ee9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineModelsGetParameterX490d8ee9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineModelsGetParameterX490d8ee9) {
      encoder.encodeString(value.value)
    }
  }
}
