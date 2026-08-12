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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites~1{check_suite_id}~1check-runs/get/response
 * s/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites~1{check_suite_id}~1check-runs/get/response
 * s/200/content/application~1json/schema
 */
@Serializable(with = InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe.Serializer::class)
public class InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe(
  checkRuns: List<CheckRun>,
  public val totalCount: Int,
) {
  public val checkRuns: List<CheckRun> = checkRuns.toList()

  public class Builder {
    private var checkRunsValue: List<CheckRun>? = null

    public var checkRuns: List<CheckRun>
      get() = requireNotNull(checkRunsValue) { "checkRuns is required" }.toList()
      set(`value`) {
        checkRunsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe {
      check(checkRunsValue != null) { "checkRuns is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe(
        checkRuns = checkRuns,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe must be a JSON object")
      val checkRuns = json.decodeRequired<List<CheckRun>>(rawObject, "check_runs")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe(
        checkRuns = checkRuns,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("check_runs", json.encodeToJsonElement(value.checkRuns))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe(block: InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe.Builder.() -> Unit): InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe = InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
