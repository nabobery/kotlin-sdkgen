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
 * Tokenizer type used by the model
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModelGroup
 */
@Serializable(with = ModelGroup.Serializer::class)
public sealed class ModelGroup {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Router`.
   */
  public data object Router : ModelGroup() {
    public override val `value`: String = "Router"
  }

  /**
   * Documented value. Wire value: `Media`.
   */
  public data object Media : ModelGroup() {
    public override val `value`: String = "Media"
  }

  /**
   * Documented value. Wire value: `Other`.
   */
  public data object Other : ModelGroup() {
    public override val `value`: String = "Other"
  }

  /**
   * Documented value. Wire value: `GPT`.
   */
  public data object Gpt : ModelGroup() {
    public override val `value`: String = "GPT"
  }

  /**
   * Documented value. Wire value: `Claude`.
   */
  public data object Claude : ModelGroup() {
    public override val `value`: String = "Claude"
  }

  /**
   * Documented value. Wire value: `Gemini`.
   */
  public data object Gemini : ModelGroup() {
    public override val `value`: String = "Gemini"
  }

  /**
   * Documented value. Wire value: `Gemma`.
   */
  public data object Gemma : ModelGroup() {
    public override val `value`: String = "Gemma"
  }

  /**
   * Documented value. Wire value: `Grok`.
   */
  public data object Grok : ModelGroup() {
    public override val `value`: String = "Grok"
  }

  /**
   * Documented value. Wire value: `Cohere`.
   */
  public data object Cohere : ModelGroup() {
    public override val `value`: String = "Cohere"
  }

  /**
   * Documented value. Wire value: `Nova`.
   */
  public data object Nova : ModelGroup() {
    public override val `value`: String = "Nova"
  }

  /**
   * Documented value. Wire value: `Qwen`.
   */
  public data object Qwen : ModelGroup() {
    public override val `value`: String = "Qwen"
  }

  /**
   * Documented value. Wire value: `Yi`.
   */
  public data object Yi : ModelGroup() {
    public override val `value`: String = "Yi"
  }

  /**
   * Documented value. Wire value: `DeepSeek`.
   */
  public data object DeepSeek : ModelGroup() {
    public override val `value`: String = "DeepSeek"
  }

  /**
   * Documented value. Wire value: `Mistral`.
   */
  public data object Mistral : ModelGroup() {
    public override val `value`: String = "Mistral"
  }

  /**
   * Documented value. Wire value: `Llama2`.
   */
  public data object Llama2 : ModelGroup() {
    public override val `value`: String = "Llama2"
  }

  /**
   * Documented value. Wire value: `Llama3`.
   */
  public data object Llama3 : ModelGroup() {
    public override val `value`: String = "Llama3"
  }

  /**
   * Documented value. Wire value: `Llama4`.
   */
  public data object Llama4 : ModelGroup() {
    public override val `value`: String = "Llama4"
  }

  /**
   * Documented value. Wire value: `PaLM`.
   */
  public data object PaLm : ModelGroup() {
    public override val `value`: String = "PaLM"
  }

  /**
   * Documented value. Wire value: `RWKV`.
   */
  public data object Rwkv : ModelGroup() {
    public override val `value`: String = "RWKV"
  }

  /**
   * Documented value. Wire value: `Qwen3`.
   */
  public data object Qwen3 : ModelGroup() {
    public override val `value`: String = "Qwen3"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ModelGroup()

  public companion object {
    public fun fromValue(`value`: String): ModelGroup = when (value) {
      Router.value -> Router
      Media.value -> Media
      Other.value -> Other
      Gpt.value -> Gpt
      Claude.value -> Claude
      Gemini.value -> Gemini
      Gemma.value -> Gemma
      Grok.value -> Grok
      Cohere.value -> Cohere
      Nova.value -> Nova
      Qwen.value -> Qwen
      Yi.value -> Yi
      DeepSeek.value -> DeepSeek
      Mistral.value -> Mistral
      Llama2.value -> Llama2
      Llama3.value -> Llama3
      Llama4.value -> Llama4
      PaLm.value -> PaLm
      Rwkv.value -> Rwkv
      Qwen3.value -> Qwen3
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ModelGroup> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ModelGroup", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ModelGroup = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ModelGroup) {
      encoder.encodeString(value.value)
    }
  }
}
