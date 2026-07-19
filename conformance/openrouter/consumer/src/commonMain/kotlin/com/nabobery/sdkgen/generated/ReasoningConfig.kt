package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Configuration for reasoning mode in the response
 */
@Serializable(with = ReasoningConfig.Serializer::class)
public class ReasoningConfig(
  public val context: ReasoningContext? = null,
  public val effort: ReasoningEffort? = null,
  public val enabled: Boolean? = null,
  public val maxTokens: Int? = null,
  public val mode: ReasoningMode? = null,
  public val summary: ReasoningSummaryVerbosity? = null,
) {
  public class Builder {
    public var context: ReasoningContext? = null

    public var effort: ReasoningEffort? = null

    public var enabled: Boolean? = null

    public var maxTokens: Int? = null

    public var mode: ReasoningMode? = null

    public var summary: ReasoningSummaryVerbosity? = null

    public fun build(): ReasoningConfig = ReasoningConfig(
      context = context,
      effort = effort,
      enabled = enabled,
      maxTokens = maxTokens,
      mode = mode,
      summary = summary,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReasoningConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReasoningConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ReasoningConfig must be a JSON object")
      return ReasoningConfig(
        context = raw["context"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ReasoningContext?>(element) },
        effort = raw["effort"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ReasoningEffort?>(element) },
        enabled = raw["enabled"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        maxTokens = raw["max_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        mode = raw["mode"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ReasoningMode?>(element) },
        summary = raw["summary"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ReasoningSummaryVerbosity?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ReasoningConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.context?.let { put("context", json.encodeToJsonElement(it)) }
        value.effort?.let { put("effort", json.encodeToJsonElement(it)) }
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.maxTokens?.let { put("max_tokens", json.encodeToJsonElement(it)) }
        value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
        value.summary?.let { put("summary", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reasoningConfig(block: ReasoningConfig.Builder.() -> Unit): ReasoningConfig = ReasoningConfig.build(block)
