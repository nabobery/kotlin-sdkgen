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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners/get/responses/200/content/application~1jso
 * n/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners/get/responses/200/content/application~1jso
 * n/schema
 */
@Serializable(with = InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7.Serializer::class)
public class InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7(
  runners: List<ActionsHostedRunner>,
  public val totalCount: Int,
) {
  public val runners: List<ActionsHostedRunner> = runners.toList()

  public class Builder {
    private var runnersValue: List<ActionsHostedRunner>? = null

    public var runners: List<ActionsHostedRunner>
      get() = requireNotNull(runnersValue) { "runners is required" }.toList()
      set(`value`) {
        runnersValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7 {
      check(runnersValue != null) { "runners is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7(
        runners = runners,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7 must be a JSON object")
      val runners = json.decodeRequired<List<ActionsHostedRunner>>(rawObject, "runners")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7(
        runners = runners,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("runners", json.encodeToJsonElement(value.runners))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7(block: InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7.Builder.() -> Unit): InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7 = InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsHostedRunnersGetResponse200JsonX7ced20e7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
