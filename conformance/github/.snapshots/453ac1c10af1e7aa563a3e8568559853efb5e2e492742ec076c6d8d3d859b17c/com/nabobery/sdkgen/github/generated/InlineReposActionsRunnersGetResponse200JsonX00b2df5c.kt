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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runners/get/responses/200/content/application~
 * 1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runners/get/responses/200/content/application~
 * 1json/schema
 */
@Serializable(with = InlineReposActionsRunnersGetResponse200JsonX00b2df5c.Serializer::class)
public class InlineReposActionsRunnersGetResponse200JsonX00b2df5c(
  runners: List<Runner>,
  public val totalCount: Int,
) {
  public val runners: List<Runner> = runners.toList()

  public class Builder {
    private var runnersValue: List<Runner>? = null

    public var runners: List<Runner>
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

    public fun build(): InlineReposActionsRunnersGetResponse200JsonX00b2df5c {
      check(runnersValue != null) { "runners is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposActionsRunnersGetResponse200JsonX00b2df5c(
        runners = runners,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsRunnersGetResponse200JsonX00b2df5c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposActionsRunnersGetResponse200JsonX00b2df5c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunnersGetResponse200JsonX00b2df5c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunnersGetResponse200JsonX00b2df5c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsRunnersGetResponse200JsonX00b2df5c must be a JSON object")
      val runners = json.decodeRequired<List<Runner>>(rawObject, "runners")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposActionsRunnersGetResponse200JsonX00b2df5c(
        runners = runners,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunnersGetResponse200JsonX00b2df5c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsRunnersGetResponse200JsonX00b2df5c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("runners", json.encodeToJsonElement(value.runners))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsRunnersGetResponse200JsonX00b2df5c(block: InlineReposActionsRunnersGetResponse200JsonX00b2df5c.Builder.() -> Unit): InlineReposActionsRunnersGetResponse200JsonX00b2df5c = InlineReposActionsRunnersGetResponse200JsonX00b2df5c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsRunnersGetResponse200JsonX00b2df5c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
