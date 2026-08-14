package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUsage.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicUsage
 */
@Serializable(with = AnthropicUsage.Serializer::class)
public class AnthropicUsage(
  public val cacheCreation: AnthropicCacheCreation?,
  public val cacheCreationInputTokens: Int?,
  public val cacheReadInputTokens: Int?,
  public val inferenceGeo: String?,
  public val inputTokens: Int,
  public val outputTokens: Int,
  public val outputTokensDetails: AnthropicOutputTokensDetails?,
  public val serverToolUse: AnthropicServerToolUsage?,
  public val serviceTier: AnthropicServiceTier?,
) {
  public class Builder {
    private var inputTokensValue: Int? = null

    public var inputTokens: Int
      get() = requireNotNull(inputTokensValue) { "inputTokens is required" }
      set(`value`) {
        inputTokensValue = value
      }

    private var outputTokensValue: Int? = null

    public var outputTokens: Int
      get() = requireNotNull(outputTokensValue) { "outputTokens is required" }
      set(`value`) {
        outputTokensValue = value
      }

    private var cacheCreationState: FieldState<AnthropicCacheCreation?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cacheCreation: AnthropicCacheCreation?
      get() = cacheCreationState.valueOrNull()
      set(`value`) {
        cacheCreationState = value.toNullableFieldState()
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

    private var inferenceGeoState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var inferenceGeo: String?
      get() = inferenceGeoState.valueOrNull()
      set(`value`) {
        inferenceGeoState = value.toNullableFieldState()
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

    private var serverToolUseState: FieldState<AnthropicServerToolUsage?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var serverToolUse: AnthropicServerToolUsage?
      get() = serverToolUseState.valueOrNull()
      set(`value`) {
        serverToolUseState = value.toNullableFieldState()
      }

    private var serviceTierState: FieldState<AnthropicServiceTier?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var serviceTier: AnthropicServiceTier?
      get() = serviceTierState.valueOrNull()
      set(`value`) {
        serviceTierState = value.toNullableFieldState()
      }

    public fun build(): AnthropicUsage {
      check(inputTokensValue != null) { "inputTokens is required" }
      check(outputTokensValue != null) { "outputTokens is required" }
      check(cacheCreationState !== FieldState.Absent) { "cacheCreation is required, even when null" }
      check(cacheCreationInputTokensState !== FieldState.Absent) { "cacheCreationInputTokens is required, even when null" }
      check(cacheReadInputTokensState !== FieldState.Absent) { "cacheReadInputTokens is required, even when null" }
      check(inferenceGeoState !== FieldState.Absent) { "inferenceGeo is required, even when null" }
      check(outputTokensDetailsState !== FieldState.Absent) { "outputTokensDetails is required, even when null" }
      check(serverToolUseState !== FieldState.Absent) { "serverToolUse is required, even when null" }
      check(serviceTierState !== FieldState.Absent) { "serviceTier is required, even when null" }
      return AnthropicUsage(
        cacheCreation = cacheCreationState.valueOrNull(),
        cacheCreationInputTokens = cacheCreationInputTokensState.valueOrNull(),
        cacheReadInputTokens = cacheReadInputTokensState.valueOrNull(),
        inferenceGeo = inferenceGeoState.valueOrNull(),
        inputTokens = inputTokens,
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetailsState.valueOrNull(),
        serverToolUse = serverToolUseState.valueOrNull(),
        serviceTier = serviceTierState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicUsage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicUsage {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicUsage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicUsage must be a JSON object")
      val inputTokens = json.decodeRequired<Int>(rawObject, "input_tokens")
      val outputTokens = json.decodeRequired<Int>(rawObject, "output_tokens")
      if (!rawObject.containsKey("cache_creation")) {
        throw SerializationException("AnthropicUsage is missing required property 'cache_creation'")
      }
      val cacheCreation = rawObject["cache_creation"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicCacheCreation?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cache_creation_input_tokens")) {
        throw SerializationException("AnthropicUsage is missing required property 'cache_creation_input_tokens'")
      }
      val cacheCreationInputTokens = rawObject["cache_creation_input_tokens"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cache_read_input_tokens")) {
        throw SerializationException("AnthropicUsage is missing required property 'cache_read_input_tokens'")
      }
      val cacheReadInputTokens = rawObject["cache_read_input_tokens"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("inference_geo")) {
        throw SerializationException("AnthropicUsage is missing required property 'inference_geo'")
      }
      val inferenceGeo = rawObject["inference_geo"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("output_tokens_details")) {
        throw SerializationException("AnthropicUsage is missing required property 'output_tokens_details'")
      }
      val outputTokensDetails = rawObject["output_tokens_details"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicOutputTokensDetails?>(requireNotNull(element)) }
      if (!rawObject.containsKey("server_tool_use")) {
        throw SerializationException("AnthropicUsage is missing required property 'server_tool_use'")
      }
      val serverToolUse = rawObject["server_tool_use"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicServerToolUsage?>(requireNotNull(element)) }
      if (!rawObject.containsKey("service_tier")) {
        throw SerializationException("AnthropicUsage is missing required property 'service_tier'")
      }
      val serviceTier = rawObject["service_tier"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicServiceTier?>(requireNotNull(element)) }
      return AnthropicUsage(
        cacheCreation = cacheCreation,
        cacheCreationInputTokens = cacheCreationInputTokens,
        cacheReadInputTokens = cacheReadInputTokens,
        inferenceGeo = inferenceGeo,
        inputTokens = inputTokens,
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetails,
        serverToolUse = serverToolUse,
        serviceTier = serviceTier,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cache_creation", value.cacheCreation?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cache_creation_input_tokens", value.cacheCreationInputTokens?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cache_read_input_tokens", value.cacheReadInputTokens?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("inference_geo", value.inferenceGeo?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("input_tokens", json.encodeToJsonElement(value.inputTokens))
        put("output_tokens", json.encodeToJsonElement(value.outputTokens))
        put("output_tokens_details", value.outputTokensDetails?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("server_tool_use", value.serverToolUse?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("service_tier", value.serviceTier?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicUsage(block: AnthropicUsage.Builder.() -> Unit): AnthropicUsage = AnthropicUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicUsage is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicUsage property '" + name + "' is not nullable")
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
