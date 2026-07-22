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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/artifact/properties/workflow_run.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/artifact/properties/workflow_run
 */
@Serializable(with = InlineArtifactWorkflowRunX6b4b28de.Serializer::class)
public class InlineArtifactWorkflowRunX6b4b28de(
  public val headBranch: String? = null,
  public val headRepositoryId: Int? = null,
  public val headSha: String? = null,
  public val id: Int? = null,
  public val repositoryId: Int? = null,
) {
  public class Builder {
    public var headBranch: String? = null

    public var headRepositoryId: Int? = null

    public var headSha: String? = null

    public var id: Int? = null

    public var repositoryId: Int? = null

    public fun build(): InlineArtifactWorkflowRunX6b4b28de = InlineArtifactWorkflowRunX6b4b28de(
      headBranch = headBranch,
      headRepositoryId = headRepositoryId,
      headSha = headSha,
      id = id,
      repositoryId = repositoryId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineArtifactWorkflowRunX6b4b28de = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineArtifactWorkflowRunX6b4b28de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineArtifactWorkflowRunX6b4b28de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineArtifactWorkflowRunX6b4b28de")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineArtifactWorkflowRunX6b4b28de must be a JSON object")
      return InlineArtifactWorkflowRunX6b4b28de(
        headBranch = rawObject["head_branch"]?.let { json.decodeFromJsonElement<String>(it) },
        headRepositoryId = rawObject["head_repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        headSha = rawObject["head_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineArtifactWorkflowRunX6b4b28de) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineArtifactWorkflowRunX6b4b28de")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.headBranch?.let { put("head_branch", it) }
        value.headRepositoryId?.let { put("head_repository_id", json.encodeToJsonElement(it)) }
        value.headSha?.let { put("head_sha", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.repositoryId?.let { put("repository_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineArtifactWorkflowRunX6b4b28de(block: InlineArtifactWorkflowRunX6b4b28de.Builder.() -> Unit): InlineArtifactWorkflowRunX6b4b28de = InlineArtifactWorkflowRunX6b4b28de.build(block)
