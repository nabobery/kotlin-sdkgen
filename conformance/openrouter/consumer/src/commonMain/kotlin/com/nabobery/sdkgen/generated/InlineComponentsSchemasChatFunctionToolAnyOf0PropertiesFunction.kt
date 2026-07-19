package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction.Serializer::class)
public class InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction(
  /**
   * Function name (a-z, A-Z, 0-9, underscores, dashes, max 64 chars)
   */
  public val name: String,
  /**
   * Function description for the model
   */
  public val description: String? = null,
  /**
   * Function parameters as JSON Schema object
   */
  public val parameters: Map<String, JsonElement?>? = null,
  /**
   * Enable strict schema adherence
   */
  public val strict: Boolean? = null,
) {
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

    /**
     * Function parameters as JSON Schema object
     */
    public var parameters: Map<String, JsonElement?>? = null

    /**
     * Enable strict schema adherence
     */
    public var strict: Boolean? = null

    public fun build(): InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction {
      check(nameValue != null) { "name is required" }
      return InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction(
        name = name,
        description = description,
        parameters = parameters,
        strict = strict,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction must be a JSON " +
          "object")
      val name = json.decodeRequired<String>(raw, "name")
      return InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction(
        name = name,
        description = raw["description"]?.let { json.decodeFromJsonElement<String>(it) },
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<Map<String, JsonElement?>>(it) },
        strict = raw["strict"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction")
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

public fun inlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction(block: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction.Builder.() -> Unit): InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction = InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
