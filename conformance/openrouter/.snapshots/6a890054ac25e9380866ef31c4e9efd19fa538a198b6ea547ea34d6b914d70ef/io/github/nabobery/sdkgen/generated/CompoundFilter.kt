package io.github.nabobery.sdkgen.generated

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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

@ConsistentCopyVisibility
@Serializable
public data class CompoundFilterView internal constructor(
  public val filters: List<Map<String, JsonElement?>>,
  public val type: InlineCompoundFilterTypeX60defd7b,
)

/**
 * A compound filter that combines multiple comparison or compound filters
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CompoundFilter
 */
@Serializable(with = CompoundFilter.Serializer::class)
public class CompoundFilter(
  filters: List<Map<String, JsonElement?>>,
  public val type: InlineCompoundFilterTypeX60defd7b,
) {
  public val filters: List<Map<String, JsonElement?>> = filters.map { element0 -> element0.toMap() }

  public class Builder {
    private var filtersValue: List<Map<String, JsonElement?>>? = null

    public var filters: List<Map<String, JsonElement?>>
      get() = requireNotNull(filtersValue) { "filters is required" }.map { element0 -> element0.toMap() }
      set(`value`) {
        filtersValue = value.map { element0 -> element0.toMap() }
      }

    private var typeValue: InlineCompoundFilterTypeX60defd7b? = null

    public var type: InlineCompoundFilterTypeX60defd7b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): CompoundFilter {
      check(filtersValue != null) { "filters is required" }
      check(typeValue != null) { "type is required" }
      return CompoundFilter(
        filters = filters,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CompoundFilter = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CompoundFilter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CompoundFilter {
      val jsonDecoder = decoder.requireJsonDecoder("CompoundFilter")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CompoundFilter must be a JSON object")
      val filters = json.decodeRequired<List<Map<String, JsonElement?>>>(rawObject, "filters")
      val type = json.decodeRequired<InlineCompoundFilterTypeX60defd7b>(rawObject, "type")
      return CompoundFilter(
        filters = filters,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CompoundFilter) {
      val jsonEncoder = encoder.requireJsonEncoder("CompoundFilter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("filters", json.encodeToJsonElement(value.filters))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun compoundFilter(block: CompoundFilter.Builder.() -> Unit): CompoundFilter = CompoundFilter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CompoundFilter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
