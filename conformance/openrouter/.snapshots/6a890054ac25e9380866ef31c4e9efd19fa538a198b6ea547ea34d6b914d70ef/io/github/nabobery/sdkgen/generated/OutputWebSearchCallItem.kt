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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchCallItem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchCallItem
 */
@Serializable(with = OutputWebSearchCallItem.Serializer::class)
public class OutputWebSearchCallItem(
  public val id: String,
  public val status: WebSearchStatus,
  public val type: InlineOutputItemWebSearchCallTypeX70b2c197,
  public val action: InlineOutputItemWebSearchCallActionX7e2c4296? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var statusValue: WebSearchStatus? = null

    public var status: WebSearchStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputItemWebSearchCallTypeX70b2c197? = null

    public var type: InlineOutputItemWebSearchCallTypeX70b2c197
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var action: InlineOutputItemWebSearchCallActionX7e2c4296? = null

    public fun build(): OutputWebSearchCallItem {
      check(idValue != null) { "id is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputWebSearchCallItem(
        id = id,
        status = status,
        type = type,
        action = action,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputWebSearchCallItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputWebSearchCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputWebSearchCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputWebSearchCallItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputWebSearchCallItem must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val status = json.decodeRequired<WebSearchStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputItemWebSearchCallTypeX70b2c197>(rawObject, "type")
      return OutputWebSearchCallItem(
        id = id,
        status = status,
        type = type,
        action = rawObject["action"]?.let { json.decodeFromJsonElement<InlineOutputItemWebSearchCallActionX7e2c4296>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputWebSearchCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputWebSearchCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.action?.let { put("action", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputWebSearchCallItem(block: OutputWebSearchCallItem.Builder.() -> Unit): OutputWebSearchCallItem = OutputWebSearchCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputWebSearchCallItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
