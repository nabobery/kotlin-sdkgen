package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class AnthropicAdvisorMessageUsageIterationView(
  @SerialName("cache_creation")
  public val cacheCreation: AnthropicIterationCacheCreation? = null,
  @SerialName("cache_creation_input_tokens")
  public val cacheCreationInputTokens: Int? = null,
  @SerialName("cache_read_input_tokens")
  public val cacheReadInputTokens: Int? = null,
  @SerialName("input_tokens")
  public val inputTokens: Int? = null,
  public val model: String,
  @SerialName("output_tokens")
  public val outputTokens: Int? = null,
  public val type: InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicAdvisorMessageUsageIteration.
 */
@Serializable(with = AnthropicAdvisorMessageUsageIteration.Serializer::class)
public class AnthropicAdvisorMessageUsageIteration(
  public val model: String,
  public val type: InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType,
  public val cacheCreation: AnthropicIterationCacheCreation? = null,
  public val cacheCreationInputTokens: Int? = null,
  public val cacheReadInputTokens: Int? = null,
  public val inputTokens: Int? = null,
  public val outputTokens: Int? = null,
) {
  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var typeValue:
        InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType? = null

    public var type:
        InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheCreation: AnthropicIterationCacheCreation? = null

    public var cacheCreationInputTokens: Int? = null

    public var cacheReadInputTokens: Int? = null

    public var inputTokens: Int? = null

    public var outputTokens: Int? = null

    public fun build(): AnthropicAdvisorMessageUsageIteration {
      check(modelValue != null) { "model is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicAdvisorMessageUsageIteration(
        model = model,
        type = type,
        cacheCreation = cacheCreation,
        cacheCreationInputTokens = cacheCreationInputTokens,
        cacheReadInputTokens = cacheReadInputTokens,
        inputTokens = inputTokens,
        outputTokens = outputTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicAdvisorMessageUsageIteration = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicAdvisorMessageUsageIteration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicAdvisorMessageUsageIteration {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicAdvisorMessageUsageIteration")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicAdvisorMessageUsageIteration must be a JSON object")
      val model = json.decodeRequired<String>(raw, "model")
      val type = json
        .decodeRequired<InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType>(raw, "type")
      return AnthropicAdvisorMessageUsageIteration(
        model = model,
        type = type,
        cacheCreation = raw["cache_creation"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<AnthropicIterationCacheCreation?>(element) },
        cacheCreationInputTokens = raw["cache_creation_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        cacheReadInputTokens = raw["cache_read_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        inputTokens = raw["input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        outputTokens = raw["output_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicAdvisorMessageUsageIteration) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicAdvisorMessageUsageIteration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("type", json.encodeToJsonElement(value.type))
        value.cacheCreation?.let { put("cache_creation", json.encodeToJsonElement(it)) }
        value.cacheCreationInputTokens?.let { put("cache_creation_input_tokens", json.encodeToJsonElement(it)) }
        value.cacheReadInputTokens?.let { put("cache_read_input_tokens", json.encodeToJsonElement(it)) }
        value.inputTokens?.let { put("input_tokens", json.encodeToJsonElement(it)) }
        value.outputTokens?.let { put("output_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicAdvisorMessageUsageIteration(block: AnthropicAdvisorMessageUsageIteration.Builder.() ->
  Unit): AnthropicAdvisorMessageUsageIteration = AnthropicAdvisorMessageUsageIteration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicAdvisorMessageUsageIteration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
