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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/sub-issues-summary.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/sub-issues-summary
 */
@Serializable(with = SubIssuesSummary.Serializer::class)
public class SubIssuesSummary(
  public val completed: Int,
  public val percentCompleted: Int,
  public val total: Int,
) {
  public class Builder {
    private var completedValue: Int? = null

    public var completed: Int
      get() = requireNotNull(completedValue) { "completed is required" }
      set(`value`) {
        completedValue = value
      }

    private var percentCompletedValue: Int? = null

    public var percentCompleted: Int
      get() = requireNotNull(percentCompletedValue) { "percentCompleted is required" }
      set(`value`) {
        percentCompletedValue = value
      }

    private var totalValue: Int? = null

    public var total: Int
      get() = requireNotNull(totalValue) { "total is required" }
      set(`value`) {
        totalValue = value
      }

    public fun build(): SubIssuesSummary {
      check(completedValue != null) { "completed is required" }
      check(percentCompletedValue != null) { "percentCompleted is required" }
      check(totalValue != null) { "total is required" }
      return SubIssuesSummary(
        completed = completed,
        percentCompleted = percentCompleted,
        total = total,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubIssuesSummary = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubIssuesSummary> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubIssuesSummary {
      val jsonDecoder = decoder.requireJsonDecoder("SubIssuesSummary")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubIssuesSummary must be a JSON object")
      val completed = json.decodeRequired<Int>(rawObject, "completed")
      val percentCompleted = json.decodeRequired<Int>(rawObject, "percent_completed")
      val total = json.decodeRequired<Int>(rawObject, "total")
      return SubIssuesSummary(
        completed = completed,
        percentCompleted = percentCompleted,
        total = total,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubIssuesSummary) {
      val jsonEncoder = encoder.requireJsonEncoder("SubIssuesSummary")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completed", json.encodeToJsonElement(value.completed))
        put("percent_completed", json.encodeToJsonElement(value.percentCompleted))
        put("total", json.encodeToJsonElement(value.total))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subIssuesSummary(block: SubIssuesSummary.Builder.() -> Unit): SubIssuesSummary = SubIssuesSummary.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubIssuesSummary is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
