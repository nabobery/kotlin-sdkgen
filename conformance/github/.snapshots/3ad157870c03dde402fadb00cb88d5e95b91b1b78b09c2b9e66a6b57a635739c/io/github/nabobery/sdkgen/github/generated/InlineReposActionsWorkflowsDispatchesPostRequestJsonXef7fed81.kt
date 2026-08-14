package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1workflows~1{workflow_id}~1dispatches/post/requ
 * estBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1workflows~1{workflow_id}~1dispatches/post/requ
 * estBody/content/application~1json/schema
 */
@Serializable(with = InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81.Serializer::class)
public class InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81(
  /**
   * The git reference for the workflow. The reference can be a branch or tag name.
   */
  public val ref: String,
  /**
   * Input keys and values configured in the workflow file. The maximum number of properties is 25. Any default
   * properties configured in the workflow file will be used when `inputs` are omitted.
   */
  public val inputs: JsonObject? = null,
  /**
   * Whether the response should include the workflow run ID and URLs.
   */
  public val returnRunDetails: Boolean? = null,
) {
  public class Builder {
    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    /**
     * Input keys and values configured in the workflow file. The maximum number of properties is 25. Any default
     * properties configured in the workflow file will be used when `inputs` are omitted.
     */
    public var inputs: JsonObject? = null

    /**
     * Whether the response should include the workflow run ID and URLs.
     */
    public var returnRunDetails: Boolean? = null

    public fun build(): InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81 {
      check(refValue != null) { "ref is required" }
      return InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81(
        ref = ref,
        inputs = inputs,
        returnRunDetails = returnRunDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      return InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81(
        ref = ref,
        inputs = rawObject["inputs"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        returnRunDetails = rawObject["return_run_details"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ref", value.ref)
        value.inputs?.let { put("inputs", json.encodeToJsonElement(it)) }
        value.returnRunDetails?.let { put("return_run_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81(block: InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81.Builder.() -> Unit): InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81 = InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsWorkflowsDispatchesPostRequestJsonXef7fed81 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
