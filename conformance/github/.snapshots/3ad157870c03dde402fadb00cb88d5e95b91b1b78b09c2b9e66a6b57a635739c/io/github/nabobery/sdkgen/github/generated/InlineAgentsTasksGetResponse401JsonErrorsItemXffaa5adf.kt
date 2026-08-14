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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/401/content/application~1json/schema/properties/err
 * ors/items
 */
@Serializable(with = InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf.Serializer::class)
public class InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf(
  /**
   * Machine-readable error code
   */
  public val code: InlineAgentsTasksGetResponse401JsonErrorsItemCodeXe547be0e,
  /**
   * Human-readable message (populated when code is "custom")
   */
  public val message: String? = null,
) {
  public class Builder {
    private var codeValue: InlineAgentsTasksGetResponse401JsonErrorsItemCodeXe547be0e? = null

    public var code: InlineAgentsTasksGetResponse401JsonErrorsItemCodeXe547be0e
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Human-readable message (populated when code is "custom")
     */
    public var message: String? = null

    public fun build(): InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf {
      check(codeValue != null) { "code is required" }
      return InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf must be a JSON object")
      val code = json.decodeRequired<InlineAgentsTasksGetResponse401JsonErrorsItemCodeXe547be0e>(rawObject, "code")
      return InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf(
        code = code,
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf(block: InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf.Builder.() -> Unit): InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf = InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse401JsonErrorsItemXffaa5adf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
