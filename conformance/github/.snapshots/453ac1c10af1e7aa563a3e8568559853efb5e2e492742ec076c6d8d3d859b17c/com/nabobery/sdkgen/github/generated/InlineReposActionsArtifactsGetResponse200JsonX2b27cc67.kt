package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1artifacts/get/responses/200/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1artifacts/get/responses/200/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineReposActionsArtifactsGetResponse200JsonX2b27cc67.Serializer::class)
public class InlineReposActionsArtifactsGetResponse200JsonX2b27cc67(
  artifacts: List<Artifact>,
  public val totalCount: Int,
) {
  public val artifacts: List<Artifact> = artifacts.toList()

  public class Builder {
    private var artifactsValue: List<Artifact>? = null

    public var artifacts: List<Artifact>
      get() = requireNotNull(artifactsValue) { "artifacts is required" }.toList()
      set(`value`) {
        artifactsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineReposActionsArtifactsGetResponse200JsonX2b27cc67 {
      check(artifactsValue != null) { "artifacts is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposActionsArtifactsGetResponse200JsonX2b27cc67(
        artifacts = artifacts,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsArtifactsGetResponse200JsonX2b27cc67 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposActionsArtifactsGetResponse200JsonX2b27cc67> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsArtifactsGetResponse200JsonX2b27cc67 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsArtifactsGetResponse200JsonX2b27cc67")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsArtifactsGetResponse200JsonX2b27cc67 must be a JSON object")
      val artifacts = json.decodeRequired<List<Artifact>>(rawObject, "artifacts")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposActionsArtifactsGetResponse200JsonX2b27cc67(
        artifacts = artifacts,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsArtifactsGetResponse200JsonX2b27cc67) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsArtifactsGetResponse200JsonX2b27cc67")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("artifacts", json.encodeToJsonElement(value.artifacts))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsArtifactsGetResponse200JsonX2b27cc67(block: InlineReposActionsArtifactsGetResponse200JsonX2b27cc67.Builder.() -> Unit): InlineReposActionsArtifactsGetResponse200JsonX2b27cc67 = InlineReposActionsArtifactsGetResponse200JsonX2b27cc67.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsArtifactsGetResponse200JsonX2b27cc67 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
