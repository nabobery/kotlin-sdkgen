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
 * Commit Activity
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit-activity
 */
@Serializable(with = CommitActivity.Serializer::class)
public class CommitActivity(
  days: List<Int>,
  public val total: Int,
  public val week: Int,
) {
  public val days: List<Int> = days.toList()

  public class Builder {
    private var daysValue: List<Int>? = null

    public var days: List<Int>
      get() = requireNotNull(daysValue) { "days is required" }.toList()
      set(`value`) {
        daysValue = value.toList()
      }

    private var totalValue: Int? = null

    public var total: Int
      get() = requireNotNull(totalValue) { "total is required" }
      set(`value`) {
        totalValue = value
      }

    private var weekValue: Int? = null

    public var week: Int
      get() = requireNotNull(weekValue) { "week is required" }
      set(`value`) {
        weekValue = value
      }

    public fun build(): CommitActivity {
      check(daysValue != null) { "days is required" }
      check(totalValue != null) { "total is required" }
      check(weekValue != null) { "week is required" }
      return CommitActivity(
        days = days,
        total = total,
        week = week,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CommitActivity = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CommitActivity> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CommitActivity {
      val jsonDecoder = decoder.requireJsonDecoder("CommitActivity")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CommitActivity must be a JSON object")
      val days = json.decodeRequired<List<Int>>(rawObject, "days")
      val total = json.decodeRequired<Int>(rawObject, "total")
      val week = json.decodeRequired<Int>(rawObject, "week")
      return CommitActivity(
        days = days,
        total = total,
        week = week,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CommitActivity) {
      val jsonEncoder = encoder.requireJsonEncoder("CommitActivity")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("days", json.encodeToJsonElement(value.days))
        put("total", json.encodeToJsonElement(value.total))
        put("week", json.encodeToJsonElement(value.week))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun commitActivity(block: CommitActivity.Builder.() -> Unit): CommitActivity = CommitActivity.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CommitActivity is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
