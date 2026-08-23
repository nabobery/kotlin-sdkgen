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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/422/content/application~1json/schema/properties/err
 * ors/items
 */
@Serializable(with = InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46.Serializer::class)
public class InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsTasksGetResponse422JsonErrorsItemCodeX8a5fd806,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsTasksGetResponse422JsonErrorsItemCodeX8a5fd806? = null

    public var code: InlineAgentsTasksGetResponse422JsonErrorsItemCodeX8a5fd806
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46 {
      check(codeValue != null) { "code is required" }
      return InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46 must be a JSON object")
      val code = json.decodeRequired<InlineAgentsTasksGetResponse422JsonErrorsItemCodeX8a5fd806>(rawObject, "code")
      return InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46(block: InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46.Builder.() -> Unit): InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46 = InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse422JsonErrorsItemXb749ad46 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
