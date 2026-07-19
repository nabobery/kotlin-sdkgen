package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class NamespaceFunctionToolView(
  @SerialName("allowed_callers")
  public val allowedCallers:
      List<InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems>? = null,
  @SerialName("defer_loading")
  public val deferLoading: Boolean? = null,
  public val description: String? = null,
  public val name: String,
  @SerialName("output_schema")
  public val outputSchema: Map<String, JsonElement?>? = null,
  public val parameters: Map<String, JsonElement?>? = null,
  public val strict: Boolean? = null,
  public val type: InlineComponentsSchemasNamespaceFunctionToolPropertiesType,
)

/**
 * A function tool grouped inside a namespace tool
 */
@Serializable(with = NamespaceFunctionTool.Serializer::class)
public class NamespaceFunctionTool(
  public val name: String,
  public val type: InlineComponentsSchemasNamespaceFunctionToolPropertiesType,
  public val allowedCallers:
      List<InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems>? = null,
  public val deferLoading: Boolean? = null,
  public val description: String? = null,
  public val outputSchema: Map<String, JsonElement?>? = null,
  public val parameters: Map<String, JsonElement?>? = null,
  public val strict: Boolean? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineComponentsSchemasNamespaceFunctionToolPropertiesType? = null

    public var type: InlineComponentsSchemasNamespaceFunctionToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var allowedCallers:
        List<InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems>? = null

    public var deferLoading: Boolean? = null

    public var description: String? = null

    public var outputSchema: Map<String, JsonElement?>? = null

    public var parameters: Map<String, JsonElement?>? = null

    public var strict: Boolean? = null

    public fun build(): NamespaceFunctionTool {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return NamespaceFunctionTool(
        name = name,
        type = type,
        allowedCallers = allowedCallers,
        deferLoading = deferLoading,
        description = description,
        outputSchema = outputSchema,
        parameters = parameters,
        strict = strict,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NamespaceFunctionTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<NamespaceFunctionTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NamespaceFunctionTool {
      val jsonDecoder = decoder.requireJsonDecoder("NamespaceFunctionTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("NamespaceFunctionTool must be a JSON object")
      val name = json.decodeRequired<String>(raw, "name")
      val type = json.decodeRequired<InlineComponentsSchemasNamespaceFunctionToolPropertiesType>(raw, "type")
      return NamespaceFunctionTool(
        name = name,
        type = type,
        allowedCallers = raw["allowed_callers"]?.let { element -> if (element == JsonNull) null else json























































                                                                                                                        .decodeFromJsonElement<List<InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems>?>(element) },
        deferLoading = raw["defer_loading"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = raw["description"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        outputSchema = raw["output_schema"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
        parameters = raw["parameters"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
        strict = raw["strict"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: NamespaceFunctionTool) {
      val jsonEncoder = encoder.requireJsonEncoder("NamespaceFunctionTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.allowedCallers?.let { put("allowed_callers", json.encodeToJsonElement(it)) }
        value.deferLoading?.let { put("defer_loading", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.outputSchema?.let { put("output_schema", json.encodeToJsonElement(it)) }
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
        value.strict?.let { put("strict", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun namespaceFunctionTool(block: NamespaceFunctionTool.Builder.() -> Unit): NamespaceFunctionTool =
  NamespaceFunctionTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NamespaceFunctionTool is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
