package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModelsCountResponse
 */
@Serializable(with = ModelsCountResponse.Serializer::class)
public class ModelsCountResponse(
  /**
   * Model count data
   */
  public val `data`: InlineModelsCountResponseDataX61b254e5,
) {
  public class Builder {
    private var dataValue: InlineModelsCountResponseDataX61b254e5? = null

    public var `data`: InlineModelsCountResponseDataX61b254e5
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): ModelsCountResponse {
      check(dataValue != null) { "data is required" }
      return ModelsCountResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ModelsCountResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ModelsCountResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ModelsCountResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ModelsCountResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ModelsCountResponse must be a JSON object")
      val data = json.decodeRequired<InlineModelsCountResponseDataX61b254e5>(rawObject, "data")
      return ModelsCountResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ModelsCountResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ModelsCountResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun modelsCountResponse(block: ModelsCountResponse.Builder.() -> Unit): ModelsCountResponse = ModelsCountResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ModelsCountResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
