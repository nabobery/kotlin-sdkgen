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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1runners/put/requestBody
 * /content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1runners/put/requestBody
 * /content/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515.Serializer::class)
public class InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515(
  runners: List<Int>,
) {
  /**
   * List of runner IDs to add to the runner group.
   */
  public val runners: List<Int> = runners.toList()

  public class Builder {
    private var runnersValue: List<Int>? = null

    public var runners: List<Int>
      get() = requireNotNull(runnersValue) { "runners is required" }
      set(`value`) {
        runnersValue = value
      }

    public fun build(): InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515 {
      check(runnersValue != null) { "runners is required" }
      return InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515(
        runners = runners,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515 must be a JSON object")
      val runners = json.decodeRequired<List<Int>>(rawObject, "runners")
      return InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515(
        runners = runners,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("runners", json.encodeToJsonElement(value.runners))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515(block: InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515.Builder.() -> Unit): InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515 = InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnerGroupsRunnersPutRequestJsonX2eb4f515 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
