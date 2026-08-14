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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1attempts~1{attempt_number}~1jo
 * bs/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1attempts~1{attempt_number}~1jo
 * bs/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675.Serializer::class)
public class InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675(
  jobs: List<Job>,
  public val totalCount: Int,
) {
  public val jobs: List<Job> = jobs.toList()

  public class Builder {
    private var jobsValue: List<Job>? = null

    public var jobs: List<Job>
      get() = requireNotNull(jobsValue) { "jobs is required" }.toList()
      set(`value`) {
        jobsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675 {
      check(jobsValue != null) { "jobs is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675(
        jobs = jobs,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675 must be a JSON object")
      val jobs = json.decodeRequired<List<Job>>(rawObject, "jobs")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675(
        jobs = jobs,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("jobs", json.encodeToJsonElement(value.jobs))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675(block: InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675.Builder.() -> Unit): InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675 = InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsRunsAttemptsJobsGetResponse200JsonXdc5d0675 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
