package com.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Aggregated usage statistics for the request
 */
@Serializable(with = SttUsage.Serializer::class)
public class SttUsage(
  /**
   * Total cost of the request in USD
   */
  public val cost: Double? = null,
  /**
   * Number of input tokens billed for this request
   */
  public val inputTokens: Int? = null,
  /**
   * Number of output tokens generated
   */
  public val outputTokens: Int? = null,
  /**
   * Duration of the input audio in seconds
   */
  public val seconds: Double? = null,
  /**
   * Total number of tokens used (input + output)
   */
  public val totalTokens: Int? = null,
) {
  public class Builder {
    /**
     * Total cost of the request in USD
     */
    public var cost: Double? = null

    /**
     * Number of input tokens billed for this request
     */
    public var inputTokens: Int? = null

    /**
     * Number of output tokens generated
     */
    public var outputTokens: Int? = null

    /**
     * Duration of the input audio in seconds
     */
    public var seconds: Double? = null

    /**
     * Total number of tokens used (input + output)
     */
    public var totalTokens: Int? = null

    public fun build(): SttUsage = SttUsage(
      cost = cost,
      inputTokens = inputTokens,
      outputTokens = outputTokens,
      seconds = seconds,
      totalTokens = totalTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SttUsage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SttUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SttUsage {
      val jsonDecoder = decoder.requireJsonDecoder("SttUsage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("SttUsage must be a JSON object")
      return SttUsage(
        cost = raw["cost"]?.let { json.decodeFromJsonElement<Double>(it) },
        inputTokens = raw["input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        outputTokens = raw["output_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        seconds = raw["seconds"]?.let { json.decodeFromJsonElement<Double>(it) },
        totalTokens = raw["total_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SttUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("SttUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cost?.let { put("cost", json.encodeToJsonElement(it)) }
        value.inputTokens?.let { put("input_tokens", json.encodeToJsonElement(it)) }
        value.outputTokens?.let { put("output_tokens", json.encodeToJsonElement(it)) }
        value.seconds?.let { put("seconds", json.encodeToJsonElement(it)) }
        value.totalTokens?.let { put("total_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sttUsage(block: SttUsage.Builder.() -> Unit): SttUsage = SttUsage.build(block)
