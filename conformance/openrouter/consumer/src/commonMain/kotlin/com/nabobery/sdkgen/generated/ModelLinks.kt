package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.put

/**
 * Related API endpoints and resources for this model.
 */
@Serializable(with = ModelLinks.Serializer::class)
public class ModelLinks(
  /**
   * URL for the model details/endpoints API
   */
  public val details: String,
) {
  public class Builder {
    private var detailsValue: String? = null

    public var details: String
      get() = requireNotNull(detailsValue) { "details is required" }
      set(`value`) {
        detailsValue = value
      }

    public fun build(): ModelLinks {
      check(detailsValue != null) { "details is required" }
      return ModelLinks(
        details = details,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ModelLinks = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ModelLinks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ModelLinks {
      val jsonDecoder = decoder.requireJsonDecoder("ModelLinks")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ModelLinks must be a JSON object")
      val details = json.decodeRequired<String>(raw, "details")
      return ModelLinks(
        details = details,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ModelLinks) {
      val jsonEncoder = encoder.requireJsonEncoder("ModelLinks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("details", value.details)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun modelLinks(block: ModelLinks.Builder.() -> Unit): ModelLinks = ModelLinks.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ModelLinks is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
