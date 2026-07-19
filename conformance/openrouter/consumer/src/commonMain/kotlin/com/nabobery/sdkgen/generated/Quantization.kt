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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/Quantization.
 */
@Serializable(with = Quantization.Serializer::class)
public sealed class Quantization {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `int4`.
   */
  public data object Int4 : Quantization() {
    public override val `value`: String = "int4"
  }

  /**
   * Documented value. Wire value: `int8`.
   */
  public data object Int8 : Quantization() {
    public override val `value`: String = "int8"
  }

  /**
   * Documented value. Wire value: `fp4`.
   */
  public data object Fp4 : Quantization() {
    public override val `value`: String = "fp4"
  }

  /**
   * Documented value. Wire value: `fp6`.
   */
  public data object Fp6 : Quantization() {
    public override val `value`: String = "fp6"
  }

  /**
   * Documented value. Wire value: `fp8`.
   */
  public data object Fp8 : Quantization() {
    public override val `value`: String = "fp8"
  }

  /**
   * Documented value. Wire value: `fp16`.
   */
  public data object Fp16 : Quantization() {
    public override val `value`: String = "fp16"
  }

  /**
   * Documented value. Wire value: `bf16`.
   */
  public data object Bf16 : Quantization() {
    public override val `value`: String = "bf16"
  }

  /**
   * Documented value. Wire value: `fp32`.
   */
  public data object Fp32 : Quantization() {
    public override val `value`: String = "fp32"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : Quantization() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : Quantization()

  public companion object {
    public fun fromValue(`value`: String): Quantization = when (value) {
      Int4.value -> Int4
      Int8.value -> Int8
      Fp4.value -> Fp4
      Fp6.value -> Fp6
      Fp8.value -> Fp8
      Fp16.value -> Fp16
      Bf16.value -> Bf16
      Fp32.value -> Fp32
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<Quantization> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.Quantization", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): Quantization = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: Quantization) {
      encoder.encodeString(value.value)
    }
  }
}
