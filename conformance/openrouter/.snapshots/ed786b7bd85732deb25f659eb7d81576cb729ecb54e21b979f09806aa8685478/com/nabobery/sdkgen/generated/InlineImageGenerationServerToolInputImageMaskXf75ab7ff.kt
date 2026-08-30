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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/input_image_mask
 */
@Serializable(with = InlineImageGenerationServerToolInputImageMaskXf75ab7ff.Serializer::class)
public class InlineImageGenerationServerToolInputImageMaskXf75ab7ff(
  public val fileId: String? = null,
  public val imageUrl: String? = null,
) {
  public class Builder {
    public var fileId: String? = null

    public var imageUrl: String? = null

    public fun build(): InlineImageGenerationServerToolInputImageMaskXf75ab7ff = InlineImageGenerationServerToolInputImageMaskXf75ab7ff(
      fileId = fileId,
      imageUrl = imageUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineImageGenerationServerToolInputImageMaskXf75ab7ff = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineImageGenerationServerToolInputImageMaskXf75ab7ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageGenerationServerToolInputImageMaskXf75ab7ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageGenerationServerToolInputImageMaskXf75ab7ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineImageGenerationServerToolInputImageMaskXf75ab7ff must be a JSON object")
      return InlineImageGenerationServerToolInputImageMaskXf75ab7ff(
        fileId = rawObject["file_id"]?.let { json.decodeFromJsonElement<String>(it) },
        imageUrl = rawObject["image_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationServerToolInputImageMaskXf75ab7ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineImageGenerationServerToolInputImageMaskXf75ab7ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fileId?.let { put("file_id", it) }
        value.imageUrl?.let { put("image_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineImageGenerationServerToolInputImageMaskXf75ab7ff(block: InlineImageGenerationServerToolInputImageMaskXf75ab7ff.Builder.() -> Unit): InlineImageGenerationServerToolInputImageMaskXf75ab7ff = InlineImageGenerationServerToolInputImageMaskXf75ab7ff.build(block)
