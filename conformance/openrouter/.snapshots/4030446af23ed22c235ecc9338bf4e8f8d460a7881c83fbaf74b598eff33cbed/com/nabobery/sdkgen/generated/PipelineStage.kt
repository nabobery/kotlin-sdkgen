package com.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/PipelineStage.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PipelineStage
 */
@Serializable(with = PipelineStage.Serializer::class)
public class PipelineStage(
  public val name: String,
  public val type: PipelineStageType,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val costUsd: Double? = null,
  `data`: Map<String, JsonElement?>? = null,
  public val guardrailId: String? = null,
  public val guardrailScope: String? = null,
  public val summary: String? = null,
) {
  public val `data`: Map<String, JsonElement?>? = data?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: PipelineStageType? = null

    public var type: PipelineStageType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var costUsd: Double? = null

    private var dataValue: Map<String, JsonElement?>? = null

    public var `data`: Map<String, JsonElement?>?
      get() = dataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        dataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var guardrailId: String? = null

    public var guardrailScope: String? = null

    public var summary: String? = null

    public fun build(): PipelineStage {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return PipelineStage(
        name = name,
        type = type,
        costUsd = costUsd,
        data = data,
        guardrailId = guardrailId,
        guardrailScope = guardrailScope,
        summary = summary,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PipelineStage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PipelineStage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PipelineStage {
      val jsonDecoder = decoder.requireJsonDecoder("PipelineStage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PipelineStage must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<PipelineStageType>(rawObject, "type")
      return PipelineStage(
        name = name,
        type = type,
        costUsd = rawObject["cost_usd"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        data = rawObject["data"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        guardrailId = rawObject["guardrail_id"]?.let { json.decodeFromJsonElement<String>(it) },
        guardrailScope = rawObject["guardrail_scope"]?.let { json.decodeFromJsonElement<String>(it) },
        summary = rawObject["summary"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PipelineStage) {
      val jsonEncoder = encoder.requireJsonEncoder("PipelineStage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.costUsd?.let { put("cost_usd", json.encodeToJsonElement(it)) }
        value.data?.let { put("data", json.encodeToJsonElement(it)) }
        value.guardrailId?.let { put("guardrail_id", it) }
        value.guardrailScope?.let { put("guardrail_scope", it) }
        value.summary?.let { put("summary", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pipelineStage(block: PipelineStage.Builder.() -> Unit): PipelineStage = PipelineStage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PipelineStage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
