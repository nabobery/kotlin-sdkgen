package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningConfig.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningConfig
 */
@Serializable(with = BaseReasoningConfig.Serializer::class)
public class BaseReasoningConfig(
  public val context: ReasoningContext? = null,
  public val effort: ReasoningEffort? = null,
  public val mode: ReasoningMode? = null,
  public val summary: ReasoningSummaryVerbosity? = null,
) {
  public class Builder {
    public var context: ReasoningContext? = null

    public var effort: ReasoningEffort? = null

    public var mode: ReasoningMode? = null

    public var summary: ReasoningSummaryVerbosity? = null

    public fun build(): BaseReasoningConfig = BaseReasoningConfig(
      context = context,
      effort = effort,
      mode = mode,
      summary = summary,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseReasoningConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BaseReasoningConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseReasoningConfig {
      val jsonDecoder = decoder.requireJsonDecoder("BaseReasoningConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BaseReasoningConfig must be a JSON object")
      return BaseReasoningConfig(
        context = rawObject["context"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ReasoningContext?>(element) },
        effort = rawObject["effort"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ReasoningEffort?>(element) },
        mode = rawObject["mode"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ReasoningMode?>(element) },
        summary = rawObject["summary"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ReasoningSummaryVerbosity?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseReasoningConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseReasoningConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.context?.let { put("context", json.encodeToJsonElement(it)) }
        value.effort?.let { put("effort", json.encodeToJsonElement(it)) }
        value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
        value.summary?.let { put("summary", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun baseReasoningConfig(block: BaseReasoningConfig.Builder.() -> Unit): BaseReasoningConfig = BaseReasoningConfig.build(block)
