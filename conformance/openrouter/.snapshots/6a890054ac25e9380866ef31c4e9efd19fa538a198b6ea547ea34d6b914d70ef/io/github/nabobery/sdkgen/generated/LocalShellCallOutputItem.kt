package io.github.nabobery.sdkgen.generated

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
 * Output from a local shell command execution
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallOutputItem
 */
@Serializable(with = LocalShellCallOutputItem.Serializer::class)
public class LocalShellCallOutputItem(
  public val id: String,
  public val output: String,
  public val type: InlineLocalShellCallOutputItemTypeX2b68a326,
  public val status: ToolCallStatus? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var outputValue: String? = null

    public var output: String
      get() = requireNotNull(outputValue) { "output is required" }
      set(`value`) {
        outputValue = value
      }

    private var typeValue: InlineLocalShellCallOutputItemTypeX2b68a326? = null

    public var type: InlineLocalShellCallOutputItemTypeX2b68a326
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var status: ToolCallStatus? = null

    public fun build(): LocalShellCallOutputItem {
      check(idValue != null) { "id is required" }
      check(outputValue != null) { "output is required" }
      check(typeValue != null) { "type is required" }
      return LocalShellCallOutputItem(
        id = id,
        output = output,
        type = type,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LocalShellCallOutputItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LocalShellCallOutputItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LocalShellCallOutputItem {
      val jsonDecoder = decoder.requireJsonDecoder("LocalShellCallOutputItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LocalShellCallOutputItem must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val output = json.decodeRequired<String>(rawObject, "output")
      val type = json.decodeRequired<InlineLocalShellCallOutputItemTypeX2b68a326>(rawObject, "type")
      return LocalShellCallOutputItem(
        id = id,
        output = output,
        type = type,
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ToolCallStatus?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LocalShellCallOutputItem) {
      val jsonEncoder = encoder.requireJsonEncoder("LocalShellCallOutputItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("output", value.output)
        put("type", json.encodeToJsonElement(value.type))
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun localShellCallOutputItem(block: LocalShellCallOutputItem.Builder.() -> Unit): LocalShellCallOutputItem = LocalShellCallOutputItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LocalShellCallOutputItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
