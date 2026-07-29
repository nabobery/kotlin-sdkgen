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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/404/content/application~1json/schema/pro
 * perties/errors/items
 */
@Serializable(with = InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d.Serializer::class)
public class InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5? = null

    public var code: InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d {
      check(codeValue != null) { "code is required" }
      return InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d must be a JSON object")
      val code = json.decodeRequired<InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5>(rawObject, "code")
      return InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d(block: InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d.Builder.() -> Unit): InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d = InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse404JsonErrorsItemX1db4cf7d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
