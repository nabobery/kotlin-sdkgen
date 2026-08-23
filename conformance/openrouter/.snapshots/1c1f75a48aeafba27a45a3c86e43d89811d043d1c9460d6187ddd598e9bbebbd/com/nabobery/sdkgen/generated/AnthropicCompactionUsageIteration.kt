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
public data class AnthropicCompactionUsageIterationView(
  @SerialName("cache_creation")
  public val cacheCreation: AnthropicIterationCacheCreation? = null,
  @SerialName("cache_creation_input_tokens")
  public val cacheCreationInputTokens: Int? = null,
  @SerialName("cache_read_input_tokens")
  public val cacheReadInputTokens: Int? = null,
  @SerialName("input_tokens")
  public val inputTokens: Int? = null,
  @SerialName("output_tokens")
  public val outputTokens: Int? = null,
  public val type: InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionUsageIteration.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionUsageIteration
 */
@Serializable(with = AnthropicCompactionUsageIteration.Serializer::class)
public class AnthropicCompactionUsageIteration(
  public val type: InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a,
  public val cacheCreation: AnthropicIterationCacheCreation? = null,
  public val cacheCreationInputTokens: Int? = null,
  public val cacheReadInputTokens: Int? = null,
  public val inputTokens: Int? = null,
  public val outputTokens: Int? = null,
) {
  public class Builder {
    private var typeValue: InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a? = null

    public var type: InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheCreation: AnthropicIterationCacheCreation? = null

    public var cacheCreationInputTokens: Int? = null

    public var cacheReadInputTokens: Int? = null

    public var inputTokens: Int? = null

    public var outputTokens: Int? = null

    public fun build(): AnthropicCompactionUsageIteration {
      check(typeValue != null) { "type is required" }
      return AnthropicCompactionUsageIteration(
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
    public fun build(block: Builder.() -> Unit): AnthropicCompactionUsageIteration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCompactionUsageIteration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCompactionUsageIteration {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCompactionUsageIteration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCompactionUsageIteration must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a>(rawObject, "type")
      return AnthropicCompactionUsageIteration(
        type = type,
        cacheCreation = rawObject["cache_creation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicIterationCacheCreation?>(element) },
        cacheCreationInputTokens = rawObject["cache_creation_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        cacheReadInputTokens = rawObject["cache_read_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        inputTokens = rawObject["input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        outputTokens = rawObject["output_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCompactionUsageIteration) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCompactionUsageIteration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
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

public fun anthropicCompactionUsageIteration(block: AnthropicCompactionUsageIteration.Builder.() -> Unit): AnthropicCompactionUsageIteration = AnthropicCompactionUsageIteration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCompactionUsageIteration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
