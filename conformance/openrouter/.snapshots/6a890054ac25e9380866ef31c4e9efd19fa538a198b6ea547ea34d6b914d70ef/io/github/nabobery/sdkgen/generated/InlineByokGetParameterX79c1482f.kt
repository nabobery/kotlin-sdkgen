package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Optional provider slug to filter by (e.g. `openai`, `anthropic`, `amazon-bedrock`).
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1byok/get/parameters/3/schema
 */
@Serializable(with = InlineByokGetParameterX79c1482f.Serializer::class)
public sealed class InlineByokGetParameterX79c1482f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ai21`.
   */
  public data object Ai21 : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "ai21"
  }

  /**
   * Documented value. Wire value: `aion-labs`.
   */
  public data object AionLabs : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "aion-labs"
  }

  /**
   * Documented value. Wire value: `akashml`.
   */
  public data object Akashml : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "akashml"
  }

  /**
   * Documented value. Wire value: `alibaba`.
   */
  public data object Alibaba : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "alibaba"
  }

  /**
   * Documented value. Wire value: `amazon-bedrock`.
   */
  public data object AmazonBedrock : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "amazon-bedrock"
  }

  /**
   * Documented value. Wire value: `amazon-nova`.
   */
  public data object AmazonNova : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "amazon-nova"
  }

  /**
   * Documented value. Wire value: `ambient`.
   */
  public data object Ambient : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "ambient"
  }

  /**
   * Documented value. Wire value: `anthropic`.
   */
  public data object Anthropic : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "anthropic"
  }

  /**
   * Documented value. Wire value: `arcee-ai`.
   */
  public data object ArceeAi : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "arcee-ai"
  }

  /**
   * Documented value. Wire value: `atlas-cloud`.
   */
  public data object AtlasCloud : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "atlas-cloud"
  }

  /**
   * Documented value. Wire value: `avian`.
   */
  public data object Avian : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "avian"
  }

  /**
   * Documented value. Wire value: `azure`.
   */
  public data object Azure : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "azure"
  }

  /**
   * Documented value. Wire value: `baidu`.
   */
  public data object Baidu : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "baidu"
  }

  /**
   * Documented value. Wire value: `baseten`.
   */
  public data object Baseten : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "baseten"
  }

  /**
   * Documented value. Wire value: `black-forest-labs`.
   */
  public data object BlackForestLabs : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "black-forest-labs"
  }

  /**
   * Documented value. Wire value: `byteplus`.
   */
  public data object Byteplus : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "byteplus"
  }

  /**
   * Documented value. Wire value: `cerebras`.
   */
  public data object Cerebras : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "cerebras"
  }

  /**
   * Documented value. Wire value: `chutes`.
   */
  public data object Chutes : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "chutes"
  }

  /**
   * Documented value. Wire value: `cirrascale`.
   */
  public data object Cirrascale : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "cirrascale"
  }

  /**
   * Documented value. Wire value: `clarifai`.
   */
  public data object Clarifai : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "clarifai"
  }

  /**
   * Documented value. Wire value: `cloudflare`.
   */
  public data object Cloudflare : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "cloudflare"
  }

  /**
   * Documented value. Wire value: `cohere`.
   */
  public data object Cohere : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "cohere"
  }

  /**
   * Documented value. Wire value: `crusoe`.
   */
  public data object Crusoe : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "crusoe"
  }

  /**
   * Documented value. Wire value: `darkbloom`.
   */
  public data object Darkbloom : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "darkbloom"
  }

  /**
   * Documented value. Wire value: `decart`.
   */
  public data object Decart : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "decart"
  }

  /**
   * Documented value. Wire value: `deepgram`.
   */
  public data object Deepgram : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "deepgram"
  }

  /**
   * Documented value. Wire value: `deepinfra`.
   */
  public data object Deepinfra : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "deepinfra"
  }

  /**
   * Documented value. Wire value: `deepseek`.
   */
  public data object Deepseek : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "deepseek"
  }

  /**
   * Documented value. Wire value: `dekallm`.
   */
  public data object Dekallm : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "dekallm"
  }

  /**
   * Documented value. Wire value: `digitalocean`.
   */
  public data object Digitalocean : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "digitalocean"
  }

  /**
   * Documented value. Wire value: `featherless`.
   */
  public data object Featherless : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "featherless"
  }

  /**
   * Documented value. Wire value: `fireworks`.
   */
  public data object Fireworks : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "fireworks"
  }

  /**
   * Documented value. Wire value: `friendli`.
   */
  public data object Friendli : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "friendli"
  }

  /**
   * Documented value. Wire value: `gmicloud`.
   */
  public data object Gmicloud : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "gmicloud"
  }

  /**
   * Documented value. Wire value: `google-ai-studio`.
   */
  public data object GoogleAiStudio : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "google-ai-studio"
  }

  /**
   * Documented value. Wire value: `google-vertex`.
   */
  public data object GoogleVertex : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "google-vertex"
  }

  /**
   * Documented value. Wire value: `groq`.
   */
  public data object Groq : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "groq"
  }

  /**
   * Documented value. Wire value: `heygen`.
   */
  public data object Heygen : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "heygen"
  }

  /**
   * Documented value. Wire value: `inception`.
   */
  public data object Inception : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "inception"
  }

  /**
   * Documented value. Wire value: `inceptron`.
   */
  public data object Inceptron : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "inceptron"
  }

  /**
   * Documented value. Wire value: `inferact-vllm`.
   */
  public data object InferactVllm : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "inferact-vllm"
  }

  /**
   * Documented value. Wire value: `inference-net`.
   */
  public data object InferenceNet : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "inference-net"
  }

  /**
   * Documented value. Wire value: `infermatic`.
   */
  public data object Infermatic : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "infermatic"
  }

  /**
   * Documented value. Wire value: `inflection`.
   */
  public data object Inflection : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "inflection"
  }

  /**
   * Documented value. Wire value: `io-net`.
   */
  public data object IoNet : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "io-net"
  }

  /**
   * Documented value. Wire value: `ionstream`.
   */
  public data object Ionstream : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "ionstream"
  }

  /**
   * Documented value. Wire value: `liquid`.
   */
  public data object Liquid : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "liquid"
  }

  /**
   * Documented value. Wire value: `mancer`.
   */
  public data object Mancer : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "mancer"
  }

  /**
   * Documented value. Wire value: `mara`.
   */
  public data object Mara : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "mara"
  }

  /**
   * Documented value. Wire value: `meta`.
   */
  public data object Meta : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "meta"
  }

  /**
   * Documented value. Wire value: `minimax`.
   */
  public data object Minimax : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "minimax"
  }

  /**
   * Documented value. Wire value: `mistral`.
   */
  public data object Mistral : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "mistral"
  }

  /**
   * Documented value. Wire value: `modelrun`.
   */
  public data object Modelrun : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "modelrun"
  }

  /**
   * Documented value. Wire value: `modular`.
   */
  public data object Modular : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "modular"
  }

  /**
   * Documented value. Wire value: `moonshotai`.
   */
  public data object Moonshotai : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "moonshotai"
  }

  /**
   * Documented value. Wire value: `morph`.
   */
  public data object Morph : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "morph"
  }

  /**
   * Documented value. Wire value: `ncompass`.
   */
  public data object Ncompass : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "ncompass"
  }

  /**
   * Documented value. Wire value: `nebius`.
   */
  public data object Nebius : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "nebius"
  }

  /**
   * Documented value. Wire value: `nex-agi`.
   */
  public data object NexAgi : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "nex-agi"
  }

  /**
   * Documented value. Wire value: `nextbit`.
   */
  public data object Nextbit : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "nextbit"
  }

  /**
   * Documented value. Wire value: `novita`.
   */
  public data object Novita : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "novita"
  }

  /**
   * Documented value. Wire value: `nvidia`.
   */
  public data object Nvidia : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "nvidia"
  }

  /**
   * Documented value. Wire value: `open-inference`.
   */
  public data object OpenInference : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "open-inference"
  }

  /**
   * Documented value. Wire value: `openai`.
   */
  public data object Openai : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "openai"
  }

  /**
   * Documented value. Wire value: `parasail`.
   */
  public data object Parasail : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "parasail"
  }

  /**
   * Documented value. Wire value: `perceptron`.
   */
  public data object Perceptron : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "perceptron"
  }

  /**
   * Documented value. Wire value: `perplexity`.
   */
  public data object Perplexity : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "perplexity"
  }

  /**
   * Documented value. Wire value: `phala`.
   */
  public data object Phala : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "phala"
  }

  /**
   * Documented value. Wire value: `poolside`.
   */
  public data object Poolside : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "poolside"
  }

  /**
   * Documented value. Wire value: `quiver`.
   */
  public data object Quiver : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "quiver"
  }

  /**
   * Documented value. Wire value: `recraft`.
   */
  public data object Recraft : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "recraft"
  }

  /**
   * Documented value. Wire value: `reka`.
   */
  public data object Reka : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "reka"
  }

  /**
   * Documented value. Wire value: `relace`.
   */
  public data object Relace : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "relace"
  }

  /**
   * Documented value. Wire value: `sail-research`.
   */
  public data object SailResearch : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "sail-research"
  }

  /**
   * Documented value. Wire value: `sakana`.
   */
  public data object Sakana : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "sakana"
  }

  /**
   * Documented value. Wire value: `sambanova`.
   */
  public data object Sambanova : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "sambanova"
  }

  /**
   * Documented value. Wire value: `seed`.
   */
  public data object Seed : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "seed"
  }

  /**
   * Documented value. Wire value: `siliconflow`.
   */
  public data object Siliconflow : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "siliconflow"
  }

  /**
   * Documented value. Wire value: `sourceful`.
   */
  public data object Sourceful : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "sourceful"
  }

  /**
   * Documented value. Wire value: `stepfun`.
   */
  public data object Stepfun : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "stepfun"
  }

  /**
   * Documented value. Wire value: `streamlake`.
   */
  public data object Streamlake : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "streamlake"
  }

  /**
   * Documented value. Wire value: `switchpoint`.
   */
  public data object Switchpoint : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "switchpoint"
  }

  /**
   * Documented value. Wire value: `tenstorrent`.
   */
  public data object Tenstorrent : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "tenstorrent"
  }

  /**
   * Documented value. Wire value: `together`.
   */
  public data object Together : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "together"
  }

  /**
   * Documented value. Wire value: `upstage`.
   */
  public data object Upstage : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "upstage"
  }

  /**
   * Documented value. Wire value: `venice`.
   */
  public data object Venice : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "venice"
  }

  /**
   * Documented value. Wire value: `wafer`.
   */
  public data object Wafer : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "wafer"
  }

  /**
   * Documented value. Wire value: `wandb`.
   */
  public data object Wandb : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "wandb"
  }

  /**
   * Documented value. Wire value: `xai`.
   */
  public data object Xai : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "xai"
  }

  /**
   * Documented value. Wire value: `xiaomi`.
   */
  public data object Xiaomi : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "xiaomi"
  }

  /**
   * Documented value. Wire value: `z-ai`.
   */
  public data object ZAi : InlineByokGetParameterX79c1482f() {
    public override val `value`: String = "z-ai"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineByokGetParameterX79c1482f()

  public companion object {
    public fun fromValue(`value`: String): InlineByokGetParameterX79c1482f = when (value) {
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

  internal object Serializer : KSerializer<InlineByokGetParameterX79c1482f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineByokGetParameterX79c1482f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineByokGetParameterX79c1482f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineByokGetParameterX79c1482f) {
      encoder.encodeString(value.value)
    }
  }
}
