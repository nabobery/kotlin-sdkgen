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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/400/content/application~1json/schema/properties/err
 * ors/items
 */
@Serializable(with = InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6.Serializer::class)
public class InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsTasksGetResponse400JsonErrorsItemCodeX17b3a4b3,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsTasksGetResponse400JsonErrorsItemCodeX17b3a4b3? = null

    public var code: InlineAgentsTasksGetResponse400JsonErrorsItemCodeX17b3a4b3
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6 {
      check(codeValue != null) { "code is required" }
      return InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6 must be a JSON object")
      val code = json.decodeRequired<InlineAgentsTasksGetResponse400JsonErrorsItemCodeX17b3a4b3>(rawObject, "code")
      return InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6(block: InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6.Builder.() -> Unit): InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6 = InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse400JsonErrorsItemX1e8489b6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
