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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * File content part for document processing
 */
@Serializable(with = ChatContentFile.Serializer::class)
public class ChatContentFile(
  public val `file`: InlineComponentsSchemasChatContentFilePropertiesFile,
  public val type: InlineComponentsSchemasChatContentFilePropertiesType,
) {
  public class Builder {
    private var fileValue: InlineComponentsSchemasChatContentFilePropertiesFile? = null

    public var `file`: InlineComponentsSchemasChatContentFilePropertiesFile
      get() = requireNotNull(fileValue) { "file is required" }
      set(`value`) {
        fileValue = value
      }

    private var typeValue: InlineComponentsSchemasChatContentFilePropertiesType? = null

    public var type: InlineComponentsSchemasChatContentFilePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatContentFile {
      check(fileValue != null) { "file is required" }
      check(typeValue != null) { "type is required" }
      return ChatContentFile(
        file = file,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatContentFile = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatContentFile> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContentFile {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContentFile")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatContentFile must be a JSON object")
      val file = json.decodeRequired<InlineComponentsSchemasChatContentFilePropertiesFile>(raw, "file")
      val type = json.decodeRequired<InlineComponentsSchemasChatContentFilePropertiesType>(raw, "type")
      return ChatContentFile(
        file = file,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatContentFile) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatContentFile")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file", json.encodeToJsonElement(value.file))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatContentFile(block: ChatContentFile.Builder.() -> Unit): ChatContentFile = ChatContentFile.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatContentFile is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
