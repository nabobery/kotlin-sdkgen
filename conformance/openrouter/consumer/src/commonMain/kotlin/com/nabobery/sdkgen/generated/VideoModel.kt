package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/VideoModel.
 */
@Serializable(with = VideoModel.Serializer::class)
public class VideoModel internal constructor(
  allowedPassthroughParameters: List<String>,
  /**
   * Canonical slug for the model
   */
  public val canonicalSlug: String,
  /**
   * Unix timestamp of when the model was created
   */
  public val created: Int,
  /**
   * Whether the model supports generating audio alongside video
   */
  public val generateAudio: Boolean?,
  /**
   * Unique identifier for the model
   */
  public val id: String,
  /**
   * Display name of the model
   */
  public val name: String,
  /**
   * Whether the model supports deterministic generation via seed parameter
   */
  public val seed: Boolean?,
  /**
   * Supported output aspect ratios
   */
  public val supportedAspectRatios:
      List<InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems>?,
  /**
   * Supported video durations in seconds
   */
  public val supportedDurations: List<Int>?,
  /**
   * Supported frame image types (e.g. first_frame, last_frame)
   */
  public val supportedFrameImages:
      List<InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems>?,
  /**
   * Supported output resolutions
   */
  public val supportedResolutions:
      List<InlineComponentsSchemasVideoModelPropertiesSupportedResolutionsItems>?,
  /**
   * Supported output sizes (width x height)
   */
  public val supportedSizes: List<InlineComponentsSchemasVideoModelPropertiesSupportedSizesItems>?,
  private val descriptionState: FieldState<String>,
  private val huggingFaceIdState: FieldState<String?>,
  private val pricingSkusState: FieldState<Map<String, String>?>,
) {
  /**
   * List of parameters that are allowed to be passed through to the provider
   */
  public val allowedPassthroughParameters: List<String> = allowedPassthroughParameters.toList()

  /**
   * Description of the model
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * Hugging Face model identifier, if applicable
   */
  public val huggingFaceId: String?
    get() = huggingFaceIdState.valueOrNull()

  /**
   * Pricing SKUs with provider prefix stripped, values as strings
   */
  public val pricingSkus: Map<String, String>?
    get() = pricingSkusState.valueOrNull()

  public constructor(
    allowedPassthroughParameters: List<String>,
    canonicalSlug: String,
    created: Int,
    generateAudio: Boolean?,
    id: String,
    name: String,
    seed: Boolean?,
    supportedAspectRatios: List<InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems>?,
    supportedDurations: List<Int>?,
    supportedFrameImages: List<InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems>?,
    supportedResolutions: List<InlineComponentsSchemasVideoModelPropertiesSupportedResolutionsItems>?,
    supportedSizes: List<InlineComponentsSchemasVideoModelPropertiesSupportedSizesItems>?,
  ) : this(allowedPassthroughParameters = allowedPassthroughParameters,
  canonicalSlug = canonicalSlug,
  created = created,
  generateAudio = generateAudio,
  id = id,
  name = name,
  seed = seed,
  supportedAspectRatios = supportedAspectRatios,
  supportedDurations = supportedDurations,
  supportedFrameImages = supportedFrameImages,
  supportedResolutions = supportedResolutions,
  supportedSizes = supportedSizes,
  descriptionState = FieldState.Absent,
  huggingFaceIdState = FieldState.Absent,
  pricingSkusState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `hugging_face_id`.
   */
  public fun huggingFaceIdPresence(): FieldPresence = huggingFaceIdState.presence

  /**
   * Returns the wire presence of `pricing_skus`.
   */
  public fun pricingSkusPresence(): FieldPresence = pricingSkusState.presence

  public class Builder {
    private var allowedPassthroughParametersValue: List<String>? = null

    public var allowedPassthroughParameters: List<String>
      get() = requireNotNull(allowedPassthroughParametersValue) { "allowedPassthroughParameters is required" }
      set(`value`) {
        allowedPassthroughParametersValue = value
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

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var generateAudioState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether the model supports generating audio alongside video
     * Required nullable field; assigning `null` records present-null.
     */
    public var generateAudio: Boolean?
      get() = generateAudioState.valueOrNull()
      set(`value`) {
        generateAudioState = value.toNullableFieldState()
      }

    private var seedState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether the model supports deterministic generation via seed parameter
     * Required nullable field; assigning `null` records present-null.
     */
    public var seed: Boolean?
      get() = seedState.valueOrNull()
      set(`value`) {
        seedState = value.toNullableFieldState()
      }

    private var supportedAspectRatiosState:
        FieldState<List<InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems>?> =
        FieldState.Absent

    /**
     * Supported output aspect ratios
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedAspectRatios:
        List<InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems>?
      get() = supportedAspectRatiosState.valueOrNull()
      set(`value`) {
        supportedAspectRatiosState = value.toNullableFieldState()
      }

    private var supportedDurationsState: FieldState<List<Int>?> = FieldState.Absent

    /**
     * Supported video durations in seconds
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedDurations: List<Int>?
      get() = supportedDurationsState.valueOrNull()
      set(`value`) {
        supportedDurationsState = value.toNullableFieldState()
      }

    private var supportedFrameImagesState:
        FieldState<List<InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems>?> =
        FieldState.Absent

    /**
     * Supported frame image types (e.g. first_frame, last_frame)
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedFrameImages:
        List<InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems>?
      get() = supportedFrameImagesState.valueOrNull()
      set(`value`) {
        supportedFrameImagesState = value.toNullableFieldState()
      }

    private var supportedResolutionsState:
        FieldState<List<InlineComponentsSchemasVideoModelPropertiesSupportedResolutionsItems>?> =
        FieldState.Absent

    /**
     * Supported output resolutions
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedResolutions:
        List<InlineComponentsSchemasVideoModelPropertiesSupportedResolutionsItems>?
      get() = supportedResolutionsState.valueOrNull()
      set(`value`) {
        supportedResolutionsState = value.toNullableFieldState()
      }

    private var supportedSizesState:
        FieldState<List<InlineComponentsSchemasVideoModelPropertiesSupportedSizesItems>?> =
        FieldState.Absent

    /**
     * Supported output sizes (width x height)
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedSizes: List<InlineComponentsSchemasVideoModelPropertiesSupportedSizesItems>?
      get() = supportedSizesState.valueOrNull()
      set(`value`) {
        supportedSizesState = value.toNullableFieldState()
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

    private var pricingSkusState: FieldState<Map<String, String>?> = FieldState.Absent

    /**
     * Pricing SKUs with provider prefix stripped, values as strings
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var pricingSkus: Map<String, String>?
      get() = pricingSkusState.valueOrNull()
      set(`value`) {
        pricingSkusState = value.toNullableFieldState()
      }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `hugging_face_id` from serialized output.
     */
    public fun unsetHuggingFaceId() {
      huggingFaceIdState = FieldState.Absent
    }

    /**
     * Omits `pricing_skus` from serialized output.
     */
    public fun unsetPricingSkus() {
      pricingSkusState = FieldState.Absent
    }

    public fun build(): VideoModel {
      check(allowedPassthroughParametersValue != null) { "allowedPassthroughParameters is required" }
      check(canonicalSlugValue != null) { "canonicalSlug is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(generateAudioState !== FieldState.Absent) { "generateAudio is required, even when null" }
      check(seedState !== FieldState.Absent) { "seed is required, even when null" }
      check(supportedAspectRatiosState !== FieldState.Absent) { "supportedAspectRatios is required, even when null" }
      check(supportedDurationsState !== FieldState.Absent) { "supportedDurations is required, even when null" }
      check(supportedFrameImagesState !== FieldState.Absent) { "supportedFrameImages is required, even when null" }
      check(supportedResolutionsState !== FieldState.Absent) { "supportedResolutions is required, even when null" }
      check(supportedSizesState !== FieldState.Absent) { "supportedSizes is required, even when null" }
      return VideoModel(
        allowedPassthroughParameters = allowedPassthroughParameters,
        canonicalSlug = canonicalSlug,
        created = created,
        generateAudio = generateAudioState.valueOrNull(),
        id = id,
        name = name,
        seed = seedState.valueOrNull(),
        supportedAspectRatios = supportedAspectRatiosState.valueOrNull(),
        supportedDurations = supportedDurationsState.valueOrNull(),
        supportedFrameImages = supportedFrameImagesState.valueOrNull(),
        supportedResolutions = supportedResolutionsState.valueOrNull(),
        supportedSizes = supportedSizesState.valueOrNull(),
        descriptionState = descriptionState,
        huggingFaceIdState = huggingFaceIdState,
        pricingSkusState = pricingSkusState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): VideoModel = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<VideoModel> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): VideoModel {
      val jsonDecoder = decoder.requireJsonDecoder("VideoModel")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("VideoModel must be a JSON object")
      val allowedPassthroughParameters = json.decodeRequired<List<String>>(raw, "allowed_passthrough_parameters")
      val canonicalSlug = json.decodeRequired<String>(raw, "canonical_slug")
      val created = json.decodeRequired<Int>(raw, "created")
      val id = json.decodeRequired<String>(raw, "id")
      val name = json.decodeRequired<String>(raw, "name")
      if (!raw.containsKey("generate_audio")) {
        throw SerializationException("VideoModel is missing required property 'generate_audio'")
      }
      val generateAudio = raw["generate_audio"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      if (!raw.containsKey("seed")) {
        throw SerializationException("VideoModel is missing required property 'seed'")
      }
      val seed = raw["seed"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      if (!raw.containsKey("supported_aspect_ratios")) {
        throw SerializationException("VideoModel is missing required property 'supported_aspect_ratios'")
      }
      val supportedAspectRatios = raw["supported_aspect_ratios"].let { element ->
        if (element == JsonNull) null else json
          .decodeFromJsonElement<List<InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems>?>(requireNotNull(element)) }
      if (!raw.containsKey("supported_durations")) {
        throw SerializationException("VideoModel is missing required property 'supported_durations'")
      }
      val supportedDurations = raw["supported_durations"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<Int>?>(requireNotNull(element)) }
      if (!raw.containsKey("supported_frame_images")) {
        throw SerializationException("VideoModel is missing required property 'supported_frame_images'")
      }
      val supportedFrameImages = raw["supported_frame_images"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<InlineComponentsSchemasVideoModelPropertiesSupportedFrameImagesItems>?>(requireNotNull(element)) }
      if (!raw.containsKey("supported_resolutions")) {
        throw SerializationException("VideoModel is missing required property 'supported_resolutions'")
      }
      val supportedResolutions = raw["supported_resolutions"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<InlineComponentsSchemasVideoModelPropertiesSupportedResolutionsItems>?>(requireNotNull(element)) }
      if (!raw.containsKey("supported_sizes")) {
        throw SerializationException("VideoModel is missing required property 'supported_sizes'")
      }
      val supportedSizes = raw["supported_sizes"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<InlineComponentsSchemasVideoModelPropertiesSupportedSizesItems>?>(requireNotNull(element)) }
      return VideoModel(
        allowedPassthroughParameters = allowedPassthroughParameters,
        canonicalSlug = canonicalSlug,
        created = created,
        generateAudio = generateAudio,
        id = id,
        name = name,
        seed = seed,
        supportedAspectRatios = supportedAspectRatios,
        supportedDurations = supportedDurations,
        supportedFrameImages = supportedFrameImages,
        supportedResolutions = supportedResolutions,
        supportedSizes = supportedSizes,
        descriptionState = json.decodeOptional(raw, "description", nullable = false),
        huggingFaceIdState = json.decodeOptional(raw, "hugging_face_id", nullable = true),
        pricingSkusState = json.decodeOptional(raw, "pricing_skus", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: VideoModel) {
      val jsonEncoder = encoder.requireJsonEncoder("VideoModel")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allowed_passthrough_parameters", json.encodeToJsonElement(value.allowedPassthroughParameters))
        put("canonical_slug", value.canonicalSlug)
        put("created", json.encodeToJsonElement(value.created))
        put("generate_audio", value.generateAudio?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("name", value.name)
        put("seed", value.seed?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("supported_aspect_ratios", value.supportedAspectRatios?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("supported_durations", value.supportedDurations?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("supported_frame_images", value.supportedFrameImages?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("supported_resolutions", value.supportedResolutions?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("supported_sizes", value.supportedSizes?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("hugging_face_id", value.huggingFaceIdState, json::encodeToJsonElement)
        putState("pricing_skus", value.pricingSkusState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun videoModel(block: VideoModel.Builder.() -> Unit): VideoModel = VideoModel.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("VideoModel is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("VideoModel property '" + name + "' is not nullable")
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
