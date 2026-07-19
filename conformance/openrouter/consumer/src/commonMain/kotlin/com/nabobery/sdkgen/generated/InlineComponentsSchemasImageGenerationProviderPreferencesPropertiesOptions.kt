package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationProviderPreferences/properties/options.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions.Serializer::class)
public class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions(
  public val _01ai: Map<String, JsonElement?>? = null,
  public val ai21: Map<String, JsonElement?>? = null,
  public val aionLabs: Map<String, JsonElement?>? = null,
  public val akashml: Map<String, JsonElement?>? = null,
  public val alibaba: Map<String, JsonElement?>? = null,
  public val amazonBedrock: Map<String, JsonElement?>? = null,
  public val amazonNova: Map<String, JsonElement?>? = null,
  public val ambient: Map<String, JsonElement?>? = null,
  public val anthropic: Map<String, JsonElement?>? = null,
  public val anyscale: Map<String, JsonElement?>? = null,
  public val arceeAi: Map<String, JsonElement?>? = null,
  public val atlasCloud: Map<String, JsonElement?>? = null,
  public val atoma: Map<String, JsonElement?>? = null,
  public val avian: Map<String, JsonElement?>? = null,
  public val azure: Map<String, JsonElement?>? = null,
  public val baidu: Map<String, JsonElement?>? = null,
  public val baseten: Map<String, JsonElement?>? = null,
  public val blackForestLabs: Map<String, JsonElement?>? = null,
  public val byteplus: Map<String, JsonElement?>? = null,
  public val centml: Map<String, JsonElement?>? = null,
  public val cerebras: Map<String, JsonElement?>? = null,
  public val chutes: Map<String, JsonElement?>? = null,
  public val cirrascale: Map<String, JsonElement?>? = null,
  public val clarifai: Map<String, JsonElement?>? = null,
  public val cloudflare: Map<String, JsonElement?>? = null,
  public val cohere: Map<String, JsonElement?>? = null,
  public val crofai: Map<String, JsonElement?>? = null,
  public val crucible: Map<String, JsonElement?>? = null,
  public val crusoe: Map<String, JsonElement?>? = null,
  public val darkbloom: Map<String, JsonElement?>? = null,
  public val decart: Map<String, JsonElement?>? = null,
  public val deepgram: Map<String, JsonElement?>? = null,
  public val deepinfra: Map<String, JsonElement?>? = null,
  public val deepseek: Map<String, JsonElement?>? = null,
  public val dekallm: Map<String, JsonElement?>? = null,
  public val digitalocean: Map<String, JsonElement?>? = null,
  public val enfer: Map<String, JsonElement?>? = null,
  public val fakeProvider: Map<String, JsonElement?>? = null,
  public val featherless: Map<String, JsonElement?>? = null,
  public val fireworks: Map<String, JsonElement?>? = null,
  public val friendli: Map<String, JsonElement?>? = null,
  public val gmicloud: Map<String, JsonElement?>? = null,
  public val googleAiStudio: Map<String, JsonElement?>? = null,
  public val googleVertex: Map<String, JsonElement?>? = null,
  public val gopomelo: Map<String, JsonElement?>? = null,
  public val groq: Map<String, JsonElement?>? = null,
  public val heygen: Map<String, JsonElement?>? = null,
  public val huggingface: Map<String, JsonElement?>? = null,
  public val hyperbolic: Map<String, JsonElement?>? = null,
  public val hyperbolicQuantized: Map<String, JsonElement?>? = null,
  public val inception: Map<String, JsonElement?>? = null,
  public val inceptron: Map<String, JsonElement?>? = null,
  public val inferactVllm: Map<String, JsonElement?>? = null,
  public val inferenceNet: Map<String, JsonElement?>? = null,
  public val infermatic: Map<String, JsonElement?>? = null,
  public val inflection: Map<String, JsonElement?>? = null,
  public val inocloud: Map<String, JsonElement?>? = null,
  public val ioNet: Map<String, JsonElement?>? = null,
  public val ionstream: Map<String, JsonElement?>? = null,
  public val klusterai: Map<String, JsonElement?>? = null,
  public val lambda: Map<String, JsonElement?>? = null,
  public val lepton: Map<String, JsonElement?>? = null,
  public val liquid: Map<String, JsonElement?>? = null,
  public val lynn: Map<String, JsonElement?>? = null,
  public val lynnPrivate: Map<String, JsonElement?>? = null,
  public val mancer: Map<String, JsonElement?>? = null,
  public val mancerOld: Map<String, JsonElement?>? = null,
  public val mara: Map<String, JsonElement?>? = null,
  public val meta: Map<String, JsonElement?>? = null,
  public val minimax: Map<String, JsonElement?>? = null,
  public val mistral: Map<String, JsonElement?>? = null,
  public val modal: Map<String, JsonElement?>? = null,
  public val modelrun: Map<String, JsonElement?>? = null,
  public val modular: Map<String, JsonElement?>? = null,
  public val moonshotai: Map<String, JsonElement?>? = null,
  public val morph: Map<String, JsonElement?>? = null,
  public val ncompass: Map<String, JsonElement?>? = null,
  public val nebius: Map<String, JsonElement?>? = null,
  public val nexAgi: Map<String, JsonElement?>? = null,
  public val nextbit: Map<String, JsonElement?>? = null,
  public val nineteen: Map<String, JsonElement?>? = null,
  public val novita: Map<String, JsonElement?>? = null,
  public val nvidia: Map<String, JsonElement?>? = null,
  public val octoai: Map<String, JsonElement?>? = null,
  public val openInference: Map<String, JsonElement?>? = null,
  public val openai: Map<String, JsonElement?>? = null,
  public val parasail: Map<String, JsonElement?>? = null,
  public val perceptron: Map<String, JsonElement?>? = null,
  public val perplexity: Map<String, JsonElement?>? = null,
  public val phala: Map<String, JsonElement?>? = null,
  public val poolside: Map<String, JsonElement?>? = null,
  public val quiver: Map<String, JsonElement?>? = null,
  public val recraft: Map<String, JsonElement?>? = null,
  public val recursal: Map<String, JsonElement?>? = null,
  public val reflection: Map<String, JsonElement?>? = null,
  public val reka: Map<String, JsonElement?>? = null,
  public val relace: Map<String, JsonElement?>? = null,
  public val replicate: Map<String, JsonElement?>? = null,
  public val sailResearch: Map<String, JsonElement?>? = null,
  public val sakana: Map<String, JsonElement?>? = null,
  public val sambanova: Map<String, JsonElement?>? = null,
  public val sambanovaCloaked: Map<String, JsonElement?>? = null,
  public val seed: Map<String, JsonElement?>? = null,
  public val sfCompute: Map<String, JsonElement?>? = null,
  public val siliconflow: Map<String, JsonElement?>? = null,
  public val sourceful: Map<String, JsonElement?>? = null,
  public val stealth: Map<String, JsonElement?>? = null,
  public val stepfun: Map<String, JsonElement?>? = null,
  public val streamlake: Map<String, JsonElement?>? = null,
  public val switchpoint: Map<String, JsonElement?>? = null,
  public val targon: Map<String, JsonElement?>? = null,
  public val tenstorrent: Map<String, JsonElement?>? = null,
  public val together: Map<String, JsonElement?>? = null,
  public val togetherLite: Map<String, JsonElement?>? = null,
  public val ubicloud: Map<String, JsonElement?>? = null,
  public val upstage: Map<String, JsonElement?>? = null,
  public val venice: Map<String, JsonElement?>? = null,
  public val wafer: Map<String, JsonElement?>? = null,
  public val wandb: Map<String, JsonElement?>? = null,
  public val xai: Map<String, JsonElement?>? = null,
  public val xiaomi: Map<String, JsonElement?>? = null,
  public val zAi: Map<String, JsonElement?>? = null,
) {
  public class Builder {
    public var _01ai: Map<String, JsonElement?>? = null

    public var ai21: Map<String, JsonElement?>? = null

    public var aionLabs: Map<String, JsonElement?>? = null

    public var akashml: Map<String, JsonElement?>? = null

    public var alibaba: Map<String, JsonElement?>? = null

    public var amazonBedrock: Map<String, JsonElement?>? = null

    public var amazonNova: Map<String, JsonElement?>? = null

    public var ambient: Map<String, JsonElement?>? = null

    public var anthropic: Map<String, JsonElement?>? = null

    public var anyscale: Map<String, JsonElement?>? = null

    public var arceeAi: Map<String, JsonElement?>? = null

    public var atlasCloud: Map<String, JsonElement?>? = null

    public var atoma: Map<String, JsonElement?>? = null

    public var avian: Map<String, JsonElement?>? = null

    public var azure: Map<String, JsonElement?>? = null

    public var baidu: Map<String, JsonElement?>? = null

    public var baseten: Map<String, JsonElement?>? = null

    public var blackForestLabs: Map<String, JsonElement?>? = null

    public var byteplus: Map<String, JsonElement?>? = null

    public var centml: Map<String, JsonElement?>? = null

    public var cerebras: Map<String, JsonElement?>? = null

    public var chutes: Map<String, JsonElement?>? = null

    public var cirrascale: Map<String, JsonElement?>? = null

    public var clarifai: Map<String, JsonElement?>? = null

    public var cloudflare: Map<String, JsonElement?>? = null

    public var cohere: Map<String, JsonElement?>? = null

    public var crofai: Map<String, JsonElement?>? = null

    public var crucible: Map<String, JsonElement?>? = null

    public var crusoe: Map<String, JsonElement?>? = null

    public var darkbloom: Map<String, JsonElement?>? = null

    public var decart: Map<String, JsonElement?>? = null

    public var deepgram: Map<String, JsonElement?>? = null

    public var deepinfra: Map<String, JsonElement?>? = null

    public var deepseek: Map<String, JsonElement?>? = null

    public var dekallm: Map<String, JsonElement?>? = null

    public var digitalocean: Map<String, JsonElement?>? = null

    public var enfer: Map<String, JsonElement?>? = null

    public var fakeProvider: Map<String, JsonElement?>? = null

    public var featherless: Map<String, JsonElement?>? = null

    public var fireworks: Map<String, JsonElement?>? = null

    public var friendli: Map<String, JsonElement?>? = null

    public var gmicloud: Map<String, JsonElement?>? = null

    public var googleAiStudio: Map<String, JsonElement?>? = null

    public var googleVertex: Map<String, JsonElement?>? = null

    public var gopomelo: Map<String, JsonElement?>? = null

    public var groq: Map<String, JsonElement?>? = null

    public var heygen: Map<String, JsonElement?>? = null

    public var huggingface: Map<String, JsonElement?>? = null

    public var hyperbolic: Map<String, JsonElement?>? = null

    public var hyperbolicQuantized: Map<String, JsonElement?>? = null

    public var inception: Map<String, JsonElement?>? = null

    public var inceptron: Map<String, JsonElement?>? = null

    public var inferactVllm: Map<String, JsonElement?>? = null

    public var inferenceNet: Map<String, JsonElement?>? = null

    public var infermatic: Map<String, JsonElement?>? = null

    public var inflection: Map<String, JsonElement?>? = null

    public var inocloud: Map<String, JsonElement?>? = null

    public var ioNet: Map<String, JsonElement?>? = null

    public var ionstream: Map<String, JsonElement?>? = null

    public var klusterai: Map<String, JsonElement?>? = null

    public var lambda: Map<String, JsonElement?>? = null

    public var lepton: Map<String, JsonElement?>? = null

    public var liquid: Map<String, JsonElement?>? = null

    public var lynn: Map<String, JsonElement?>? = null

    public var lynnPrivate: Map<String, JsonElement?>? = null

    public var mancer: Map<String, JsonElement?>? = null

    public var mancerOld: Map<String, JsonElement?>? = null

    public var mara: Map<String, JsonElement?>? = null

    public var meta: Map<String, JsonElement?>? = null

    public var minimax: Map<String, JsonElement?>? = null

    public var mistral: Map<String, JsonElement?>? = null

    public var modal: Map<String, JsonElement?>? = null

    public var modelrun: Map<String, JsonElement?>? = null

    public var modular: Map<String, JsonElement?>? = null

    public var moonshotai: Map<String, JsonElement?>? = null

    public var morph: Map<String, JsonElement?>? = null

    public var ncompass: Map<String, JsonElement?>? = null

    public var nebius: Map<String, JsonElement?>? = null

    public var nexAgi: Map<String, JsonElement?>? = null

    public var nextbit: Map<String, JsonElement?>? = null

    public var nineteen: Map<String, JsonElement?>? = null

    public var novita: Map<String, JsonElement?>? = null

    public var nvidia: Map<String, JsonElement?>? = null

    public var octoai: Map<String, JsonElement?>? = null

    public var openInference: Map<String, JsonElement?>? = null

    public var openai: Map<String, JsonElement?>? = null

    public var parasail: Map<String, JsonElement?>? = null

    public var perceptron: Map<String, JsonElement?>? = null

    public var perplexity: Map<String, JsonElement?>? = null

    public var phala: Map<String, JsonElement?>? = null

    public var poolside: Map<String, JsonElement?>? = null

    public var quiver: Map<String, JsonElement?>? = null

    public var recraft: Map<String, JsonElement?>? = null

    public var recursal: Map<String, JsonElement?>? = null

    public var reflection: Map<String, JsonElement?>? = null

    public var reka: Map<String, JsonElement?>? = null

    public var relace: Map<String, JsonElement?>? = null

    public var replicate: Map<String, JsonElement?>? = null

    public var sailResearch: Map<String, JsonElement?>? = null

    public var sakana: Map<String, JsonElement?>? = null

    public var sambanova: Map<String, JsonElement?>? = null

    public var sambanovaCloaked: Map<String, JsonElement?>? = null

    public var seed: Map<String, JsonElement?>? = null

    public var sfCompute: Map<String, JsonElement?>? = null

    public var siliconflow: Map<String, JsonElement?>? = null

    public var sourceful: Map<String, JsonElement?>? = null

    public var stealth: Map<String, JsonElement?>? = null

    public var stepfun: Map<String, JsonElement?>? = null

    public var streamlake: Map<String, JsonElement?>? = null

    public var switchpoint: Map<String, JsonElement?>? = null

    public var targon: Map<String, JsonElement?>? = null

    public var tenstorrent: Map<String, JsonElement?>? = null

    public var together: Map<String, JsonElement?>? = null

    public var togetherLite: Map<String, JsonElement?>? = null

    public var ubicloud: Map<String, JsonElement?>? = null

    public var upstage: Map<String, JsonElement?>? = null

    public var venice: Map<String, JsonElement?>? = null

    public var wafer: Map<String, JsonElement?>? = null

    public var wandb: Map<String, JsonElement?>? = null

    public var xai: Map<String, JsonElement?>? = null

    public var xiaomi: Map<String, JsonElement?>? = null

    public var zAi: Map<String, JsonElement?>? = null

    public fun build(): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions =
      InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions(
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
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions must " +
          "be a JSON object")
      return InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions(
        _01ai = raw["01ai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ai21 = raw["ai21"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        aionLabs = raw["aion-labs"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        akashml = raw["akashml"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        alibaba = raw["alibaba"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        amazonBedrock = raw["amazon-bedrock"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        amazonNova = raw["amazon-nova"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ambient = raw["ambient"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        anthropic = raw["anthropic"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        anyscale = raw["anyscale"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        arceeAi = raw["arcee-ai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        atlasCloud = raw["atlas-cloud"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        atoma = raw["atoma"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        avian = raw["avian"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        azure = raw["azure"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        baidu = raw["baidu"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        baseten = raw["baseten"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        blackForestLabs = raw["black-forest-labs"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        byteplus = raw["byteplus"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        centml = raw["centml"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        cerebras = raw["cerebras"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        chutes = raw["chutes"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        cirrascale = raw["cirrascale"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        clarifai = raw["clarifai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        cloudflare = raw["cloudflare"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        cohere = raw["cohere"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        crofai = raw["crofai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        crucible = raw["crucible"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        crusoe = raw["crusoe"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        darkbloom = raw["darkbloom"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        decart = raw["decart"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        deepgram = raw["deepgram"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        deepinfra = raw["deepinfra"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        deepseek = raw["deepseek"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        dekallm = raw["dekallm"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        digitalocean = raw["digitalocean"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        enfer = raw["enfer"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        fakeProvider = raw["fake-provider"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        featherless = raw["featherless"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        fireworks = raw["fireworks"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        friendli = raw["friendli"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        gmicloud = raw["gmicloud"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        googleAiStudio = raw["google-ai-studio"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        googleVertex = raw["google-vertex"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        gopomelo = raw["gopomelo"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        groq = raw["groq"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        heygen = raw["heygen"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        huggingface = raw["huggingface"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        hyperbolic = raw["hyperbolic"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        hyperbolicQuantized = raw["hyperbolic-quantized"]?.let { json.decodeFromJsonElement<Map<String,
          JsonElement?>>(it) },
        inception = raw["inception"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inceptron = raw["inceptron"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inferactVllm = raw["inferact-vllm"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inferenceNet = raw["inference-net"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        infermatic = raw["infermatic"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inflection = raw["inflection"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        inocloud = raw["inocloud"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ioNet = raw["io-net"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ionstream = raw["ionstream"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        klusterai = raw["klusterai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        lambda = raw["lambda"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        lepton = raw["lepton"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        liquid = raw["liquid"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        lynn = raw["lynn"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        lynnPrivate = raw["lynn-private"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        mancer = raw["mancer"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        mancerOld = raw["mancer-old"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        mara = raw["mara"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        meta = raw["meta"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        minimax = raw["minimax"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        mistral = raw["mistral"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        modal = raw["modal"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        modelrun = raw["modelrun"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        modular = raw["modular"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        moonshotai = raw["moonshotai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        morph = raw["morph"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ncompass = raw["ncompass"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nebius = raw["nebius"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nexAgi = raw["nex-agi"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nextbit = raw["nextbit"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nineteen = raw["nineteen"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        novita = raw["novita"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        nvidia = raw["nvidia"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        octoai = raw["octoai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        openInference = raw["open-inference"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        openai = raw["openai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        parasail = raw["parasail"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        perceptron = raw["perceptron"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        perplexity = raw["perplexity"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        phala = raw["phala"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        poolside = raw["poolside"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        quiver = raw["quiver"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        recraft = raw["recraft"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        recursal = raw["recursal"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        reflection = raw["reflection"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        reka = raw["reka"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        relace = raw["relace"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        replicate = raw["replicate"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sailResearch = raw["sail-research"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sakana = raw["sakana"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sambanova = raw["sambanova"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sambanovaCloaked = raw["sambanova-cloaked"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        seed = raw["seed"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sfCompute = raw["sf-compute"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        siliconflow = raw["siliconflow"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        sourceful = raw["sourceful"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        stealth = raw["stealth"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        stepfun = raw["stepfun"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        streamlake = raw["streamlake"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        switchpoint = raw["switchpoint"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        targon = raw["targon"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        tenstorrent = raw["tenstorrent"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        together = raw["together"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        togetherLite = raw["together-lite"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        ubicloud = raw["ubicloud"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        upstage = raw["upstage"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        venice = raw["venice"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        wafer = raw["wafer"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        wandb = raw["wandb"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        xai = raw["xai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        xiaomi = raw["xiaomi"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        zAi = raw["z-ai"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions")
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

public fun inlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions(block: InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions.Builder.() -> Unit): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions = InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOptions.build(block)
