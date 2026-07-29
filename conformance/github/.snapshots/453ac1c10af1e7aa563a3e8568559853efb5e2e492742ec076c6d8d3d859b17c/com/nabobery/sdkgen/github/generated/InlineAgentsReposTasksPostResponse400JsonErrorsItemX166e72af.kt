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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/400/content/application~1j
 * son/schema/properties/errors/items
 */
@Serializable(with = InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af.Serializer::class)
public class InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd? = null

    public var code: InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af {
      check(codeValue != null) { "code is required" }
      return InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af must be a JSON object")
      val code = json.decodeRequired<InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd>(rawObject, "code")
      return InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af(block: InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af.Builder.() -> Unit): InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af = InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksPostResponse400JsonErrorsItemX166e72af is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
