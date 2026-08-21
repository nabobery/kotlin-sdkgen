package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * An openrouter:code_interpreter server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputCodeInterpreterServerToolItem
 */
@Serializable(with = OutputCodeInterpreterServerToolItem.Serializer::class)
public class OutputCodeInterpreterServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputCodeInterpreterServerToolItemTypeX7279e892,
  public val code: String? = null,
  public val exitCode: Int? = null,
  public val id: String? = null,
  public val language: String? = null,
  public val stderr: String? = null,
  public val stdout: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputCodeInterpreterServerToolItemTypeX7279e892? = null

    public var type: InlineOutputCodeInterpreterServerToolItemTypeX7279e892
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var code: String? = null

    public var exitCode: Int? = null

    public var id: String? = null

    public var language: String? = null

    public var stderr: String? = null

    public var stdout: String? = null

    public fun build(): OutputCodeInterpreterServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputCodeInterpreterServerToolItem(
        status = status,
        type = type,
        code = code,
        exitCode = exitCode,
        id = id,
        language = language,
        stderr = stderr,
        stdout = stdout,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputCodeInterpreterServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputCodeInterpreterServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputCodeInterpreterServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputCodeInterpreterServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputCodeInterpreterServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputCodeInterpreterServerToolItemTypeX7279e892>(rawObject, "type")
      return OutputCodeInterpreterServerToolItem(
        status = status,
        type = type,
        code = rawObject["code"]?.let { json.decodeFromJsonElement<String>(it) },
        exitCode = rawObject["exitCode"]?.let { json.decodeFromJsonElement<Int>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        language = rawObject["language"]?.let { json.decodeFromJsonElement<String>(it) },
        stderr = rawObject["stderr"]?.let { json.decodeFromJsonElement<String>(it) },
        stdout = rawObject["stdout"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputCodeInterpreterServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputCodeInterpreterServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.code?.let { put("code", it) }
        value.exitCode?.let { put("exitCode", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.language?.let { put("language", it) }
        value.stderr?.let { put("stderr", it) }
        value.stdout?.let { put("stdout", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputCodeInterpreterServerToolItem(block: OutputCodeInterpreterServerToolItem.Builder.() -> Unit): OutputCodeInterpreterServerToolItem = OutputCodeInterpreterServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputCodeInterpreterServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
