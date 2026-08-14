package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
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

@ConsistentCopyVisibility
@Serializable
public data class NamespaceFunctionToolView internal constructor(
  @SerialName("allowed_callers")
  public val allowedCallers: List<InlineNamespaceFunctionToolAllowedCallersItemX6412c66a>? = null,
  @SerialName("defer_loading")
  public val deferLoading: Boolean? = null,
  public val description: String? = null,
  public val name: String,
  @SerialName("output_schema")
  public val outputSchema: Map<String, JsonElement?>? = null,
  public val parameters: Map<String, JsonElement?>? = null,
  public val strict: Boolean? = null,
  public val type: InlineNamespaceFunctionToolTypeXe2f4b311,
)

/**
 * A function tool grouped inside a namespace tool
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/NamespaceFunctionTool
 */
@Serializable(with = NamespaceFunctionTool.Serializer::class)
public class NamespaceFunctionTool(
  public val name: String,
  public val type: InlineNamespaceFunctionToolTypeXe2f4b311,
  allowedCallers: List<InlineNamespaceFunctionToolAllowedCallersItemX6412c66a>? = null,
  public val deferLoading: Boolean? = null,
  public val description: String? = null,
  outputSchema: Map<String, JsonElement?>? = null,
  parameters: Map<String, JsonElement?>? = null,
  public val strict: Boolean? = null,
) {
  public val allowedCallers: List<InlineNamespaceFunctionToolAllowedCallersItemX6412c66a>? =
      allowedCallers?.let { collection0 -> collection0.toList() }

  public val outputSchema: Map<String, JsonElement?>? =
      outputSchema?.let { collection0 -> collection0.toMap() }

  public val parameters: Map<String, JsonElement?>? =
      parameters?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineNamespaceFunctionToolTypeXe2f4b311? = null

    public var type: InlineNamespaceFunctionToolTypeXe2f4b311
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var allowedCallersValue: List<InlineNamespaceFunctionToolAllowedCallersItemX6412c66a>? =
        null

    public var allowedCallers: List<InlineNamespaceFunctionToolAllowedCallersItemX6412c66a>?
      get() = allowedCallersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedCallersValue = value?.let { collection0 -> collection0.toList() }
      }

    public var deferLoading: Boolean? = null

    public var description: String? = null

    private var outputSchemaValue: Map<String, JsonElement?>? = null

    public var outputSchema: Map<String, JsonElement?>?
      get() = outputSchemaValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        outputSchemaValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var parametersValue: Map<String, JsonElement?>? = null

    public var parameters: Map<String, JsonElement?>?
      get() = parametersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        parametersValue = value?.let { collection0 -> collection0.toMap() }
      }

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

  internal object Serializer : KSerializer<NamespaceFunctionTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NamespaceFunctionTool {
      val jsonDecoder = decoder.requireJsonDecoder("NamespaceFunctionTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NamespaceFunctionTool must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineNamespaceFunctionToolTypeXe2f4b311>(rawObject, "type")
      return NamespaceFunctionTool(
        name = name,
        type = type,
        allowedCallers = rawObject["allowed_callers"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineNamespaceFunctionToolAllowedCallersItemX6412c66a>?>(element) },
        deferLoading = rawObject["defer_loading"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        outputSchema = rawObject["output_schema"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
        parameters = rawObject["parameters"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
        strict = rawObject["strict"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
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

public fun namespaceFunctionTool(block: NamespaceFunctionTool.Builder.() -> Unit): NamespaceFunctionTool = NamespaceFunctionTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NamespaceFunctionTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
