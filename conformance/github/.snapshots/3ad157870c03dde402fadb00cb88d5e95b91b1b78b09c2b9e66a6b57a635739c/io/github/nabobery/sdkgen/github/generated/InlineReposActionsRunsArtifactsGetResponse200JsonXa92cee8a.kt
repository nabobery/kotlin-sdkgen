package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1artifacts/get/responses/200/co
 * ntent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1artifacts/get/responses/200/co
 * ntent/application~1json/schema
 */
@Serializable(with = InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a.Serializer::class)
public class InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a(
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

    public fun build(): InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a {
      check(artifactsValue != null) { "artifacts is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a(
        artifacts = artifacts,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a must be a JSON object")
      val artifacts = json.decodeRequired<List<Artifact>>(rawObject, "artifacts")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a(
        artifacts = artifacts,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("artifacts", json.encodeToJsonElement(value.artifacts))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a(block: InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a.Builder.() -> Unit): InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a = InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsRunsArtifactsGetResponse200JsonXa92cee8a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
