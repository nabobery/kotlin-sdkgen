package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * OpenRouter pricing per token for this model. Null if pricing is unavailable.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarkPricing
 */
@Serializable(with = UnifiedBenchmarkPricing.Serializer::class)
public class UnifiedBenchmarkPricing(
  /**
   * Cost per output token (USD, decimal string).
   */
  public val completion: String,
  /**
   * Cost per input token (USD, decimal string).
   */
  public val prompt: String,
) {
  public class Builder {
    private var completionValue: String? = null

    public var completion: String
      get() = requireNotNull(completionValue) { "completion is required" }
      set(`value`) {
        completionValue = value
      }

    private var promptValue: String? = null

    public var prompt: String
      get() = requireNotNull(promptValue) { "prompt is required" }
      set(`value`) {
        promptValue = value
      }

    public fun build(): UnifiedBenchmarkPricing {
      check(completionValue != null) { "completion is required" }
      check(promptValue != null) { "prompt is required" }
      return UnifiedBenchmarkPricing(
        completion = completion,
        prompt = prompt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UnifiedBenchmarkPricing = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UnifiedBenchmarkPricing> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UnifiedBenchmarkPricing {
      val jsonDecoder = decoder.requireJsonDecoder("UnifiedBenchmarkPricing")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UnifiedBenchmarkPricing must be a JSON object")
      val completion = json.decodeRequired<String>(rawObject, "completion")
      val prompt = json.decodeRequired<String>(rawObject, "prompt")
      return UnifiedBenchmarkPricing(
        completion = completion,
        prompt = prompt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UnifiedBenchmarkPricing) {
      val jsonEncoder = encoder.requireJsonEncoder("UnifiedBenchmarkPricing")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completion", value.completion)
        put("prompt", value.prompt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun unifiedBenchmarkPricing(block: UnifiedBenchmarkPricing.Builder.() -> Unit): UnifiedBenchmarkPricing = UnifiedBenchmarkPricing.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UnifiedBenchmarkPricing is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
