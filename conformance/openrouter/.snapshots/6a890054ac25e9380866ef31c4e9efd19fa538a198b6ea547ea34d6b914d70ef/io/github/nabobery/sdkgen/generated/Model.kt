package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information about an AI model available on OpenRouter
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Model
 */
@Serializable(with = Model.Serializer::class)
public class Model internal constructor(
  public val architecture: ModelArchitecture,
  /**
   * Canonical slug for the model
   */
  public val canonicalSlug: String,
  /**
   * Maximum context length in tokens
   */
  public val contextLength: Int?,
  /**
   * Unix timestamp of when the model was created
   */
  public val created: Int,
  public val defaultParameters: DefaultParameters?,
  /**
   * Unique identifier for the model
   */
  public val id: String,
  public val links: ModelLinks,
  /**
   * Display name of the model
   */
  public val name: String,
  public val perRequestLimits: PerRequestLimits?,
  public val pricing: PublicPricing,
  supportedParameters: List<Parameter>,
  supportedVoices: List<String>?,
  public val topProvider: TopProviderInfo,
  private val benchmarksState: FieldState<ModelBenchmarks>,
  private val descriptionState: FieldState<String>,
  private val expirationDateState: FieldState<String?>,
  private val huggingFaceIdState: FieldState<String?>,
  private val knowledgeCutoffState: FieldState<String?>,
  private val reasoningState: FieldState<ModelReasoning>,
) {
  /**
   * List of supported parameters for this model
   */
  public val supportedParameters: List<Parameter> = supportedParameters.toList()

  /**
   * List of supported voice identifiers for TTS models. Null for non-TTS models.
   */
  public val supportedVoices: List<String>? =
      supportedVoices?.let { collection0 -> collection0.toList() }

  public val benchmarks: ModelBenchmarks?
    get() = benchmarksState.valueOrNull()

  /**
   * Description of the model
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The date after which the model may be removed. ISO 8601 date string (YYYY-MM-DD) or null if no expiration.
   */
  public val expirationDate: String?
    get() = expirationDateState.valueOrNull()

  /**
   * Hugging Face model identifier, if applicable
   */
  public val huggingFaceId: String?
    get() = huggingFaceIdState.valueOrNull()

  /**
   * The date up to which the model was trained on data. ISO 8601 date string (YYYY-MM-DD) or null if unknown.
   */
  public val knowledgeCutoff: String?
    get() = knowledgeCutoffState.valueOrNull()

  public val reasoning: ModelReasoning?
    get() = reasoningState.valueOrNull()

  public constructor(
    architecture: ModelArchitecture,
    canonicalSlug: String,
    contextLength: Int?,
    created: Int,
    defaultParameters: DefaultParameters?,
    id: String,
    links: ModelLinks,
    name: String,
    perRequestLimits: PerRequestLimits?,
    pricing: PublicPricing,
    supportedParameters: List<Parameter>,
    supportedVoices: List<String>?,
    topProvider: TopProviderInfo,
  ) : this(architecture = architecture,
  canonicalSlug = canonicalSlug,
  contextLength = contextLength,
  created = created,
  defaultParameters = defaultParameters,
  id = id,
  links = links,
  name = name,
  perRequestLimits = perRequestLimits,
  pricing = pricing,
  supportedParameters = supportedParameters,
  supportedVoices = supportedVoices,
  topProvider = topProvider,
  benchmarksState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  expirationDateState = FieldState.Absent,
  huggingFaceIdState = FieldState.Absent,
  knowledgeCutoffState = FieldState.Absent,
  reasoningState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `benchmarks`.
   */
  public fun benchmarksPresence(): FieldPresence = benchmarksState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `expiration_date`.
   */
  public fun expirationDatePresence(): FieldPresence = expirationDateState.presence

  /**
   * Returns the wire presence of `hugging_face_id`.
   */
  public fun huggingFaceIdPresence(): FieldPresence = huggingFaceIdState.presence

  /**
   * Returns the wire presence of `knowledge_cutoff`.
   */
  public fun knowledgeCutoffPresence(): FieldPresence = knowledgeCutoffState.presence

  /**
   * Returns the wire presence of `reasoning`.
   */
  public fun reasoningPresence(): FieldPresence = reasoningState.presence

  public class Builder {
    private var architectureValue: ModelArchitecture? = null

    public var architecture: ModelArchitecture
      get() = requireNotNull(architectureValue) { "architecture is required" }
      set(`value`) {
        architectureValue = value
      }

    private var canonicalSlugValue: String? = null

    public var canonicalSlug: String
      get() = requireNotNull(canonicalSlugValue) { "canonicalSlug is required" }
      set(`value`) {
        canonicalSlugValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var linksValue: ModelLinks? = null

    public var links: ModelLinks
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var pricingValue: PublicPricing? = null

    public var pricing: PublicPricing
      get() = requireNotNull(pricingValue) { "pricing is required" }
      set(`value`) {
        pricingValue = value
      }

    private var supportedParametersValue: List<Parameter>? = null

    public var supportedParameters: List<Parameter>
      get() = requireNotNull(supportedParametersValue) { "supportedParameters is required" }.toList()
      set(`value`) {
        supportedParametersValue = value.toList()
      }

    private var topProviderValue: TopProviderInfo? = null

    public var topProvider: TopProviderInfo
      get() = requireNotNull(topProviderValue) { "topProvider is required" }
      set(`value`) {
        topProviderValue = value
      }

    private var contextLengthState: FieldState<Int?> = FieldState.Absent

    /**
     * Maximum context length in tokens
     * Required nullable field; assigning `null` records present-null.
     */
    public var contextLength: Int?
      get() = contextLengthState.valueOrNull()
      set(`value`) {
        contextLengthState = value.toNullableFieldState()
      }

    private var defaultParametersState: FieldState<DefaultParameters?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var defaultParameters: DefaultParameters?
      get() = defaultParametersState.valueOrNull()
      set(`value`) {
        defaultParametersState = value.toNullableFieldState()
      }

    private var perRequestLimitsState: FieldState<PerRequestLimits?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var perRequestLimits: PerRequestLimits?
      get() = perRequestLimitsState.valueOrNull()
      set(`value`) {
        perRequestLimitsState = value.toNullableFieldState()
      }

    private var supportedVoicesState: FieldState<List<String>?> = FieldState.Absent

    /**
     * List of supported voice identifiers for TTS models. Null for non-TTS models.
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedVoices: List<String>?
      get() = supportedVoicesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedVoicesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var benchmarksState: FieldState<ModelBenchmarks> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var benchmarks: ModelBenchmarks?
      get() = benchmarksState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "benchmarks is not nullable; call unsetBenchmarks() to omit it" }
        benchmarksState = FieldState.Value(present)
      }

    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * Description of the model
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var expirationDateState: FieldState<String?> = FieldState.Absent

    /**
     * The date after which the model may be removed. ISO 8601 date string (YYYY-MM-DD) or null if no expiration.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var expirationDate: String?
      get() = expirationDateState.valueOrNull()
      set(`value`) {
        expirationDateState = value.toNullableFieldState()
      }

    private var huggingFaceIdState: FieldState<String?> = FieldState.Absent

    /**
     * Hugging Face model identifier, if applicable
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var huggingFaceId: String?
      get() = huggingFaceIdState.valueOrNull()
      set(`value`) {
        huggingFaceIdState = value.toNullableFieldState()
      }

    private var knowledgeCutoffState: FieldState<String?> = FieldState.Absent

    /**
     * The date up to which the model was trained on data. ISO 8601 date string (YYYY-MM-DD) or null if unknown.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var knowledgeCutoff: String?
      get() = knowledgeCutoffState.valueOrNull()
      set(`value`) {
        knowledgeCutoffState = value.toNullableFieldState()
      }

    private var reasoningState: FieldState<ModelReasoning> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reasoning: ModelReasoning?
      get() = reasoningState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reasoning is not nullable; call unsetReasoning() to omit it" }
        reasoningState = FieldState.Value(present)
      }

    /**
     * Omits `benchmarks` from serialized output.
     */
    public fun unsetBenchmarks() {
      benchmarksState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `expiration_date` from serialized output.
     */
    public fun unsetExpirationDate() {
      expirationDateState = FieldState.Absent
    }

    /**
     * Omits `hugging_face_id` from serialized output.
     */
    public fun unsetHuggingFaceId() {
      huggingFaceIdState = FieldState.Absent
    }

    /**
     * Omits `knowledge_cutoff` from serialized output.
     */
    public fun unsetKnowledgeCutoff() {
      knowledgeCutoffState = FieldState.Absent
    }

    /**
     * Omits `reasoning` from serialized output.
     */
    public fun unsetReasoning() {
      reasoningState = FieldState.Absent
    }

    public fun build(): Model {
      check(architectureValue != null) { "architecture is required" }
      check(canonicalSlugValue != null) { "canonicalSlug is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(linksValue != null) { "links is required" }
      check(nameValue != null) { "name is required" }
      check(pricingValue != null) { "pricing is required" }
      check(supportedParametersValue != null) { "supportedParameters is required" }
      check(topProviderValue != null) { "topProvider is required" }
      check(contextLengthState !== FieldState.Absent) { "contextLength is required, even when null" }
      check(defaultParametersState !== FieldState.Absent) { "defaultParameters is required, even when null" }
      check(perRequestLimitsState !== FieldState.Absent) { "perRequestLimits is required, even when null" }
      check(supportedVoicesState !== FieldState.Absent) { "supportedVoices is required, even when null" }
      return Model(
        architecture = architecture,
        canonicalSlug = canonicalSlug,
        contextLength = contextLengthState.valueOrNull(),
        created = created,
        defaultParameters = defaultParametersState.valueOrNull(),
        id = id,
        links = links,
        name = name,
        perRequestLimits = perRequestLimitsState.valueOrNull(),
        pricing = pricing,
        supportedParameters = supportedParameters,
        supportedVoices = supportedVoicesState.valueOrNull(),
        topProvider = topProvider,
        benchmarksState = benchmarksState,
        descriptionState = descriptionState,
        expirationDateState = expirationDateState,
        huggingFaceIdState = huggingFaceIdState,
        knowledgeCutoffState = knowledgeCutoffState,
        reasoningState = reasoningState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Model = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Model> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Model {
      val jsonDecoder = decoder.requireJsonDecoder("Model")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Model must be a JSON object")
      val architecture = json.decodeRequired<ModelArchitecture>(rawObject, "architecture")
      val canonicalSlug = json.decodeRequired<String>(rawObject, "canonical_slug")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val links = json.decodeRequired<ModelLinks>(rawObject, "links")
      val name = json.decodeRequired<String>(rawObject, "name")
      val pricing = json.decodeRequired<PublicPricing>(rawObject, "pricing")
      val supportedParameters = json.decodeRequired<List<Parameter>>(rawObject, "supported_parameters")
      val topProvider = json.decodeRequired<TopProviderInfo>(rawObject, "top_provider")
      if (!rawObject.containsKey("context_length")) {
        throw SerializationException("Model is missing required property 'context_length'")
      }
      val contextLength = rawObject["context_length"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("default_parameters")) {
        throw SerializationException("Model is missing required property 'default_parameters'")
      }
      val defaultParameters = rawObject["default_parameters"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<DefaultParameters?>(requireNotNull(element)) }
      if (!rawObject.containsKey("per_request_limits")) {
        throw SerializationException("Model is missing required property 'per_request_limits'")
      }
      val perRequestLimits = rawObject["per_request_limits"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<PerRequestLimits?>(requireNotNull(element)) }
      if (!rawObject.containsKey("supported_voices")) {
        throw SerializationException("Model is missing required property 'supported_voices'")
      }
      val supportedVoices = rawObject["supported_voices"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(requireNotNull(element)) }
      return Model(
        architecture = architecture,
        canonicalSlug = canonicalSlug,
        contextLength = contextLength,
        created = created,
        defaultParameters = defaultParameters,
        id = id,
        links = links,
        name = name,
        perRequestLimits = perRequestLimits,
        pricing = pricing,
        supportedParameters = supportedParameters,
        supportedVoices = supportedVoices,
        topProvider = topProvider,
        benchmarksState = json.decodeOptional(rawObject, "benchmarks", nullable = false),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        expirationDateState = json.decodeOptional(rawObject, "expiration_date", nullable = true),
        huggingFaceIdState = json.decodeOptional(rawObject, "hugging_face_id", nullable = true),
        knowledgeCutoffState = json.decodeOptional(rawObject, "knowledge_cutoff", nullable = true),
        reasoningState = json.decodeOptional(rawObject, "reasoning", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Model) {
      val jsonEncoder = encoder.requireJsonEncoder("Model")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("architecture", json.encodeToJsonElement(value.architecture))
        put("canonical_slug", value.canonicalSlug)
        put("context_length", value.contextLength?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created", json.encodeToJsonElement(value.created))
        put("default_parameters", value.defaultParameters?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("links", json.encodeToJsonElement(value.links))
        put("name", value.name)
        put("per_request_limits", value.perRequestLimits?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("pricing", json.encodeToJsonElement(value.pricing))
        put("supported_parameters", json.encodeToJsonElement(value.supportedParameters))
        put("supported_voices", value.supportedVoices?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("top_provider", json.encodeToJsonElement(value.topProvider))
        putState("benchmarks", value.benchmarksState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("expiration_date", value.expirationDateState, json::encodeToJsonElement)
        putState("hugging_face_id", value.huggingFaceIdState, json::encodeToJsonElement)
        putState("knowledge_cutoff", value.knowledgeCutoffState, json::encodeToJsonElement)
        putState("reasoning", value.reasoningState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun model(block: Model.Builder.() -> Unit): Model = Model.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Model is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("Model property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
