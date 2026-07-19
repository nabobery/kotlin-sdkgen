package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/input_image_mask.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask.Serializer::class)
public class InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask(
  public val fileId: String? = null,
  public val imageUrl: String? = null,
) {
  public class Builder {
    public var fileId: String? = null

    public var imageUrl: String? = null

    public fun build(): InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask =
      InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask(
      fileId = fileId,
      imageUrl = imageUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask must " +
          "be a JSON object")
      return InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask(
        fileId = raw["file_id"]?.let { json.decodeFromJsonElement<String>(it) },
        imageUrl = raw["image_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fileId?.let { put("file_id", it) }
        value.imageUrl?.let { put("image_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask(block: InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask.Builder.() -> Unit): InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask = InlineComponentsSchemasImageGenerationServerToolPropertiesInputImageMask.build(block)
