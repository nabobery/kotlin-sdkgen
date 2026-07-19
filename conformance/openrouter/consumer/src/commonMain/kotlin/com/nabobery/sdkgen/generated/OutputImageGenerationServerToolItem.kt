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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An openrouter:image_generation server tool output item
 */
@Serializable(with = OutputImageGenerationServerToolItem.Serializer::class)
public class OutputImageGenerationServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType,
  public val id: String? = null,
  public val imageB64: String? = null,
  public val imageUrl: String? = null,
  /**
   * The generated image as a base64-encoded string or URL, matching OpenAI image_generation_call format
   */
  public val result: String? = null,
  public val revisedPrompt: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType?
        = null

    public var type: InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public var imageB64: String? = null

    public var imageUrl: String? = null

    /**
     * The generated image as a base64-encoded string or URL, matching OpenAI image_generation_call format
     */
    public var result: String? = null

    public var revisedPrompt: String? = null

    public fun build(): OutputImageGenerationServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputImageGenerationServerToolItem(
        status = status,
        type = type,
        id = id,
        imageB64 = imageB64,
        imageUrl = imageUrl,
        result = result,
        revisedPrompt = revisedPrompt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputImageGenerationServerToolItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputImageGenerationServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputImageGenerationServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputImageGenerationServerToolItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputImageGenerationServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType>(raw,
        "type")
      return OutputImageGenerationServerToolItem(
        status = status,
        type = type,
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        imageB64 = raw["imageB64"]?.let { json.decodeFromJsonElement<String>(it) },
        imageUrl = raw["imageUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        result = raw["result"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        revisedPrompt = raw["revisedPrompt"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputImageGenerationServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputImageGenerationServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.imageB64?.let { put("imageB64", it) }
        value.imageUrl?.let { put("imageUrl", it) }
        value.result?.let { put("result", it) }
        value.revisedPrompt?.let { put("revisedPrompt", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputImageGenerationServerToolItem(block: OutputImageGenerationServerToolItem.Builder.() ->
  Unit): OutputImageGenerationServerToolItem = OutputImageGenerationServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("OutputImageGenerationServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
