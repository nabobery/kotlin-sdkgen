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
 * An openrouter:files server tool output item
 */
@Serializable(with = OutputFilesServerToolItem.Serializer::class)
public class OutputFilesServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineComponentsSchemasOutputFilesServerToolItemPropertiesType,
  /**
   * Error message when the file operation failed.
   */
  public val error: String? = null,
  /**
   * The target file id supplied in the tool-call arguments.
   */
  public val fileId: String? = null,
  /**
   * The target filename supplied in the tool-call arguments.
   */
  public val filename: String? = null,
  public val id: String? = null,
  /**
   * The file operation performed (list, read, write, or edit).
   */
  public val operation: String? = null,
  /**
   * JSON-serialized result of the file operation.
   */
  public val result: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputFilesServerToolItemPropertiesType? = null

    public var type: InlineComponentsSchemasOutputFilesServerToolItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Error message when the file operation failed.
     */
    public var error: String? = null

    /**
     * The target file id supplied in the tool-call arguments.
     */
    public var fileId: String? = null

    /**
     * The target filename supplied in the tool-call arguments.
     */
    public var filename: String? = null

    public var id: String? = null

    /**
     * The file operation performed (list, read, write, or edit).
     */
    public var operation: String? = null

    /**
     * JSON-serialized result of the file operation.
     */
    public var result: String? = null

    public fun build(): OutputFilesServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputFilesServerToolItem(
        status = status,
        type = type,
        error = error,
        fileId = fileId,
        filename = filename,
        id = id,
        operation = operation,
        result = result,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputFilesServerToolItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputFilesServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputFilesServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputFilesServerToolItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputFilesServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasOutputFilesServerToolItemPropertiesType>(raw, "type")
      return OutputFilesServerToolItem(
        status = status,
        type = type,
        error = raw["error"]?.let { json.decodeFromJsonElement<String>(it) },
        fileId = raw["file_id"]?.let { json.decodeFromJsonElement<String>(it) },
        filename = raw["filename"]?.let { json.decodeFromJsonElement<String>(it) },
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        operation = raw["operation"]?.let { json.decodeFromJsonElement<String>(it) },
        result = raw["result"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputFilesServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputFilesServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.error?.let { put("error", it) }
        value.fileId?.let { put("file_id", it) }
        value.filename?.let { put("filename", it) }
        value.id?.let { put("id", it) }
        value.operation?.let { put("operation", it) }
        value.result?.let { put("result", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputFilesServerToolItem(block: OutputFilesServerToolItem.Builder.() -> Unit): OutputFilesServerToolItem =
  OutputFilesServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputFilesServerToolItem is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
