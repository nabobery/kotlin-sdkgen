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
 * Instruction format type
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InstructType
 */
@Serializable(with = InstructType.Serializer::class)
public sealed class InstructType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InstructType() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `airoboros`.
   */
  public data object Airoboros : InstructType() {
    public override val `value`: String = "airoboros"
  }

  /**
   * Documented value. Wire value: `alpaca`.
   */
  public data object Alpaca : InstructType() {
    public override val `value`: String = "alpaca"
  }

  /**
   * Documented value. Wire value: `alpaca-modif`.
   */
  public data object AlpacaModif : InstructType() {
    public override val `value`: String = "alpaca-modif"
  }

  /**
   * Documented value. Wire value: `chatml`.
   */
  public data object Chatml : InstructType() {
    public override val `value`: String = "chatml"
  }

  /**
   * Documented value. Wire value: `claude`.
   */
  public data object Claude : InstructType() {
    public override val `value`: String = "claude"
  }

  /**
   * Documented value. Wire value: `code-llama`.
   */
  public data object CodeLlama : InstructType() {
    public override val `value`: String = "code-llama"
  }

  /**
   * Documented value. Wire value: `gemma`.
   */
  public data object Gemma : InstructType() {
    public override val `value`: String = "gemma"
  }

  /**
   * Documented value. Wire value: `llama2`.
   */
  public data object Llama2 : InstructType() {
    public override val `value`: String = "llama2"
  }

  /**
   * Documented value. Wire value: `llama3`.
   */
  public data object Llama3 : InstructType() {
    public override val `value`: String = "llama3"
  }

  /**
   * Documented value. Wire value: `mistral`.
   */
  public data object Mistral : InstructType() {
    public override val `value`: String = "mistral"
  }

  /**
   * Documented value. Wire value: `nemotron`.
   */
  public data object Nemotron : InstructType() {
    public override val `value`: String = "nemotron"
  }

  /**
   * Documented value. Wire value: `neural`.
   */
  public data object Neural : InstructType() {
    public override val `value`: String = "neural"
  }

  /**
   * Documented value. Wire value: `openchat`.
   */
  public data object Openchat : InstructType() {
    public override val `value`: String = "openchat"
  }

  /**
   * Documented value. Wire value: `phi3`.
   */
  public data object Phi3 : InstructType() {
    public override val `value`: String = "phi3"
  }

  /**
   * Documented value. Wire value: `rwkv`.
   */
  public data object Rwkv : InstructType() {
    public override val `value`: String = "rwkv"
  }

  /**
   * Documented value. Wire value: `vicuna`.
   */
  public data object Vicuna : InstructType() {
    public override val `value`: String = "vicuna"
  }

  /**
   * Documented value. Wire value: `zephyr`.
   */
  public data object Zephyr : InstructType() {
    public override val `value`: String = "zephyr"
  }

  /**
   * Documented value. Wire value: `deepseek-r1`.
   */
  public data object DeepseekR1 : InstructType() {
    public override val `value`: String = "deepseek-r1"
  }

  /**
   * Documented value. Wire value: `deepseek-v3.1`.
   */
  public data object DeepseekV31 : InstructType() {
    public override val `value`: String = "deepseek-v3.1"
  }

  /**
   * Documented value. Wire value: `qwq`.
   */
  public data object Qwq : InstructType() {
    public override val `value`: String = "qwq"
  }

  /**
   * Documented value. Wire value: `qwen3`.
   */
  public data object Qwen3 : InstructType() {
    public override val `value`: String = "qwen3"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InstructType()

  public companion object {
    public fun fromValue(`value`: String): InstructType = when (value) {
      None.value -> None
      Airoboros.value -> Airoboros
      Alpaca.value -> Alpaca
      AlpacaModif.value -> AlpacaModif
      Chatml.value -> Chatml
      Claude.value -> Claude
      CodeLlama.value -> CodeLlama
      Gemma.value -> Gemma
      Llama2.value -> Llama2
      Llama3.value -> Llama3
      Mistral.value -> Mistral
      Nemotron.value -> Nemotron
      Neural.value -> Neural
      Openchat.value -> Openchat
      Phi3.value -> Phi3
      Rwkv.value -> Rwkv
      Vicuna.value -> Vicuna
      Zephyr.value -> Zephyr
      DeepseekR1.value -> DeepseekR1
      DeepseekV31.value -> DeepseekV31
      Qwq.value -> Qwq
      Qwen3.value -> Qwen3
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InstructType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InstructType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InstructType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InstructType) {
      encoder.encodeString(value.value)
    }
  }
}
