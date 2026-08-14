package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * pull_requests/items/properties/base/properties/repo.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * pull_requests/items/properties/base/properties/repo
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944.Serializer::class)
public class InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944(
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

    public fun build(): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944(
        id = id,
        name = name,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944(
        id = id,
        name = name,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944")
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

public fun inlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944(block: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944.Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944 = InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemBaseRepoXcdf75944 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
