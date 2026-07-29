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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/401/content/application~1json/schema/pro
 * perties/errors/items
 */
@Serializable(with = InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02.Serializer::class)
public class InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsTasksGetResponse401JsonErrorsItemCodeX7e084d79,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsTasksGetResponse401JsonErrorsItemCodeX7e084d79? = null

    public var code: InlineAgentsTasksGetResponse401JsonErrorsItemCodeX7e084d79
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02 {
      check(codeValue != null) { "code is required" }
      return InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02 must be a JSON object")
      val code = json.decodeRequired<InlineAgentsTasksGetResponse401JsonErrorsItemCodeX7e084d79>(rawObject, "code")
      return InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02(block: InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02.Builder.() -> Unit): InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02 = InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse401JsonErrorsItemX9caebb02 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
