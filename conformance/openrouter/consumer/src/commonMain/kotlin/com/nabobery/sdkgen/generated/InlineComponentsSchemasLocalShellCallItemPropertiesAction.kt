package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallItem/properties/action.
 */
@Serializable(with = InlineComponentsSchemasLocalShellCallItemPropertiesAction.Serializer::class)
public class InlineComponentsSchemasLocalShellCallItemPropertiesAction(
  command: List<String>,
  public val env: Map<String, String>,
  public val type: InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType,
  public val timeoutMs: Int? = null,
  public val user: String? = null,
  public val workingDirectory: String? = null,
) {
  public val command: List<String> = command.toList()

  public class Builder {
    private var commandValue: List<String>? = null

    public var command: List<String>
      get() = requireNotNull(commandValue) { "command is required" }
      set(`value`) {
        commandValue = value
      }

    private var envValue: Map<String, String>? = null

    public var env: Map<String, String>
      get() = requireNotNull(envValue) { "env is required" }
      set(`value`) {
        envValue = value
      }

    private var typeValue: InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType?
        = null

    public var type: InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var timeoutMs: Int? = null

    public var user: String? = null

    public var workingDirectory: String? = null

    public fun build(): InlineComponentsSchemasLocalShellCallItemPropertiesAction {
      check(commandValue != null) { "command is required" }
      check(envValue != null) { "env is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasLocalShellCallItemPropertiesAction(
        command = command,
        env = env,
        type = type,
        timeoutMs = timeoutMs,
        user = user,
        workingDirectory = workingDirectory,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasLocalShellCallItemPropertiesAction = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasLocalShellCallItemPropertiesAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasLocalShellCallItemPropertiesAction {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasLocalShellCallItemPropertiesAction")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasLocalShellCallItemPropertiesAction must be a JSON object")
      val command = json.decodeRequired<List<String>>(raw, "command")
      val env = json.decodeRequired<Map<String, String>>(raw, "env")
      val type = json.decodeRequired<InlineComponentsSchemasLocalShellCallItemPropertiesActionPropertiesType>(raw,
        "type")
      return InlineComponentsSchemasLocalShellCallItemPropertiesAction(
        command = command,
        env = env,
        type = type,
        timeoutMs = raw["timeout_ms"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        user = raw["user"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        workingDirectory = raw["working_directory"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasLocalShellCallItemPropertiesAction) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasLocalShellCallItemPropertiesAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("command", json.encodeToJsonElement(value.command))
        put("env", json.encodeToJsonElement(value.env))
        put("type", json.encodeToJsonElement(value.type))
        value.timeoutMs?.let { put("timeout_ms", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", it) }
        value.workingDirectory?.let { put("working_directory", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasLocalShellCallItemPropertiesAction(block: InlineComponentsSchemasLocalShellCallItemPropertiesAction.Builder.() -> Unit): InlineComponentsSchemasLocalShellCallItemPropertiesAction = InlineComponentsSchemasLocalShellCallItemPropertiesAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasLocalShellCallItemPropertiesAction is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
