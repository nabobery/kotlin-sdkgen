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
 * A workflow that must run for this rule to pass
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-workflow-file-reference
 */
@Serializable(with = RepositoryRuleParamsWorkflowFileReference.Serializer::class)
public class RepositoryRuleParamsWorkflowFileReference(
  /**
   * The path to the workflow file
   */
  public val path: String,
  /**
   * The ID of the repository where the workflow is defined
   */
  public val repositoryId: Int,
  /**
   * The ref (branch or tag) of the workflow file to use
   */
  public val ref: String? = null,
  /**
   * The commit SHA of the workflow file to use
   */
  public val sha: String? = null,
) {
  public class Builder {
    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var repositoryIdValue: Int? = null

    public var repositoryId: Int
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    /**
     * The ref (branch or tag) of the workflow file to use
     */
    public var ref: String? = null

    /**
     * The commit SHA of the workflow file to use
     */
    public var sha: String? = null

    public fun build(): RepositoryRuleParamsWorkflowFileReference {
      check(pathValue != null) { "path is required" }
      check(repositoryIdValue != null) { "repositoryId is required" }
      return RepositoryRuleParamsWorkflowFileReference(
        path = path,
        repositoryId = repositoryId,
        ref = ref,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleParamsWorkflowFileReference = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleParamsWorkflowFileReference> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleParamsWorkflowFileReference {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleParamsWorkflowFileReference")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleParamsWorkflowFileReference must be a JSON object")
      val path = json.decodeRequired<String>(rawObject, "path")
      val repositoryId = json.decodeRequired<Int>(rawObject, "repository_id")
      return RepositoryRuleParamsWorkflowFileReference(
        path = path,
        repositoryId = repositoryId,
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleParamsWorkflowFileReference) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleParamsWorkflowFileReference")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("path", value.path)
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
        value.ref?.let { put("ref", it) }
        value.sha?.let { put("sha", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleParamsWorkflowFileReference(block: RepositoryRuleParamsWorkflowFileReference.Builder.() -> Unit): RepositoryRuleParamsWorkflowFileReference = RepositoryRuleParamsWorkflowFileReference.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleParamsWorkflowFileReference is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
