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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1hosted-runners/get/resp
 * onses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1hosted-runners/get/resp
 * onses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0.Serializer::class)
public class InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0(
  runners: List<ActionsHostedRunner>,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val totalCount: Double,
) {
  public val runners: List<ActionsHostedRunner> = runners.toList()

  public class Builder {
    private var runnersValue: List<ActionsHostedRunner>? = null

    public var runners: List<ActionsHostedRunner>
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

    public fun build(): InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0 {
      check(runnersValue != null) { "runners is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0(
        runners = runners,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0 must be a JSON object")
      val runners = json.decodeRequired<List<ActionsHostedRunner>>(rawObject, "runners")
      val totalCount = json.decodeRequired<Double>(rawObject, "total_count")
      return InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0(
        runners = runners,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("runners", json.encodeToJsonElement(value.runners))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0(block: InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0.Builder.() -> Unit): InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0 = InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnerGroupsHostedRunnersGetResponse200JsonXdb1639d0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
