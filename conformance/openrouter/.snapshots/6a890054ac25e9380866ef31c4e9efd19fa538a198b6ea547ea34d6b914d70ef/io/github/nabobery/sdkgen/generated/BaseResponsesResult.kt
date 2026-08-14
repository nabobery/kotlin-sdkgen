package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BaseResponsesResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseResponsesResult
 */
@Serializable(with = BaseResponsesResult.Serializer::class)
public class BaseResponsesResult internal constructor(
  public val completedAt: Int?,
  public val createdAt: Int,
  public val error: ResponsesErrorField?,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val frequencyPenalty: Double?,
  public val id: String,
  public val incompleteDetails: IncompleteDetails?,
  public val instructions: BaseInputs?,
  metadata: Map<String, String>?,
  public val model: String,
  public val objectValue: InlineBaseResponsesResultObjectValueXe17d26ee,
  output: List<InlineBaseResponsesResultOutputItemXa13cf5c3>,
  public val parallelToolCalls: Boolean,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val presencePenalty: Double?,
  public val status: OpenAiResponsesResponseStatus,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val temperature: Double?,
  public val toolChoice: OpenAiResponsesToolChoice,
  tools: List<InlineBaseResponsesResultToolsItemX21d00fda>,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val topP: Double?,
  private val backgroundState: FieldState<Boolean?>,
  private val maxOutputTokensState: FieldState<Int?>,
  private val maxToolCallsState: FieldState<Int?>,
  private val outputTextState: FieldState<String>,
  private val previousResponseIdState: FieldState<String?>,
  private val promptState: FieldState<StoredPromptTemplate?>,
  private val promptCacheKeyState: FieldState<String?>,
  private val reasoningState: FieldState<BaseReasoningConfig?>,
  private val safetyIdentifierState: FieldState<String?>,
  private val serviceTierState: FieldState<ServiceTier?>,
  private val storeState: FieldState<Boolean>,
  private val textState: FieldState<TextConfig>,
  private val topLogprobsState: FieldState<Int?>,
  private val truncationState: FieldState<Truncation?>,
  private val usageState: FieldState<OpenAiResponsesUsage>,
  private val userState: FieldState<String?>,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public val output: List<InlineBaseResponsesResultOutputItemXa13cf5c3> = output.toList()

  public val tools: List<InlineBaseResponsesResultToolsItemX21d00fda> = tools.toList()

  public val background: Boolean?
    get() = backgroundState.valueOrNull()

  public val maxOutputTokens: Int?
    get() = maxOutputTokensState.valueOrNull()

  public val maxToolCalls: Int?
    get() = maxToolCallsState.valueOrNull()

  public val outputText: String?
    get() = outputTextState.valueOrNull()

  public val previousResponseId: String?
    get() = previousResponseIdState.valueOrNull()

  public val prompt: StoredPromptTemplate?
    get() = promptState.valueOrNull()

  public val promptCacheKey: String?
    get() = promptCacheKeyState.valueOrNull()

  public val reasoning: BaseReasoningConfig?
    get() = reasoningState.valueOrNull()

  public val safetyIdentifier: String?
    get() = safetyIdentifierState.valueOrNull()

  public val serviceTier: ServiceTier?
    get() = serviceTierState.valueOrNull()

  public val store: Boolean?
    get() = storeState.valueOrNull()

  public val text: TextConfig?
    get() = textState.valueOrNull()

  public val topLogprobs: Int?
    get() = topLogprobsState.valueOrNull()

  public val truncation: Truncation?
    get() = truncationState.valueOrNull()

  public val usage: OpenAiResponsesUsage?
    get() = usageState.valueOrNull()

  public val user: String?
    get() = userState.valueOrNull()

  public constructor(
    completedAt: Int?,
    createdAt: Int,
    error: ResponsesErrorField?,
    frequencyPenalty: Double?,
    id: String,
    incompleteDetails: IncompleteDetails?,
    instructions: BaseInputs?,
    metadata: Map<String, String>?,
    model: String,
    objectValue: InlineBaseResponsesResultObjectValueXe17d26ee,
    output: List<InlineBaseResponsesResultOutputItemXa13cf5c3>,
    parallelToolCalls: Boolean,
    presencePenalty: Double?,
    status: OpenAiResponsesResponseStatus,
    temperature: Double?,
    toolChoice: OpenAiResponsesToolChoice,
    tools: List<InlineBaseResponsesResultToolsItemX21d00fda>,
    topP: Double?,
  ) : this(completedAt = completedAt,
  createdAt = createdAt,
  error = error,
  frequencyPenalty = frequencyPenalty,
  id = id,
  incompleteDetails = incompleteDetails,
  instructions = instructions,
  metadata = metadata,
  model = model,
  objectValue = objectValue,
  output = output,
  parallelToolCalls = parallelToolCalls,
  presencePenalty = presencePenalty,
  status = status,
  temperature = temperature,
  toolChoice = toolChoice,
  tools = tools,
  topP = topP,
  backgroundState = FieldState.Absent,
  maxOutputTokensState = FieldState.Absent,
  maxToolCallsState = FieldState.Absent,
  outputTextState = FieldState.Absent,
  previousResponseIdState = FieldState.Absent,
  promptState = FieldState.Absent,
  promptCacheKeyState = FieldState.Absent,
  reasoningState = FieldState.Absent,
  safetyIdentifierState = FieldState.Absent,
  serviceTierState = FieldState.Absent,
  storeState = FieldState.Absent,
  textState = FieldState.Absent,
  topLogprobsState = FieldState.Absent,
  truncationState = FieldState.Absent,
  usageState = FieldState.Absent,
  userState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `background`.
   */
  public fun backgroundPresence(): FieldPresence = backgroundState.presence

  /**
   * Returns the wire presence of `max_output_tokens`.
   */
  public fun maxOutputTokensPresence(): FieldPresence = maxOutputTokensState.presence

  /**
   * Returns the wire presence of `max_tool_calls`.
   */
  public fun maxToolCallsPresence(): FieldPresence = maxToolCallsState.presence

  /**
   * Returns the wire presence of `output_text`.
   */
  public fun outputTextPresence(): FieldPresence = outputTextState.presence

  /**
   * Returns the wire presence of `previous_response_id`.
   */
  public fun previousResponseIdPresence(): FieldPresence = previousResponseIdState.presence

  /**
   * Returns the wire presence of `prompt`.
   */
  public fun promptPresence(): FieldPresence = promptState.presence

  /**
   * Returns the wire presence of `prompt_cache_key`.
   */
  public fun promptCacheKeyPresence(): FieldPresence = promptCacheKeyState.presence

  /**
   * Returns the wire presence of `reasoning`.
   */
  public fun reasoningPresence(): FieldPresence = reasoningState.presence

  /**
   * Returns the wire presence of `safety_identifier`.
   */
  public fun safetyIdentifierPresence(): FieldPresence = safetyIdentifierState.presence

  /**
   * Returns the wire presence of `service_tier`.
   */
  public fun serviceTierPresence(): FieldPresence = serviceTierState.presence

  /**
   * Returns the wire presence of `store`.
   */
  public fun storePresence(): FieldPresence = storeState.presence

  /**
   * Returns the wire presence of `text`.
   */
  public fun textPresence(): FieldPresence = textState.presence

  /**
   * Returns the wire presence of `top_logprobs`.
   */
  public fun topLogprobsPresence(): FieldPresence = topLogprobsState.presence

  /**
   * Returns the wire presence of `truncation`.
   */
  public fun truncationPresence(): FieldPresence = truncationState.presence

  /**
   * Returns the wire presence of `usage`.
   */
  public fun usagePresence(): FieldPresence = usageState.presence

  /**
   * Returns the wire presence of `user`.
   */
  public fun userPresence(): FieldPresence = userState.presence

  public class Builder {
    private var createdAtValue: Int? = null

    public var createdAt: Int
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var objectValueValue: InlineBaseResponsesResultObjectValueXe17d26ee? = null

    public var objectValue: InlineBaseResponsesResultObjectValueXe17d26ee
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var outputValue: List<InlineBaseResponsesResultOutputItemXa13cf5c3>? = null

    public var output: List<InlineBaseResponsesResultOutputItemXa13cf5c3>
      get() = requireNotNull(outputValue) { "output is required" }.toList()
      set(`value`) {
        outputValue = value.toList()
      }

    private var parallelToolCallsValue: Boolean? = null

    public var parallelToolCalls: Boolean
      get() = requireNotNull(parallelToolCallsValue) { "parallelToolCalls is required" }
      set(`value`) {
        parallelToolCallsValue = value
      }

    private var statusValue: OpenAiResponsesResponseStatus? = null

    public var status: OpenAiResponsesResponseStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var toolChoiceValue: OpenAiResponsesToolChoice? = null

    public var toolChoice: OpenAiResponsesToolChoice
      get() = requireNotNull(toolChoiceValue) { "toolChoice is required" }
      set(`value`) {
        toolChoiceValue = value
      }

    private var toolsValue: List<InlineBaseResponsesResultToolsItemX21d00fda>? = null

    public var tools: List<InlineBaseResponsesResultToolsItemX21d00fda>
      get() = requireNotNull(toolsValue) { "tools is required" }.toList()
      set(`value`) {
        toolsValue = value.toList()
      }

    private var completedAtState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var completedAt: Int?
      get() = completedAtState.valueOrNull()
      set(`value`) {
        completedAtState = value.toNullableFieldState()
      }

    private var errorState: FieldState<ResponsesErrorField?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var error: ResponsesErrorField?
      get() = errorState.valueOrNull()
      set(`value`) {
        errorState = value.toNullableFieldState()
      }

    private var frequencyPenaltyState: FieldState<Double?> = FieldState.Absent

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var frequencyPenalty: Double?
      get() = frequencyPenaltyState.valueOrNull()
      set(`value`) {
        frequencyPenaltyState = value.toNullableFieldState()
      }

    private var incompleteDetailsState: FieldState<IncompleteDetails?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var incompleteDetails: IncompleteDetails?
      get() = incompleteDetailsState.valueOrNull()
      set(`value`) {
        incompleteDetailsState = value.toNullableFieldState()
      }

    private var instructionsState: FieldState<BaseInputs?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var instructions: BaseInputs?
      get() = instructionsState.valueOrNull()
      set(`value`) {
        instructionsState = value.toNullableFieldState()
      }

    private var metadataState: FieldState<Map<String, String>?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var metadata: Map<String, String>?
      get() = metadataState.valueOrNull()?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataState = value?.let { collection0 -> collection0.toMap() }.toNullableFieldState()
      }

    private var presencePenaltyState: FieldState<Double?> = FieldState.Absent

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var presencePenalty: Double?
      get() = presencePenaltyState.valueOrNull()
      set(`value`) {
        presencePenaltyState = value.toNullableFieldState()
      }

    private var temperatureState: FieldState<Double?> = FieldState.Absent

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var temperature: Double?
      get() = temperatureState.valueOrNull()
      set(`value`) {
        temperatureState = value.toNullableFieldState()
      }

    private var topPState: FieldState<Double?> = FieldState.Absent

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var topP: Double?
      get() = topPState.valueOrNull()
      set(`value`) {
        topPState = value.toNullableFieldState()
      }

    private var backgroundState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var background: Boolean?
      get() = backgroundState.valueOrNull()
      set(`value`) {
        backgroundState = value.toNullableFieldState()
      }

    private var maxOutputTokensState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var maxOutputTokens: Int?
      get() = maxOutputTokensState.valueOrNull()
      set(`value`) {
        maxOutputTokensState = value.toNullableFieldState()
      }

    private var maxToolCallsState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var maxToolCalls: Int?
      get() = maxToolCallsState.valueOrNull()
      set(`value`) {
        maxToolCallsState = value.toNullableFieldState()
      }

    private var outputTextState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var outputText: String?
      get() = outputTextState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "outputText is not nullable; call unsetOutputText() to omit it" }
        outputTextState = FieldState.Value(present)
      }

    private var previousResponseIdState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var previousResponseId: String?
      get() = previousResponseIdState.valueOrNull()
      set(`value`) {
        previousResponseIdState = value.toNullableFieldState()
      }

    private var promptState: FieldState<StoredPromptTemplate?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var prompt: StoredPromptTemplate?
      get() = promptState.valueOrNull()
      set(`value`) {
        promptState = value.toNullableFieldState()
      }

    private var promptCacheKeyState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var promptCacheKey: String?
      get() = promptCacheKeyState.valueOrNull()
      set(`value`) {
        promptCacheKeyState = value.toNullableFieldState()
      }

    private var reasoningState: FieldState<BaseReasoningConfig?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var reasoning: BaseReasoningConfig?
      get() = reasoningState.valueOrNull()
      set(`value`) {
        reasoningState = value.toNullableFieldState()
      }

    private var safetyIdentifierState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var safetyIdentifier: String?
      get() = safetyIdentifierState.valueOrNull()
      set(`value`) {
        safetyIdentifierState = value.toNullableFieldState()
      }

    private var serviceTierState: FieldState<ServiceTier?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var serviceTier: ServiceTier?
      get() = serviceTierState.valueOrNull()
      set(`value`) {
        serviceTierState = value.toNullableFieldState()
      }

    private var storeState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var store: Boolean?
      get() = storeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "store is not nullable; call unsetStore() to omit it" }
        storeState = FieldState.Value(present)
      }

    private var textState: FieldState<TextConfig> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var text: TextConfig?
      get() = textState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "text is not nullable; call unsetText() to omit it" }
        textState = FieldState.Value(present)
      }

    private var topLogprobsState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var topLogprobs: Int?
      get() = topLogprobsState.valueOrNull()
      set(`value`) {
        topLogprobsState = value.toNullableFieldState()
      }

    private var truncationState: FieldState<Truncation?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var truncation: Truncation?
      get() = truncationState.valueOrNull()
      set(`value`) {
        truncationState = value.toNullableFieldState()
      }

    private var usageState: FieldState<OpenAiResponsesUsage> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var usage: OpenAiResponsesUsage?
      get() = usageState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "usage is not nullable; call unsetUsage() to omit it" }
        usageState = FieldState.Value(present)
      }

    private var userState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var user: String?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    /**
     * Omits `background` from serialized output.
     */
    public fun unsetBackground() {
      backgroundState = FieldState.Absent
    }

    /**
     * Omits `max_output_tokens` from serialized output.
     */
    public fun unsetMaxOutputTokens() {
      maxOutputTokensState = FieldState.Absent
    }

    /**
     * Omits `max_tool_calls` from serialized output.
     */
    public fun unsetMaxToolCalls() {
      maxToolCallsState = FieldState.Absent
    }

    /**
     * Omits `output_text` from serialized output.
     */
    public fun unsetOutputText() {
      outputTextState = FieldState.Absent
    }

    /**
     * Omits `previous_response_id` from serialized output.
     */
    public fun unsetPreviousResponseId() {
      previousResponseIdState = FieldState.Absent
    }

    /**
     * Omits `prompt` from serialized output.
     */
    public fun unsetPrompt() {
      promptState = FieldState.Absent
    }

    /**
     * Omits `prompt_cache_key` from serialized output.
     */
    public fun unsetPromptCacheKey() {
      promptCacheKeyState = FieldState.Absent
    }

    /**
     * Omits `reasoning` from serialized output.
     */
    public fun unsetReasoning() {
      reasoningState = FieldState.Absent
    }

    /**
     * Omits `safety_identifier` from serialized output.
     */
    public fun unsetSafetyIdentifier() {
      safetyIdentifierState = FieldState.Absent
    }

    /**
     * Omits `service_tier` from serialized output.
     */
    public fun unsetServiceTier() {
      serviceTierState = FieldState.Absent
    }

    /**
     * Omits `store` from serialized output.
     */
    public fun unsetStore() {
      storeState = FieldState.Absent
    }

    /**
     * Omits `text` from serialized output.
     */
    public fun unsetText() {
      textState = FieldState.Absent
    }

    /**
     * Omits `top_logprobs` from serialized output.
     */
    public fun unsetTopLogprobs() {
      topLogprobsState = FieldState.Absent
    }

    /**
     * Omits `truncation` from serialized output.
     */
    public fun unsetTruncation() {
      truncationState = FieldState.Absent
    }

    /**
     * Omits `usage` from serialized output.
     */
    public fun unsetUsage() {
      usageState = FieldState.Absent
    }

    /**
     * Omits `user` from serialized output.
     */
    public fun unsetUser() {
      userState = FieldState.Absent
    }

    public fun build(): BaseResponsesResult {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(modelValue != null) { "model is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(outputValue != null) { "output is required" }
      check(parallelToolCallsValue != null) { "parallelToolCalls is required" }
      check(statusValue != null) { "status is required" }
      check(toolChoiceValue != null) { "toolChoice is required" }
      check(toolsValue != null) { "tools is required" }
      check(completedAtState !== FieldState.Absent) { "completedAt is required, even when null" }
      check(errorState !== FieldState.Absent) { "error is required, even when null" }
      check(frequencyPenaltyState !== FieldState.Absent) { "frequencyPenalty is required, even when null" }
      check(incompleteDetailsState !== FieldState.Absent) { "incompleteDetails is required, even when null" }
      check(instructionsState !== FieldState.Absent) { "instructions is required, even when null" }
      check(metadataState !== FieldState.Absent) { "metadata is required, even when null" }
      check(presencePenaltyState !== FieldState.Absent) { "presencePenalty is required, even when null" }
      check(temperatureState !== FieldState.Absent) { "temperature is required, even when null" }
      check(topPState !== FieldState.Absent) { "topP is required, even when null" }
      return BaseResponsesResult(
        completedAt = completedAtState.valueOrNull(),
        createdAt = createdAt,
        error = errorState.valueOrNull(),
        frequencyPenalty = frequencyPenaltyState.valueOrNull(),
        id = id,
        incompleteDetails = incompleteDetailsState.valueOrNull(),
        instructions = instructionsState.valueOrNull(),
        metadata = metadataState.valueOrNull(),
        model = model,
        objectValue = objectValue,
        output = output,
        parallelToolCalls = parallelToolCalls,
        presencePenalty = presencePenaltyState.valueOrNull(),
        status = status,
        temperature = temperatureState.valueOrNull(),
        toolChoice = toolChoice,
        tools = tools,
        topP = topPState.valueOrNull(),
        backgroundState = backgroundState,
        maxOutputTokensState = maxOutputTokensState,
        maxToolCallsState = maxToolCallsState,
        outputTextState = outputTextState,
        previousResponseIdState = previousResponseIdState,
        promptState = promptState,
        promptCacheKeyState = promptCacheKeyState,
        reasoningState = reasoningState,
        safetyIdentifierState = safetyIdentifierState,
        serviceTierState = serviceTierState,
        storeState = storeState,
        textState = textState,
        topLogprobsState = topLogprobsState,
        truncationState = truncationState,
        usageState = usageState,
        userState = userState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseResponsesResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BaseResponsesResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseResponsesResult {
      val jsonDecoder = decoder.requireJsonDecoder("BaseResponsesResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BaseResponsesResult must be a JSON object")
      val createdAt = json.decodeRequired<Int>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val model = json.decodeRequired<String>(rawObject, "model")
      val objectValue = json.decodeRequired<InlineBaseResponsesResultObjectValueXe17d26ee>(rawObject, "object")
      val output = json.decodeRequired<List<InlineBaseResponsesResultOutputItemXa13cf5c3>>(rawObject, "output")
      val parallelToolCalls = json.decodeRequired<Boolean>(rawObject, "parallel_tool_calls")
      val status = json.decodeRequired<OpenAiResponsesResponseStatus>(rawObject, "status")
      val toolChoice = json.decodeRequired<OpenAiResponsesToolChoice>(rawObject, "tool_choice")
      val tools = json.decodeRequired<List<InlineBaseResponsesResultToolsItemX21d00fda>>(rawObject, "tools")
      if (!rawObject.containsKey("completed_at")) {
        throw SerializationException("BaseResponsesResult is missing required property 'completed_at'")
      }
      val completedAt = rawObject["completed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("error")) {
        throw SerializationException("BaseResponsesResult is missing required property 'error'")
      }
      val error = rawObject["error"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ResponsesErrorField?>(requireNotNull(element)) }
      if (!rawObject.containsKey("frequency_penalty")) {
        throw SerializationException("BaseResponsesResult is missing required property 'frequency_penalty'")
      }
      val frequencyPenalty = rawObject["frequency_penalty"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("incomplete_details")) {
        throw SerializationException("BaseResponsesResult is missing required property 'incomplete_details'")
      }
      val incompleteDetails = rawObject["incomplete_details"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<IncompleteDetails?>(requireNotNull(element)) }
      if (!rawObject.containsKey("instructions")) {
        throw SerializationException("BaseResponsesResult is missing required property 'instructions'")
      }
      val instructions = rawObject["instructions"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<BaseInputs?>(requireNotNull(element)) }
      if (!rawObject.containsKey("metadata")) {
        throw SerializationException("BaseResponsesResult is missing required property 'metadata'")
      }
      val metadata = rawObject["metadata"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("presence_penalty")) {
        throw SerializationException("BaseResponsesResult is missing required property 'presence_penalty'")
      }
      val presencePenalty = rawObject["presence_penalty"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("temperature")) {
        throw SerializationException("BaseResponsesResult is missing required property 'temperature'")
      }
      val temperature = rawObject["temperature"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("top_p")) {
        throw SerializationException("BaseResponsesResult is missing required property 'top_p'")
      }
      val topP = rawObject["top_p"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      return BaseResponsesResult(
        completedAt = completedAt,
        createdAt = createdAt,
        error = error,
        frequencyPenalty = frequencyPenalty,
        id = id,
        incompleteDetails = incompleteDetails,
        instructions = instructions,
        metadata = metadata,
        model = model,
        objectValue = objectValue,
        output = output,
        parallelToolCalls = parallelToolCalls,
        presencePenalty = presencePenalty,
        status = status,
        temperature = temperature,
        toolChoice = toolChoice,
        tools = tools,
        topP = topP,
        backgroundState = json.decodeOptional(rawObject, "background", nullable = true),
        maxOutputTokensState = json.decodeOptional(rawObject, "max_output_tokens", nullable = true),
        maxToolCallsState = json.decodeOptional(rawObject, "max_tool_calls", nullable = true),
        outputTextState = json.decodeOptional(rawObject, "output_text", nullable = false),
        previousResponseIdState = json.decodeOptional(rawObject, "previous_response_id", nullable = true),
        promptState = json.decodeOptional(rawObject, "prompt", nullable = true),
        promptCacheKeyState = json.decodeOptional(rawObject, "prompt_cache_key", nullable = true),
        reasoningState = json.decodeOptional(rawObject, "reasoning", nullable = true),
        safetyIdentifierState = json.decodeOptional(rawObject, "safety_identifier", nullable = true),
        serviceTierState = json.decodeOptional(rawObject, "service_tier", nullable = true),
        storeState = json.decodeOptional(rawObject, "store", nullable = false),
        textState = json.decodeOptional(rawObject, "text", nullable = false),
        topLogprobsState = json.decodeOptional(rawObject, "top_logprobs", nullable = true),
        truncationState = json.decodeOptional(rawObject, "truncation", nullable = true),
        usageState = json.decodeOptional(rawObject, "usage", nullable = false),
        userState = json.decodeOptional(rawObject, "user", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseResponsesResult) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseResponsesResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completed_at", value.completedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", json.encodeToJsonElement(value.createdAt))
        put("error", value.error?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("frequency_penalty", value.frequencyPenalty?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("incomplete_details", value.incompleteDetails?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("instructions", value.instructions?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("metadata", value.metadata?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("model", value.model)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("output", json.encodeToJsonElement(value.output))
        put("parallel_tool_calls", json.encodeToJsonElement(value.parallelToolCalls))
        put("presence_penalty", value.presencePenalty?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", json.encodeToJsonElement(value.status))
        put("temperature", value.temperature?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("tool_choice", json.encodeToJsonElement(value.toolChoice))
        put("tools", json.encodeToJsonElement(value.tools))
        put("top_p", value.topP?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("background", value.backgroundState, json::encodeToJsonElement)
        putState("max_output_tokens", value.maxOutputTokensState, json::encodeToJsonElement)
        putState("max_tool_calls", value.maxToolCallsState, json::encodeToJsonElement)
        putState("output_text", value.outputTextState, json::encodeToJsonElement)
        putState("previous_response_id", value.previousResponseIdState, json::encodeToJsonElement)
        putState("prompt", value.promptState, json::encodeToJsonElement)
        putState("prompt_cache_key", value.promptCacheKeyState, json::encodeToJsonElement)
        putState("reasoning", value.reasoningState, json::encodeToJsonElement)
        putState("safety_identifier", value.safetyIdentifierState, json::encodeToJsonElement)
        putState("service_tier", value.serviceTierState, json::encodeToJsonElement)
        putState("store", value.storeState, json::encodeToJsonElement)
        putState("text", value.textState, json::encodeToJsonElement)
        putState("top_logprobs", value.topLogprobsState, json::encodeToJsonElement)
        putState("truncation", value.truncationState, json::encodeToJsonElement)
        putState("usage", value.usageState, json::encodeToJsonElement)
        putState("user", value.userState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun baseResponsesResult(block: BaseResponsesResult.Builder.() -> Unit): BaseResponsesResult = BaseResponsesResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BaseResponsesResult is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("BaseResponsesResult property '" + name + "' is not nullable")
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
