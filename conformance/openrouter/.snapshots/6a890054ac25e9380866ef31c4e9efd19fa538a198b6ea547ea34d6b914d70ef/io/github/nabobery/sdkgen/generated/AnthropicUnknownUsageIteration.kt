package io.github.nabobery.sdkgen.generated

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
public data class AnthropicUnknownUsageIterationView(
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
  public val type: String,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUnknownUsageIteration.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicUnknownUsageIteration
 */
@Serializable(with = AnthropicUnknownUsageIteration.Serializer::class)
public class AnthropicUnknownUsageIteration(
  public val type: String,
  public val cacheCreation: AnthropicIterationCacheCreation? = null,
  public val cacheCreationInputTokens: Int? = null,
  public val cacheReadInputTokens: Int? = null,
  public val inputTokens: Int? = null,
  public val outputTokens: Int? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheCreation: AnthropicIterationCacheCreation? = null

    public var cacheCreationInputTokens: Int? = null

    public var cacheReadInputTokens: Int? = null

    public var inputTokens: Int? = null

    public var outputTokens: Int? = null

    public fun build(): AnthropicUnknownUsageIteration {
      check(typeValue != null) { "type is required" }
      return AnthropicUnknownUsageIteration(
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
    public fun build(block: Builder.() -> Unit): AnthropicUnknownUsageIteration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicUnknownUsageIteration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicUnknownUsageIteration {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicUnknownUsageIteration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicUnknownUsageIteration must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return AnthropicUnknownUsageIteration(
        type = type,
        cacheCreation = rawObject["cache_creation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicIterationCacheCreation?>(element) },
        cacheCreationInputTokens = rawObject["cache_creation_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        cacheReadInputTokens = rawObject["cache_read_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        inputTokens = rawObject["input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        outputTokens = rawObject["output_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicUnknownUsageIteration) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicUnknownUsageIteration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
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

public fun anthropicUnknownUsageIteration(block: AnthropicUnknownUsageIteration.Builder.() -> Unit): AnthropicUnknownUsageIteration = AnthropicUnknownUsageIteration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicUnknownUsageIteration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
