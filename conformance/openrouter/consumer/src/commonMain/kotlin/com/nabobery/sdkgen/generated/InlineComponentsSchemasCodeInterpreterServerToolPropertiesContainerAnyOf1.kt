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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1.Serializer::class)
public class InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1(
  public val type:
      InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType,
  public val fileIds: List<String>? = null,
  public val memoryLimit:
      InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1Properte38ea91e? = null,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType? =
        null

    public var type:
        InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var fileIds: List<String>? = null

    public var memoryLimit:
        InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1Properte38ea91e? =
        null

    public fun build(): InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1(
        type = type,
        fileIds = fileIds,
        memoryLimit = memoryLimit,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1 must " +
          "be a JSON object")
      val type = json
        .decodeRequired<InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1PropertiesType>(raw,
          "type")
      return InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1(
        type = type,
        fileIds = raw["file_ids"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        memoryLimit = raw["memory_limit"]?.let { element -> if (element == JsonNull) null else json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1Properte38ea91e?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.fileIds?.let { put("file_ids", json.encodeToJsonElement(it)) }
        value.memoryLimit?.let { put("memory_limit", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1(block: InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1.Builder.() -> Unit): InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1 = InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
