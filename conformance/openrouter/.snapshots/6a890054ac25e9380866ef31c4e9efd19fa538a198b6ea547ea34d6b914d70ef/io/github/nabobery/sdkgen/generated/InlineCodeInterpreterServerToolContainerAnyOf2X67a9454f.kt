package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container/anyOf/1
 */
@Serializable(with = InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f.Serializer::class)
public class InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f(
  public val type: InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04,
  fileIds: List<String>? = null,
  public val memoryLimit:
      InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e? = null,
) {
  public val fileIds: List<String>? = fileIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04? = null

    public var type: InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var fileIdsValue: List<String>? = null

    public var fileIds: List<String>?
      get() = fileIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        fileIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var memoryLimit: InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e? =
        null

    public fun build(): InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f {
      check(typeValue != null) { "type is required" }
      return InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f(
        type = type,
        fileIds = fileIds,
        memoryLimit = memoryLimit,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f must be a JSON object")
      val type = json.decodeRequired<InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04>(rawObject, "type")
      return InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f(
        type = type,
        fileIds = rawObject["file_ids"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        memoryLimit = rawObject["memory_limit"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f")
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

public fun inlineCodeInterpreterServerToolContainerAnyOf2X67a9454f(block: InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f.Builder.() -> Unit): InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f = InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
