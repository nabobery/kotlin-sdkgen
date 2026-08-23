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
 * Embeddings response containing embedding vectors
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1embeddings/post/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineEmbeddingsPostResponse200JsonX0f6ccfc4.Serializer::class)
public class InlineEmbeddingsPostResponse200JsonX0f6ccfc4(
  `data`: List<InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197>,
  /**
   * The model used for embeddings
   */
  public val model: String,
  public val objectValue: InlineEmbeddingsPostResponse200JsonObjectValueX497822a2,
  /**
   * Unique identifier for the embeddings response
   */
  public val id: String? = null,
  /**
   * Token usage statistics
   */
  public val usage: InlineEmbeddingsPostResponse200JsonUsageXe5f9524c? = null,
) {
  /**
   * List of embedding objects
   */
  public val `data`: List<InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197> = data.toList()

  public class Builder {
    private var dataValue: List<InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197>? = null

    public var `data`: List<InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var objectValueValue: InlineEmbeddingsPostResponse200JsonObjectValueX497822a2? = null

    public var objectValue: InlineEmbeddingsPostResponse200JsonObjectValueX497822a2
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * Unique identifier for the embeddings response
     */
    public var id: String? = null

    /**
     * Token usage statistics
     */
    public var usage: InlineEmbeddingsPostResponse200JsonUsageXe5f9524c? = null

    public fun build(): InlineEmbeddingsPostResponse200JsonX0f6ccfc4 {
      check(dataValue != null) { "data is required" }
      check(modelValue != null) { "model is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return InlineEmbeddingsPostResponse200JsonX0f6ccfc4(
        data = data,
        model = model,
        objectValue = objectValue,
        id = id,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEmbeddingsPostResponse200JsonX0f6ccfc4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostResponse200JsonX0f6ccfc4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostResponse200JsonX0f6ccfc4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostResponse200JsonX0f6ccfc4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEmbeddingsPostResponse200JsonX0f6ccfc4 must be a JSON object")
      val data = json.decodeRequired<List<InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197>>(rawObject, "data")
      val model = json.decodeRequired<String>(rawObject, "model")
      val objectValue = json.decodeRequired<InlineEmbeddingsPostResponse200JsonObjectValueX497822a2>(rawObject, "object")
      return InlineEmbeddingsPostResponse200JsonX0f6ccfc4(
        data = data,
        model = model,
        objectValue = objectValue,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        usage = rawObject["usage"]?.let { json.decodeFromJsonElement<InlineEmbeddingsPostResponse200JsonUsageXe5f9524c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostResponse200JsonX0f6ccfc4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEmbeddingsPostResponse200JsonX0f6ccfc4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("model", value.model)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.id?.let { put("id", it) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEmbeddingsPostResponse200JsonX0f6ccfc4(block: InlineEmbeddingsPostResponse200JsonX0f6ccfc4.Builder.() -> Unit): InlineEmbeddingsPostResponse200JsonX0f6ccfc4 = InlineEmbeddingsPostResponse200JsonX0f6ccfc4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEmbeddingsPostResponse200JsonX0f6ccfc4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
