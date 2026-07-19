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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ProviderName.
 */
@Serializable(with = ProviderName.Serializer::class)
public sealed class ProviderName {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Meta`.
   */
  public data object Meta : ProviderName() {
    public override val `value`: String = "Meta"
  }

  /**
   * Documented value. Wire value: `AkashML`.
   */
  public data object AkashMl : ProviderName() {
    public override val `value`: String = "AkashML"
  }

  /**
   * Documented value. Wire value: `AI21`.
   */
  public data object Ai21 : ProviderName() {
    public override val `value`: String = "AI21"
  }

  /**
   * Documented value. Wire value: `AionLabs`.
   */
  public data object AionLabs : ProviderName() {
    public override val `value`: String = "AionLabs"
  }

  /**
   * Documented value. Wire value: `Alibaba`.
   */
  public data object Alibaba : ProviderName() {
    public override val `value`: String = "Alibaba"
  }

  /**
   * Documented value. Wire value: `Ambient`.
   */
  public data object Ambient : ProviderName() {
    public override val `value`: String = "Ambient"
  }

  /**
   * Documented value. Wire value: `Baidu`.
   */
  public data object Baidu : ProviderName() {
    public override val `value`: String = "Baidu"
  }

  /**
   * Documented value. Wire value: `Amazon Bedrock`.
   */
  public data object AmazonBedrock : ProviderName() {
    public override val `value`: String = "Amazon Bedrock"
  }

  /**
   * Documented value. Wire value: `Amazon Nova`.
   */
  public data object AmazonNova : ProviderName() {
    public override val `value`: String = "Amazon Nova"
  }

  /**
   * Documented value. Wire value: `Anthropic`.
   */
  public data object Anthropic : ProviderName() {
    public override val `value`: String = "Anthropic"
  }

  /**
   * Documented value. Wire value: `Arcee AI`.
   */
  public data object ArceeAi : ProviderName() {
    public override val `value`: String = "Arcee AI"
  }

  /**
   * Documented value. Wire value: `AtlasCloud`.
   */
  public data object AtlasCloud : ProviderName() {
    public override val `value`: String = "AtlasCloud"
  }

  /**
   * Documented value. Wire value: `Avian`.
   */
  public data object Avian : ProviderName() {
    public override val `value`: String = "Avian"
  }

  /**
   * Documented value. Wire value: `Azure`.
   */
  public data object Azure : ProviderName() {
    public override val `value`: String = "Azure"
  }

  /**
   * Documented value. Wire value: `BaseTen`.
   */
  public data object BaseTen : ProviderName() {
    public override val `value`: String = "BaseTen"
  }

  /**
   * Documented value. Wire value: `BytePlus`.
   */
  public data object BytePlus : ProviderName() {
    public override val `value`: String = "BytePlus"
  }

  /**
   * Documented value. Wire value: `Black Forest Labs`.
   */
  public data object BlackForestLabs : ProviderName() {
    public override val `value`: String = "Black Forest Labs"
  }

  /**
   * Documented value. Wire value: `Cerebras`.
   */
  public data object Cerebras : ProviderName() {
    public override val `value`: String = "Cerebras"
  }

  /**
   * Documented value. Wire value: `Chutes`.
   */
  public data object Chutes : ProviderName() {
    public override val `value`: String = "Chutes"
  }

  /**
   * Documented value. Wire value: `Cirrascale`.
   */
  public data object Cirrascale : ProviderName() {
    public override val `value`: String = "Cirrascale"
  }

  /**
   * Documented value. Wire value: `Clarifai`.
   */
  public data object Clarifai : ProviderName() {
    public override val `value`: String = "Clarifai"
  }

  /**
   * Documented value. Wire value: `Cloudflare`.
   */
  public data object Cloudflare : ProviderName() {
    public override val `value`: String = "Cloudflare"
  }

  /**
   * Documented value. Wire value: `Cohere`.
   */
  public data object Cohere : ProviderName() {
    public override val `value`: String = "Cohere"
  }

  /**
   * Documented value. Wire value: `Crucible`.
   */
  public data object Crucible : ProviderName() {
    public override val `value`: String = "Crucible"
  }

  /**
   * Documented value. Wire value: `Crusoe`.
   */
  public data object Crusoe : ProviderName() {
    public override val `value`: String = "Crusoe"
  }

  /**
   * Documented value. Wire value: `Darkbloom`.
   */
  public data object Darkbloom : ProviderName() {
    public override val `value`: String = "Darkbloom"
  }

  /**
   * Documented value. Wire value: `Decart`.
   */
  public data object Decart : ProviderName() {
    public override val `value`: String = "Decart"
  }

  /**
   * Documented value. Wire value: `Deepgram`.
   */
  public data object Deepgram : ProviderName() {
    public override val `value`: String = "Deepgram"
  }

  /**
   * Documented value. Wire value: `DeepInfra`.
   */
  public data object DeepInfra : ProviderName() {
    public override val `value`: String = "DeepInfra"
  }

  /**
   * Documented value. Wire value: `DeepSeek`.
   */
  public data object DeepSeek : ProviderName() {
    public override val `value`: String = "DeepSeek"
  }

  /**
   * Documented value. Wire value: `DekaLLM`.
   */
  public data object DekaLlm : ProviderName() {
    public override val `value`: String = "DekaLLM"
  }

  /**
   * Documented value. Wire value: `DigitalOcean`.
   */
  public data object DigitalOcean : ProviderName() {
    public override val `value`: String = "DigitalOcean"
  }

  /**
   * Documented value. Wire value: `Featherless`.
   */
  public data object Featherless : ProviderName() {
    public override val `value`: String = "Featherless"
  }

  /**
   * Documented value. Wire value: `Fireworks`.
   */
  public data object Fireworks : ProviderName() {
    public override val `value`: String = "Fireworks"
  }

  /**
   * Documented value. Wire value: `Friendli`.
   */
  public data object Friendli : ProviderName() {
    public override val `value`: String = "Friendli"
  }

  /**
   * Documented value. Wire value: `GMICloud`.
   */
  public data object GmiCloud : ProviderName() {
    public override val `value`: String = "GMICloud"
  }

  /**
   * Documented value. Wire value: `Google`.
   */
  public data object Google : ProviderName() {
    public override val `value`: String = "Google"
  }

  /**
   * Documented value. Wire value: `Google AI Studio`.
   */
  public data object GoogleAiStudio : ProviderName() {
    public override val `value`: String = "Google AI Studio"
  }

  /**
   * Documented value. Wire value: `Groq`.
   */
  public data object Groq : ProviderName() {
    public override val `value`: String = "Groq"
  }

  /**
   * Documented value. Wire value: `HeyGen`.
   */
  public data object HeyGen : ProviderName() {
    public override val `value`: String = "HeyGen"
  }

  /**
   * Documented value. Wire value: `Inception`.
   */
  public data object Inception : ProviderName() {
    public override val `value`: String = "Inception"
  }

  /**
   * Documented value. Wire value: `Inceptron`.
   */
  public data object Inceptron : ProviderName() {
    public override val `value`: String = "Inceptron"
  }

  /**
   * Documented value. Wire value: `InferenceNet`.
   */
  public data object InferenceNet : ProviderName() {
    public override val `value`: String = "InferenceNet"
  }

  /**
   * Documented value. Wire value: `Ionstream`.
   */
  public data object Ionstream : ProviderName() {
    public override val `value`: String = "Ionstream"
  }

  /**
   * Documented value. Wire value: `Infermatic`.
   */
  public data object Infermatic : ProviderName() {
    public override val `value`: String = "Infermatic"
  }

  /**
   * Documented value. Wire value: `Io Net`.
   */
  public data object IoNet : ProviderName() {
    public override val `value`: String = "Io Net"
  }

  /**
   * Documented value. Wire value: `Inferact vLLM`.
   */
  public data object InferactVLlm : ProviderName() {
    public override val `value`: String = "Inferact vLLM"
  }

  /**
   * Documented value. Wire value: `Inflection`.
   */
  public data object Inflection : ProviderName() {
    public override val `value`: String = "Inflection"
  }

  /**
   * Documented value. Wire value: `Liquid`.
   */
  public data object Liquid : ProviderName() {
    public override val `value`: String = "Liquid"
  }

  /**
   * Documented value. Wire value: `Mara`.
   */
  public data object Mara : ProviderName() {
    public override val `value`: String = "Mara"
  }

  /**
   * Documented value. Wire value: `Mancer 2`.
   */
  public data object Mancer2 : ProviderName() {
    public override val `value`: String = "Mancer 2"
  }

  /**
   * Documented value. Wire value: `Minimax`.
   */
  public data object Minimax : ProviderName() {
    public override val `value`: String = "Minimax"
  }

  /**
   * Documented value. Wire value: `ModelRun`.
   */
  public data object ModelRun : ProviderName() {
    public override val `value`: String = "ModelRun"
  }

  /**
   * Documented value. Wire value: `Mistral`.
   */
  public data object Mistral : ProviderName() {
    public override val `value`: String = "Mistral"
  }

  /**
   * Documented value. Wire value: `Modular`.
   */
  public data object Modular : ProviderName() {
    public override val `value`: String = "Modular"
  }

  /**
   * Documented value. Wire value: `Moonshot AI`.
   */
  public data object MoonshotAi : ProviderName() {
    public override val `value`: String = "Moonshot AI"
  }

  /**
   * Documented value. Wire value: `Morph`.
   */
  public data object Morph : ProviderName() {
    public override val `value`: String = "Morph"
  }

  /**
   * Documented value. Wire value: `NCompass`.
   */
  public data object NCompass : ProviderName() {
    public override val `value`: String = "NCompass"
  }

  /**
   * Documented value. Wire value: `Nebius`.
   */
  public data object Nebius : ProviderName() {
    public override val `value`: String = "Nebius"
  }

  /**
   * Documented value. Wire value: `Nex AGI`.
   */
  public data object NexAgi : ProviderName() {
    public override val `value`: String = "Nex AGI"
  }

  /**
   * Documented value. Wire value: `NextBit`.
   */
  public data object NextBit : ProviderName() {
    public override val `value`: String = "NextBit"
  }

  /**
   * Documented value. Wire value: `Novita`.
   */
  public data object Novita : ProviderName() {
    public override val `value`: String = "Novita"
  }

  /**
   * Documented value. Wire value: `Nvidia`.
   */
  public data object Nvidia : ProviderName() {
    public override val `value`: String = "Nvidia"
  }

  /**
   * Documented value. Wire value: `OpenAI`.
   */
  public data object OpenAi : ProviderName() {
    public override val `value`: String = "OpenAI"
  }

  /**
   * Documented value. Wire value: `OpenInference`.
   */
  public data object OpenInference : ProviderName() {
    public override val `value`: String = "OpenInference"
  }

  /**
   * Documented value. Wire value: `Parasail`.
   */
  public data object Parasail : ProviderName() {
    public override val `value`: String = "Parasail"
  }

  /**
   * Documented value. Wire value: `Poolside`.
   */
  public data object Poolside : ProviderName() {
    public override val `value`: String = "Poolside"
  }

  /**
   * Documented value. Wire value: `Perceptron`.
   */
  public data object Perceptron : ProviderName() {
    public override val `value`: String = "Perceptron"
  }

  /**
   * Documented value. Wire value: `Perplexity`.
   */
  public data object Perplexity : ProviderName() {
    public override val `value`: String = "Perplexity"
  }

  /**
   * Documented value. Wire value: `Phala`.
   */
  public data object Phala : ProviderName() {
    public override val `value`: String = "Phala"
  }

  /**
   * Documented value. Wire value: `Recraft`.
   */
  public data object Recraft : ProviderName() {
    public override val `value`: String = "Recraft"
  }

  /**
   * Documented value. Wire value: `Reka`.
   */
  public data object Reka : ProviderName() {
    public override val `value`: String = "Reka"
  }

  /**
   * Documented value. Wire value: `Relace`.
   */
  public data object Relace : ProviderName() {
    public override val `value`: String = "Relace"
  }

  /**
   * Documented value. Wire value: `Sail Research`.
   */
  public data object SailResearch : ProviderName() {
    public override val `value`: String = "Sail Research"
  }

  /**
   * Documented value. Wire value: `Sakana AI`.
   */
  public data object SakanaAi : ProviderName() {
    public override val `value`: String = "Sakana AI"
  }

  /**
   * Documented value. Wire value: `SambaNova`.
   */
  public data object SambaNova : ProviderName() {
    public override val `value`: String = "SambaNova"
  }

  /**
   * Documented value. Wire value: `Seed`.
   */
  public data object Seed : ProviderName() {
    public override val `value`: String = "Seed"
  }

  /**
   * Documented value. Wire value: `SiliconFlow`.
   */
  public data object SiliconFlow : ProviderName() {
    public override val `value`: String = "SiliconFlow"
  }

  /**
   * Documented value. Wire value: `Sourceful`.
   */
  public data object Sourceful : ProviderName() {
    public override val `value`: String = "Sourceful"
  }

  /**
   * Documented value. Wire value: `StepFun`.
   */
  public data object StepFun : ProviderName() {
    public override val `value`: String = "StepFun"
  }

  /**
   * Documented value. Wire value: `Stealth`.
   */
  public data object Stealth : ProviderName() {
    public override val `value`: String = "Stealth"
  }

  /**
   * Documented value. Wire value: `StreamLake`.
   */
  public data object StreamLake : ProviderName() {
    public override val `value`: String = "StreamLake"
  }

  /**
   * Documented value. Wire value: `Switchpoint`.
   */
  public data object Switchpoint : ProviderName() {
    public override val `value`: String = "Switchpoint"
  }

  /**
   * Documented value. Wire value: `Tenstorrent`.
   */
  public data object Tenstorrent : ProviderName() {
    public override val `value`: String = "Tenstorrent"
  }

  /**
   * Documented value. Wire value: `Together`.
   */
  public data object Together : ProviderName() {
    public override val `value`: String = "Together"
  }

  /**
   * Documented value. Wire value: `Upstage`.
   */
  public data object Upstage : ProviderName() {
    public override val `value`: String = "Upstage"
  }

  /**
   * Documented value. Wire value: `Venice`.
   */
  public data object Venice : ProviderName() {
    public override val `value`: String = "Venice"
  }

  /**
   * Documented value. Wire value: `Wafer`.
   */
  public data object Wafer : ProviderName() {
    public override val `value`: String = "Wafer"
  }

  /**
   * Documented value. Wire value: `WandB`.
   */
  public data object WandB : ProviderName() {
    public override val `value`: String = "WandB"
  }

  /**
   * Documented value. Wire value: `Quiver`.
   */
  public data object Quiver : ProviderName() {
    public override val `value`: String = "Quiver"
  }

  /**
   * Documented value. Wire value: `Xiaomi`.
   */
  public data object Xiaomi : ProviderName() {
    public override val `value`: String = "Xiaomi"
  }

  /**
   * Documented value. Wire value: `xAI`.
   */
  public data object XAi : ProviderName() {
    public override val `value`: String = "xAI"
  }

  /**
   * Documented value. Wire value: `Z.AI`.
   */
  public data object ZAi : ProviderName() {
    public override val `value`: String = "Z.AI"
  }

  /**
   * Documented value. Wire value: `FakeProvider`.
   */
  public data object FakeProvider : ProviderName() {
    public override val `value`: String = "FakeProvider"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ProviderName()

  public companion object {
    public fun fromValue(`value`: String): ProviderName = when (value) {
      Meta.value -> Meta
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

  public object Serializer : KSerializer<ProviderName> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ProviderName", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ProviderName = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ProviderName) {
      encoder.encodeString(value.value)
    }
  }
}
