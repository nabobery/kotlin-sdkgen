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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Default parameters for this model
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DefaultParameters
 */
@Serializable(with = DefaultParameters.Serializer::class)
public class DefaultParameters(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val frequencyPenalty: Double? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val presencePenalty: Double? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val repetitionPenalty: Double? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val temperature: Double? = null,
  public val topK: Int? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val topP: Double? = null,
) {
  public class Builder {
    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var frequencyPenalty: Double? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var presencePenalty: Double? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var repetitionPenalty: Double? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var temperature: Double? = null

    public var topK: Int? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var topP: Double? = null

    public fun build(): DefaultParameters = DefaultParameters(
      frequencyPenalty = frequencyPenalty,
      presencePenalty = presencePenalty,
      repetitionPenalty = repetitionPenalty,
      temperature = temperature,
      topK = topK,
      topP = topP,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DefaultParameters = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DefaultParameters> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DefaultParameters {
      val jsonDecoder = decoder.requireJsonDecoder("DefaultParameters")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DefaultParameters must be a JSON object")
      return DefaultParameters(
        frequencyPenalty = rawObject["frequency_penalty"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        presencePenalty = rawObject["presence_penalty"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        repetitionPenalty = rawObject["repetition_penalty"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        temperature = rawObject["temperature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        topK = rawObject["top_k"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        topP = rawObject["top_p"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DefaultParameters) {
      val jsonEncoder = encoder.requireJsonEncoder("DefaultParameters")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.frequencyPenalty?.let { put("frequency_penalty", json.encodeToJsonElement(it)) }
        value.presencePenalty?.let { put("presence_penalty", json.encodeToJsonElement(it)) }
        value.repetitionPenalty?.let { put("repetition_penalty", json.encodeToJsonElement(it)) }
        value.temperature?.let { put("temperature", json.encodeToJsonElement(it)) }
        value.topK?.let { put("top_k", json.encodeToJsonElement(it)) }
        value.topP?.let { put("top_p", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun defaultParameters(block: DefaultParameters.Builder.() -> Unit): DefaultParameters = DefaultParameters.build(block)
