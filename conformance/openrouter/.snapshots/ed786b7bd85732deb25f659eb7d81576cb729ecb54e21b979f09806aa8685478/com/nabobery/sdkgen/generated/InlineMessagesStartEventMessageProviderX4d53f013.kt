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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message/properties/provider.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message/properties/provider
 */
@Serializable(with = InlineMessagesStartEventMessageProviderX4d53f013.Serializer::class)
public sealed class InlineMessagesStartEventMessageProviderX4d53f013 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `AnyScale`.
   */
  public data object AnyScale : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "AnyScale"
  }

  /**
   * Documented value. Wire value: `Atoma`.
   */
  public data object Atoma : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Atoma"
  }

  /**
   * Documented value. Wire value: `Cent-ML`.
   */
  public data object CentMl : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Cent-ML"
  }

  /**
   * Documented value. Wire value: `CrofAI`.
   */
  public data object CrofAi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "CrofAI"
  }

  /**
   * Documented value. Wire value: `Enfer`.
   */
  public data object Enfer : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Enfer"
  }

  /**
   * Documented value. Wire value: `GoPomelo`.
   */
  public data object GoPomelo : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "GoPomelo"
  }

  /**
   * Documented value. Wire value: `HuggingFace`.
   */
  public data object HuggingFace : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "HuggingFace"
  }

  /**
   * Documented value. Wire value: `Hyperbolic`.
   */
  public data object Hyperbolic : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Hyperbolic"
  }

  /**
   * Documented value. Wire value: `Hyperbolic 2`.
   */
  public data object Hyperbolic2 : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Hyperbolic 2"
  }

  /**
   * Documented value. Wire value: `InoCloud`.
   */
  public data object InoCloud : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "InoCloud"
  }

  /**
   * Documented value. Wire value: `Kluster`.
   */
  public data object Kluster : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Kluster"
  }

  /**
   * Documented value. Wire value: `Lambda`.
   */
  public data object Lambda : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Lambda"
  }

  /**
   * Documented value. Wire value: `Lepton`.
   */
  public data object Lepton : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Lepton"
  }

  /**
   * Documented value. Wire value: `Lynn 2`.
   */
  public data object Lynn2 : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Lynn 2"
  }

  /**
   * Documented value. Wire value: `Lynn`.
   */
  public data object Lynn : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Lynn"
  }

  /**
   * Documented value. Wire value: `Mancer`.
   */
  public data object Mancer : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Mancer"
  }

  /**
   * Documented value. Wire value: `Meta`.
   */
  public data object Meta : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Meta"
  }

  /**
   * Documented value. Wire value: `Modal`.
   */
  public data object Modal : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Modal"
  }

  /**
   * Documented value. Wire value: `Nineteen`.
   */
  public data object Nineteen : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Nineteen"
  }

  /**
   * Documented value. Wire value: `OctoAI`.
   */
  public data object OctoAi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "OctoAI"
  }

  /**
   * Documented value. Wire value: `Recursal`.
   */
  public data object Recursal : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Recursal"
  }

  /**
   * Documented value. Wire value: `Reflection`.
   */
  public data object Reflection : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Reflection"
  }

  /**
   * Documented value. Wire value: `Replicate`.
   */
  public data object Replicate : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Replicate"
  }

  /**
   * Documented value. Wire value: `SambaNova 2`.
   */
  public data object SambaNova2 : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "SambaNova 2"
  }

  /**
   * Documented value. Wire value: `SF Compute`.
   */
  public data object SfCompute : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "SF Compute"
  }

  /**
   * Documented value. Wire value: `Targon`.
   */
  public data object Targon : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Targon"
  }

  /**
   * Documented value. Wire value: `Together 2`.
   */
  public data object Together2 : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Together 2"
  }

  /**
   * Documented value. Wire value: `Ubicloud`.
   */
  public data object Ubicloud : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Ubicloud"
  }

  /**
   * Documented value. Wire value: `01.AI`.
   */
  public data object _01Ai : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "01.AI"
  }

  /**
   * Documented value. Wire value: `AkashML`.
   */
  public data object AkashMl : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "AkashML"
  }

  /**
   * Documented value. Wire value: `AI21`.
   */
  public data object Ai21 : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "AI21"
  }

  /**
   * Documented value. Wire value: `AionLabs`.
   */
  public data object AionLabs : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "AionLabs"
  }

  /**
   * Documented value. Wire value: `Alibaba`.
   */
  public data object Alibaba : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Alibaba"
  }

  /**
   * Documented value. Wire value: `Ambient`.
   */
  public data object Ambient : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Ambient"
  }

  /**
   * Documented value. Wire value: `Baidu`.
   */
  public data object Baidu : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Baidu"
  }

  /**
   * Documented value. Wire value: `Amazon Bedrock`.
   */
  public data object AmazonBedrock : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Amazon Bedrock"
  }

  /**
   * Documented value. Wire value: `Amazon Nova`.
   */
  public data object AmazonNova : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Amazon Nova"
  }

  /**
   * Documented value. Wire value: `Anthropic`.
   */
  public data object Anthropic : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Anthropic"
  }

  /**
   * Documented value. Wire value: `Arcee AI`.
   */
  public data object ArceeAi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Arcee AI"
  }

  /**
   * Documented value. Wire value: `AtlasCloud`.
   */
  public data object AtlasCloud : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "AtlasCloud"
  }

  /**
   * Documented value. Wire value: `Avian`.
   */
  public data object Avian : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Avian"
  }

  /**
   * Documented value. Wire value: `Azure`.
   */
  public data object Azure : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Azure"
  }

  /**
   * Documented value. Wire value: `BaseTen`.
   */
  public data object BaseTen : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "BaseTen"
  }

  /**
   * Documented value. Wire value: `BytePlus`.
   */
  public data object BytePlus : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "BytePlus"
  }

  /**
   * Documented value. Wire value: `Black Forest Labs`.
   */
  public data object BlackForestLabs : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Black Forest Labs"
  }

  /**
   * Documented value. Wire value: `Cerebras`.
   */
  public data object Cerebras : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Cerebras"
  }

  /**
   * Documented value. Wire value: `Chutes`.
   */
  public data object Chutes : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Chutes"
  }

  /**
   * Documented value. Wire value: `Cirrascale`.
   */
  public data object Cirrascale : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Cirrascale"
  }

  /**
   * Documented value. Wire value: `Clarifai`.
   */
  public data object Clarifai : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Clarifai"
  }

  /**
   * Documented value. Wire value: `Cloudflare`.
   */
  public data object Cloudflare : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Cloudflare"
  }

  /**
   * Documented value. Wire value: `Cohere`.
   */
  public data object Cohere : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Cohere"
  }

  /**
   * Documented value. Wire value: `Crucible`.
   */
  public data object Crucible : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Crucible"
  }

  /**
   * Documented value. Wire value: `Crusoe`.
   */
  public data object Crusoe : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Crusoe"
  }

  /**
   * Documented value. Wire value: `Darkbloom`.
   */
  public data object Darkbloom : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Darkbloom"
  }

  /**
   * Documented value. Wire value: `Decart`.
   */
  public data object Decart : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Decart"
  }

  /**
   * Documented value. Wire value: `Deepgram`.
   */
  public data object Deepgram : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Deepgram"
  }

  /**
   * Documented value. Wire value: `DeepInfra`.
   */
  public data object DeepInfra : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "DeepInfra"
  }

  /**
   * Documented value. Wire value: `DeepSeek`.
   */
  public data object DeepSeek : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "DeepSeek"
  }

  /**
   * Documented value. Wire value: `DekaLLM`.
   */
  public data object DekaLlm : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "DekaLLM"
  }

  /**
   * Documented value. Wire value: `DigitalOcean`.
   */
  public data object DigitalOcean : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "DigitalOcean"
  }

  /**
   * Documented value. Wire value: `Featherless`.
   */
  public data object Featherless : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Featherless"
  }

  /**
   * Documented value. Wire value: `Fireworks`.
   */
  public data object Fireworks : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Fireworks"
  }

  /**
   * Documented value. Wire value: `Friendli`.
   */
  public data object Friendli : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Friendli"
  }

  /**
   * Documented value. Wire value: `GMICloud`.
   */
  public data object GmiCloud : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "GMICloud"
  }

  /**
   * Documented value. Wire value: `Google`.
   */
  public data object Google : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Google"
  }

  /**
   * Documented value. Wire value: `Google AI Studio`.
   */
  public data object GoogleAiStudio : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Google AI Studio"
  }

  /**
   * Documented value. Wire value: `Groq`.
   */
  public data object Groq : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Groq"
  }

  /**
   * Documented value. Wire value: `HeyGen`.
   */
  public data object HeyGen : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "HeyGen"
  }

  /**
   * Documented value. Wire value: `Inception`.
   */
  public data object Inception : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Inception"
  }

  /**
   * Documented value. Wire value: `Inceptron`.
   */
  public data object Inceptron : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Inceptron"
  }

  /**
   * Documented value. Wire value: `InferenceNet`.
   */
  public data object InferenceNet : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "InferenceNet"
  }

  /**
   * Documented value. Wire value: `Ionstream`.
   */
  public data object Ionstream : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Ionstream"
  }

  /**
   * Documented value. Wire value: `Infermatic`.
   */
  public data object Infermatic : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Infermatic"
  }

  /**
   * Documented value. Wire value: `Io Net`.
   */
  public data object IoNet : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Io Net"
  }

  /**
   * Documented value. Wire value: `Inferact vLLM`.
   */
  public data object InferactVLlm : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Inferact vLLM"
  }

  /**
   * Documented value. Wire value: `Inflection`.
   */
  public data object Inflection : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Inflection"
  }

  /**
   * Documented value. Wire value: `Liquid`.
   */
  public data object Liquid : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Liquid"
  }

  /**
   * Documented value. Wire value: `Mara`.
   */
  public data object Mara : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Mara"
  }

  /**
   * Documented value. Wire value: `Mancer 2`.
   */
  public data object Mancer2 : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Mancer 2"
  }

  /**
   * Documented value. Wire value: `Minimax`.
   */
  public data object Minimax : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Minimax"
  }

  /**
   * Documented value. Wire value: `ModelRun`.
   */
  public data object ModelRun : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "ModelRun"
  }

  /**
   * Documented value. Wire value: `Mistral`.
   */
  public data object Mistral : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Mistral"
  }

  /**
   * Documented value. Wire value: `Modular`.
   */
  public data object Modular : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Modular"
  }

  /**
   * Documented value. Wire value: `Moonshot AI`.
   */
  public data object MoonshotAi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Moonshot AI"
  }

  /**
   * Documented value. Wire value: `Morph`.
   */
  public data object Morph : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Morph"
  }

  /**
   * Documented value. Wire value: `NCompass`.
   */
  public data object NCompass : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "NCompass"
  }

  /**
   * Documented value. Wire value: `Nebius`.
   */
  public data object Nebius : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Nebius"
  }

  /**
   * Documented value. Wire value: `Nex AGI`.
   */
  public data object NexAgi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Nex AGI"
  }

  /**
   * Documented value. Wire value: `NextBit`.
   */
  public data object NextBit : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "NextBit"
  }

  /**
   * Documented value. Wire value: `Novita`.
   */
  public data object Novita : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Novita"
  }

  /**
   * Documented value. Wire value: `Nvidia`.
   */
  public data object Nvidia : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Nvidia"
  }

  /**
   * Documented value. Wire value: `OpenAI`.
   */
  public data object OpenAi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "OpenAI"
  }

  /**
   * Documented value. Wire value: `OpenInference`.
   */
  public data object OpenInference : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "OpenInference"
  }

  /**
   * Documented value. Wire value: `Parasail`.
   */
  public data object Parasail : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Parasail"
  }

  /**
   * Documented value. Wire value: `Poolside`.
   */
  public data object Poolside : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Poolside"
  }

  /**
   * Documented value. Wire value: `Perceptron`.
   */
  public data object Perceptron : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Perceptron"
  }

  /**
   * Documented value. Wire value: `Perplexity`.
   */
  public data object Perplexity : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Perplexity"
  }

  /**
   * Documented value. Wire value: `Phala`.
   */
  public data object Phala : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Phala"
  }

  /**
   * Documented value. Wire value: `Recraft`.
   */
  public data object Recraft : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Recraft"
  }

  /**
   * Documented value. Wire value: `Reka`.
   */
  public data object Reka : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Reka"
  }

  /**
   * Documented value. Wire value: `Relace`.
   */
  public data object Relace : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Relace"
  }

  /**
   * Documented value. Wire value: `Sail Research`.
   */
  public data object SailResearch : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Sail Research"
  }

  /**
   * Documented value. Wire value: `Sakana AI`.
   */
  public data object SakanaAi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Sakana AI"
  }

  /**
   * Documented value. Wire value: `SambaNova`.
   */
  public data object SambaNova : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "SambaNova"
  }

  /**
   * Documented value. Wire value: `Seed`.
   */
  public data object Seed : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Seed"
  }

  /**
   * Documented value. Wire value: `SiliconFlow`.
   */
  public data object SiliconFlow : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "SiliconFlow"
  }

  /**
   * Documented value. Wire value: `Sourceful`.
   */
  public data object Sourceful : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Sourceful"
  }

  /**
   * Documented value. Wire value: `StepFun`.
   */
  public data object StepFun : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "StepFun"
  }

  /**
   * Documented value. Wire value: `Stealth`.
   */
  public data object Stealth : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Stealth"
  }

  /**
   * Documented value. Wire value: `StreamLake`.
   */
  public data object StreamLake : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "StreamLake"
  }

  /**
   * Documented value. Wire value: `Switchpoint`.
   */
  public data object Switchpoint : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Switchpoint"
  }

  /**
   * Documented value. Wire value: `Tenstorrent`.
   */
  public data object Tenstorrent : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Tenstorrent"
  }

  /**
   * Documented value. Wire value: `Together`.
   */
  public data object Together : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Together"
  }

  /**
   * Documented value. Wire value: `Upstage`.
   */
  public data object Upstage : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Upstage"
  }

  /**
   * Documented value. Wire value: `Venice`.
   */
  public data object Venice : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Venice"
  }

  /**
   * Documented value. Wire value: `Wafer`.
   */
  public data object Wafer : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Wafer"
  }

  /**
   * Documented value. Wire value: `WandB`.
   */
  public data object WandB : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "WandB"
  }

  /**
   * Documented value. Wire value: `Quiver`.
   */
  public data object Quiver : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Quiver"
  }

  /**
   * Documented value. Wire value: `Xiaomi`.
   */
  public data object Xiaomi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Xiaomi"
  }

  /**
   * Documented value. Wire value: `xAI`.
   */
  public data object XAi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "xAI"
  }

  /**
   * Documented value. Wire value: `Z.AI`.
   */
  public data object ZAi : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "Z.AI"
  }

  /**
   * Documented value. Wire value: `FakeProvider`.
   */
  public data object FakeProvider : InlineMessagesStartEventMessageProviderX4d53f013() {
    public override val `value`: String = "FakeProvider"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesStartEventMessageProviderX4d53f013()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesStartEventMessageProviderX4d53f013 = when (value) {
      AnyScale.value -> AnyScale
      Atoma.value -> Atoma
      CentMl.value -> CentMl
      CrofAi.value -> CrofAi
      Enfer.value -> Enfer
      GoPomelo.value -> GoPomelo
      HuggingFace.value -> HuggingFace
      Hyperbolic.value -> Hyperbolic
      Hyperbolic2.value -> Hyperbolic2
      InoCloud.value -> InoCloud
      Kluster.value -> Kluster
      Lambda.value -> Lambda
      Lepton.value -> Lepton
      Lynn2.value -> Lynn2
      Lynn.value -> Lynn
      Mancer.value -> Mancer
      Meta.value -> Meta
      Modal.value -> Modal
      Nineteen.value -> Nineteen
      OctoAi.value -> OctoAi
      Recursal.value -> Recursal
      Reflection.value -> Reflection
      Replicate.value -> Replicate
      SambaNova2.value -> SambaNova2
      SfCompute.value -> SfCompute
      Targon.value -> Targon
      Together2.value -> Together2
      Ubicloud.value -> Ubicloud
      _01Ai.value -> _01Ai
      AkashMl.value -> AkashMl
      Ai21.value -> Ai21
      AionLabs.value -> AionLabs
      Alibaba.value -> Alibaba
      Ambient.value -> Ambient
      Baidu.value -> Baidu
      AmazonBedrock.value -> AmazonBedrock
      AmazonNova.value -> AmazonNova
      Anthropic.value -> Anthropic
      ArceeAi.value -> ArceeAi
      AtlasCloud.value -> AtlasCloud
      Avian.value -> Avian
      Azure.value -> Azure
      BaseTen.value -> BaseTen
      BytePlus.value -> BytePlus
      BlackForestLabs.value -> BlackForestLabs
      Cerebras.value -> Cerebras
      Chutes.value -> Chutes
      Cirrascale.value -> Cirrascale
      Clarifai.value -> Clarifai
      Cloudflare.value -> Cloudflare
      Cohere.value -> Cohere
      Crucible.value -> Crucible
      Crusoe.value -> Crusoe
      Darkbloom.value -> Darkbloom
      Decart.value -> Decart
      Deepgram.value -> Deepgram
      DeepInfra.value -> DeepInfra
      DeepSeek.value -> DeepSeek
      DekaLlm.value -> DekaLlm
      DigitalOcean.value -> DigitalOcean
      Featherless.value -> Featherless
      Fireworks.value -> Fireworks
      Friendli.value -> Friendli
      GmiCloud.value -> GmiCloud
      Google.value -> Google
      GoogleAiStudio.value -> GoogleAiStudio
      Groq.value -> Groq
      HeyGen.value -> HeyGen
      Inception.value -> Inception
      Inceptron.value -> Inceptron
      InferenceNet.value -> InferenceNet
      Ionstream.value -> Ionstream
      Infermatic.value -> Infermatic
      IoNet.value -> IoNet
      InferactVLlm.value -> InferactVLlm
      Inflection.value -> Inflection
      Liquid.value -> Liquid
      Mara.value -> Mara
      Mancer2.value -> Mancer2
      Minimax.value -> Minimax
      ModelRun.value -> ModelRun
      Mistral.value -> Mistral
      Modular.value -> Modular
      MoonshotAi.value -> MoonshotAi
      Morph.value -> Morph
      NCompass.value -> NCompass
      Nebius.value -> Nebius
      NexAgi.value -> NexAgi
      NextBit.value -> NextBit
      Novita.value -> Novita
      Nvidia.value -> Nvidia
      OpenAi.value -> OpenAi
      OpenInference.value -> OpenInference
      Parasail.value -> Parasail
      Poolside.value -> Poolside
      Perceptron.value -> Perceptron
      Perplexity.value -> Perplexity
      Phala.value -> Phala
      Recraft.value -> Recraft
      Reka.value -> Reka
      Relace.value -> Relace
      SailResearch.value -> SailResearch
      SakanaAi.value -> SakanaAi
      SambaNova.value -> SambaNova
      Seed.value -> Seed
      SiliconFlow.value -> SiliconFlow
      Sourceful.value -> Sourceful
      StepFun.value -> StepFun
      Stealth.value -> Stealth
      StreamLake.value -> StreamLake
      Switchpoint.value -> Switchpoint
      Tenstorrent.value -> Tenstorrent
      Together.value -> Together
      Upstage.value -> Upstage
      Venice.value -> Venice
      Wafer.value -> Wafer
      WandB.value -> WandB
      Quiver.value -> Quiver
      Xiaomi.value -> Xiaomi
      XAi.value -> XAi
      ZAi.value -> ZAi
      FakeProvider.value -> FakeProvider
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesStartEventMessageProviderX4d53f013> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesStartEventMessageProviderX4d53f013", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesStartEventMessageProviderX4d53f013 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesStartEventMessageProviderX4d53f013) {
      encoder.encodeString(value.value)
    }
  }
}
