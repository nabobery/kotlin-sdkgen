package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/requestBody/content/application~1jso
 * n/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/requestBody/content/application~1jso
 * n/schema
 */
@Serializable(with = InlineAgentsReposTasksPostRequestJsonX7c4d2325.Serializer::class)
public class InlineAgentsReposTasksPostRequestJsonX7c4d2325(
  /**
   * The user's prompt for the agent
   */
  public val prompt: String,
  /**
   * Base ref for new branch/PR
   */
  public val baseRef: String? = null,
  /**
   * Whether to create a PR.
   */
  public val createPullRequest: Boolean? = null,
  /**
   * Head ref for existing branch/PR. If provided with `base_ref`, the agent looks up open PR context for `head_ref`
   * targeting `base_ref` and commits to `head_ref` instead of creating a new branch.
   */
  public val headRef: String? = null,
  /**
   * The model to use for this task. The allowed models may change over time and depend on the user's GitHub Copilot
   * plan and organization policies. Currently supported values: `claude-sonnet-4.6`, `claude-opus-4.6`,
   * `gpt-5.2-codex`, `gpt-5.3-codex`, `gpt-5.4`, `claude-sonnet-4.5`, `claude-opus-4.5`
   */
  public val model: String? = null,
) {
  public class Builder {
    private var promptValue: String? = null

    public var prompt: String
      get() = requireNotNull(promptValue) { "prompt is required" }
      set(`value`) {
        promptValue = value
      }

    /**
     * Base ref for new branch/PR
     */
    public var baseRef: String? = null

    /**
     * Whether to create a PR.
     */
    public var createPullRequest: Boolean? = null

    /**
     * Head ref for existing branch/PR. If provided with `base_ref`, the agent looks up open PR context for `head_ref`
     * targeting `base_ref` and commits to `head_ref` instead of creating a new branch.
     */
    public var headRef: String? = null

    /**
     * The model to use for this task. The allowed models may change over time and depend on the user's GitHub Copilot
     * plan and organization policies. Currently supported values: `claude-sonnet-4.6`, `claude-opus-4.6`,
     * `gpt-5.2-codex`, `gpt-5.3-codex`, `gpt-5.4`, `claude-sonnet-4.5`, `claude-opus-4.5`
     */
    public var model: String? = null

    public fun build(): InlineAgentsReposTasksPostRequestJsonX7c4d2325 {
      check(promptValue != null) { "prompt is required" }
      return InlineAgentsReposTasksPostRequestJsonX7c4d2325(
        prompt = prompt,
        baseRef = baseRef,
        createPullRequest = createPullRequest,
        headRef = headRef,
        model = model,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostRequestJsonX7c4d2325 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostRequestJsonX7c4d2325> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostRequestJsonX7c4d2325 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostRequestJsonX7c4d2325")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostRequestJsonX7c4d2325 must be a JSON object")
      val prompt = json.decodeRequired<String>(rawObject, "prompt")
      return InlineAgentsReposTasksPostRequestJsonX7c4d2325(
        prompt = prompt,
        baseRef = rawObject["base_ref"]?.let { json.decodeFromJsonElement<String>(it) },
        createPullRequest = rawObject["create_pull_request"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        headRef = rawObject["head_ref"]?.let { json.decodeFromJsonElement<String>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostRequestJsonX7c4d2325) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostRequestJsonX7c4d2325")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("prompt", value.prompt)
        value.baseRef?.let { put("base_ref", it) }
        value.createPullRequest?.let { put("create_pull_request", json.encodeToJsonElement(it)) }
        value.headRef?.let { put("head_ref", it) }
        value.model?.let { put("model", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostRequestJsonX7c4d2325(block: InlineAgentsReposTasksPostRequestJsonX7c4d2325.Builder.() -> Unit): InlineAgentsReposTasksPostRequestJsonX7c4d2325 = InlineAgentsReposTasksPostRequestJsonX7c4d2325.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksPostRequestJsonX7c4d2325 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
