package com.nabobery.sdkgen.github.generated

import kotlin.Double
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups/get/responses/200/content/application~1json
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups/get/responses/200/content/application~1json
 * /schema
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494.Serializer::class)
public class InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494(
  runnerGroups: List<RunnerGroupsOrg>,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val totalCount: Double,
) {
  public val runnerGroups: List<RunnerGroupsOrg> = runnerGroups.toList()

  public class Builder {
    private var runnerGroupsValue: List<RunnerGroupsOrg>? = null

    public var runnerGroups: List<RunnerGroupsOrg>
      get() = requireNotNull(runnerGroupsValue) { "runnerGroups is required" }.toList()
      set(`value`) {
        runnerGroupsValue = value.toList()
      }

    private var totalCountValue: Double? = null

    public var totalCount: Double
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494 {
      check(runnerGroupsValue != null) { "runnerGroups is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494(
        runnerGroups = runnerGroups,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494 must be a JSON object")
      val runnerGroups = json.decodeRequired<List<RunnerGroupsOrg>>(rawObject, "runner_groups")
      val totalCount = json.decodeRequired<Double>(rawObject, "total_count")
      return InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494(
        runnerGroups = runnerGroups,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("runner_groups", json.encodeToJsonElement(value.runnerGroups))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494(block: InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494.Builder.() -> Unit): InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494 = InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnerGroupsGetResponse200JsonXfefdb494 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
