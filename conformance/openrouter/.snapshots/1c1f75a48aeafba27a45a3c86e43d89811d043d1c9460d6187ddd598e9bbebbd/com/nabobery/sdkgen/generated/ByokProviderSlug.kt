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
 * The upstream provider this credential authenticates against, as a lowercase slug (e.g. `openai`, `anthropic`,
 * `amazon-bedrock`).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BYOKProviderSlug
 */
@Serializable(with = ByokProviderSlug.Serializer::class)
public sealed class ByokProviderSlug {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ai21`.
   */
  public data object Ai21 : ByokProviderSlug() {
    public override val `value`: String = "ai21"
  }

  /**
   * Documented value. Wire value: `aion-labs`.
   */
  public data object AionLabs : ByokProviderSlug() {
    public override val `value`: String = "aion-labs"
  }

  /**
   * Documented value. Wire value: `akashml`.
   */
  public data object Akashml : ByokProviderSlug() {
    public override val `value`: String = "akashml"
  }

  /**
   * Documented value. Wire value: `alibaba`.
   */
  public data object Alibaba : ByokProviderSlug() {
    public override val `value`: String = "alibaba"
  }

  /**
   * Documented value. Wire value: `amazon-bedrock`.
   */
  public data object AmazonBedrock : ByokProviderSlug() {
    public override val `value`: String = "amazon-bedrock"
  }

  /**
   * Documented value. Wire value: `amazon-nova`.
   */
  public data object AmazonNova : ByokProviderSlug() {
    public override val `value`: String = "amazon-nova"
  }

  /**
   * Documented value. Wire value: `ambient`.
   */
  public data object Ambient : ByokProviderSlug() {
    public override val `value`: String = "ambient"
  }

  /**
   * Documented value. Wire value: `anthropic`.
   */
  public data object Anthropic : ByokProviderSlug() {
    public override val `value`: String = "anthropic"
  }

  /**
   * Documented value. Wire value: `arcee-ai`.
   */
  public data object ArceeAi : ByokProviderSlug() {
    public override val `value`: String = "arcee-ai"
  }

  /**
   * Documented value. Wire value: `atlas-cloud`.
   */
  public data object AtlasCloud : ByokProviderSlug() {
    public override val `value`: String = "atlas-cloud"
  }

  /**
   * Documented value. Wire value: `avian`.
   */
  public data object Avian : ByokProviderSlug() {
    public override val `value`: String = "avian"
  }

  /**
   * Documented value. Wire value: `azure`.
   */
  public data object Azure : ByokProviderSlug() {
    public override val `value`: String = "azure"
  }

  /**
   * Documented value. Wire value: `baidu`.
   */
  public data object Baidu : ByokProviderSlug() {
    public override val `value`: String = "baidu"
  }

  /**
   * Documented value. Wire value: `baseten`.
   */
  public data object Baseten : ByokProviderSlug() {
    public override val `value`: String = "baseten"
  }

  /**
   * Documented value. Wire value: `black-forest-labs`.
   */
  public data object BlackForestLabs : ByokProviderSlug() {
    public override val `value`: String = "black-forest-labs"
  }

  /**
   * Documented value. Wire value: `byteplus`.
   */
  public data object Byteplus : ByokProviderSlug() {
    public override val `value`: String = "byteplus"
  }

  /**
   * Documented value. Wire value: `cerebras`.
   */
  public data object Cerebras : ByokProviderSlug() {
    public override val `value`: String = "cerebras"
  }

  /**
   * Documented value. Wire value: `chutes`.
   */
  public data object Chutes : ByokProviderSlug() {
    public override val `value`: String = "chutes"
  }

  /**
   * Documented value. Wire value: `cirrascale`.
   */
  public data object Cirrascale : ByokProviderSlug() {
    public override val `value`: String = "cirrascale"
  }

  /**
   * Documented value. Wire value: `clarifai`.
   */
  public data object Clarifai : ByokProviderSlug() {
    public override val `value`: String = "clarifai"
  }

  /**
   * Documented value. Wire value: `cloudflare`.
   */
  public data object Cloudflare : ByokProviderSlug() {
    public override val `value`: String = "cloudflare"
  }

  /**
   * Documented value. Wire value: `cohere`.
   */
  public data object Cohere : ByokProviderSlug() {
    public override val `value`: String = "cohere"
  }

  /**
   * Documented value. Wire value: `crusoe`.
   */
  public data object Crusoe : ByokProviderSlug() {
    public override val `value`: String = "crusoe"
  }

  /**
   * Documented value. Wire value: `darkbloom`.
   */
  public data object Darkbloom : ByokProviderSlug() {
    public override val `value`: String = "darkbloom"
  }

  /**
   * Documented value. Wire value: `decart`.
   */
  public data object Decart : ByokProviderSlug() {
    public override val `value`: String = "decart"
  }

  /**
   * Documented value. Wire value: `deepgram`.
   */
  public data object Deepgram : ByokProviderSlug() {
    public override val `value`: String = "deepgram"
  }

  /**
   * Documented value. Wire value: `deepinfra`.
   */
  public data object Deepinfra : ByokProviderSlug() {
    public override val `value`: String = "deepinfra"
  }

  /**
   * Documented value. Wire value: `deepseek`.
   */
  public data object Deepseek : ByokProviderSlug() {
    public override val `value`: String = "deepseek"
  }

  /**
   * Documented value. Wire value: `dekallm`.
   */
  public data object Dekallm : ByokProviderSlug() {
    public override val `value`: String = "dekallm"
  }

  /**
   * Documented value. Wire value: `digitalocean`.
   */
  public data object Digitalocean : ByokProviderSlug() {
    public override val `value`: String = "digitalocean"
  }

  /**
   * Documented value. Wire value: `featherless`.
   */
  public data object Featherless : ByokProviderSlug() {
    public override val `value`: String = "featherless"
  }

  /**
   * Documented value. Wire value: `fireworks`.
   */
  public data object Fireworks : ByokProviderSlug() {
    public override val `value`: String = "fireworks"
  }

  /**
   * Documented value. Wire value: `friendli`.
   */
  public data object Friendli : ByokProviderSlug() {
    public override val `value`: String = "friendli"
  }

  /**
   * Documented value. Wire value: `gmicloud`.
   */
  public data object Gmicloud : ByokProviderSlug() {
    public override val `value`: String = "gmicloud"
  }

  /**
   * Documented value. Wire value: `google-ai-studio`.
   */
  public data object GoogleAiStudio : ByokProviderSlug() {
    public override val `value`: String = "google-ai-studio"
  }

  /**
   * Documented value. Wire value: `google-vertex`.
   */
  public data object GoogleVertex : ByokProviderSlug() {
    public override val `value`: String = "google-vertex"
  }

  /**
   * Documented value. Wire value: `groq`.
   */
  public data object Groq : ByokProviderSlug() {
    public override val `value`: String = "groq"
  }

  /**
   * Documented value. Wire value: `heygen`.
   */
  public data object Heygen : ByokProviderSlug() {
    public override val `value`: String = "heygen"
  }

  /**
   * Documented value. Wire value: `inception`.
   */
  public data object Inception : ByokProviderSlug() {
    public override val `value`: String = "inception"
  }

  /**
   * Documented value. Wire value: `inceptron`.
   */
  public data object Inceptron : ByokProviderSlug() {
    public override val `value`: String = "inceptron"
  }

  /**
   * Documented value. Wire value: `inferact-vllm`.
   */
  public data object InferactVllm : ByokProviderSlug() {
    public override val `value`: String = "inferact-vllm"
  }

  /**
   * Documented value. Wire value: `inference-net`.
   */
  public data object InferenceNet : ByokProviderSlug() {
    public override val `value`: String = "inference-net"
  }

  /**
   * Documented value. Wire value: `infermatic`.
   */
  public data object Infermatic : ByokProviderSlug() {
    public override val `value`: String = "infermatic"
  }

  /**
   * Documented value. Wire value: `inflection`.
   */
  public data object Inflection : ByokProviderSlug() {
    public override val `value`: String = "inflection"
  }

  /**
   * Documented value. Wire value: `io-net`.
   */
  public data object IoNet : ByokProviderSlug() {
    public override val `value`: String = "io-net"
  }

  /**
   * Documented value. Wire value: `ionstream`.
   */
  public data object Ionstream : ByokProviderSlug() {
    public override val `value`: String = "ionstream"
  }

  /**
   * Documented value. Wire value: `liquid`.
   */
  public data object Liquid : ByokProviderSlug() {
    public override val `value`: String = "liquid"
  }

  /**
   * Documented value. Wire value: `mancer`.
   */
  public data object Mancer : ByokProviderSlug() {
    public override val `value`: String = "mancer"
  }

  /**
   * Documented value. Wire value: `mara`.
   */
  public data object Mara : ByokProviderSlug() {
    public override val `value`: String = "mara"
  }

  /**
   * Documented value. Wire value: `meta`.
   */
  public data object Meta : ByokProviderSlug() {
    public override val `value`: String = "meta"
  }

  /**
   * Documented value. Wire value: `minimax`.
   */
  public data object Minimax : ByokProviderSlug() {
    public override val `value`: String = "minimax"
  }

  /**
   * Documented value. Wire value: `mistral`.
   */
  public data object Mistral : ByokProviderSlug() {
    public override val `value`: String = "mistral"
  }

  /**
   * Documented value. Wire value: `modelrun`.
   */
  public data object Modelrun : ByokProviderSlug() {
    public override val `value`: String = "modelrun"
  }

  /**
   * Documented value. Wire value: `modular`.
   */
  public data object Modular : ByokProviderSlug() {
    public override val `value`: String = "modular"
  }

  /**
   * Documented value. Wire value: `moonshotai`.
   */
  public data object Moonshotai : ByokProviderSlug() {
    public override val `value`: String = "moonshotai"
  }

  /**
   * Documented value. Wire value: `morph`.
   */
  public data object Morph : ByokProviderSlug() {
    public override val `value`: String = "morph"
  }

  /**
   * Documented value. Wire value: `ncompass`.
   */
  public data object Ncompass : ByokProviderSlug() {
    public override val `value`: String = "ncompass"
  }

  /**
   * Documented value. Wire value: `nebius`.
   */
  public data object Nebius : ByokProviderSlug() {
    public override val `value`: String = "nebius"
  }

  /**
   * Documented value. Wire value: `nex-agi`.
   */
  public data object NexAgi : ByokProviderSlug() {
    public override val `value`: String = "nex-agi"
  }

  /**
   * Documented value. Wire value: `nextbit`.
   */
  public data object Nextbit : ByokProviderSlug() {
    public override val `value`: String = "nextbit"
  }

  /**
   * Documented value. Wire value: `novita`.
   */
  public data object Novita : ByokProviderSlug() {
    public override val `value`: String = "novita"
  }

  /**
   * Documented value. Wire value: `nvidia`.
   */
  public data object Nvidia : ByokProviderSlug() {
    public override val `value`: String = "nvidia"
  }

  /**
   * Documented value. Wire value: `open-inference`.
   */
  public data object OpenInference : ByokProviderSlug() {
    public override val `value`: String = "open-inference"
  }

  /**
   * Documented value. Wire value: `openai`.
   */
  public data object Openai : ByokProviderSlug() {
    public override val `value`: String = "openai"
  }

  /**
   * Documented value. Wire value: `parasail`.
   */
  public data object Parasail : ByokProviderSlug() {
    public override val `value`: String = "parasail"
  }

  /**
   * Documented value. Wire value: `perceptron`.
   */
  public data object Perceptron : ByokProviderSlug() {
    public override val `value`: String = "perceptron"
  }

  /**
   * Documented value. Wire value: `perplexity`.
   */
  public data object Perplexity : ByokProviderSlug() {
    public override val `value`: String = "perplexity"
  }

  /**
   * Documented value. Wire value: `phala`.
   */
  public data object Phala : ByokProviderSlug() {
    public override val `value`: String = "phala"
  }

  /**
   * Documented value. Wire value: `poolside`.
   */
  public data object Poolside : ByokProviderSlug() {
    public override val `value`: String = "poolside"
  }

  /**
   * Documented value. Wire value: `quiver`.
   */
  public data object Quiver : ByokProviderSlug() {
    public override val `value`: String = "quiver"
  }

  /**
   * Documented value. Wire value: `recraft`.
   */
  public data object Recraft : ByokProviderSlug() {
    public override val `value`: String = "recraft"
  }

  /**
   * Documented value. Wire value: `reka`.
   */
  public data object Reka : ByokProviderSlug() {
    public override val `value`: String = "reka"
  }

  /**
   * Documented value. Wire value: `relace`.
   */
  public data object Relace : ByokProviderSlug() {
    public override val `value`: String = "relace"
  }

  /**
   * Documented value. Wire value: `sail-research`.
   */
  public data object SailResearch : ByokProviderSlug() {
    public override val `value`: String = "sail-research"
  }

  /**
   * Documented value. Wire value: `sakana`.
   */
  public data object Sakana : ByokProviderSlug() {
    public override val `value`: String = "sakana"
  }

  /**
   * Documented value. Wire value: `sambanova`.
   */
  public data object Sambanova : ByokProviderSlug() {
    public override val `value`: String = "sambanova"
  }

  /**
   * Documented value. Wire value: `seed`.
   */
  public data object Seed : ByokProviderSlug() {
    public override val `value`: String = "seed"
  }

  /**
   * Documented value. Wire value: `siliconflow`.
   */
  public data object Siliconflow : ByokProviderSlug() {
    public override val `value`: String = "siliconflow"
  }

  /**
   * Documented value. Wire value: `sourceful`.
   */
  public data object Sourceful : ByokProviderSlug() {
    public override val `value`: String = "sourceful"
  }

  /**
   * Documented value. Wire value: `stepfun`.
   */
  public data object Stepfun : ByokProviderSlug() {
    public override val `value`: String = "stepfun"
  }

  /**
   * Documented value. Wire value: `streamlake`.
   */
  public data object Streamlake : ByokProviderSlug() {
    public override val `value`: String = "streamlake"
  }

  /**
   * Documented value. Wire value: `switchpoint`.
   */
  public data object Switchpoint : ByokProviderSlug() {
    public override val `value`: String = "switchpoint"
  }

  /**
   * Documented value. Wire value: `tenstorrent`.
   */
  public data object Tenstorrent : ByokProviderSlug() {
    public override val `value`: String = "tenstorrent"
  }

  /**
   * Documented value. Wire value: `together`.
   */
  public data object Together : ByokProviderSlug() {
    public override val `value`: String = "together"
  }

  /**
   * Documented value. Wire value: `upstage`.
   */
  public data object Upstage : ByokProviderSlug() {
    public override val `value`: String = "upstage"
  }

  /**
   * Documented value. Wire value: `venice`.
   */
  public data object Venice : ByokProviderSlug() {
    public override val `value`: String = "venice"
  }

  /**
   * Documented value. Wire value: `wafer`.
   */
  public data object Wafer : ByokProviderSlug() {
    public override val `value`: String = "wafer"
  }

  /**
   * Documented value. Wire value: `wandb`.
   */
  public data object Wandb : ByokProviderSlug() {
    public override val `value`: String = "wandb"
  }

  /**
   * Documented value. Wire value: `xai`.
   */
  public data object Xai : ByokProviderSlug() {
    public override val `value`: String = "xai"
  }

  /**
   * Documented value. Wire value: `xiaomi`.
   */
  public data object Xiaomi : ByokProviderSlug() {
    public override val `value`: String = "xiaomi"
  }

  /**
   * Documented value. Wire value: `z-ai`.
   */
  public data object ZAi : ByokProviderSlug() {
    public override val `value`: String = "z-ai"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ByokProviderSlug()

  public companion object {
    public fun fromValue(`value`: String): ByokProviderSlug = when (value) {
      Ai21.value -> Ai21
      AionLabs.value -> AionLabs
      Akashml.value -> Akashml
      Alibaba.value -> Alibaba
      AmazonBedrock.value -> AmazonBedrock
      AmazonNova.value -> AmazonNova
      Ambient.value -> Ambient
      Anthropic.value -> Anthropic
      ArceeAi.value -> ArceeAi
      AtlasCloud.value -> AtlasCloud
      Avian.value -> Avian
      Azure.value -> Azure
      Baidu.value -> Baidu
      Baseten.value -> Baseten
      BlackForestLabs.value -> BlackForestLabs
      Byteplus.value -> Byteplus
      Cerebras.value -> Cerebras
      Chutes.value -> Chutes
      Cirrascale.value -> Cirrascale
      Clarifai.value -> Clarifai
      Cloudflare.value -> Cloudflare
      Cohere.value -> Cohere
      Crusoe.value -> Crusoe
      Darkbloom.value -> Darkbloom
      Decart.value -> Decart
      Deepgram.value -> Deepgram
      Deepinfra.value -> Deepinfra
      Deepseek.value -> Deepseek
      Dekallm.value -> Dekallm
      Digitalocean.value -> Digitalocean
      Featherless.value -> Featherless
      Fireworks.value -> Fireworks
      Friendli.value -> Friendli
      Gmicloud.value -> Gmicloud
      GoogleAiStudio.value -> GoogleAiStudio
      GoogleVertex.value -> GoogleVertex
      Groq.value -> Groq
      Heygen.value -> Heygen
      Inception.value -> Inception
      Inceptron.value -> Inceptron
      InferactVllm.value -> InferactVllm
      InferenceNet.value -> InferenceNet
      Infermatic.value -> Infermatic
      Inflection.value -> Inflection
      IoNet.value -> IoNet
      Ionstream.value -> Ionstream
      Liquid.value -> Liquid
      Mancer.value -> Mancer
      Mara.value -> Mara
      Meta.value -> Meta
      Minimax.value -> Minimax
      Mistral.value -> Mistral
      Modelrun.value -> Modelrun
      Modular.value -> Modular
      Moonshotai.value -> Moonshotai
      Morph.value -> Morph
      Ncompass.value -> Ncompass
      Nebius.value -> Nebius
      NexAgi.value -> NexAgi
      Nextbit.value -> Nextbit
      Novita.value -> Novita
      Nvidia.value -> Nvidia
      OpenInference.value -> OpenInference
      Openai.value -> Openai
      Parasail.value -> Parasail
      Perceptron.value -> Perceptron
      Perplexity.value -> Perplexity
      Phala.value -> Phala
      Poolside.value -> Poolside
      Quiver.value -> Quiver
      Recraft.value -> Recraft
      Reka.value -> Reka
      Relace.value -> Relace
      SailResearch.value -> SailResearch
      Sakana.value -> Sakana
      Sambanova.value -> Sambanova
      Seed.value -> Seed
      Siliconflow.value -> Siliconflow
      Sourceful.value -> Sourceful
      Stepfun.value -> Stepfun
      Streamlake.value -> Streamlake
      Switchpoint.value -> Switchpoint
      Tenstorrent.value -> Tenstorrent
      Together.value -> Together
      Upstage.value -> Upstage
      Venice.value -> Venice
      Wafer.value -> Wafer
      Wandb.value -> Wandb
      Xai.value -> Xai
      Xiaomi.value -> Xiaomi
      ZAi.value -> ZAi
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ByokProviderSlug> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ByokProviderSlug", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ByokProviderSlug = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ByokProviderSlug) {
      encoder.encodeString(value.value)
    }
  }
}
