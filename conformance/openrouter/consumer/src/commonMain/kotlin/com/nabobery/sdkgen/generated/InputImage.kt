package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class InputImageView(
  public val detail: InlineComponentsSchemasInputImagePropertiesDetail,
  @SerialName("image_url")
  public val imageUrl: String? = null,
  public val type: InlineComponentsSchemasInputImagePropertiesType,
)

/**
 * Image input content item
 */
@Serializable(with = InputImage.Serializer::class)
public class InputImage(
  public val detail: InlineComponentsSchemasInputImagePropertiesDetail,
  public val type: InlineComponentsSchemasInputImagePropertiesType,
  public val imageUrl: String? = null,
) {
  public class Builder {
    private var detailValue: InlineComponentsSchemasInputImagePropertiesDetail? = null

    public var detail: InlineComponentsSchemasInputImagePropertiesDetail
      get() = requireNotNull(detailValue) { "detail is required" }
      set(`value`) {
        detailValue = value
      }

    private var typeValue: InlineComponentsSchemasInputImagePropertiesType? = null

    public var type: InlineComponentsSchemasInputImagePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var imageUrl: String? = null

    public fun build(): InputImage {
      check(detailValue != null) { "detail is required" }
      check(typeValue != null) { "type is required" }
      return InputImage(
        detail = detail,
        type = type,
        imageUrl = imageUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InputImage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InputImage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InputImage {
      val jsonDecoder = decoder.requireJsonDecoder("InputImage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InputImage must be a JSON object")
      val detail = json.decodeRequired<InlineComponentsSchemasInputImagePropertiesDetail>(raw, "detail")
      val type = json.decodeRequired<InlineComponentsSchemasInputImagePropertiesType>(raw, "type")
      return InputImage(
        detail = detail,
        type = type,
        imageUrl = raw["image_url"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InputImage) {
      val jsonEncoder = encoder.requireJsonEncoder("InputImage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("detail", json.encodeToJsonElement(value.detail))
        put("type", json.encodeToJsonElement(value.type))
        value.imageUrl?.let { put("image_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inputImage(block: InputImage.Builder.() -> Unit): InputImage = InputImage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InputImage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
