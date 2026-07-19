package com.nabobery.sdkgen.generated

import kotlin.Double
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Per-request token limits
 */
@Serializable(with = PerRequestLimits.Serializer::class)
public class PerRequestLimits(
  /**
   * Maximum completion tokens per request
   */
  public val completionTokens: Double,
  /**
   * Maximum prompt tokens per request
   */
  public val promptTokens: Double,
) {
  public class Builder {
    private var completionTokensValue: Double? = null

    public var completionTokens: Double
      get() = requireNotNull(completionTokensValue) { "completionTokens is required" }
      set(`value`) {
        completionTokensValue = value
      }

    private var promptTokensValue: Double? = null

    public var promptTokens: Double
      get() = requireNotNull(promptTokensValue) { "promptTokens is required" }
      set(`value`) {
        promptTokensValue = value
      }

    public fun build(): PerRequestLimits {
      check(completionTokensValue != null) { "completionTokens is required" }
      check(promptTokensValue != null) { "promptTokens is required" }
      return PerRequestLimits(
        completionTokens = completionTokens,
        promptTokens = promptTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PerRequestLimits = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PerRequestLimits> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PerRequestLimits {
      val jsonDecoder = decoder.requireJsonDecoder("PerRequestLimits")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("PerRequestLimits must be a JSON object")
      val completionTokens = json.decodeRequired<Double>(raw, "completion_tokens")
      val promptTokens = json.decodeRequired<Double>(raw, "prompt_tokens")
      return PerRequestLimits(
        completionTokens = completionTokens,
        promptTokens = promptTokens,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PerRequestLimits) {
      val jsonEncoder = encoder.requireJsonEncoder("PerRequestLimits")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completion_tokens", json.encodeToJsonElement(value.completionTokens))
        put("prompt_tokens", json.encodeToJsonElement(value.promptTokens))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun perRequestLimits(block: PerRequestLimits.Builder.() -> Unit): PerRequestLimits = PerRequestLimits
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PerRequestLimits is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
