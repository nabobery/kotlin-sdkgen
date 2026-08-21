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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/422/content/appl
 * ication~1json/schema/properties/errors/items
 */
@Serializable(with = InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb.Serializer::class)
public class InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsReposTasksGetResponse422JsonErrorsItemCodeX2b291638,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsReposTasksGetResponse422JsonErrorsItemCodeX2b291638? = null

    public var code: InlineAgentsReposTasksGetResponse422JsonErrorsItemCodeX2b291638
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb {
      check(codeValue != null) { "code is required" }
      return InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb must be a JSON object")
      val code = json.decodeRequired<InlineAgentsReposTasksGetResponse422JsonErrorsItemCodeX2b291638>(rawObject, "code")
      return InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb(block: InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb.Builder.() -> Unit): InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb = InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse422JsonErrorsItemX9c148cdb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
