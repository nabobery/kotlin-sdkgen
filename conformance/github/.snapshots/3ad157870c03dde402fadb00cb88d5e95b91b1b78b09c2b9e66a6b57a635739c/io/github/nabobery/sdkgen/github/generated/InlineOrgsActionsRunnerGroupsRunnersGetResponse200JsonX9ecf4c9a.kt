package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1runners/get/responses/2
 * 00/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1runners/get/responses/2
 * 00/content/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a.Serializer::class)
public class InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a(
  runners: List<Runner>,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val totalCount: Double,
) {
  public val runners: List<Runner> = runners.toList()

  public class Builder {
    private var runnersValue: List<Runner>? = null

    public var runners: List<Runner>
      get() = requireNotNull(runnersValue) { "runners is required" }.toList()
      set(`value`) {
        runnersValue = value.toList()
      }

    private var totalCountValue: Double? = null

    public var totalCount: Double
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a {
      check(runnersValue != null) { "runners is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a(
        runners = runners,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a must be a JSON object")
      val runners = json.decodeRequired<List<Runner>>(rawObject, "runners")
      val totalCount = json.decodeRequired<Double>(rawObject, "total_count")
      return InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a(
        runners = runners,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("runners", json.encodeToJsonElement(value.runners))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a(block: InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a.Builder.() -> Unit): InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a = InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnerGroupsRunnersGetResponse200JsonX9ecf4c9a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
