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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1platforms/get/responses/200/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1platforms/get/responses/200/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd.Serializer::class)
public class InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd(
  platforms: List<String>,
  public val totalCount: Int,
) {
  public val platforms: List<String> = platforms.toList()

  public class Builder {
    private var platformsValue: List<String>? = null

    public var platforms: List<String>
      get() = requireNotNull(platformsValue) { "platforms is required" }.toList()
      set(`value`) {
        platformsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd {
      check(platformsValue != null) { "platforms is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd(
        platforms = platforms,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd must be a JSON object")
      val platforms = json.decodeRequired<List<String>>(rawObject, "platforms")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd(
        platforms = platforms,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("platforms", json.encodeToJsonElement(value.platforms))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd(block: InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd.Builder.() -> Unit): InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd = InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsHostedRunnersPlatformsGetResponse200JsonX981cb1dd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
