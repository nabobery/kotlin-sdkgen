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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/403/content/application~1js
 * on/schema/properties/errors/items
 */
@Serializable(with = InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4.Serializer::class)
public class InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsReposTasksGetResponse403JsonErrorsItemCodeX2d51df49,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsReposTasksGetResponse403JsonErrorsItemCodeX2d51df49? = null

    public var code: InlineAgentsReposTasksGetResponse403JsonErrorsItemCodeX2d51df49
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4 {
      check(codeValue != null) { "code is required" }
      return InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4 must be a JSON object")
      val code = json.decodeRequired<InlineAgentsReposTasksGetResponse403JsonErrorsItemCodeX2d51df49>(rawObject, "code")
      return InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4(block: InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4.Builder.() -> Unit): InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4 = InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse403JsonErrorsItemX032a77f4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
