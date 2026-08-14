package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Function definition for tool calling
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFunctionTool/anyOf/0/properties/function
 */
@Serializable(with = InlineChatFunctionToolAnyOf1FunctionX25ce1173.Serializer::class)
public class InlineChatFunctionToolAnyOf1FunctionX25ce1173(
  /**
   * Function name (a-z, A-Z, 0-9, underscores, dashes, max 64 chars)
   */
  public val name: String,
  /**
   * Function description for the model
   */
  public val description: String? = null,
  parameters: Map<String, JsonElement?>? = null,
  /**
   * Enable strict schema adherence
   */
  public val strict: Boolean? = null,
) {
  /**
   * Function parameters as JSON Schema object
   */
  public val parameters: Map<String, JsonElement?>? =
      parameters?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Function description for the model
     */
    public var description: String? = null

    private var parametersValue: Map<String, JsonElement?>? = null

    /**
     * Function parameters as JSON Schema object
     */
    public var parameters: Map<String, JsonElement?>?
      get() = parametersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        parametersValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Enable strict schema adherence
     */
    public var strict: Boolean? = null

    public fun build(): InlineChatFunctionToolAnyOf1FunctionX25ce1173 {
      check(nameValue != null) { "name is required" }
      return InlineChatFunctionToolAnyOf1FunctionX25ce1173(
        name = name,
        description = description,
        parameters = parameters,
        strict = strict,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatFunctionToolAnyOf1FunctionX25ce1173 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatFunctionToolAnyOf1FunctionX25ce1173> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatFunctionToolAnyOf1FunctionX25ce1173 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatFunctionToolAnyOf1FunctionX25ce1173")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatFunctionToolAnyOf1FunctionX25ce1173 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineChatFunctionToolAnyOf1FunctionX25ce1173(
        name = name,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        strict = rawObject["strict"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatFunctionToolAnyOf1FunctionX25ce1173) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatFunctionToolAnyOf1FunctionX25ce1173")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.description?.let { put("description", it) }
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
        value.strict?.let { put("strict", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatFunctionToolAnyOf1FunctionX25ce1173(block: InlineChatFunctionToolAnyOf1FunctionX25ce1173.Builder.() -> Unit): InlineChatFunctionToolAnyOf1FunctionX25ce1173 = InlineChatFunctionToolAnyOf1FunctionX25ce1173.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatFunctionToolAnyOf1FunctionX25ce1173 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
