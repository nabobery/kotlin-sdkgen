package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/pu
 * ll_requests/items/properties/base/properties/repo.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/pu
 * ll_requests/items/properties/base/properties/repo
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2.Serializer::class)
public class InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2(
  public val id: Int,
  public val name: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2(
        id = id,
        name = name,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2(
        id = id,
        name = name,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2(block: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2.Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2 = InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
