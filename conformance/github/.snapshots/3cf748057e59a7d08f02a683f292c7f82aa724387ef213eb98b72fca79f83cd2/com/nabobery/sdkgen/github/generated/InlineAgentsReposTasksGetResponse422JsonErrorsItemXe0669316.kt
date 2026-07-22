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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/422/content/application~1js
 * on/schema/properties/errors/items
 */
@Serializable(with = InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316.Serializer::class)
public class InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsReposTasksGetResponse422JsonErrorsItemCodeXfcbb92c1,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsReposTasksGetResponse422JsonErrorsItemCodeXfcbb92c1? = null

    public var code: InlineAgentsReposTasksGetResponse422JsonErrorsItemCodeXfcbb92c1
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316 {
      check(codeValue != null) { "code is required" }
      return InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316 must be a JSON object")
      val code = json.decodeRequired<InlineAgentsReposTasksGetResponse422JsonErrorsItemCodeXfcbb92c1>(rawObject, "code")
      return InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316(block: InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316.Builder.() -> Unit): InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316 = InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse422JsonErrorsItemXe0669316 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
