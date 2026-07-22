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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/422/content/application~1j
 * son/schema/properties/errors/items
 */
@Serializable(with = InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed.Serializer::class)
public class InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsReposTasksPostResponse422JsonErrorsItemCodeXa1bc1742,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsReposTasksPostResponse422JsonErrorsItemCodeXa1bc1742? = null

    public var code: InlineAgentsReposTasksPostResponse422JsonErrorsItemCodeXa1bc1742
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed {
      check(codeValue != null) { "code is required" }
      return InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed must be a JSON object")
      val code = json.decodeRequired<InlineAgentsReposTasksPostResponse422JsonErrorsItemCodeXa1bc1742>(rawObject, "code")
      return InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed(block: InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed.Builder.() -> Unit): InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed = InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksPostResponse422JsonErrorsItemXc92991ed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
