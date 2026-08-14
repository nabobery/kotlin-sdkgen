package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationRequest/properties/provider/properties/options.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationRequest/properties/provider/properties/options
 */
@Serializable(with = InlineVideoGenerationRequestProviderOptionsXee223a59.Serializer::class)
public class InlineVideoGenerationRequestProviderOptionsXee223a59(
  _01ai: Map<String, JsonElement?>? = null,
  ai21: Map<String, JsonElement?>? = null,
  aionLabs: Map<String, JsonElement?>? = null,
  akashml: Map<String, JsonElement?>? = null,
  alibaba: Map<String, JsonElement?>? = null,
  amazonBedrock: Map<String, JsonElement?>? = null,
  amazonNova: Map<String, JsonElement?>? = null,
  ambient: Map<String, JsonElement?>? = null,
  anthropic: Map<String, JsonElement?>? = null,
  anyscale: Map<String, JsonElement?>? = null,
  arceeAi: Map<String, JsonElement?>? = null,
  atlasCloud: Map<String, JsonElement?>? = null,
  atoma: Map<String, JsonElement?>? = null,
  avian: Map<String, JsonElement?>? = null,
  azure: Map<String, JsonElement?>? = null,
  baidu: Map<String, JsonElement?>? = null,
  baseten: Map<String, JsonElement?>? = null,
  blackForestLabs: Map<String, JsonElement?>? = null,
  byteplus: Map<String, JsonElement?>? = null,
  centml: Map<String, JsonElement?>? = null,
  cerebras: Map<String, JsonElement?>? = null,
  chutes: Map<String, JsonElement?>? = null,
  cirrascale: Map<String, JsonElement?>? = null,
  clarifai: Map<String, JsonElement?>? = null,
  cloudflare: Map<String, JsonElement?>? = null,
  cohere: Map<String, JsonElement?>? = null,
  crofai: Map<String, JsonElement?>? = null,
  crucible: Map<String, JsonElement?>? = null,
  crusoe: Map<String, JsonElement?>? = null,
  darkbloom: Map<String, JsonElement?>? = null,
  decart: Map<String, JsonElement?>? = null,
  deepgram: Map<String, JsonElement?>? = null,
  deepinfra: Map<String, JsonElement?>? = null,
  deepseek: Map<String, JsonElement?>? = null,
  dekallm: Map<String, JsonElement?>? = null,
  digitalocean: Map<String, JsonElement?>? = null,
  enfer: Map<String, JsonElement?>? = null,
  fakeProvider: Map<String, JsonElement?>? = null,
  featherless: Map<String, JsonElement?>? = null,
  fireworks: Map<String, JsonElement?>? = null,
  friendli: Map<String, JsonElement?>? = null,
  gmicloud: Map<String, JsonElement?>? = null,
  googleAiStudio: Map<String, JsonElement?>? = null,
  googleVertex: Map<String, JsonElement?>? = null,
  gopomelo: Map<String, JsonElement?>? = null,
  groq: Map<String, JsonElement?>? = null,
  heygen: Map<String, JsonElement?>? = null,
  huggingface: Map<String, JsonElement?>? = null,
  hyperbolic: Map<String, JsonElement?>? = null,
  hyperbolicQuantized: Map<String, JsonElement?>? = null,
  inception: Map<String, JsonElement?>? = null,
  inceptron: Map<String, JsonElement?>? = null,
  inferactVllm: Map<String, JsonElement?>? = null,
  inferenceNet: Map<String, JsonElement?>? = null,
  infermatic: Map<String, JsonElement?>? = null,
  inflection: Map<String, JsonElement?>? = null,
  inocloud: Map<String, JsonElement?>? = null,
  ioNet: Map<String, JsonElement?>? = null,
  ionstream: Map<String, JsonElement?>? = null,
  klusterai: Map<String, JsonElement?>? = null,
  lambda: Map<String, JsonElement?>? = null,
  lepton: Map<String, JsonElement?>? = null,
  liquid: Map<String, JsonElement?>? = null,
  lynn: Map<String, JsonElement?>? = null,
  lynnPrivate: Map<String, JsonElement?>? = null,
  mancer: Map<String, JsonElement?>? = null,
  mancerOld: Map<String, JsonElement?>? = null,
  mara: Map<String, JsonElement?>? = null,
  meta: Map<String, JsonElement?>? = null,
  minimax: Map<String, JsonElement?>? = null,
  mistral: Map<String, JsonElement?>? = null,
  modal: Map<String, JsonElement?>? = null,
  modelrun: Map<String, JsonElement?>? = null,
  modular: Map<String, JsonElement?>? = null,
  moonshotai: Map<String, JsonElement?>? = null,
  morph: Map<String, JsonElement?>? = null,
  ncompass: Map<String, JsonElement?>? = null,
  nebius: Map<String, JsonElement?>? = null,
  nexAgi: Map<String, JsonElement?>? = null,
  nextbit: Map<String, JsonElement?>? = null,
  nineteen: Map<String, JsonElement?>? = null,
  novita: Map<String, JsonElement?>? = null,
  nvidia: Map<String, JsonElement?>? = null,
  octoai: Map<String, JsonElement?>? = null,
  openInference: Map<String, JsonElement?>? = null,
  openai: Map<String, JsonElement?>? = null,
  parasail: Map<String, JsonElement?>? = null,
  perceptron: Map<String, JsonElement?>? = null,
  perplexity: Map<String, JsonElement?>? = null,
  phala: Map<String, JsonElement?>? = null,
  poolside: Map<String, JsonElement?>? = null,
  quiver: Map<String, JsonElement?>? = null,
  recraft: Map<String, JsonElement?>? = null,
  recursal: Map<String, JsonElement?>? = null,
  reflection: Map<String, JsonElement?>? = null,
  reka: Map<String, JsonElement?>? = null,
  relace: Map<String, JsonElement?>? = null,
  replicate: Map<String, JsonElement?>? = null,
  sailResearch: Map<String, JsonElement?>? = null,
  sakana: Map<String, JsonElement?>? = null,
  sambanova: Map<String, JsonElement?>? = null,
  sambanovaCloaked: Map<String, JsonElement?>? = null,
  seed: Map<String, JsonElement?>? = null,
  sfCompute: Map<String, JsonElement?>? = null,
  siliconflow: Map<String, JsonElement?>? = null,
  sourceful: Map<String, JsonElement?>? = null,
  stealth: Map<String, JsonElement?>? = null,
  stepfun: Map<String, JsonElement?>? = null,
  streamlake: Map<String, JsonElement?>? = null,
  switchpoint: Map<String, JsonElement?>? = null,
  targon: Map<String, JsonElement?>? = null,
  tenstorrent: Map<String, JsonElement?>? = null,
  together: Map<String, JsonElement?>? = null,
  togetherLite: Map<String, JsonElement?>? = null,
  ubicloud: Map<String, JsonElement?>? = null,
  upstage: Map<String, JsonElement?>? = null,
  venice: Map<String, JsonElement?>? = null,
  wafer: Map<String, JsonElement?>? = null,
  wandb: Map<String, JsonElement?>? = null,
  xai: Map<String, JsonElement?>? = null,
  xiaomi: Map<String, JsonElement?>? = null,
  zAi: Map<String, JsonElement?>? = null,
) {
  public val _01ai: Map<String, JsonElement?>? = _01ai?.let { collection0 -> collection0.toMap() }

  public val ai21: Map<String, JsonElement?>? = ai21?.let { collection0 -> collection0.toMap() }

  public val aionLabs: Map<String, JsonElement?>? =
      aionLabs?.let { collection0 -> collection0.toMap() }

  public val akashml: Map<String, JsonElement?>? =
      akashml?.let { collection0 -> collection0.toMap() }

  public val alibaba: Map<String, JsonElement?>? =
      alibaba?.let { collection0 -> collection0.toMap() }

  public val amazonBedrock: Map<String, JsonElement?>? =
      amazonBedrock?.let { collection0 -> collection0.toMap() }

  public val amazonNova: Map<String, JsonElement?>? =
      amazonNova?.let { collection0 -> collection0.toMap() }

  public val ambient: Map<String, JsonElement?>? =
      ambient?.let { collection0 -> collection0.toMap() }

  public val anthropic: Map<String, JsonElement?>? =
      anthropic?.let { collection0 -> collection0.toMap() }

  public val anyscale: Map<String, JsonElement?>? =
      anyscale?.let { collection0 -> collection0.toMap() }

  public val arceeAi: Map<String, JsonElement?>? =
      arceeAi?.let { collection0 -> collection0.toMap() }

  public val atlasCloud: Map<String, JsonElement?>? =
      atlasCloud?.let { collection0 -> collection0.toMap() }

  public val atoma: Map<String, JsonElement?>? = atoma?.let { collection0 -> collection0.toMap() }

  public val avian: Map<String, JsonElement?>? = avian?.let { collection0 -> collection0.toMap() }

  public val azure: Map<String, JsonElement?>? = azure?.let { collection0 -> collection0.toMap() }

  public val baidu: Map<String, JsonElement?>? = baidu?.let { collection0 -> collection0.toMap() }

  public val baseten: Map<String, JsonElement?>? =
      baseten?.let { collection0 -> collection0.toMap() }

  public val blackForestLabs: Map<String, JsonElement?>? =
      blackForestLabs?.let { collection0 -> collection0.toMap() }

  public val byteplus: Map<String, JsonElement?>? =
      byteplus?.let { collection0 -> collection0.toMap() }

  public val centml: Map<String, JsonElement?>? = centml?.let { collection0 -> collection0.toMap() }

  public val cerebras: Map<String, JsonElement?>? =
      cerebras?.let { collection0 -> collection0.toMap() }

  public val chutes: Map<String, JsonElement?>? = chutes?.let { collection0 -> collection0.toMap() }

  public val cirrascale: Map<String, JsonElement?>? =
      cirrascale?.let { collection0 -> collection0.toMap() }

  public val clarifai: Map<String, JsonElement?>? =
      clarifai?.let { collection0 -> collection0.toMap() }

  public val cloudflare: Map<String, JsonElement?>? =
      cloudflare?.let { collection0 -> collection0.toMap() }

  public val cohere: Map<String, JsonElement?>? = cohere?.let { collection0 -> collection0.toMap() }

  public val crofai: Map<String, JsonElement?>? = crofai?.let { collection0 -> collection0.toMap() }

  public val crucible: Map<String, JsonElement?>? =
      crucible?.let { collection0 -> collection0.toMap() }

  public val crusoe: Map<String, JsonElement?>? = crusoe?.let { collection0 -> collection0.toMap() }

  public val darkbloom: Map<String, JsonElement?>? =
      darkbloom?.let { collection0 -> collection0.toMap() }

  public val decart: Map<String, JsonElement?>? = decart?.let { collection0 -> collection0.toMap() }

  public val deepgram: Map<String, JsonElement?>? =
      deepgram?.let { collection0 -> collection0.toMap() }

  public val deepinfra: Map<String, JsonElement?>? =
      deepinfra?.let { collection0 -> collection0.toMap() }

  public val deepseek: Map<String, JsonElement?>? =
      deepseek?.let { collection0 -> collection0.toMap() }

  public val dekallm: Map<String, JsonElement?>? =
      dekallm?.let { collection0 -> collection0.toMap() }

  public val digitalocean: Map<String, JsonElement?>? =
      digitalocean?.let { collection0 -> collection0.toMap() }

  public val enfer: Map<String, JsonElement?>? = enfer?.let { collection0 -> collection0.toMap() }

  public val fakeProvider: Map<String, JsonElement?>? =
      fakeProvider?.let { collection0 -> collection0.toMap() }

  public val featherless: Map<String, JsonElement?>? =
      featherless?.let { collection0 -> collection0.toMap() }

  public val fireworks: Map<String, JsonElement?>? =
      fireworks?.let { collection0 -> collection0.toMap() }

  public val friendli: Map<String, JsonElement?>? =
      friendli?.let { collection0 -> collection0.toMap() }

  public val gmicloud: Map<String, JsonElement?>? =
      gmicloud?.let { collection0 -> collection0.toMap() }

  public val googleAiStudio: Map<String, JsonElement?>? =
      googleAiStudio?.let { collection0 -> collection0.toMap() }

  public val googleVertex: Map<String, JsonElement?>? =
      googleVertex?.let { collection0 -> collection0.toMap() }

  public val gopomelo: Map<String, JsonElement?>? =
      gopomelo?.let { collection0 -> collection0.toMap() }

  public val groq: Map<String, JsonElement?>? = groq?.let { collection0 -> collection0.toMap() }

  public val heygen: Map<String, JsonElement?>? = heygen?.let { collection0 -> collection0.toMap() }

  public val huggingface: Map<String, JsonElement?>? =
      huggingface?.let { collection0 -> collection0.toMap() }

  public val hyperbolic: Map<String, JsonElement?>? =
      hyperbolic?.let { collection0 -> collection0.toMap() }

  public val hyperbolicQuantized: Map<String, JsonElement?>? =
      hyperbolicQuantized?.let { collection0 -> collection0.toMap() }

  public val inception: Map<String, JsonElement?>? =
      inception?.let { collection0 -> collection0.toMap() }

  public val inceptron: Map<String, JsonElement?>? =
      inceptron?.let { collection0 -> collection0.toMap() }

  public val inferactVllm: Map<String, JsonElement?>? =
      inferactVllm?.let { collection0 -> collection0.toMap() }

  public val inferenceNet: Map<String, JsonElement?>? =
      inferenceNet?.let { collection0 -> collection0.toMap() }

  public val infermatic: Map<String, JsonElement?>? =
      infermatic?.let { collection0 -> collection0.toMap() }

  public val inflection: Map<String, JsonElement?>? =
      inflection?.let { collection0 -> collection0.toMap() }

  public val inocloud: Map<String, JsonElement?>? =
      inocloud?.let { collection0 -> collection0.toMap() }

  public val ioNet: Map<String, JsonElement?>? = ioNet?.let { collection0 -> collection0.toMap() }

  public val ionstream: Map<String, JsonElement?>? =
      ionstream?.let { collection0 -> collection0.toMap() }

  public val klusterai: Map<String, JsonElement?>? =
      klusterai?.let { collection0 -> collection0.toMap() }

  public val lambda: Map<String, JsonElement?>? = lambda?.let { collection0 -> collection0.toMap() }

  public val lepton: Map<String, JsonElement?>? = lepton?.let { collection0 -> collection0.toMap() }

  public val liquid: Map<String, JsonElement?>? = liquid?.let { collection0 -> collection0.toMap() }

  public val lynn: Map<String, JsonElement?>? = lynn?.let { collection0 -> collection0.toMap() }

  public val lynnPrivate: Map<String, JsonElement?>? =
      lynnPrivate?.let { collection0 -> collection0.toMap() }

  public val mancer: Map<String, JsonElement?>? = mancer?.let { collection0 -> collection0.toMap() }

  public val mancerOld: Map<String, JsonElement?>? =
      mancerOld?.let { collection0 -> collection0.toMap() }

  public val mara: Map<String, JsonElement?>? = mara?.let { collection0 -> collection0.toMap() }

  public val meta: Map<String, JsonElement?>? = meta?.let { collection0 -> collection0.toMap() }

  public val minimax: Map<String, JsonElement?>? =
      minimax?.let { collection0 -> collection0.toMap() }

  public val mistral: Map<String, JsonElement?>? =
      mistral?.let { collection0 -> collection0.toMap() }

  public val modal: Map<String, JsonElement?>? = modal?.let { collection0 -> collection0.toMap() }

  public val modelrun: Map<String, JsonElement?>? =
      modelrun?.let { collection0 -> collection0.toMap() }

  public val modular: Map<String, JsonElement?>? =
      modular?.let { collection0 -> collection0.toMap() }

  public val moonshotai: Map<String, JsonElement?>? =
      moonshotai?.let { collection0 -> collection0.toMap() }

  public val morph: Map<String, JsonElement?>? = morph?.let { collection0 -> collection0.toMap() }

  public val ncompass: Map<String, JsonElement?>? =
      ncompass?.let { collection0 -> collection0.toMap() }

  public val nebius: Map<String, JsonElement?>? = nebius?.let { collection0 -> collection0.toMap() }

  public val nexAgi: Map<String, JsonElement?>? = nexAgi?.let { collection0 -> collection0.toMap() }

  public val nextbit: Map<String, JsonElement?>? =
      nextbit?.let { collection0 -> collection0.toMap() }

  public val nineteen: Map<String, JsonElement?>? =
      nineteen?.let { collection0 -> collection0.toMap() }

  public val novita: Map<String, JsonElement?>? = novita?.let { collection0 -> collection0.toMap() }

  public val nvidia: Map<String, JsonElement?>? = nvidia?.let { collection0 -> collection0.toMap() }

  public val octoai: Map<String, JsonElement?>? = octoai?.let { collection0 -> collection0.toMap() }

  public val openInference: Map<String, JsonElement?>? =
      openInference?.let { collection0 -> collection0.toMap() }

  public val openai: Map<String, JsonElement?>? = openai?.let { collection0 -> collection0.toMap() }

  public val parasail: Map<String, JsonElement?>? =
      parasail?.let { collection0 -> collection0.toMap() }

  public val perceptron: Map<String, JsonElement?>? =
      perceptron?.let { collection0 -> collection0.toMap() }

  public val perplexity: Map<String, JsonElement?>? =
      perplexity?.let { collection0 -> collection0.toMap() }

  public val phala: Map<String, JsonElement?>? = phala?.let { collection0 -> collection0.toMap() }

  public val poolside: Map<String, JsonElement?>? =
      poolside?.let { collection0 -> collection0.toMap() }

  public val quiver: Map<String, JsonElement?>? = quiver?.let { collection0 -> collection0.toMap() }

  public val recraft: Map<String, JsonElement?>? =
      recraft?.let { collection0 -> collection0.toMap() }

  public val recursal: Map<String, JsonElement?>? =
      recursal?.let { collection0 -> collection0.toMap() }

  public val reflection: Map<String, JsonElement?>? =
      reflection?.let { collection0 -> collection0.toMap() }

  public val reka: Map<String, JsonElement?>? = reka?.let { collection0 -> collection0.toMap() }

  public val relace: Map<String, JsonElement?>? = relace?.let { collection0 -> collection0.toMap() }

  public val replicate: Map<String, JsonElement?>? =
      replicate?.let { collection0 -> collection0.toMap() }

  public val sailResearch: Map<String, JsonElement?>? =
      sailResearch?.let { collection0 -> collection0.toMap() }

  public val sakana: Map<String, JsonElement?>? = sakana?.let { collection0 -> collection0.toMap() }

  public val sambanova: Map<String, JsonElement?>? =
      sambanova?.let { collection0 -> collection0.toMap() }

  public val sambanovaCloaked: Map<String, JsonElement?>? =
      sambanovaCloaked?.let { collection0 -> collection0.toMap() }

  public val seed: Map<String, JsonElement?>? = seed?.let { collection0 -> collection0.toMap() }

  public val sfCompute: Map<String, JsonElement?>? =
      sfCompute?.let { collection0 -> collection0.toMap() }

  public val siliconflow: Map<String, JsonElement?>? =
      siliconflow?.let { collection0 -> collection0.toMap() }

  public val sourceful: Map<String, JsonElement?>? =
      sourceful?.let { collection0 -> collection0.toMap() }

  public val stealth: Map<String, JsonElement?>? =
      stealth?.let { collection0 -> collection0.toMap() }

  public val stepfun: Map<String, JsonElement?>? =
      stepfun?.let { collection0 -> collection0.toMap() }

  public val streamlake: Map<String, JsonElement?>? =
      streamlake?.let { collection0 -> collection0.toMap() }

  public val switchpoint: Map<String, JsonElement?>? =
      switchpoint?.let { collection0 -> collection0.toMap() }

  public val targon: Map<String, JsonElement?>? = targon?.let { collection0 -> collection0.toMap() }

  public val tenstorrent: Map<String, JsonElement?>? =
      tenstorrent?.let { collection0 -> collection0.toMap() }

  public val together: Map<String, JsonElement?>? =
      together?.let { collection0 -> collection0.toMap() }

  public val togetherLite: Map<String, JsonElement?>? =
      togetherLite?.let { collection0 -> collection0.toMap() }

  public val ubicloud: Map<String, JsonElement?>? =
      ubicloud?.let { collection0 -> collection0.toMap() }

  public val upstage: Map<String, JsonElement?>? =
      upstage?.let { collection0 -> collection0.toMap() }

  public val venice: Map<String, JsonElement?>? = venice?.let { collection0 -> collection0.toMap() }

  public val wafer: Map<String, JsonElement?>? = wafer?.let { collection0 -> collection0.toMap() }

  public val wandb: Map<String, JsonElement?>? = wandb?.let { collection0 -> collection0.toMap() }

  public val xai: Map<String, JsonElement?>? = xai?.let { collection0 -> collection0.toMap() }

  public val xiaomi: Map<String, JsonElement?>? = xiaomi?.let { collection0 -> collection0.toMap() }

  public val zAi: Map<String, JsonElement?>? = zAi?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var _01aiValue: Map<String, JsonElement?>? = null

    public var _01ai: Map<String, JsonElement?>?
      get() = _01aiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        _01aiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var ai21Value: Map<String, JsonElement?>? = null

    public var ai21: Map<String, JsonElement?>?
      get() = ai21Value?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        ai21Value = value?.let { collection0 -> collection0.toMap() }
      }

    private var aionLabsValue: Map<String, JsonElement?>? = null

    public var aionLabs: Map<String, JsonElement?>?
      get() = aionLabsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        aionLabsValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var akashmlValue: Map<String, JsonElement?>? = null

    public var akashml: Map<String, JsonElement?>?
      get() = akashmlValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        akashmlValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var alibabaValue: Map<String, JsonElement?>? = null

    public var alibaba: Map<String, JsonElement?>?
      get() = alibabaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        alibabaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var amazonBedrockValue: Map<String, JsonElement?>? = null

    public var amazonBedrock: Map<String, JsonElement?>?
      get() = amazonBedrockValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        amazonBedrockValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var amazonNovaValue: Map<String, JsonElement?>? = null

    public var amazonNova: Map<String, JsonElement?>?
      get() = amazonNovaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        amazonNovaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var ambientValue: Map<String, JsonElement?>? = null

    public var ambient: Map<String, JsonElement?>?
      get() = ambientValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        ambientValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var anthropicValue: Map<String, JsonElement?>? = null

    public var anthropic: Map<String, JsonElement?>?
      get() = anthropicValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        anthropicValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var anyscaleValue: Map<String, JsonElement?>? = null

    public var anyscale: Map<String, JsonElement?>?
      get() = anyscaleValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        anyscaleValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var arceeAiValue: Map<String, JsonElement?>? = null

    public var arceeAi: Map<String, JsonElement?>?
      get() = arceeAiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        arceeAiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var atlasCloudValue: Map<String, JsonElement?>? = null

    public var atlasCloud: Map<String, JsonElement?>?
      get() = atlasCloudValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        atlasCloudValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var atomaValue: Map<String, JsonElement?>? = null

    public var atoma: Map<String, JsonElement?>?
      get() = atomaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        atomaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var avianValue: Map<String, JsonElement?>? = null

    public var avian: Map<String, JsonElement?>?
      get() = avianValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        avianValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var azureValue: Map<String, JsonElement?>? = null

    public var azure: Map<String, JsonElement?>?
      get() = azureValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        azureValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var baiduValue: Map<String, JsonElement?>? = null

    public var baidu: Map<String, JsonElement?>?
      get() = baiduValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        baiduValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var basetenValue: Map<String, JsonElement?>? = null

    public var baseten: Map<String, JsonElement?>?
      get() = basetenValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        basetenValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var blackForestLabsValue: Map<String, JsonElement?>? = null

    public var blackForestLabs: Map<String, JsonElement?>?
      get() = blackForestLabsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        blackForestLabsValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var byteplusValue: Map<String, JsonElement?>? = null

    public var byteplus: Map<String, JsonElement?>?
      get() = byteplusValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        byteplusValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var centmlValue: Map<String, JsonElement?>? = null

    public var centml: Map<String, JsonElement?>?
      get() = centmlValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        centmlValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var cerebrasValue: Map<String, JsonElement?>? = null

    public var cerebras: Map<String, JsonElement?>?
      get() = cerebrasValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        cerebrasValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var chutesValue: Map<String, JsonElement?>? = null

    public var chutes: Map<String, JsonElement?>?
      get() = chutesValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        chutesValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var cirrascaleValue: Map<String, JsonElement?>? = null

    public var cirrascale: Map<String, JsonElement?>?
      get() = cirrascaleValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        cirrascaleValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var clarifaiValue: Map<String, JsonElement?>? = null

    public var clarifai: Map<String, JsonElement?>?
      get() = clarifaiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        clarifaiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var cloudflareValue: Map<String, JsonElement?>? = null

    public var cloudflare: Map<String, JsonElement?>?
      get() = cloudflareValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        cloudflareValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var cohereValue: Map<String, JsonElement?>? = null

    public var cohere: Map<String, JsonElement?>?
      get() = cohereValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        cohereValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var crofaiValue: Map<String, JsonElement?>? = null

    public var crofai: Map<String, JsonElement?>?
      get() = crofaiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        crofaiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var crucibleValue: Map<String, JsonElement?>? = null

    public var crucible: Map<String, JsonElement?>?
      get() = crucibleValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        crucibleValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var crusoeValue: Map<String, JsonElement?>? = null

    public var crusoe: Map<String, JsonElement?>?
      get() = crusoeValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        crusoeValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var darkbloomValue: Map<String, JsonElement?>? = null

    public var darkbloom: Map<String, JsonElement?>?
      get() = darkbloomValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        darkbloomValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var decartValue: Map<String, JsonElement?>? = null

    public var decart: Map<String, JsonElement?>?
      get() = decartValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        decartValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var deepgramValue: Map<String, JsonElement?>? = null

    public var deepgram: Map<String, JsonElement?>?
      get() = deepgramValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        deepgramValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var deepinfraValue: Map<String, JsonElement?>? = null

    public var deepinfra: Map<String, JsonElement?>?
      get() = deepinfraValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        deepinfraValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var deepseekValue: Map<String, JsonElement?>? = null

    public var deepseek: Map<String, JsonElement?>?
      get() = deepseekValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        deepseekValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var dekallmValue: Map<String, JsonElement?>? = null

    public var dekallm: Map<String, JsonElement?>?
      get() = dekallmValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        dekallmValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var digitaloceanValue: Map<String, JsonElement?>? = null

    public var digitalocean: Map<String, JsonElement?>?
      get() = digitaloceanValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        digitaloceanValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var enferValue: Map<String, JsonElement?>? = null

    public var enfer: Map<String, JsonElement?>?
      get() = enferValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        enferValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var fakeProviderValue: Map<String, JsonElement?>? = null

    public var fakeProvider: Map<String, JsonElement?>?
      get() = fakeProviderValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        fakeProviderValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var featherlessValue: Map<String, JsonElement?>? = null

    public var featherless: Map<String, JsonElement?>?
      get() = featherlessValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        featherlessValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var fireworksValue: Map<String, JsonElement?>? = null

    public var fireworks: Map<String, JsonElement?>?
      get() = fireworksValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        fireworksValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var friendliValue: Map<String, JsonElement?>? = null

    public var friendli: Map<String, JsonElement?>?
      get() = friendliValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        friendliValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var gmicloudValue: Map<String, JsonElement?>? = null

    public var gmicloud: Map<String, JsonElement?>?
      get() = gmicloudValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        gmicloudValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var googleAiStudioValue: Map<String, JsonElement?>? = null

    public var googleAiStudio: Map<String, JsonElement?>?
      get() = googleAiStudioValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        googleAiStudioValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var googleVertexValue: Map<String, JsonElement?>? = null

    public var googleVertex: Map<String, JsonElement?>?
      get() = googleVertexValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        googleVertexValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var gopomeloValue: Map<String, JsonElement?>? = null

    public var gopomelo: Map<String, JsonElement?>?
      get() = gopomeloValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        gopomeloValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var groqValue: Map<String, JsonElement?>? = null

    public var groq: Map<String, JsonElement?>?
      get() = groqValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        groqValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var heygenValue: Map<String, JsonElement?>? = null

    public var heygen: Map<String, JsonElement?>?
      get() = heygenValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        heygenValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var huggingfaceValue: Map<String, JsonElement?>? = null

    public var huggingface: Map<String, JsonElement?>?
      get() = huggingfaceValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        huggingfaceValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var hyperbolicValue: Map<String, JsonElement?>? = null

    public var hyperbolic: Map<String, JsonElement?>?
      get() = hyperbolicValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        hyperbolicValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var hyperbolicQuantizedValue: Map<String, JsonElement?>? = null

    public var hyperbolicQuantized: Map<String, JsonElement?>?
      get() = hyperbolicQuantizedValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        hyperbolicQuantizedValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var inceptionValue: Map<String, JsonElement?>? = null

    public var inception: Map<String, JsonElement?>?
      get() = inceptionValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        inceptionValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var inceptronValue: Map<String, JsonElement?>? = null

    public var inceptron: Map<String, JsonElement?>?
      get() = inceptronValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        inceptronValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var inferactVllmValue: Map<String, JsonElement?>? = null

    public var inferactVllm: Map<String, JsonElement?>?
      get() = inferactVllmValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        inferactVllmValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var inferenceNetValue: Map<String, JsonElement?>? = null

    public var inferenceNet: Map<String, JsonElement?>?
      get() = inferenceNetValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        inferenceNetValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var infermaticValue: Map<String, JsonElement?>? = null

    public var infermatic: Map<String, JsonElement?>?
      get() = infermaticValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        infermaticValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var inflectionValue: Map<String, JsonElement?>? = null

    public var inflection: Map<String, JsonElement?>?
      get() = inflectionValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        inflectionValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var inocloudValue: Map<String, JsonElement?>? = null

    public var inocloud: Map<String, JsonElement?>?
      get() = inocloudValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        inocloudValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var ioNetValue: Map<String, JsonElement?>? = null

    public var ioNet: Map<String, JsonElement?>?
      get() = ioNetValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        ioNetValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var ionstreamValue: Map<String, JsonElement?>? = null

    public var ionstream: Map<String, JsonElement?>?
      get() = ionstreamValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        ionstreamValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var klusteraiValue: Map<String, JsonElement?>? = null

    public var klusterai: Map<String, JsonElement?>?
      get() = klusteraiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        klusteraiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var lambdaValue: Map<String, JsonElement?>? = null

    public var lambda: Map<String, JsonElement?>?
      get() = lambdaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        lambdaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var leptonValue: Map<String, JsonElement?>? = null

    public var lepton: Map<String, JsonElement?>?
      get() = leptonValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        leptonValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var liquidValue: Map<String, JsonElement?>? = null

    public var liquid: Map<String, JsonElement?>?
      get() = liquidValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        liquidValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var lynnValue: Map<String, JsonElement?>? = null

    public var lynn: Map<String, JsonElement?>?
      get() = lynnValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        lynnValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var lynnPrivateValue: Map<String, JsonElement?>? = null

    public var lynnPrivate: Map<String, JsonElement?>?
      get() = lynnPrivateValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        lynnPrivateValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var mancerValue: Map<String, JsonElement?>? = null

    public var mancer: Map<String, JsonElement?>?
      get() = mancerValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        mancerValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var mancerOldValue: Map<String, JsonElement?>? = null

    public var mancerOld: Map<String, JsonElement?>?
      get() = mancerOldValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        mancerOldValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var maraValue: Map<String, JsonElement?>? = null

    public var mara: Map<String, JsonElement?>?
      get() = maraValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        maraValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var metaValue: Map<String, JsonElement?>? = null

    public var meta: Map<String, JsonElement?>?
      get() = metaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var minimaxValue: Map<String, JsonElement?>? = null

    public var minimax: Map<String, JsonElement?>?
      get() = minimaxValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        minimaxValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var mistralValue: Map<String, JsonElement?>? = null

    public var mistral: Map<String, JsonElement?>?
      get() = mistralValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        mistralValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var modalValue: Map<String, JsonElement?>? = null

    public var modal: Map<String, JsonElement?>?
      get() = modalValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        modalValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var modelrunValue: Map<String, JsonElement?>? = null

    public var modelrun: Map<String, JsonElement?>?
      get() = modelrunValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        modelrunValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var modularValue: Map<String, JsonElement?>? = null

    public var modular: Map<String, JsonElement?>?
      get() = modularValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        modularValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var moonshotaiValue: Map<String, JsonElement?>? = null

    public var moonshotai: Map<String, JsonElement?>?
      get() = moonshotaiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        moonshotaiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var morphValue: Map<String, JsonElement?>? = null

    public var morph: Map<String, JsonElement?>?
      get() = morphValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        morphValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var ncompassValue: Map<String, JsonElement?>? = null

    public var ncompass: Map<String, JsonElement?>?
      get() = ncompassValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        ncompassValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var nebiusValue: Map<String, JsonElement?>? = null

    public var nebius: Map<String, JsonElement?>?
      get() = nebiusValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        nebiusValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var nexAgiValue: Map<String, JsonElement?>? = null

    public var nexAgi: Map<String, JsonElement?>?
      get() = nexAgiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        nexAgiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var nextbitValue: Map<String, JsonElement?>? = null

    public var nextbit: Map<String, JsonElement?>?
      get() = nextbitValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        nextbitValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var nineteenValue: Map<String, JsonElement?>? = null

    public var nineteen: Map<String, JsonElement?>?
      get() = nineteenValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        nineteenValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var novitaValue: Map<String, JsonElement?>? = null

    public var novita: Map<String, JsonElement?>?
      get() = novitaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        novitaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var nvidiaValue: Map<String, JsonElement?>? = null

    public var nvidia: Map<String, JsonElement?>?
      get() = nvidiaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        nvidiaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var octoaiValue: Map<String, JsonElement?>? = null

    public var octoai: Map<String, JsonElement?>?
      get() = octoaiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        octoaiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var openInferenceValue: Map<String, JsonElement?>? = null

    public var openInference: Map<String, JsonElement?>?
      get() = openInferenceValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        openInferenceValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var openaiValue: Map<String, JsonElement?>? = null

    public var openai: Map<String, JsonElement?>?
      get() = openaiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        openaiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var parasailValue: Map<String, JsonElement?>? = null

    public var parasail: Map<String, JsonElement?>?
      get() = parasailValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        parasailValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var perceptronValue: Map<String, JsonElement?>? = null

    public var perceptron: Map<String, JsonElement?>?
      get() = perceptronValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        perceptronValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var perplexityValue: Map<String, JsonElement?>? = null

    public var perplexity: Map<String, JsonElement?>?
      get() = perplexityValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        perplexityValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var phalaValue: Map<String, JsonElement?>? = null

    public var phala: Map<String, JsonElement?>?
      get() = phalaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        phalaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var poolsideValue: Map<String, JsonElement?>? = null

    public var poolside: Map<String, JsonElement?>?
      get() = poolsideValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        poolsideValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var quiverValue: Map<String, JsonElement?>? = null

    public var quiver: Map<String, JsonElement?>?
      get() = quiverValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        quiverValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var recraftValue: Map<String, JsonElement?>? = null

    public var recraft: Map<String, JsonElement?>?
      get() = recraftValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        recraftValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var recursalValue: Map<String, JsonElement?>? = null

    public var recursal: Map<String, JsonElement?>?
      get() = recursalValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        recursalValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var reflectionValue: Map<String, JsonElement?>? = null

    public var reflection: Map<String, JsonElement?>?
      get() = reflectionValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        reflectionValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var rekaValue: Map<String, JsonElement?>? = null

    public var reka: Map<String, JsonElement?>?
      get() = rekaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        rekaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var relaceValue: Map<String, JsonElement?>? = null

    public var relace: Map<String, JsonElement?>?
      get() = relaceValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        relaceValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var replicateValue: Map<String, JsonElement?>? = null

    public var replicate: Map<String, JsonElement?>?
      get() = replicateValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        replicateValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var sailResearchValue: Map<String, JsonElement?>? = null

    public var sailResearch: Map<String, JsonElement?>?
      get() = sailResearchValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        sailResearchValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var sakanaValue: Map<String, JsonElement?>? = null

    public var sakana: Map<String, JsonElement?>?
      get() = sakanaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        sakanaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var sambanovaValue: Map<String, JsonElement?>? = null

    public var sambanova: Map<String, JsonElement?>?
      get() = sambanovaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        sambanovaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var sambanovaCloakedValue: Map<String, JsonElement?>? = null

    public var sambanovaCloaked: Map<String, JsonElement?>?
      get() = sambanovaCloakedValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        sambanovaCloakedValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var seedValue: Map<String, JsonElement?>? = null

    public var seed: Map<String, JsonElement?>?
      get() = seedValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        seedValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var sfComputeValue: Map<String, JsonElement?>? = null

    public var sfCompute: Map<String, JsonElement?>?
      get() = sfComputeValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        sfComputeValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var siliconflowValue: Map<String, JsonElement?>? = null

    public var siliconflow: Map<String, JsonElement?>?
      get() = siliconflowValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        siliconflowValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var sourcefulValue: Map<String, JsonElement?>? = null

    public var sourceful: Map<String, JsonElement?>?
      get() = sourcefulValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        sourcefulValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var stealthValue: Map<String, JsonElement?>? = null

    public var stealth: Map<String, JsonElement?>?
      get() = stealthValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        stealthValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var stepfunValue: Map<String, JsonElement?>? = null

    public var stepfun: Map<String, JsonElement?>?
      get() = stepfunValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        stepfunValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var streamlakeValue: Map<String, JsonElement?>? = null

    public var streamlake: Map<String, JsonElement?>?
      get() = streamlakeValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        streamlakeValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var switchpointValue: Map<String, JsonElement?>? = null

    public var switchpoint: Map<String, JsonElement?>?
      get() = switchpointValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        switchpointValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var targonValue: Map<String, JsonElement?>? = null

    public var targon: Map<String, JsonElement?>?
      get() = targonValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        targonValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var tenstorrentValue: Map<String, JsonElement?>? = null

    public var tenstorrent: Map<String, JsonElement?>?
      get() = tenstorrentValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        tenstorrentValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var togetherValue: Map<String, JsonElement?>? = null

    public var together: Map<String, JsonElement?>?
      get() = togetherValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        togetherValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var togetherLiteValue: Map<String, JsonElement?>? = null

    public var togetherLite: Map<String, JsonElement?>?
      get() = togetherLiteValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        togetherLiteValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var ubicloudValue: Map<String, JsonElement?>? = null

    public var ubicloud: Map<String, JsonElement?>?
      get() = ubicloudValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        ubicloudValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var upstageValue: Map<String, JsonElement?>? = null

    public var upstage: Map<String, JsonElement?>?
      get() = upstageValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        upstageValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var veniceValue: Map<String, JsonElement?>? = null

    public var venice: Map<String, JsonElement?>?
      get() = veniceValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        veniceValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var waferValue: Map<String, JsonElement?>? = null

    public var wafer: Map<String, JsonElement?>?
      get() = waferValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        waferValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var wandbValue: Map<String, JsonElement?>? = null

    public var wandb: Map<String, JsonElement?>?
      get() = wandbValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        wandbValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var xaiValue: Map<String, JsonElement?>? = null

    public var xai: Map<String, JsonElement?>?
      get() = xaiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        xaiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var xiaomiValue: Map<String, JsonElement?>? = null

    public var xiaomi: Map<String, JsonElement?>?
      get() = xiaomiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        xiaomiValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var zAiValue: Map<String, JsonElement?>? = null

    public var zAi: Map<String, JsonElement?>?
      get() = zAiValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        zAiValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineVideoGenerationRequestProviderOptionsXee223a59 = InlineVideoGenerationRequestProviderOptionsXee223a59(
      _01ai = _01ai,
      ai21 = ai21,
      aionLabs = aionLabs,
      akashml = akashml,
      alibaba = alibaba,
      amazonBedrock = amazonBedrock,
      amazonNova = amazonNova,
      ambient = ambient,
      anthropic = anthropic,
      anyscale = anyscale,
      arceeAi = arceeAi,
      atlasCloud = atlasCloud,
      atoma = atoma,
      avian = avian,
      azure = azure,
      baidu = baidu,
      baseten = baseten,
      blackForestLabs = blackForestLabs,
      byteplus = byteplus,
      centml = centml,
      cerebras = cerebras,
      chutes = chutes,
      cirrascale = cirrascale,
      clarifai = clarifai,
      cloudflare = cloudflare,
      cohere = cohere,
      crofai = crofai,
      crucible = crucible,
      crusoe = crusoe,
      darkbloom = darkbloom,
      decart = decart,
      deepgram = deepgram,
      deepinfra = deepinfra,
      deepseek = deepseek,
      dekallm = dekallm,
      digitalocean = digitalocean,
      enfer = enfer,
      fakeProvider = fakeProvider,
      featherless = featherless,
      fireworks = fireworks,
      friendli = friendli,
      gmicloud = gmicloud,
      googleAiStudio = googleAiStudio,
      googleVertex = googleVertex,
      gopomelo = gopomelo,
      groq = groq,
      heygen = heygen,
      huggingface = huggingface,
      hyperbolic = hyperbolic,
      hyperbolicQuantized = hyperbolicQuantized,
      inception = inception,
      inceptron = inceptron,
      inferactVllm = inferactVllm,
      inferenceNet = inferenceNet,
      infermatic = infermatic,
      inflection = inflection,
      inocloud = inocloud,
      ioNet = ioNet,
      ionstream = ionstream,
      klusterai = klusterai,
      lambda = lambda,
      lepton = lepton,
      liquid = liquid,
      lynn = lynn,
      lynnPrivate = lynnPrivate,
      mancer = mancer,
      mancerOld = mancerOld,
      mara = mara,
      meta = meta,
      minimax = minimax,
      mistral = mistral,
      modal = modal,
      modelrun = modelrun,
      modular = modular,
      moonshotai = moonshotai,
      morph = morph,
      ncompass = ncompass,
      nebius = nebius,
      nexAgi = nexAgi,
      nextbit = nextbit,
      nineteen = nineteen,
      novita = novita,
      nvidia = nvidia,
      octoai = octoai,
      openInference = openInference,
      openai = openai,
      parasail = parasail,
      perceptron = perceptron,
      perplexity = perplexity,
      phala = phala,
      poolside = poolside,
      quiver = quiver,
      recraft = recraft,
      recursal = recursal,
      reflection = reflection,
      reka = reka,
      relace = relace,
      replicate = replicate,
      sailResearch = sailResearch,
      sakana = sakana,
      sambanova = sambanova,
      sambanovaCloaked = sambanovaCloaked,
      seed = seed,
      sfCompute = sfCompute,
      siliconflow = siliconflow,
      sourceful = sourceful,
      stealth = stealth,
      stepfun = stepfun,
      streamlake = streamlake,
      switchpoint = switchpoint,
      targon = targon,
      tenstorrent = tenstorrent,
      together = together,
      togetherLite = togetherLite,
      ubicloud = ubicloud,
      upstage = upstage,
      venice = venice,
      wafer = wafer,
      wandb = wandb,
      xai = xai,
      xiaomi = xiaomi,
      zAi = zAi,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineVideoGenerationRequestProviderOptionsXee223a59 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineVideoGenerationRequestProviderOptionsXee223a59> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineVideoGenerationRequestProviderOptionsXee223a59 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineVideoGenerationRequestProviderOptionsXee223a59")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineVideoGenerationRequestProviderOptionsXee223a59 must be a JSON object")
      return InlineVideoGenerationRequestProviderOptionsXee223a59(
        _01ai = rawObject["01ai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ai21 = rawObject["ai21"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        aionLabs = rawObject["aion-labs"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        akashml = rawObject["akashml"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        alibaba = rawObject["alibaba"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        amazonBedrock = rawObject["amazon-bedrock"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        amazonNova = rawObject["amazon-nova"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ambient = rawObject["ambient"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        anthropic = rawObject["anthropic"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        anyscale = rawObject["anyscale"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        arceeAi = rawObject["arcee-ai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        atlasCloud = rawObject["atlas-cloud"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        atoma = rawObject["atoma"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        avian = rawObject["avian"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        azure = rawObject["azure"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        baidu = rawObject["baidu"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        baseten = rawObject["baseten"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        blackForestLabs = rawObject["black-forest-labs"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        byteplus = rawObject["byteplus"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        centml = rawObject["centml"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        cerebras = rawObject["cerebras"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        chutes = rawObject["chutes"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        cirrascale = rawObject["cirrascale"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        clarifai = rawObject["clarifai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        cloudflare = rawObject["cloudflare"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        cohere = rawObject["cohere"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        crofai = rawObject["crofai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        crucible = rawObject["crucible"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        crusoe = rawObject["crusoe"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        darkbloom = rawObject["darkbloom"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        decart = rawObject["decart"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        deepgram = rawObject["deepgram"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        deepinfra = rawObject["deepinfra"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        deepseek = rawObject["deepseek"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        dekallm = rawObject["dekallm"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        digitalocean = rawObject["digitalocean"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        enfer = rawObject["enfer"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        fakeProvider = rawObject["fake-provider"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        featherless = rawObject["featherless"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        fireworks = rawObject["fireworks"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        friendli = rawObject["friendli"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        gmicloud = rawObject["gmicloud"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        googleAiStudio = rawObject["google-ai-studio"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        googleVertex = rawObject["google-vertex"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        gopomelo = rawObject["gopomelo"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        groq = rawObject["groq"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        heygen = rawObject["heygen"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        huggingface = rawObject["huggingface"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        hyperbolic = rawObject["hyperbolic"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        hyperbolicQuantized = rawObject["hyperbolic-quantized"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inception = rawObject["inception"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inceptron = rawObject["inceptron"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inferactVllm = rawObject["inferact-vllm"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inferenceNet = rawObject["inference-net"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        infermatic = rawObject["infermatic"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inflection = rawObject["inflection"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inocloud = rawObject["inocloud"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ioNet = rawObject["io-net"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ionstream = rawObject["ionstream"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        klusterai = rawObject["klusterai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        lambda = rawObject["lambda"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        lepton = rawObject["lepton"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        liquid = rawObject["liquid"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        lynn = rawObject["lynn"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        lynnPrivate = rawObject["lynn-private"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        mancer = rawObject["mancer"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        mancerOld = rawObject["mancer-old"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        mara = rawObject["mara"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        meta = rawObject["meta"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        minimax = rawObject["minimax"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        mistral = rawObject["mistral"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        modal = rawObject["modal"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        modelrun = rawObject["modelrun"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        modular = rawObject["modular"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        moonshotai = rawObject["moonshotai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        morph = rawObject["morph"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ncompass = rawObject["ncompass"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nebius = rawObject["nebius"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nexAgi = rawObject["nex-agi"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nextbit = rawObject["nextbit"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nineteen = rawObject["nineteen"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        novita = rawObject["novita"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nvidia = rawObject["nvidia"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        octoai = rawObject["octoai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        openInference = rawObject["open-inference"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        openai = rawObject["openai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        parasail = rawObject["parasail"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        perceptron = rawObject["perceptron"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        perplexity = rawObject["perplexity"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        phala = rawObject["phala"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        poolside = rawObject["poolside"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        quiver = rawObject["quiver"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        recraft = rawObject["recraft"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        recursal = rawObject["recursal"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        reflection = rawObject["reflection"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        reka = rawObject["reka"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        relace = rawObject["relace"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        replicate = rawObject["replicate"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sailResearch = rawObject["sail-research"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sakana = rawObject["sakana"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sambanova = rawObject["sambanova"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sambanovaCloaked = rawObject["sambanova-cloaked"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        seed = rawObject["seed"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sfCompute = rawObject["sf-compute"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        siliconflow = rawObject["siliconflow"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sourceful = rawObject["sourceful"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        stealth = rawObject["stealth"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        stepfun = rawObject["stepfun"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        streamlake = rawObject["streamlake"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        switchpoint = rawObject["switchpoint"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        targon = rawObject["targon"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        tenstorrent = rawObject["tenstorrent"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        together = rawObject["together"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        togetherLite = rawObject["together-lite"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ubicloud = rawObject["ubicloud"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        upstage = rawObject["upstage"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        venice = rawObject["venice"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        wafer = rawObject["wafer"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        wandb = rawObject["wandb"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        xai = rawObject["xai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        xiaomi = rawObject["xiaomi"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        zAi = rawObject["z-ai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineVideoGenerationRequestProviderOptionsXee223a59) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineVideoGenerationRequestProviderOptionsXee223a59")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value._01ai?.let { put("01ai", json.encodeToJsonElement(it)) }
        value.ai21?.let { put("ai21", json.encodeToJsonElement(it)) }
        value.aionLabs?.let { put("aion-labs", json.encodeToJsonElement(it)) }
        value.akashml?.let { put("akashml", json.encodeToJsonElement(it)) }
        value.alibaba?.let { put("alibaba", json.encodeToJsonElement(it)) }
        value.amazonBedrock?.let { put("amazon-bedrock", json.encodeToJsonElement(it)) }
        value.amazonNova?.let { put("amazon-nova", json.encodeToJsonElement(it)) }
        value.ambient?.let { put("ambient", json.encodeToJsonElement(it)) }
        value.anthropic?.let { put("anthropic", json.encodeToJsonElement(it)) }
        value.anyscale?.let { put("anyscale", json.encodeToJsonElement(it)) }
        value.arceeAi?.let { put("arcee-ai", json.encodeToJsonElement(it)) }
        value.atlasCloud?.let { put("atlas-cloud", json.encodeToJsonElement(it)) }
        value.atoma?.let { put("atoma", json.encodeToJsonElement(it)) }
        value.avian?.let { put("avian", json.encodeToJsonElement(it)) }
        value.azure?.let { put("azure", json.encodeToJsonElement(it)) }
        value.baidu?.let { put("baidu", json.encodeToJsonElement(it)) }
        value.baseten?.let { put("baseten", json.encodeToJsonElement(it)) }
        value.blackForestLabs?.let { put("black-forest-labs", json.encodeToJsonElement(it)) }
        value.byteplus?.let { put("byteplus", json.encodeToJsonElement(it)) }
        value.centml?.let { put("centml", json.encodeToJsonElement(it)) }
        value.cerebras?.let { put("cerebras", json.encodeToJsonElement(it)) }
        value.chutes?.let { put("chutes", json.encodeToJsonElement(it)) }
        value.cirrascale?.let { put("cirrascale", json.encodeToJsonElement(it)) }
        value.clarifai?.let { put("clarifai", json.encodeToJsonElement(it)) }
        value.cloudflare?.let { put("cloudflare", json.encodeToJsonElement(it)) }
        value.cohere?.let { put("cohere", json.encodeToJsonElement(it)) }
        value.crofai?.let { put("crofai", json.encodeToJsonElement(it)) }
        value.crucible?.let { put("crucible", json.encodeToJsonElement(it)) }
        value.crusoe?.let { put("crusoe", json.encodeToJsonElement(it)) }
        value.darkbloom?.let { put("darkbloom", json.encodeToJsonElement(it)) }
        value.decart?.let { put("decart", json.encodeToJsonElement(it)) }
        value.deepgram?.let { put("deepgram", json.encodeToJsonElement(it)) }
        value.deepinfra?.let { put("deepinfra", json.encodeToJsonElement(it)) }
        value.deepseek?.let { put("deepseek", json.encodeToJsonElement(it)) }
        value.dekallm?.let { put("dekallm", json.encodeToJsonElement(it)) }
        value.digitalocean?.let { put("digitalocean", json.encodeToJsonElement(it)) }
        value.enfer?.let { put("enfer", json.encodeToJsonElement(it)) }
        value.fakeProvider?.let { put("fake-provider", json.encodeToJsonElement(it)) }
        value.featherless?.let { put("featherless", json.encodeToJsonElement(it)) }
        value.fireworks?.let { put("fireworks", json.encodeToJsonElement(it)) }
        value.friendli?.let { put("friendli", json.encodeToJsonElement(it)) }
        value.gmicloud?.let { put("gmicloud", json.encodeToJsonElement(it)) }
        value.googleAiStudio?.let { put("google-ai-studio", json.encodeToJsonElement(it)) }
        value.googleVertex?.let { put("google-vertex", json.encodeToJsonElement(it)) }
        value.gopomelo?.let { put("gopomelo", json.encodeToJsonElement(it)) }
        value.groq?.let { put("groq", json.encodeToJsonElement(it)) }
        value.heygen?.let { put("heygen", json.encodeToJsonElement(it)) }
        value.huggingface?.let { put("huggingface", json.encodeToJsonElement(it)) }
        value.hyperbolic?.let { put("hyperbolic", json.encodeToJsonElement(it)) }
        value.hyperbolicQuantized?.let { put("hyperbolic-quantized", json.encodeToJsonElement(it)) }
        value.inception?.let { put("inception", json.encodeToJsonElement(it)) }
        value.inceptron?.let { put("inceptron", json.encodeToJsonElement(it)) }
        value.inferactVllm?.let { put("inferact-vllm", json.encodeToJsonElement(it)) }
        value.inferenceNet?.let { put("inference-net", json.encodeToJsonElement(it)) }
        value.infermatic?.let { put("infermatic", json.encodeToJsonElement(it)) }
        value.inflection?.let { put("inflection", json.encodeToJsonElement(it)) }
        value.inocloud?.let { put("inocloud", json.encodeToJsonElement(it)) }
        value.ioNet?.let { put("io-net", json.encodeToJsonElement(it)) }
        value.ionstream?.let { put("ionstream", json.encodeToJsonElement(it)) }
        value.klusterai?.let { put("klusterai", json.encodeToJsonElement(it)) }
        value.lambda?.let { put("lambda", json.encodeToJsonElement(it)) }
        value.lepton?.let { put("lepton", json.encodeToJsonElement(it)) }
        value.liquid?.let { put("liquid", json.encodeToJsonElement(it)) }
        value.lynn?.let { put("lynn", json.encodeToJsonElement(it)) }
        value.lynnPrivate?.let { put("lynn-private", json.encodeToJsonElement(it)) }
        value.mancer?.let { put("mancer", json.encodeToJsonElement(it)) }
        value.mancerOld?.let { put("mancer-old", json.encodeToJsonElement(it)) }
        value.mara?.let { put("mara", json.encodeToJsonElement(it)) }
        value.meta?.let { put("meta", json.encodeToJsonElement(it)) }
        value.minimax?.let { put("minimax", json.encodeToJsonElement(it)) }
        value.mistral?.let { put("mistral", json.encodeToJsonElement(it)) }
        value.modal?.let { put("modal", json.encodeToJsonElement(it)) }
        value.modelrun?.let { put("modelrun", json.encodeToJsonElement(it)) }
        value.modular?.let { put("modular", json.encodeToJsonElement(it)) }
        value.moonshotai?.let { put("moonshotai", json.encodeToJsonElement(it)) }
        value.morph?.let { put("morph", json.encodeToJsonElement(it)) }
        value.ncompass?.let { put("ncompass", json.encodeToJsonElement(it)) }
        value.nebius?.let { put("nebius", json.encodeToJsonElement(it)) }
        value.nexAgi?.let { put("nex-agi", json.encodeToJsonElement(it)) }
        value.nextbit?.let { put("nextbit", json.encodeToJsonElement(it)) }
        value.nineteen?.let { put("nineteen", json.encodeToJsonElement(it)) }
        value.novita?.let { put("novita", json.encodeToJsonElement(it)) }
        value.nvidia?.let { put("nvidia", json.encodeToJsonElement(it)) }
        value.octoai?.let { put("octoai", json.encodeToJsonElement(it)) }
        value.openInference?.let { put("open-inference", json.encodeToJsonElement(it)) }
        value.openai?.let { put("openai", json.encodeToJsonElement(it)) }
        value.parasail?.let { put("parasail", json.encodeToJsonElement(it)) }
        value.perceptron?.let { put("perceptron", json.encodeToJsonElement(it)) }
        value.perplexity?.let { put("perplexity", json.encodeToJsonElement(it)) }
        value.phala?.let { put("phala", json.encodeToJsonElement(it)) }
        value.poolside?.let { put("poolside", json.encodeToJsonElement(it)) }
        value.quiver?.let { put("quiver", json.encodeToJsonElement(it)) }
        value.recraft?.let { put("recraft", json.encodeToJsonElement(it)) }
        value.recursal?.let { put("recursal", json.encodeToJsonElement(it)) }
        value.reflection?.let { put("reflection", json.encodeToJsonElement(it)) }
        value.reka?.let { put("reka", json.encodeToJsonElement(it)) }
        value.relace?.let { put("relace", json.encodeToJsonElement(it)) }
        value.replicate?.let { put("replicate", json.encodeToJsonElement(it)) }
        value.sailResearch?.let { put("sail-research", json.encodeToJsonElement(it)) }
        value.sakana?.let { put("sakana", json.encodeToJsonElement(it)) }
        value.sambanova?.let { put("sambanova", json.encodeToJsonElement(it)) }
        value.sambanovaCloaked?.let { put("sambanova-cloaked", json.encodeToJsonElement(it)) }
        value.seed?.let { put("seed", json.encodeToJsonElement(it)) }
        value.sfCompute?.let { put("sf-compute", json.encodeToJsonElement(it)) }
        value.siliconflow?.let { put("siliconflow", json.encodeToJsonElement(it)) }
        value.sourceful?.let { put("sourceful", json.encodeToJsonElement(it)) }
        value.stealth?.let { put("stealth", json.encodeToJsonElement(it)) }
        value.stepfun?.let { put("stepfun", json.encodeToJsonElement(it)) }
        value.streamlake?.let { put("streamlake", json.encodeToJsonElement(it)) }
        value.switchpoint?.let { put("switchpoint", json.encodeToJsonElement(it)) }
        value.targon?.let { put("targon", json.encodeToJsonElement(it)) }
        value.tenstorrent?.let { put("tenstorrent", json.encodeToJsonElement(it)) }
        value.together?.let { put("together", json.encodeToJsonElement(it)) }
        value.togetherLite?.let { put("together-lite", json.encodeToJsonElement(it)) }
        value.ubicloud?.let { put("ubicloud", json.encodeToJsonElement(it)) }
        value.upstage?.let { put("upstage", json.encodeToJsonElement(it)) }
        value.venice?.let { put("venice", json.encodeToJsonElement(it)) }
        value.wafer?.let { put("wafer", json.encodeToJsonElement(it)) }
        value.wandb?.let { put("wandb", json.encodeToJsonElement(it)) }
        value.xai?.let { put("xai", json.encodeToJsonElement(it)) }
        value.xiaomi?.let { put("xiaomi", json.encodeToJsonElement(it)) }
        value.zAi?.let { put("z-ai", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineVideoGenerationRequestProviderOptionsXee223a59(block: InlineVideoGenerationRequestProviderOptionsXee223a59.Builder.() -> Unit): InlineVideoGenerationRequestProviderOptionsXee223a59 = InlineVideoGenerationRequestProviderOptionsXee223a59.build(block)
