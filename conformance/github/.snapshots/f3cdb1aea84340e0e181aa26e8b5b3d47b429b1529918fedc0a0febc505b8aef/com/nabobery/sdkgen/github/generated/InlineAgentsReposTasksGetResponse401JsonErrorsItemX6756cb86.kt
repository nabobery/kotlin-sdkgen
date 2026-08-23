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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/401/content/appl
 * ication~1json/schema/properties/errors/items
 */
@Serializable(with = InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86.Serializer::class)
public class InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35? = null

    public var code: InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86 {
      check(codeValue != null) { "code is required" }
      return InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86 must be a JSON object")
      val code = json.decodeRequired<InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35>(rawObject, "code")
      return InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86(block: InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86.Builder.() -> Unit): InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86 = InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse401JsonErrorsItemX6756cb86 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
