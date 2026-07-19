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
 */
@Serializable(with = InlineComponentsSchemasShellCallItemPropertiesAction.Serializer::class)
public class InlineComponentsSchemasShellCallItemPropertiesAction(
  commands: List<String>,
  public val maxOutputLength: Int? = null,
  public val timeoutMs: Int? = null,
) {
  public val commands: List<String> = commands.toList()

  public class Builder {
    private var commandsValue: List<String>? = null

    public var commands: List<String>
      get() = requireNotNull(commandsValue) { "commands is required" }
      set(`value`) {
        commandsValue = value
      }

    public var maxOutputLength: Int? = null

    public var timeoutMs: Int? = null

    public fun build(): InlineComponentsSchemasShellCallItemPropertiesAction {
      check(commandsValue != null) { "commands is required" }
      return InlineComponentsSchemasShellCallItemPropertiesAction(
        commands = commands,
        maxOutputLength = maxOutputLength,
        timeoutMs = timeoutMs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasShellCallItemPropertiesAction = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasShellCallItemPropertiesAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasShellCallItemPropertiesAction {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasShellCallItemPropertiesAction")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasShellCallItemPropertiesAction must be a JSON object")
      val commands = json.decodeRequired<List<String>>(raw, "commands")
      return InlineComponentsSchemasShellCallItemPropertiesAction(
        commands = commands,
        maxOutputLength = raw["max_output_length"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        timeoutMs = raw["timeout_ms"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasShellCallItemPropertiesAction) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasShellCallItemPropertiesAction")
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

public fun inlineComponentsSchemasShellCallItemPropertiesAction(block: InlineComponentsSchemasShellCallItemPropertiesAction.Builder.() -> Unit): InlineComponentsSchemasShellCallItemPropertiesAction = InlineComponentsSchemasShellCallItemPropertiesAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasShellCallItemPropertiesAction is missing required property " +
      "'" + name + "'")
  return decodeFromJsonElement(element)
}
