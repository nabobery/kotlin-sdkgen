package io.github.nabobery.sdkgen.generated

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
 * An openrouter:bash server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputBashServerToolItem
 */
@Serializable(with = OutputBashServerToolItem.Serializer::class)
public class OutputBashServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputBashServerToolItemTypeXc097682a,
  public val command: String? = null,
  public val exitCode: Int? = null,
  public val id: String? = null,
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

    private var typeValue: InlineOutputBashServerToolItemTypeXc097682a? = null

    public var type: InlineOutputBashServerToolItemTypeXc097682a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var command: String? = null

    public var exitCode: Int? = null

    public var id: String? = null

    public var stderr: String? = null

    public var stdout: String? = null

    public fun build(): OutputBashServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputBashServerToolItem(
        status = status,
        type = type,
        command = command,
        exitCode = exitCode,
        id = id,
        stderr = stderr,
        stdout = stdout,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputBashServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputBashServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputBashServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputBashServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputBashServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputBashServerToolItemTypeXc097682a>(rawObject, "type")
      return OutputBashServerToolItem(
        status = status,
        type = type,
        command = rawObject["command"]?.let { json.decodeFromJsonElement<String>(it) },
        exitCode = rawObject["exitCode"]?.let { json.decodeFromJsonElement<Int>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        stderr = rawObject["stderr"]?.let { json.decodeFromJsonElement<String>(it) },
        stdout = rawObject["stdout"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputBashServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputBashServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.command?.let { put("command", it) }
        value.exitCode?.let { put("exitCode", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.stderr?.let { put("stderr", it) }
        value.stdout?.let { put("stdout", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputBashServerToolItem(block: OutputBashServerToolItem.Builder.() -> Unit): OutputBashServerToolItem = OutputBashServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputBashServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
