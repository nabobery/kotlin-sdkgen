package io.github.nabobery.sdkgen.generated

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
 * An openrouter:advisor server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputAdvisorServerToolItem
 */
@Serializable(with = OutputAdvisorServerToolItem.Serializer::class)
public class OutputAdvisorServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputAdvisorServerToolItemTypeX996c03cf,
  /**
   * The advisor model's response (the advice text returned to the executor).
   */
  public val advice: String? = null,
  /**
   * Error message when the advisor call did not produce advice.
   */
  public val error: String? = null,
  public val id: String? = null,
  /**
   * Provider-safe function name of the specific advisor instance that produced this item (e.g.
   * `openrouter_advisor__1`). Present only when more than one advisor tool is configured; omitted for the default
   * single advisor. Echo this field back unchanged so the advisor's cross-request memory stays namespaced to the
   * correct instance. This identity is positional: it is derived from the index of the advisor entry in the request
   * `tools` array, so clients must keep the order of advisor tool entries stable across requests in a conversation.
   * Reordering or inserting advisor entries shifts these names and causes each advisor's cross-request memory to be
   * attributed to the wrong instance.
   */
  public val instanceName: String? = null,
  /**
   * Slug of the advisor model that was consulted.
   */
  public val model: String? = null,
  /**
   * The prompt the executor sent to the advisor.
   */
  public val prompt: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputAdvisorServerToolItemTypeX996c03cf? = null

    public var type: InlineOutputAdvisorServerToolItemTypeX996c03cf
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The advisor model's response (the advice text returned to the executor).
     */
    public var advice: String? = null

    /**
     * Error message when the advisor call did not produce advice.
     */
    public var error: String? = null

    public var id: String? = null

    /**
     * Provider-safe function name of the specific advisor instance that produced this item (e.g.
     * `openrouter_advisor__1`). Present only when more than one advisor tool is configured; omitted for the default
     * single advisor. Echo this field back unchanged so the advisor's cross-request memory stays namespaced to the
     * correct instance. This identity is positional: it is derived from the index of the advisor entry in the request
     * `tools` array, so clients must keep the order of advisor tool entries stable across requests in a conversation.
     * Reordering or inserting advisor entries shifts these names and causes each advisor's cross-request memory to be
     * attributed to the wrong instance.
     */
    public var instanceName: String? = null

    /**
     * Slug of the advisor model that was consulted.
     */
    public var model: String? = null

    /**
     * The prompt the executor sent to the advisor.
     */
    public var prompt: String? = null

    public fun build(): OutputAdvisorServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputAdvisorServerToolItem(
        status = status,
        type = type,
        advice = advice,
        error = error,
        id = id,
        instanceName = instanceName,
        model = model,
        prompt = prompt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputAdvisorServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputAdvisorServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputAdvisorServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputAdvisorServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputAdvisorServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputAdvisorServerToolItemTypeX996c03cf>(rawObject, "type")
      return OutputAdvisorServerToolItem(
        status = status,
        type = type,
        advice = rawObject["advice"]?.let { json.decodeFromJsonElement<String>(it) },
        error = rawObject["error"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        instanceName = rawObject["instance_name"]?.let { json.decodeFromJsonElement<String>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        prompt = rawObject["prompt"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputAdvisorServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputAdvisorServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.advice?.let { put("advice", it) }
        value.error?.let { put("error", it) }
        value.id?.let { put("id", it) }
        value.instanceName?.let { put("instance_name", it) }
        value.model?.let { put("model", it) }
        value.prompt?.let { put("prompt", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputAdvisorServerToolItem(block: OutputAdvisorServerToolItem.Builder.() -> Unit): OutputAdvisorServerToolItem = OutputAdvisorServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputAdvisorServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
