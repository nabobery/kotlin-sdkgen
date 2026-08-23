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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/400/content/application~1json/schema/pro
 * perties/errors/items
 */
@Serializable(with = InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561.Serializer::class)
public class InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsTasksGetResponse400JsonErrorsItemCodeX59e8b4df,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsTasksGetResponse400JsonErrorsItemCodeX59e8b4df? = null

    public var code: InlineAgentsTasksGetResponse400JsonErrorsItemCodeX59e8b4df
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561 {
      check(codeValue != null) { "code is required" }
      return InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561 must be a JSON object")
      val code = json.decodeRequired<InlineAgentsTasksGetResponse400JsonErrorsItemCodeX59e8b4df>(rawObject, "code")
      return InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse400JsonErrorsItemXc9439561(block: InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561.Builder.() -> Unit): InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561 = InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse400JsonErrorsItemXc9439561 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
