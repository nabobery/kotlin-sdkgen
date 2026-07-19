package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * Model count data
 */
@Serializable(with = InlineComponentsSchemasModelsCountResponsePropertiesData.Serializer::class)
public class InlineComponentsSchemasModelsCountResponsePropertiesData(
  /**
   * Total number of available models
   */
  public val count: Int,
) {
  public class Builder {
    private var countValue: Int? = null

    public var count: Int
      get() = requireNotNull(countValue) { "count is required" }
      set(`value`) {
        countValue = value
      }

    public fun build(): InlineComponentsSchemasModelsCountResponsePropertiesData {
      check(countValue != null) { "count is required" }
      return InlineComponentsSchemasModelsCountResponsePropertiesData(
        count = count,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasModelsCountResponsePropertiesData = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasModelsCountResponsePropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasModelsCountResponsePropertiesData {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasModelsCountResponsePropertiesData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasModelsCountResponsePropertiesData must be a JSON object")
      val count = json.decodeRequired<Int>(raw, "count")
      return InlineComponentsSchemasModelsCountResponsePropertiesData(
        count = count,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasModelsCountResponsePropertiesData) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasModelsCountResponsePropertiesData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("count", json.encodeToJsonElement(value.count))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasModelsCountResponsePropertiesData(block: InlineComponentsSchemasModelsCountResponsePropertiesData.Builder.() -> Unit): InlineComponentsSchemasModelsCountResponsePropertiesData = InlineComponentsSchemasModelsCountResponsePropertiesData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasModelsCountResponsePropertiesData is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
