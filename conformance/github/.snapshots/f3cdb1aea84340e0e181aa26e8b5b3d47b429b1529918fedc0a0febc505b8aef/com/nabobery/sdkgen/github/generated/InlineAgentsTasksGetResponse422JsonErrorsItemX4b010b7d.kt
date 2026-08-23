package com.nabobery.sdkgen.github.generated

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
 * A single validation error
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/422/content/application~1json/schema/pro
 * perties/errors/items
 */
@Serializable(with = InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d.Serializer::class)
public class InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsTasksGetResponse422JsonErrorsItemCodeXb9eb5fbc,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsTasksGetResponse422JsonErrorsItemCodeXb9eb5fbc? = null

    public var code: InlineAgentsTasksGetResponse422JsonErrorsItemCodeXb9eb5fbc
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d {
      check(codeValue != null) { "code is required" }
      return InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d must be a JSON object")
      val code = json.decodeRequired<InlineAgentsTasksGetResponse422JsonErrorsItemCodeXb9eb5fbc>(rawObject, "code")
      return InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d(block: InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d.Builder.() -> Unit): InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d = InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse422JsonErrorsItemX4b010b7d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
