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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/401/content/application~1j
 * son/schema/properties/errors/items
 */
@Serializable(with = InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033.Serializer::class)
public class InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsReposTasksPostResponse401JsonErrorsItemCodeX55a811bf,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsReposTasksPostResponse401JsonErrorsItemCodeX55a811bf? = null

    public var code: InlineAgentsReposTasksPostResponse401JsonErrorsItemCodeX55a811bf
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033 {
      check(codeValue != null) { "code is required" }
      return InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033 must be a JSON object")
      val code = json.decodeRequired<InlineAgentsReposTasksPostResponse401JsonErrorsItemCodeX55a811bf>(rawObject, "code")
      return InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033(block: InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033.Builder.() -> Unit): InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033 = InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksPostResponse401JsonErrorsItemXdbd63033 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
