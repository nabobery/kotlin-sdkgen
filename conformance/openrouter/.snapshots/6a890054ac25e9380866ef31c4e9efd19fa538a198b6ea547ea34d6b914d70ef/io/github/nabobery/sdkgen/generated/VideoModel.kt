package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/VideoModel
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
  supportedAspectRatios: List<InlineVideoModelSupportedAspectRatiosItemXbdc926f6>?,
  supportedDurations: List<Int>?,
  supportedFrameImages: List<InlineVideoModelSupportedFrameImagesItemX0f95f394>?,
  supportedResolutions: List<InlineVideoModelSupportedResolutionsItemX1a7426b8>?,
  supportedSizes: List<InlineVideoModelSupportedSizesItemX482e067d>?,
  private val descriptionState: FieldState<String>,
  private val huggingFaceIdState: FieldState<String?>,
  pricingSkusState: FieldState<Map<String, String>?>,
) {
  /**
   * List of parameters that are allowed to be passed through to the provider
   */
  public val allowedPassthroughParameters: List<String> = allowedPassthroughParameters.toList()

  /**
   * Supported output aspect ratios
   */
  public val supportedAspectRatios: List<InlineVideoModelSupportedAspectRatiosItemXbdc926f6>? =
      supportedAspectRatios?.let { collection0 -> collection0.toList() }

  /**
   * Supported video durations in seconds
   */
  public val supportedDurations: List<Int>? =
      supportedDurations?.let { collection0 -> collection0.toList() }

  /**
   * Supported frame image types (e.g. first_frame, last_frame)
   */
  public val supportedFrameImages: List<InlineVideoModelSupportedFrameImagesItemX0f95f394>? =
      supportedFrameImages?.let { collection0 -> collection0.toList() }

  /**
   * Supported output resolutions
   */
  public val supportedResolutions: List<InlineVideoModelSupportedResolutionsItemX1a7426b8>? =
      supportedResolutions?.let { collection0 -> collection0.toList() }

  /**
   * Supported output sizes (width x height)
   */
  public val supportedSizes: List<InlineVideoModelSupportedSizesItemX482e067d>? =
      supportedSizes?.let { collection0 -> collection0.toList() }

  private val pricingSkusState: FieldState<Map<String, String>?> =
      pricingSkusState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toMap() } }

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
    supportedAspectRatios: List<InlineVideoModelSupportedAspectRatiosItemXbdc926f6>?,
    supportedDurations: List<Int>?,
    supportedFrameImages: List<InlineVideoModelSupportedFrameImagesItemX0f95f394>?,
    supportedResolutions: List<InlineVideoModelSupportedResolutionsItemX1a7426b8>?,
    supportedSizes: List<InlineVideoModelSupportedSizesItemX482e067d>?,
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
      get() = requireNotNull(allowedPassthroughParametersValue) { "allowedPassthroughParameters is required" }.toList()
      set(`value`) {
        allowedPassthroughParametersValue = value.toList()
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
        FieldState<List<InlineVideoModelSupportedAspectRatiosItemXbdc926f6>?> = FieldState.Absent

    /**
     * Supported output aspect ratios
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedAspectRatios: List<InlineVideoModelSupportedAspectRatiosItemXbdc926f6>?
      get() = supportedAspectRatiosState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedAspectRatiosState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var supportedDurationsState: FieldState<List<Int>?> = FieldState.Absent

    /**
     * Supported video durations in seconds
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedDurations: List<Int>?
      get() = supportedDurationsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedDurationsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var supportedFrameImagesState:
        FieldState<List<InlineVideoModelSupportedFrameImagesItemX0f95f394>?> = FieldState.Absent

    /**
     * Supported frame image types (e.g. first_frame, last_frame)
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedFrameImages: List<InlineVideoModelSupportedFrameImagesItemX0f95f394>?
      get() = supportedFrameImagesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedFrameImagesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var supportedResolutionsState:
        FieldState<List<InlineVideoModelSupportedResolutionsItemX1a7426b8>?> = FieldState.Absent

    /**
     * Supported output resolutions
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedResolutions: List<InlineVideoModelSupportedResolutionsItemX1a7426b8>?
      get() = supportedResolutionsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedResolutionsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var supportedSizesState: FieldState<List<InlineVideoModelSupportedSizesItemX482e067d>?>
        = FieldState.Absent

    /**
     * Supported output sizes (width x height)
     * Required nullable field; assigning `null` records present-null.
     */
    public var supportedSizes: List<InlineVideoModelSupportedSizesItemX482e067d>?
      get() = supportedSizesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedSizesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
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
      get() = pricingSkusState.valueOrNull()?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        pricingSkusState = value?.let { collection0 -> collection0.toMap() }.toNullableFieldState()
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

  internal object Serializer : KSerializer<VideoModel> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): VideoModel {
      val jsonDecoder = decoder.requireJsonDecoder("VideoModel")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("VideoModel must be a JSON object")
      val allowedPassthroughParameters = json.decodeRequired<List<String>>(rawObject, "allowed_passthrough_parameters")
      val canonicalSlug = json.decodeRequired<String>(rawObject, "canonical_slug")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      if (!rawObject.containsKey("generate_audio")) {
        throw SerializationException("VideoModel is missing required property 'generate_audio'")
      }
      val generateAudio = rawObject["generate_audio"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      if (!rawObject.containsKey("seed")) {
        throw SerializationException("VideoModel is missing required property 'seed'")
      }
      val seed = rawObject["seed"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      if (!rawObject.containsKey("supported_aspect_ratios")) {
        throw SerializationException("VideoModel is missing required property 'supported_aspect_ratios'")
      }
      val supportedAspectRatios = rawObject["supported_aspect_ratios"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineVideoModelSupportedAspectRatiosItemXbdc926f6>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("supported_durations")) {
        throw SerializationException("VideoModel is missing required property 'supported_durations'")
      }
      val supportedDurations = rawObject["supported_durations"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<Int>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("supported_frame_images")) {
        throw SerializationException("VideoModel is missing required property 'supported_frame_images'")
      }
      val supportedFrameImages = rawObject["supported_frame_images"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineVideoModelSupportedFrameImagesItemX0f95f394>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("supported_resolutions")) {
        throw SerializationException("VideoModel is missing required property 'supported_resolutions'")
      }
      val supportedResolutions = rawObject["supported_resolutions"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineVideoModelSupportedResolutionsItemX1a7426b8>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("supported_sizes")) {
        throw SerializationException("VideoModel is missing required property 'supported_sizes'")
      }
      val supportedSizes = rawObject["supported_sizes"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineVideoModelSupportedSizesItemX482e067d>?>(requireNotNull(element)) }
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
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        huggingFaceIdState = json.decodeOptional(rawObject, "hugging_face_id", nullable = true),
        pricingSkusState = json.decodeOptional(rawObject, "pricing_skus", nullable = true),
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
