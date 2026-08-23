package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Third-party benchmark rankings for this model. Omitted when no benchmark data is available.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModelBenchmarks
 */
@Serializable(with = ModelBenchmarks.Serializer::class)
public class ModelBenchmarks(
  designArena: List<DaBenchmarkEntry>,
  public val artificialAnalysis: AaBenchmarkEntry? = null,
) {
  /**
   * Design Arena ELO rankings across arena+category pairs.
   */
  public val designArena: List<DaBenchmarkEntry> = designArena.toList()

  public class Builder {
    private var designArenaValue: List<DaBenchmarkEntry>? = null

    public var designArena: List<DaBenchmarkEntry>
      get() = requireNotNull(designArenaValue) { "designArena is required" }.toList()
      set(`value`) {
        designArenaValue = value.toList()
      }

    public var artificialAnalysis: AaBenchmarkEntry? = null

    public fun build(): ModelBenchmarks {
      check(designArenaValue != null) { "designArena is required" }
      return ModelBenchmarks(
        designArena = designArena,
        artificialAnalysis = artificialAnalysis,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ModelBenchmarks = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ModelBenchmarks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ModelBenchmarks {
      val jsonDecoder = decoder.requireJsonDecoder("ModelBenchmarks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ModelBenchmarks must be a JSON object")
      val designArena = json.decodeRequired<List<DaBenchmarkEntry>>(rawObject, "design_arena")
      return ModelBenchmarks(
        designArena = designArena,
        artificialAnalysis = rawObject["artificial_analysis"]?.let { json.decodeFromJsonElement<AaBenchmarkEntry>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ModelBenchmarks) {
      val jsonEncoder = encoder.requireJsonEncoder("ModelBenchmarks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("design_arena", json.encodeToJsonElement(value.designArena))
        value.artificialAnalysis?.let { put("artificial_analysis", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun modelBenchmarks(block: ModelBenchmarks.Builder.() -> Unit): ModelBenchmarks = ModelBenchmarks.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ModelBenchmarks is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
