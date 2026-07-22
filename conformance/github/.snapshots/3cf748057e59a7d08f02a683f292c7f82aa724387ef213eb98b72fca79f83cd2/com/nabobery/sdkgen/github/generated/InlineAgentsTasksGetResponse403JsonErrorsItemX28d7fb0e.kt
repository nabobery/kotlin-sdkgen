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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/403/content/application~1json/schema/properties/err
 * ors/items
 */
@Serializable(with = InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e.Serializer::class)
public class InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsTasksGetResponse403JsonErrorsItemCodeXce5da511,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsTasksGetResponse403JsonErrorsItemCodeXce5da511? = null

    public var code: InlineAgentsTasksGetResponse403JsonErrorsItemCodeXce5da511
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e {
      check(codeValue != null) { "code is required" }
      return InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e must be a JSON object")
      val code = json.decodeRequired<InlineAgentsTasksGetResponse403JsonErrorsItemCodeXce5da511>(rawObject, "code")
      return InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e(block: InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e.Builder.() -> Unit): InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e = InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse403JsonErrorsItemX28d7fb0e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
