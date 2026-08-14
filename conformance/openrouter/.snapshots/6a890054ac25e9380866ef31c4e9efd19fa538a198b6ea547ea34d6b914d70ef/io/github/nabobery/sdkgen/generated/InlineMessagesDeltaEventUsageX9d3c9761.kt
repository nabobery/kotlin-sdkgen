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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesDeltaEvent/properties/usage.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesDeltaEvent/properties/usage
 */
@Serializable(with = InlineMessagesDeltaEventUsageX9d3c9761.Serializer::class)
public class InlineMessagesDeltaEventUsageX9d3c9761 internal constructor(
  public val cacheCreationInputTokens: Int?,
  public val cacheReadInputTokens: Int?,
  public val inputTokens: Int?,
  public val outputTokens: Int,
  public val outputTokensDetails: AnthropicOutputTokensDetails?,
  public val serverToolUse: InlineMessagesDeltaEventUsageServerToolUseXd09ae0db?,
  private val cacheCreationState: FieldState<AnthropicCacheCreation?>,
  iterationsState: FieldState<List<AnthropicUsageIteration>>,
) {
  private val iterationsState: FieldState<List<AnthropicUsageIteration>> =
      iterationsState.copyValue { fieldValue -> fieldValue.toList() }

  public val cacheCreation: AnthropicCacheCreation?
    get() = cacheCreationState.valueOrNull()

  public val iterations: List<AnthropicUsageIteration>?
    get() = iterationsState.valueOrNull()

  public constructor(
    cacheCreationInputTokens: Int?,
    cacheReadInputTokens: Int?,
    inputTokens: Int?,
    outputTokens: Int,
    outputTokensDetails: AnthropicOutputTokensDetails?,
    serverToolUse: InlineMessagesDeltaEventUsageServerToolUseXd09ae0db?,
  ) : this(cacheCreationInputTokens = cacheCreationInputTokens,
  cacheReadInputTokens = cacheReadInputTokens,
  inputTokens = inputTokens,
  outputTokens = outputTokens,
  outputTokensDetails = outputTokensDetails,
  serverToolUse = serverToolUse,
  cacheCreationState = FieldState.Absent,
  iterationsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `cache_creation`.
   */
  public fun cacheCreationPresence(): FieldPresence = cacheCreationState.presence

  /**
   * Returns the wire presence of `iterations`.
   */
  public fun iterationsPresence(): FieldPresence = iterationsState.presence

  public class Builder {
    private var outputTokensValue: Int? = null

    public var outputTokens: Int
      get() = requireNotNull(outputTokensValue) { "outputTokens is required" }
      set(`value`) {
        outputTokensValue = value
      }

    private var cacheCreationInputTokensState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cacheCreationInputTokens: Int?
      get() = cacheCreationInputTokensState.valueOrNull()
      set(`value`) {
        cacheCreationInputTokensState = value.toNullableFieldState()
      }

    private var cacheReadInputTokensState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cacheReadInputTokens: Int?
      get() = cacheReadInputTokensState.valueOrNull()
      set(`value`) {
        cacheReadInputTokensState = value.toNullableFieldState()
      }

    private var inputTokensState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var inputTokens: Int?
      get() = inputTokensState.valueOrNull()
      set(`value`) {
        inputTokensState = value.toNullableFieldState()
      }

    private var outputTokensDetailsState: FieldState<AnthropicOutputTokensDetails?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var outputTokensDetails: AnthropicOutputTokensDetails?
      get() = outputTokensDetailsState.valueOrNull()
      set(`value`) {
        outputTokensDetailsState = value.toNullableFieldState()
      }

    private var serverToolUseState: FieldState<InlineMessagesDeltaEventUsageServerToolUseXd09ae0db?>
        = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var serverToolUse: InlineMessagesDeltaEventUsageServerToolUseXd09ae0db?
      get() = serverToolUseState.valueOrNull()
      set(`value`) {
        serverToolUseState = value.toNullableFieldState()
      }

    private var cacheCreationState: FieldState<AnthropicCacheCreation?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var cacheCreation: AnthropicCacheCreation?
      get() = cacheCreationState.valueOrNull()
      set(`value`) {
        cacheCreationState = value.toNullableFieldState()
      }

    private var iterationsState: FieldState<List<AnthropicUsageIteration>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var iterations: List<AnthropicUsageIteration>?
      get() = iterationsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "iterations is not nullable; call unsetIterations() to omit it" }
        iterationsState = FieldState.Value(present.toList())
      }

    /**
     * Omits `cache_creation` from serialized output.
     */
    public fun unsetCacheCreation() {
      cacheCreationState = FieldState.Absent
    }

    /**
     * Omits `iterations` from serialized output.
     */
    public fun unsetIterations() {
      iterationsState = FieldState.Absent
    }

    public fun build(): InlineMessagesDeltaEventUsageX9d3c9761 {
      check(outputTokensValue != null) { "outputTokens is required" }
      check(cacheCreationInputTokensState !== FieldState.Absent) { "cacheCreationInputTokens is required, even when null" }
      check(cacheReadInputTokensState !== FieldState.Absent) { "cacheReadInputTokens is required, even when null" }
      check(inputTokensState !== FieldState.Absent) { "inputTokens is required, even when null" }
      check(outputTokensDetailsState !== FieldState.Absent) { "outputTokensDetails is required, even when null" }
      check(serverToolUseState !== FieldState.Absent) { "serverToolUse is required, even when null" }
      return InlineMessagesDeltaEventUsageX9d3c9761(
        cacheCreationInputTokens = cacheCreationInputTokensState.valueOrNull(),
        cacheReadInputTokens = cacheReadInputTokensState.valueOrNull(),
        inputTokens = inputTokensState.valueOrNull(),
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetailsState.valueOrNull(),
        serverToolUse = serverToolUseState.valueOrNull(),
        cacheCreationState = cacheCreationState,
        iterationsState = iterationsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesDeltaEventUsageX9d3c9761 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesDeltaEventUsageX9d3c9761> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesDeltaEventUsageX9d3c9761 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesDeltaEventUsageX9d3c9761")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesDeltaEventUsageX9d3c9761 must be a JSON object")
      val outputTokens = json.decodeRequired<Int>(rawObject, "output_tokens")
      if (!rawObject.containsKey("cache_creation_input_tokens")) {
        throw SerializationException("InlineMessagesDeltaEventUsageX9d3c9761 is missing required property 'cache_creation_input_tokens'")
      }
      val cacheCreationInputTokens = rawObject["cache_creation_input_tokens"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cache_read_input_tokens")) {
        throw SerializationException("InlineMessagesDeltaEventUsageX9d3c9761 is missing required property 'cache_read_input_tokens'")
      }
      val cacheReadInputTokens = rawObject["cache_read_input_tokens"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("input_tokens")) {
        throw SerializationException("InlineMessagesDeltaEventUsageX9d3c9761 is missing required property 'input_tokens'")
      }
      val inputTokens = rawObject["input_tokens"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("output_tokens_details")) {
        throw SerializationException("InlineMessagesDeltaEventUsageX9d3c9761 is missing required property 'output_tokens_details'")
      }
      val outputTokensDetails = rawObject["output_tokens_details"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicOutputTokensDetails?>(requireNotNull(element)) }
      if (!rawObject.containsKey("server_tool_use")) {
        throw SerializationException("InlineMessagesDeltaEventUsageX9d3c9761 is missing required property 'server_tool_use'")
      }
      val serverToolUse = rawObject["server_tool_use"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineMessagesDeltaEventUsageServerToolUseXd09ae0db?>(requireNotNull(element)) }
      return InlineMessagesDeltaEventUsageX9d3c9761(
        cacheCreationInputTokens = cacheCreationInputTokens,
        cacheReadInputTokens = cacheReadInputTokens,
        inputTokens = inputTokens,
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetails,
        serverToolUse = serverToolUse,
        cacheCreationState = json.decodeOptional(rawObject, "cache_creation", nullable = true),
        iterationsState = json.decodeOptional(rawObject, "iterations", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesDeltaEventUsageX9d3c9761) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesDeltaEventUsageX9d3c9761")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cache_creation_input_tokens", value.cacheCreationInputTokens?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cache_read_input_tokens", value.cacheReadInputTokens?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("input_tokens", value.inputTokens?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("output_tokens", json.encodeToJsonElement(value.outputTokens))
        put("output_tokens_details", value.outputTokensDetails?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("server_tool_use", value.serverToolUse?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("cache_creation", value.cacheCreationState, json::encodeToJsonElement)
        putState("iterations", value.iterationsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesDeltaEventUsageX9d3c9761(block: InlineMessagesDeltaEventUsageX9d3c9761.Builder.() -> Unit): InlineMessagesDeltaEventUsageX9d3c9761 = InlineMessagesDeltaEventUsageX9d3c9761.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesDeltaEventUsageX9d3c9761 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineMessagesDeltaEventUsageX9d3c9761 property '" + name + "' is not nullable")
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
