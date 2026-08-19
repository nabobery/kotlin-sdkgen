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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallItem/properties/action
 */
@Serializable(with = InlineLocalShellCallItemActionXc05bceb6.Serializer::class)
public class InlineLocalShellCallItemActionXc05bceb6(
  command: List<String>,
  env: Map<String, String>,
  public val type: InlineLocalShellCallItemActionTypeX536632c8,
  public val timeoutMs: Int? = null,
  public val user: String? = null,
  public val workingDirectory: String? = null,
) {
  public val command: List<String> = command.toList()

  public val env: Map<String, String> = env.toMap()

  public class Builder {
    private var commandValue: List<String>? = null

    public var command: List<String>
      get() = requireNotNull(commandValue) { "command is required" }.toList()
      set(`value`) {
        commandValue = value.toList()
      }

    private var envValue: Map<String, String>? = null

    public var env: Map<String, String>
      get() = requireNotNull(envValue) { "env is required" }.toMap()
      set(`value`) {
        envValue = value.toMap()
      }

    private var typeValue: InlineLocalShellCallItemActionTypeX536632c8? = null

    public var type: InlineLocalShellCallItemActionTypeX536632c8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var timeoutMs: Int? = null

    public var user: String? = null

    public var workingDirectory: String? = null

    public fun build(): InlineLocalShellCallItemActionXc05bceb6 {
      check(commandValue != null) { "command is required" }
      check(envValue != null) { "env is required" }
      check(typeValue != null) { "type is required" }
      return InlineLocalShellCallItemActionXc05bceb6(
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
    public fun build(block: Builder.() -> Unit): InlineLocalShellCallItemActionXc05bceb6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineLocalShellCallItemActionXc05bceb6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLocalShellCallItemActionXc05bceb6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLocalShellCallItemActionXc05bceb6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineLocalShellCallItemActionXc05bceb6 must be a JSON object")
      val command = json.decodeRequired<List<String>>(rawObject, "command")
      val env = json.decodeRequired<Map<String, String>>(rawObject, "env")
      val type = json.decodeRequired<InlineLocalShellCallItemActionTypeX536632c8>(rawObject, "type")
      return InlineLocalShellCallItemActionXc05bceb6(
        command = command,
        env = env,
        type = type,
        timeoutMs = rawObject["timeout_ms"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        user = rawObject["user"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        workingDirectory = rawObject["working_directory"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineLocalShellCallItemActionXc05bceb6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineLocalShellCallItemActionXc05bceb6")
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

public fun inlineLocalShellCallItemActionXc05bceb6(block: InlineLocalShellCallItemActionXc05bceb6.Builder.() -> Unit): InlineLocalShellCallItemActionXc05bceb6 = InlineLocalShellCallItemActionXc05bceb6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineLocalShellCallItemActionXc05bceb6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
