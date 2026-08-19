package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ShellCallItem/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ShellCallItem/properties/action
 */
@Serializable(with = InlineShellCallItemActionXb277d6b5.Serializer::class)
public class InlineShellCallItemActionXb277d6b5(
  commands: List<String>,
  public val maxOutputLength: Int? = null,
  public val timeoutMs: Int? = null,
) {
  public val commands: List<String> = commands.toList()

  public class Builder {
    private var commandsValue: List<String>? = null

    public var commands: List<String>
      get() = requireNotNull(commandsValue) { "commands is required" }.toList()
      set(`value`) {
        commandsValue = value.toList()
      }

    public var maxOutputLength: Int? = null

    public var timeoutMs: Int? = null

    public fun build(): InlineShellCallItemActionXb277d6b5 {
      check(commandsValue != null) { "commands is required" }
      return InlineShellCallItemActionXb277d6b5(
        commands = commands,
        maxOutputLength = maxOutputLength,
        timeoutMs = timeoutMs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineShellCallItemActionXb277d6b5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineShellCallItemActionXb277d6b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineShellCallItemActionXb277d6b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineShellCallItemActionXb277d6b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineShellCallItemActionXb277d6b5 must be a JSON object")
      val commands = json.decodeRequired<List<String>>(rawObject, "commands")
      return InlineShellCallItemActionXb277d6b5(
        commands = commands,
        maxOutputLength = rawObject["max_output_length"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        timeoutMs = rawObject["timeout_ms"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineShellCallItemActionXb277d6b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineShellCallItemActionXb277d6b5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commands", json.encodeToJsonElement(value.commands))
        value.maxOutputLength?.let { put("max_output_length", json.encodeToJsonElement(it)) }
        value.timeoutMs?.let { put("timeout_ms", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineShellCallItemActionXb277d6b5(block: InlineShellCallItemActionXb277d6b5.Builder.() -> Unit): InlineShellCallItemActionXb277d6b5 = InlineShellCallItemActionXb277d6b5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineShellCallItemActionXb277d6b5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
