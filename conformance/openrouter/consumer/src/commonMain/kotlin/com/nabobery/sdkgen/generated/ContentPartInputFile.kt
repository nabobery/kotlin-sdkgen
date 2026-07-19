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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputFile.
 */
@Serializable(with = ContentPartInputFile.Serializer::class)
public class ContentPartInputFile(
  public val inputFile: MultimodalMedia,
  public val type: InlineComponentsSchemasContentPartInputFilePropertiesType,
) {
  public class Builder {
    private var inputFileValue: MultimodalMedia? = null

    public var inputFile: MultimodalMedia
      get() = requireNotNull(inputFileValue) { "inputFile is required" }
      set(`value`) {
        inputFileValue = value
      }

    private var typeValue: InlineComponentsSchemasContentPartInputFilePropertiesType? = null

    public var type: InlineComponentsSchemasContentPartInputFilePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ContentPartInputFile {
      check(inputFileValue != null) { "inputFile is required" }
      check(typeValue != null) { "type is required" }
      return ContentPartInputFile(
        inputFile = inputFile,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentPartInputFile = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ContentPartInputFile> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentPartInputFile {
      val jsonDecoder = decoder.requireJsonDecoder("ContentPartInputFile")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ContentPartInputFile must be a JSON object")
      val inputFile = json.decodeRequired<MultimodalMedia>(raw, "input_file")
      val type = json.decodeRequired<InlineComponentsSchemasContentPartInputFilePropertiesType>(raw, "type")
      return ContentPartInputFile(
        inputFile = inputFile,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentPartInputFile) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentPartInputFile")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_file", json.encodeToJsonElement(value.inputFile))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentPartInputFile(block: ContentPartInputFile.Builder.() -> Unit): ContentPartInputFile =
  ContentPartInputFile.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentPartInputFile is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
