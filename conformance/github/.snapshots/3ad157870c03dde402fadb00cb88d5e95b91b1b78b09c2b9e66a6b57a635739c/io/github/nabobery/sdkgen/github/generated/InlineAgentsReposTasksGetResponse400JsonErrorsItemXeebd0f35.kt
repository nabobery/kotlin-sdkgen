package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/400/content/application~1js
 * on/schema/properties/errors/items
 */
@Serializable(with = InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35.Serializer::class)
public class InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsReposTasksGetResponse400JsonErrorsItemCodeXc0bd7a54,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsReposTasksGetResponse400JsonErrorsItemCodeXc0bd7a54? = null

    public var code: InlineAgentsReposTasksGetResponse400JsonErrorsItemCodeXc0bd7a54
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35 {
      check(codeValue != null) { "code is required" }
      return InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35 must be a JSON object")
      val code = json.decodeRequired<InlineAgentsReposTasksGetResponse400JsonErrorsItemCodeXc0bd7a54>(rawObject, "code")
      return InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35(block: InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35.Builder.() -> Unit): InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35 = InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse400JsonErrorsItemXeebd0f35 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
